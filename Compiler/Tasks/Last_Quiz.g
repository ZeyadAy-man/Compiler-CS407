grammar Last_Quiz;

options{output=AST;}

tokens{
Parameter;
Statement;
For_Loop;
While_Loop;
Dowhile_Loop;
Main_Method_Declaration;
If_Statement;
Object_Declaration;
Run;
}

@members{
String s="";
}

run	:	(main_class_declaration class_declaration*);

// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
  // The finally clause is the last part a rule executes before returning.
  finally { s = s + "Exit..."+"\n"; }

stmt	:	for_loop						|
		if_stmt					|	 
		decl							| 
		while_loop						| 
		dowhile_loop						|
		printingStatements					|
		method_call ;

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

decl	:	(declOfInteger | declOfDoubleAndFloat | declOfBool | declOfString | declOfChar | declOfArrays)';';

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

printingStatements:	'System' '.' 'out' '.' printerStatement '(' printerValues? ('+' printerValues)* ')' ';';

printerStatement:	'print' | 'println';

printerValues:	(ID | stringExpression | integerValuesOnly | doubleAndFloatValuesOnly | CharValue);

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

declOfBool:	'bool' ID ('=' boolValues)? (',' ID ('=' boolValues)?)*;

boolValues:	(ID | 'true' | 'false' | booleanExpression);

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

declOfDoubleAndFloat:	doubleAndFloatTypes ID ('=' doubleAndFloatValues)? (',' (ID ('=' doubleAndFloatValues)?))*;

doubleAndFloatValues:	ID | doubleAndFloatValuesOnly;

doubleAndFloatValuesOnly:	DoubleNum | doubleExpression;

doubleAndFloatTypes:	('double' | 'float');

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

declOfInteger:	 'int' ID ('=' integerValues)? (',' (ID ('=' integerValues)?))*;

integerValues:	(ID | integerValuesOnly);

integerValuesOnly:	IntNum | integerExpression;
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

declOfString:	'String' ID ('=' stringValues)? (',' (ID ('=' stringValues)?))*;		

stringValues:	ID | stringValuesOnly;

stringValuesOnly:	StringValue | stringExpression;
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

declOfChar:	'char' ID ('=' charValues)? (',' (ID ('=' charValues)?))*;

charValues:	ID | CharValue;
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

//declOfAuto:	'auto' ID ('=' (ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | booleanExpression))? (',' (ID ('=' (ID | CharValue | StringValue | IntNum | DoubleNum | 'true' | 'false' | booleanExpression))?))*;

//declOfPointer:	('int' | 'double' | 'char' | 'String' | 'float' | ID) '*'ID ('=' '&'ID)? (',' '*'ID ('=' '&'ID)?)*;

//declOfObjects:	ID ID ('=' 'new' ID '('  ')')? (',' (ID ('=' 'new' ID '('  ')')?))*
//		-> ^(Object_Declaration (ID ID ('=' 'new' ID '('  ')')? (',' (ID ('=' 'new' ID '('  ')')?))*));

  //catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  //catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  //catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

declOfArrays:	arrayTypes'['']' ID '=' 'new' arrayTypes '['IntNum']';

arrayTypes:	('int' | 'double' | 'char' | 'String' | 'float');
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

if_stmt	:	ifOnly elseIfOnly elseOnly;

ifOnly	:	'if''('booleanExpression (LogicalOperators booleanExpression)*')''{' stmt* '}';

elseIfOnly:	('else' 'if' '(' booleanExpression (LogicalOperators booleanExpression)* ')' '{' stmt* '}')*;

elseOnly:	('else''{' stmt* '}')?;

  //catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  //catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  //catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

//booleanExpression:	 (numberBooleanExpression | trueFalseBooleanExpression | stringBooleanExpression) ;

//numberBooleanExpression:	numbersValues ArithmaticOperators numbersValues;

//trueFalseBooleanExpression:	booleanValues ('==' | '!=') booleanValues;

//stringBooleanExpression:	stringValues ('==' | '!=') stringValues;

//booleanValues:	booleanValuesOnly | ID;

//booleanValuesOnly:	('true' | 'false') (LogicalOperators ('true' | 'false'))*;

//numbersValues:	(numberValuesOnly | ID);	

boolExpression:		;

trueFalseExpression
	:	('true' | 'false' | ID);
