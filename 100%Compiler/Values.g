grammar Values;

run	:	stmts;

stmts	:	ifStmt | numberDeclarations | whileStmt | dowhileStmt | forStmt | assignmentStmt | booleanDeclarations;

body	:	'{' (stmts)* '}';

//functionBody:	'{' (stmts)* 'return' value '}';

functionDeclaration:	modifiers? 'static'? functionReturnType ID '(' ')' ;

forStmt	:	'for' '(' numberDeclarations   fullBooleanExpressions ';' assignmentStmt (',' assignmentStmt)* ')' body;

dowhileStmt:	'do' body 'while' '(' fullBooleanExpressions ')' ';';

whileStmt:	'while' '(' fullBooleanExpressions ')' body;

ifStmt	:	(if body) (elseIf body)* (else body)?;

elseIf	:	'else' 'if' '(' fullBooleanExpressions ')';

else	:	'else';

if	:	'if' '(' fullBooleanExpressions ')';

fullBooleanExpressions:	  (booleanExpressions (LogicalOperators booleanExpressions)*);

booleanExpressions:	(numberExpression ComparisonOperators numberExpression) | booleanValue;

numberDeclarations:	('int' | 'double') ID '='   numberExpression  (ArithmaticOperators  numberExpression )* ';';

booleanDeclarations:	'boolean' ID '=' fullBooleanExpressions ';';

numberExpression:	(number (ArithmaticOperators numberExpression )?) ;

number	:	IntValue | DoubleValue | ID ;

assignmentStmt:		ID (AssignmentAutoOperators | (AssignmentOperators number) );

//value	:	booleanExpressions | numberExpression;

ID:	(('a'..'z'|'A'..'Z'|'_'|'$')('0'..'9')*)+;
IntValue:	('0'..'9')+;
DoubleValue:	IntValue '.' IntValue;
StringValue:	'\"'.*'\"';
CharValue:	'\''.?'\'';
booleanValue:	'true' | 'false';
	
WS:	(' '|'\n'|'\r'|'\t')+{skip();};	
ArithmaticOperators:	'+' | '-' | '*' | '/' | '%';	
ComparisonOperators: '==' | '<=' | '>=' | '!=' | '>' | '<';	
LogicalOperators:	'&&' | '||';
AssignmentOperators:	'+=' | '-=' | '*=' | '/=';
AssignmentAutoOperators:	'--' | '++';	
modifiers:	'public' | 'private' | 'protected';
functionReturnType:	'void' | 'int' | 'double' | 'boolean';