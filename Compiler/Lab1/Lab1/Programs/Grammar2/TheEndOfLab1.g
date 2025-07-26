grammar TheEndOfLab1;

@members{
   String s1;
   String s2;
   String s3;
   String s4;
   String s5;
}

option{langauage=Java}


decl	:	('int' '=' INT ';') | ('double' '=' DOUBLE ';') {s1 = $ID.text; s2 = $DOUBLE.text; s3 = $INT.text; System.out.println(s1 + " " + s2 + " " + s3);};
ID	:	('a'..'z'|'A'..'Z'|'_'|'$')+('a'..'z'|'A'..'Z'|'_'|'$'|'0'..'9')*;
DOUBLE	:	INT '.' INT;
INT	:	'0'..'9';
COMMENT	:	'//' options{greedy=false} '\n';
WS	:	('\r' | '\n' | ' ')+ {skip();};