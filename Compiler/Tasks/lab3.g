grammar lab3;
options{output=AST;}
tokens{
StartgeneralArithExpr;
GeneralArithExpr;
Decl;
Stmt;
}
@members {
String s="";
}
  
run 	:	stmt | mathmaticalExpression;


stmt	:	for_loop|
		if_stmt| 
		decl| 
		while_loop| 
		assigningVariable|
		printings_statements;

//Declaration of pointers (type * id;) //done
//Declaration of string (String s = "a";) //done
//Declaration of float (float f = 1.3;) //done
//Declaration of boolean //done 
//Declaration of char //done
//Declaration of Auto //done
//Declaration of objects id ids //done
//int a = 20, b = 10, c = 60; //done
//Declaration of arrays of any types
//Define Struct
//Declaration using a call of function
//Define struct without initialization
//Declaration with constants
//id id = 100;

decl	:	declOfInteger ';'|
		declOfDoubleAndFloat ';'|
		declOfBool ';'|
		declOfString ';'|
		declOfChar ';'|
		declOfAuto ';'|
		declOfPointer ';'|
		declOfObjects ';'|
		declOfArrays ';';



//
declOfBool:	'bool' ID ('=' (ID | 'true' | 'false' | expression))? (',' (ID ('=' (ID | 'true' | 'false' | expression))?))*;

declOfDoubleAndFloat:	('double' | 'float') ID ('=' (ID | DoubleNum))? (',' (ID ('=' (DoubleNum | ID))?))*;

declOfInteger:	 'int' ID ('=' (ID | IntNum))? (',' (ID ('=' (IntNum | ID))?))*;

declOfString:	'String' ID ('=' (ID | StringValue))? (',' (ID ('=' (StringValue | ID))?))*;		

declOfChar:	'char' ID ('=' (ID | CharValue))? (',' (ID ('=' (CharValue | ID))?))*;

declOfAuto:	'auto' ID ('=' (ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression))? (',' (ID ('=' (ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | expression))?))*;

declOfPointer:	('int' | 'double' | 'char' | 'String' | 'float' | ID) '*'ID ('=' '&'ID)? (',' '*'ID ('=' '&'ID)?)*;

declOfObjects:	ID ID ('=' 'new' ID '('  ')')? (',' (ID ('=' 'new' ID '('  ')')?))*;

declOfArrays:	('int' | 'double' | 'char' | 'String' | 'float')'['']' ID '=' 'new' ID '['IntNum']';

if_stmt	:	'if''('expression (LogicalOperators expression)*')''{' stmt* '}' ('else''{' stmt* '}')?;

//func_decl:	'void' |;

expression:	(ID ArithmaticOperators ID) 			   |
		(ID ArithmaticOperators (IntNum| DoubleNum)) 	   |
		((IntNum| DoubleNum) ArithmaticOperators ID) 	   |
		((IntNum| DoubleNum) ArithmaticOperators (IntNum| DoubleNum))
		  ;


assignment:	ID AssignmentAutoOperators 			   |
		AssignmentAutoOperators ID 			   |
		ID AssignmentOperators ((IntNum| DoubleNum) | ID) ;

assigningVariable:	ID '=' ((ID | IntNum | DoubleNum) (Operators (ID | IntNum | DoubleNum))*) ';' | assignment ';';

//String name;
		
for_loop:	'for''('declOfInteger* ';' (expression (LogicalOperators expression)*)* ';' assignment*')''{' stmt* '}';//decl'}';

while_loop:	'while''('expression (LogicalOperators expression)*')''{' stmt* '}';

mathmaticalExpression:	(ID | SignedNumber | IntNum | DoubleNum | '('mathmaticalExpression')' | TrigonometricFunctions'('mathmaticalExpression')')
			(Operators (ID | IntNum | DoubleNum | TrigonometricFunctions'('mathmaticalExpression')' | '('mathmaticalExpression')'))*;

printings_statements:	('cout' | 'cin' | 'cerr' | 'clog') '<<' (ID | StringValue | ((StringValue | ID) ('+' (StringValue | ID))+)) ('<<' (StringValue | ID | ((StringValue | ID) ('+' (StringValue | ID))+)))* ';';

//stringExpression:	(ID|StringValue) ('+' (ID|StringValue))* ;  
//arithmaticExpression: i * j + 3;

SignedNumber: '-' (IntNum | DoubleNum | ID);
TrigonometricFunctions:	 'sin' | 'cos' | 'tan'	;
IntNum:		('0'..'9')+;
DoubleNum:	IntNum '.'IntNum;
StringValue:	'\"'.*'\"';
CharValue:	'\''.'\'';			
ID:	(('a'..'z'|'A'..'Z'|'_'|'$')('0'..'9')*)+;
WS:	(' '|'\n'|'\r'|'\t')+{skip();};
Operators:	'-' | '+' | '*' | '/';
ArithmaticOperators: '==' | '<=' | '>=' | '!=' | '>' | '<';	
LogicalOperators:	'&&' | '||';
AssignmentOperators:	'+=' | '-=' | '*=' | '/=';
AssignmentAutoOperators:	'--' | '++';	