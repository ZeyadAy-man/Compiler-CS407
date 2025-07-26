grammar Test_Compiler_Project;

main_method	:	Identifier;



//variable_declaration:	integer_declaration 	;
//integer_declaration: 
//			'int' Identifier '=' (Digit+ | Identifier) ';';
			//'int' Identifier ';';


//Int_Literal: Digit+; //done checked
//Double_Literal: (Digit* '.' Digit+) | (Digit+ '.' Digit*); //Changed by zeyad
Char_Literal: '\'' (.) '\''; //done checked
String_Literal: '\"' .* '\"'	; //done checked
Bool_Literal: 'true'|'false'; //done 
Operator: '+'|'-'|'/'|'*'|'%'; //done
Visibility_Specifier: 'public'|'protected'|'private'; //done
Return_Type:	'int'|'double'|'char'|'bool' | 'void'	; //done
Identifier: (('a'..'z'|'A'..'Z'|'_'|'$')('0'..'9')*)+;	//done checked
Letter	: ('a'..'z'|'A'..'Z'|'_'|'$'); //done needs to be checked
Digit	: '0'..'9'; //done checked

WS	:	('\n' | '\r' | '\t' | ' ')+ {skip();};