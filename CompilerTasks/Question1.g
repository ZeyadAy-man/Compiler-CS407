grammar Question1;
run	:	phoneAttr ',' emailAttr;

phoneAttr:	phoneName phoneValue;
emailAttr:	emailName emailValue;

phoneName:	'phone' ':';
phoneValue:	IntValue;

emailName:	'email' ':';
emailValue:	ID '@' ('gmail' | 'hotmail')'.com';
//Periority is important in grammar!!!!!!!!! <<<<<<<<<<<<<<===========
//If something already matches the tokens but not refered to it in the interpreter
//it will cause mismatched error, since it's detected and its parser exists
//but you are using the wrong parser, bro!!
ID:	(('a'..'z'|'A'..'Z'|'_'|'$')('0'..'9')*)+;
WS:	(' '|'\n'|'\r'|'\t')+{skip();};	
IntValue:	('0'..'9') ('0'..'9') ('0'..'9');