booleanExpression:	(booleanValues (('==' | '!=') booleanValues)?);
booleanValues	:	('true' | 'false' | ID);
numberValuesOnly:	IntNum | DoubleNum;			
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


stringExpression:	((ID | StringValue) ('+' (ID | StringValue))+) 	;

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

integerExpression:	((ID | IntNum) (('+' | '-' | '*' | '/' | '%') (ID | IntNum))+) ;

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

doubleExpression:	((ID | DoubleNum) (('+' | '-' | '*' | '/' | '%') (ID | DoubleNum))+) ;

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

assignment:	ID AssignmentAutoOperators 			   |
		AssignmentAutoOperators ID 			   |
		ID AssignmentOperators ((IntNum | DoubleNum) | ID) ;
		
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

//assigningVariable:	ID '=' ((ID | IntNum | DoubleNum) (Operator (ID | IntNum | DoubleNum))*) ';' | assignment ';';

  //catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  //catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  //catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
		
for_loop:	'for''('declOfInteger* ';' (booleanExpression (LogicalOperators booleanExpression)*)* ';' assignment*')''{' stmt* '}' ;

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

while_loop:	'while''('booleanExpression (LogicalOperators booleanExpression)*')''{' stmt* '}';

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

dowhile_loop:	'do' '{' stmt* '}' 'while' '(' booleanExpression (LogicalOperators booleanExpression)* ')' ';';

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

//switch_cases:	'switch' '('  ')' '{'  '}';

//enum_declaration:	;
class_declaration:	(('private' | 'protected'))? (('final' | 'abstract'))? 'class' ID '{' ((void_method_declaration | method_declaration))* '}';

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

main_method_declaration:	'public' 'static' 'void' 'main' '(' 'String' '['']' 'args' ')' '{' stmt* '}';

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

main_class_declaration:		'public' ('final' | 'abstract')? 'class'  ID '{' main_method_declaration ((void_method_declaration | method_declaration))* '}';

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

void_method_declaration:	(('public' | 'private' | 'protected'))? (('static' | 'abstract' | 'final'))? ('void') ID '(' parameters? (',' parameters)* ')' '{' stmt*'}';

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

method_declaration:	(('public' | 'private' | 'protected'))? (('static' | 'abstract' | 'final'))? ('int' | 'String' | 'double' | 'char' | ID)^ ID '(' parameters? (',' parameters)* ')' '{' stmt* ('return' (ID | IntNum | DoubleNum | StringValue | CharValue | stringExpression | doubleExpression | integerExpression | booleanExpression))'}';

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

method_call:	ID '(' ((ID | CharValue | StringValue | stringExpression | IntNum | integerExpression | DoubleNum | doubleExpression | booleanExpression (('&&' | '||') booleanExpression)*)?) (',' (ID | CharValue | StringValue | stringExpression | IntNum | integerExpression | DoubleNum | doubleExpression | booleanExpression (('&&' | '||') booleanExpression)*))* ')' ';';

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

parameters:	(('int' | 'double' | 'String' | 'char' | 'boolean' | ID) ID);

  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

//mathmaticalExpression:	(ID | SignedNumber | IntNum | DoubleNum | '('mathmaticalExpression')' | TrigonometricFunctions'('mathmaticalExpression')')
//			(('+' | '-' | '/' | '*' | '%') (ID | IntNum | DoubleNum | TrigonometricFunctions'('mathmaticalExpression')' | '('mathmaticalExpression')'))*;
modifiers_A:	'public' | 'private' | 'protected';
modifiers_B:	'static' | 'abstract' | 'final';
signedNumber: '-' (IntNum | DoubleNum | ID);
TrigonometricFunctions:	 'sin' | 'cos' | 'tan'	;
IntNum:		('0'..'9')+;
DoubleNum:	IntNum '.' IntNum;
StringValue:	'\"'.*'\"';
CharValue:	'\''.'\'';			
ID:	(('a'..'z'|'A'..'Z'|'_'|'$')('0'..'9')*)+;
WS:	(' '|'\n'|'\r'|'\t')+{skip();};
//Operators:	'-' | '+' | '*' | '/' | '%';
ArithmaticOperators: '==' | '<=' | '>=' | '!=' | '>' | '<';	
LogicalOperators:	'&&' | '||';
AssignmentOperators:	'+=' | '-=' | '*=' | '/=';
AssignmentAutoOperators:	'--' | '++';	
