// Testing the greedy option with multiline comments.

grammar Gre;
options {
language=Java;
}
@members {
String s = "abc";
}
r : ID '#' {System.out.println("found "+ s + "lol");} ;
ID: 'a'..'z'+ ;

// New
ML_COMMENT
	:	'/*' ( options {greedy=false;} : . )* '*/' {skip();} ;
//ML_COMMENT1
	//:	'/*' (  . )* '*/' {skip();}; // Equivalent but without greedy option (ANTLR automatically makes these two subrules �.*� and�.+� nongreedy. So, you can use�.*� instead of manually specifying the option)

WS: (' '|'\n'|'\r')+ {skip();} ; // ignore whitespace


