#!/bin/bash
antlr4='java -jar ./lib/antlr-4.5-complete.jar'

$antlr4 src/antlr/C/Module.g4
$antlr4 src/antlr/C/Function.g4

