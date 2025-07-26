grammar Task1;

decl:	if_dec | declaration | Comment | MultilevelComment | mathimaticalStatementWithPriority;


//Declaration is done
mathimaticalStatement: ('('(IntNumWithSign) (Operators (TrigomatricFunctions | IntNum)))*;	
declaration:	  (IntType ID '='IntNum ';' | IntType ID (',' ID)* ';' | IntType ID '=' ID (Operators (ID | IntNum))* ';' | DoubleType ID '=' (DoubleNum | IntNum) ';' | DoubleType ID (',' ID)* ';' | DoubleType ID '=' ID (Operators (ID | DoubleNum | IntNum))+ ';')+;	
if_dec:	('if('Expression (LogicalOperators Expression)*'){'declaration'}' ('else if('Expression (LogicalOperators Expression)*'){'declaration'}')*) | (('if('Expression (LogicalOperators Expression)*'){'declaration'}' ('else if('Expression (LogicalOperators Expression)*'){'declaration'}')*)'else{'declaration'}');
mathimaticalStatementWithPriority:	('('mathimaticalStatement')')*;	
TrigomatricFunctions:	(('sin('(IntNum | ID | DoubleNum) (Operators (ID | IntNum | DoubleNum))*')') | ('cos('(IntNum | ID | DoubleNum)(Operators (ID | IntNum | DoubleNum))*')') | 'tan('(IntNum | ID | DoubleNum)(Operators (ID | IntNum | DoubleNum))*')');
IntType:	'int';
Operators:	('+'|'-'|'*'|'/');	
DoubleType:	 'double';
IntNumWithSign: ('-')(IntNum | ID | TrigomatricFunctions);
IntNum:		('0'..'9')+;
DoubleNum:	IntNum '.'IntNum;			
ID:	(('a'..'z'|'A'..'Z'|'_'|'$')('0'..'9')*)+;
WS:	(' '|'\n'|'\r'|'\t')+{skip();};
Comment	:	('//' ~('\r' | '\n')* ('\n'));
MultilevelComment:	'/*' ~('`')* '*/';	
Expression:	('true'|'false'|(ID ArithmaticOperators ID)|(ID ArithmaticOperators (IntNum | DoubleNum)) | ((IntNum | DoubleNum) ArithmaticOperators ID))  ((LogicalOperators ((ID ArithmaticOperators ID) | (ID ArithmaticOperators (IntNum | DoubleNum)) | ((IntNum | DoubleNum) ArithmaticOperators ID))))*;
LogicalOperators:		('&&' | '||');
ArithmaticOperators: '==' | '<=' | '>=' | '!=' | '>' | '<';
				