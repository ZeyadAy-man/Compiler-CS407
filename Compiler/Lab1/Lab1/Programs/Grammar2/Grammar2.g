grammar Grammar2;

run	:	DoubleValue;

IntValue:	'0'..'9';
DoubleValue
	:	IntValue+ '.' IntValue+;
StringValue:	'*';
