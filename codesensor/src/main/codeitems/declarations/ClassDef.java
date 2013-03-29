package main.codeitems.declarations;

import main.codeitems.CodeItem;
import main.codeitems.CodeItemVisitor;
import main.codeitems.Name;
import main.codeitems.functionContent.CompoundItem;

public class ClassDef extends CodeItem
{
	
	public Name name;
	public CompoundItem content;
	
	public ClassDef()
	{
		nodeTypeName = "class";
		codeStr = "";
	}
	
	public Name getName()
	{
		return name;
	}

	public void accept(CodeItemVisitor visitor){ visitor.visit(this); }
	
}
