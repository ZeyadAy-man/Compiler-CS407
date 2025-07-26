grammar Compiler_Project_Grammar;


run	:	Function_Type;


parameter:	Type Identifier ('/' parameter)*; //what is this meaning?
parameters:	parameter*; //what is this meaning?
parameter_list:		'(' parameters ')'; //what is this meaning?
expression:	Identifier '=' expression 	|
		Identifier '(' arguments ')'	|
		Literal				|
		Identifier '.' Identifier	|
		Identifier Operator Identifier	; //what is this meaning?? what are the content of this parser?
arguments:	expression*; //what is this meaning?

/////////////////////////////////////////

main:	'int' 'main' '(' ')' '{' Literal '}'	; //done but mismatchedTokens when using strings!
function_declaration:	Return_Type Identifier parameter_list	;	
variable_declaration:	Type Identifier ('=' expression)? ';'	; //need to be completed (missed cases).
return_statement:	'return' expression ';'	;
do_while_statement:	'do' statements 'while' '(' expression ')' ';'	;
while_statement:	'while' '(' expression ')' '{' statements '}'	;
for_statement:	'for' '(' variable_declaration ';' expression ';' expression ')' '{' statements '}'	;
default_statement:	'default' ':' statements ';'	;
case_statement:		'case' Literal ':' '{' statements '}' ;
switch_statement:	'switch' '(' expression ')' '{' case_statement* default_statement? '}'	;
if_statement:	'if' '(' expression ')' '{' statements '}' |
		'if' '(' expression ')' '{' statements '}' 'else' '{' statements '}';
statement:	expression ';'		|
		variable_declaration	|
		if_statement		|
		switch_statement	|
		for_statement		|
		while_statement		|
		do_while_statement	|
		return_statement	|	;
statements:	statement*;

//////////////////////////////////
Literal	:	Int_Literal 	|
		Double_Literal	|
		String_Literal	|
		Bool_Literal	|
		Char_Literal	; //done checked
Int_Literal: Digit+; //done checked
Double_Literal: (Digit* '.' Digit+) | (Digit+ '.' Digit*); //Changed by zeyad
Char_Literal: '\'' (.) '\''; //done checked
String_Literal: '"' .* '"'	; //done checked
Bool_Literal: 'true'|'false'; //done checked
Operator: '+'|'-'|'/'|'*'|'%'; //done checked
Visibility_Specifier: 'public'|'protected'|'private'; //done checked
Return_Type: Type; //done checked
Function_Type:	Type | 'void'	;
Type: 'int'|'double'|'char'|'bool'|Identifier; //done checked but meaningless, i want to separate void of them.
Identifier: Letter Identifier_Part*; //done checked	
Identifier_Part: Letter|Digit;	//done checked
Letter	: 'a'..'z'|'A'..'Z'|'_'|'$'; //done checked
Digit	: '0'..'9'; //done checked

WS	:	('\n' | '\r' | '\t' | ' ')+ {skip();};