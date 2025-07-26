// Testing Rule Exception Handling
grammar RuleExceps;

options {
language=Java;
}
@members {

}
// New
r 
@after {
System.out.println("after: In after actions...");
}
:  ID '#'
;
  // catch blocks go first
  catch[MismatchedTokenException me] { System.out.println("found MismatchedException"); }
  catch[NoViableAltException ve] { System.out.println("found NoViableAltException"); }
  catch[RecognitionException re] { System.out.println("found RecognitionException"); }
  // The finally clause is the last part a rule executes before returning.
  finally { System.out.println("finally: exit rule r"); }
  
ID: 'a'..'z'+ ;
WS: (' '|'\n'|'\r')+ {skip();} ; // ignore whitespace




