// $ANTLR 3.4 C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g 2025-07-24 00:42:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Task1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ArithmaticOperators", "DoubleValue", "ID", "IntValue", "WS", "'('", "')'", "'cos'", "'sin'", "'tan'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int ArithmaticOperators=4;
    public static final int DoubleValue=5;
    public static final int ID=6;
    public static final int IntValue=7;
    public static final int WS=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Task1Parser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Task1Parser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Task1Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g"; }



    // $ANTLR start "run"
    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:3:1: run : arithmaticExpression ;
    public final void run() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:3:5: ( arithmaticExpression )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:3:7: arithmaticExpression
            {
            pushFollow(FOLLOW_arithmaticExpression_in_run10);
            arithmaticExpression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "run"



    // $ANTLR start "arithmaticExpression"
    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:1: arithmaticExpression : ( ( number ( ArithmaticOperators arithmaticExpression )? ) | ( '(' arithmaticExpression ')' ) |);
    public final void arithmaticExpression() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:21: ( ( number ( ArithmaticOperators arithmaticExpression )? ) | ( '(' arithmaticExpression ')' ) |)
            int alt2=3;
            switch ( input.LA(1) ) {
            case DoubleValue:
            case ID:
            case IntValue:
            case 11:
            case 12:
            case 13:
                {
                alt2=1;
                }
                break;
            case 9:
                {
                alt2=2;
                }
                break;
            case EOF:
            case 10:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:23: ( number ( ArithmaticOperators arithmaticExpression )? )
                    {
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:23: ( number ( ArithmaticOperators arithmaticExpression )? )
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:25: number ( ArithmaticOperators arithmaticExpression )?
                    {
                    pushFollow(FOLLOW_number_in_arithmaticExpression19);
                    number();

                    state._fsp--;


                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:32: ( ArithmaticOperators arithmaticExpression )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==ArithmaticOperators) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:33: ArithmaticOperators arithmaticExpression
                            {
                            match(input,ArithmaticOperators,FOLLOW_ArithmaticOperators_in_arithmaticExpression22); 

                            pushFollow(FOLLOW_arithmaticExpression_in_arithmaticExpression24);
                            arithmaticExpression();

                            state._fsp--;


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:79: ( '(' arithmaticExpression ')' )
                    {
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:79: ( '(' arithmaticExpression ')' )
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:80: '(' arithmaticExpression ')'
                    {
                    match(input,9,FOLLOW_9_in_arithmaticExpression32); 

                    pushFollow(FOLLOW_arithmaticExpression_in_arithmaticExpression34);
                    arithmaticExpression();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_arithmaticExpression36); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:5:112: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "arithmaticExpression"



    // $ANTLR start "number"
    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:1: number : ( ( IntValue ) | ID | ( DoubleValue ) | ( triagnometricFunctions '(' arithmaticExpression ')' ) );
    public final void number() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:8: ( ( IntValue ) | ID | ( DoubleValue ) | ( triagnometricFunctions '(' arithmaticExpression ')' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case IntValue:
                {
                alt3=1;
                }
                break;
            case ID:
                {
                alt3=2;
                }
                break;
            case DoubleValue:
                {
                alt3=3;
                }
                break;
            case 11:
            case 12:
            case 13:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:10: ( IntValue )
                    {
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:10: ( IntValue )
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:11: IntValue
                    {
                    match(input,IntValue,FOLLOW_IntValue_in_number48); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:23: ID
                    {
                    match(input,ID,FOLLOW_ID_in_number53); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:28: ( DoubleValue )
                    {
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:28: ( DoubleValue )
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:29: DoubleValue
                    {
                    match(input,DoubleValue,FOLLOW_DoubleValue_in_number58); 

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:43: ( triagnometricFunctions '(' arithmaticExpression ')' )
                    {
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:43: ( triagnometricFunctions '(' arithmaticExpression ')' )
                    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:6:44: triagnometricFunctions '(' arithmaticExpression ')'
                    {
                    pushFollow(FOLLOW_triagnometricFunctions_in_number63);
                    triagnometricFunctions();

                    state._fsp--;


                    match(input,9,FOLLOW_9_in_number65); 

                    pushFollow(FOLLOW_arithmaticExpression_in_number67);
                    arithmaticExpression();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_number69); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "number"



    // $ANTLR start "triagnometricFunctions"
    // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:10:1: triagnometricFunctions : ( 'sin' | 'cos' | 'tan' );
    public final void triagnometricFunctions() throws RecognitionException {
        try {
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:10:23: ( 'sin' | 'cos' | 'tan' )
            // C:\\Users\\zizoa\\Desktop\\CompilerTasks\\Task1.g:
            {
            if ( (input.LA(1) >= 11 && input.LA(1) <= 13) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "triagnometricFunctions"

    // Delegated rules


 

    public static final BitSet FOLLOW_arithmaticExpression_in_run10 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_arithmaticExpression19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ArithmaticOperators_in_arithmaticExpression22 = new BitSet(new long[]{0x0000000000003AE0L});
    public static final BitSet FOLLOW_arithmaticExpression_in_arithmaticExpression24 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_arithmaticExpression32 = new BitSet(new long[]{0x0000000000003EE0L});
    public static final BitSet FOLLOW_arithmaticExpression_in_arithmaticExpression34 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_arithmaticExpression36 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntValue_in_number48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_number53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DoubleValue_in_number58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triagnometricFunctions_in_number63 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_number65 = new BitSet(new long[]{0x0000000000003EE0L});
    public static final BitSet FOLLOW_arithmaticExpression_in_number67 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_number69 = new BitSet(new long[]{0x0000000000000002L});

}