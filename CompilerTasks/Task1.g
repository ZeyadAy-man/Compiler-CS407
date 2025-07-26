grammar Task1;

run	:	arithmaticExpression;

arithmaticExpression:	( number (ArithmaticOperators arithmaticExpression)?) | ('(' arithmaticExpression ')');
number	:	(IntValue) | ID | (DoubleValue)| (triagnometricFunctions '(' arithmaticExpression ')');
ID:	(('a'..'z'|'A'..'Z'|'_'|'$')('0'..'9')*)+;
IntValue:	('+' | '-')? ('0'..'9')+;
DoubleValue:	('+' | '-')? IntValue '.' IntValue;
triagnometricFunctions:	'sin' | 'cos' | 'tan';
ArithmaticOperators:  '*' | '/' | '%' | '+' | '-';

WS:	(' '|'\n'|'\r'|'\t')+{skip();};	
