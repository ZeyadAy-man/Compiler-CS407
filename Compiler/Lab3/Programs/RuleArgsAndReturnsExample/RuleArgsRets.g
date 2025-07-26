// Testing Rule Arguments and Returns
grammar RuleArgsRets;

options {
language=Java;
}
@members {

}
// New
r [int a, String b] returns [int c, String d]	:  ID '#' {$c=$a; $d=$b; System.out.println($c + " " + $d);} ;
ID: 'a'..'z'+ ;
// Calling r in another rule s
// The rule s matches ID # then matches the body of r which is of the form ID #
s	:	ID '#' v=r[3,"my grammar string"] {System.out.println($v.d);} ;

WS: (' '|'\n'|'\r')+ {skip();} ; // ignore whitespace



