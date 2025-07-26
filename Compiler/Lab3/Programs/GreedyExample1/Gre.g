// Testing the greedy option with multiline comments.

grammar Gre;
options {
language=Java;
}
@members {
String s;
}
r : ID '#' {s = $ID.text; System.out.println("found "+s);} ;
//r1	:	ML_COMMENT;
ID: 'a'..'z'+ ;

// New
ML_COMMENT
	:	'/*' ( options {greedy=false;} : . )* '*/';
//ML_COMMENT1
	//:	'/*' (  . )* '*/' ; // Equivalent but without greedy option (ANTLR automatically makes these two subrules �.*� and�.+� nongreedy. So, you can use�.*� instead of manually specifying the option)

WS: (' '|'\n'|'\r')+ {skip();} ; // ignore whitespace


