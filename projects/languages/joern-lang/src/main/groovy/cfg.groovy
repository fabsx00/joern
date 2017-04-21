
/**
   For an AST node, traverse to the exit-node
   of the function
*/
addStep("toExitNode", {
  delegate.flatMap{
    functionId = it.get().value('functionId')
    g.V().has('type','CFGExitNode').has('functionId',functionId)
  }
})

/**
   Search the CFG breadth-first so that we can keep track of all nodes we've visited in
    the entire search rather than just along the current path (massive optimization for
    high branching-factor CFGs, e.g. state machines).
*/
_reachableCfgNodes = { curNodes, visited, forward ->
  if (forward == true) {
    nextNodes = g.V(*curNodes).out(CFG_EDGE).toSet() - visited
  } else {
    nextNodes = g.V(*curNodes).in(CFG_EDGE).toSet() - visited
  }
  if (nextNodes.isEmpty()) { return visited }

  visited.addAll(nextNodes)
  return _reachableCfgNodes(nextNodes.toList(), visited, forward)
}

/* Finds all nodes in the CFG forwards or backwards reachable from the current node */
addStep('reachableCfgNodes', { args_list ->
  def forward = args_list[0]
  g.V(*_reachableCfgNodes(delegate.statements().toList(), new HashSet(), forward).toList())
})

isInLoop = { it ->
  statement = it.statements().toList()
  _reachableCfgNodes(statement, new HashSet(), true).contains(statement[0])
}
