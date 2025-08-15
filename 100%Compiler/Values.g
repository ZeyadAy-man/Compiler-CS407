grammar Values;

run	:	stmts+;

stmts	:	ifStmt | numberDeclarations | whileStmt | dowhileStmt | forStmt | assignmentStmt | booleanDeclarations | comment;

body	:	'{' (stmts)* '}';

functionStmt:	functionDeclaration functionBody;

functionBody:	'{' (stmts)* ('return' (fullBooleanExpressions | numberExpression) ';')? '}';

functionDeclaration:	modifiers? 'static'? functionReturnType ID '(' ')' ;

forStmt	:	'for' '(' numberDeclarations   fullBooleanExpressions ';' assignmentStmt (',' assignmentStmt)* ')' body;

dowhileStmt:	'do' body 'while' '(' fullBooleanExpressions ')' ';';

whileStmt:	'while' '(' fullBooleanExpressions ')' body;

ifStmt	:	(if body) (elseIf body)* (else body)?;

elseIf	:	'else' 'if' '(' fullBooleanExpressions ')';

else	:	'else';

if	:	'if' '(' fullBooleanExpressions ')';

fullBooleanExpressions:	  (booleanExpressions (LogicalOperators booleanExpressions)*);

//change the first parser from numberExpression to number!
booleanExpressions:	(number ComparisonOperators numberExpression) | booleanValue;

numberDeclarations:	('int' | 'double') ID (('=' numberExpression  (ArithmaticOperators  numberExpression )*) | (',' ID)*) ';';

booleanDeclarations:	'boolean' ID '=' fullBooleanExpressions ';';

numberExpression:	(number (ArithmaticOperators numberExpression )?) ;

number	:	IntValue | DoubleValue | ID ;

assignmentStmt:		ID (AssignmentAutoOperators | (AssignmentOperators number) );

comment	:	Comment;

ID:	(('a'..'z'|'A'..'Z'|'_'|'$')('0'..'9')*)+;
IntValue:	('0'..'9')+;
DoubleValue:	IntValue '.' IntValue;
StringValue:	'\"'.*'\"';
CharValue:	'\''.?'\'';
Comment	:	'//' (.)* '\n';
booleanValue:	'true' | 'false';
	
WS:	(' '|'\n'|'\r'|'\t')+{skip();};	
ArithmaticOperators:	'+' | '-' | '*' | '/' | '%';	
ComparisonOperators: '==' | '<=' | '>=' | '!=' | '>' | '<';	
LogicalOperators:	'&&' | '||';
AssignmentOperators:	'+=' | '-=' | '*=' | '/=';
AssignmentAutoOperators:	'--' | '++';	
modifiers:	'public' | 'private' | 'protected';
functionReturnType:	'void' | 'int' | 'double' | 'boolean';