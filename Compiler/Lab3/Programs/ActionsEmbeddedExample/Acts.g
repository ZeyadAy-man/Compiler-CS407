// Testing Actions Embedded within Rules

grammar Acts;
options {
language=Java;
}
@members {

}

// New
r returns [int n, String s]
@init {
$n=0; // init return value
$s="abc
}
@after {
s = "abc"; System.out.println("returning value n="+$n + " " + $s);
}
: 'a' '#' {$n=23;}
|'b' '#' {$n=9;}
|'c' '#' {$n=1;}
|'d' '#'  // use initialized value of n
;
ID: 'a'..'z'+ ;

WS: (' '|'\n'|'\r')+ {skip();} ; // ignore whitespace




