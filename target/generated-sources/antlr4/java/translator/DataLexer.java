// Generated from Data.g4 by ANTLR 4.7.1
package translator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DataLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WS=9, 
		ID=10, INT=11, DOUBLE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "WS", 
		"ID", "INT", "DOUBLE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.Dim'", "'='", "'structure'", "'('", "','", "')'", "'c'", "'<-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "WS", "ID", "INT", 
		"DOUBLE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DataLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Data.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16w\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\6\n"+
		"9\n\n\r\n\16\n:\3\n\3\n\3\13\6\13@\n\13\r\13\16\13A\3\13\7\13E\n\13\f"+
		"\13\16\13H\13\13\3\f\5\fK\n\f\3\f\6\fN\n\f\r\f\16\fO\3\r\5\rS\n\r\3\r"+
		"\5\rV\n\r\3\r\3\r\6\rZ\n\r\r\r\16\r[\3\r\3\r\7\r`\n\r\f\r\16\rc\13\r\3"+
		"\r\3\r\6\rg\n\r\r\r\16\rh\5\rk\n\r\3\r\3\r\5\ro\n\r\3\r\6\rr\n\r\r\r\16"+
		"\rs\5\rv\n\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\3\2\t\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\3\2//\3\2\62;"+
		"\3\2\63;\4\2GGgg\2\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5 \3\2\2\2\7\"\3\2\2\2"+
		"\t,\3\2\2\2\13.\3\2\2\2\r\60\3\2\2\2\17\62\3\2\2\2\21\64\3\2\2\2\238\3"+
		"\2\2\2\25?\3\2\2\2\27J\3\2\2\2\31R\3\2\2\2\33\34\7\60\2\2\34\35\7F\2\2"+
		"\35\36\7k\2\2\36\37\7o\2\2\37\4\3\2\2\2 !\7?\2\2!\6\3\2\2\2\"#\7u\2\2"+
		"#$\7v\2\2$%\7t\2\2%&\7w\2\2&\'\7e\2\2\'(\7v\2\2()\7w\2\2)*\7t\2\2*+\7"+
		"g\2\2+\b\3\2\2\2,-\7*\2\2-\n\3\2\2\2./\7.\2\2/\f\3\2\2\2\60\61\7+\2\2"+
		"\61\16\3\2\2\2\62\63\7e\2\2\63\20\3\2\2\2\64\65\7>\2\2\65\66\7/\2\2\66"+
		"\22\3\2\2\2\679\t\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3"+
		"\2\2\2<=\b\n\2\2=\24\3\2\2\2>@\t\3\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2A"+
		"B\3\2\2\2BF\3\2\2\2CE\t\4\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2"+
		"G\26\3\2\2\2HF\3\2\2\2IK\t\5\2\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\t\6\2"+
		"\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\30\3\2\2\2QS\t\5\2\2RQ\3\2"+
		"\2\2RS\3\2\2\2Sj\3\2\2\2TV\t\6\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\7\60"+
		"\2\2XZ\t\6\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\k\3\2\2\2]a\t"+
		"\7\2\2^`\t\6\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3"+
		"\2\2\2df\7\60\2\2eg\t\6\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik"+
		"\3\2\2\2jU\3\2\2\2j]\3\2\2\2ku\3\2\2\2ln\t\b\2\2mo\t\5\2\2nm\3\2\2\2n"+
		"o\3\2\2\2oq\3\2\2\2pr\t\6\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"tv\3\2\2\2ul\3\2\2\2uv\3\2\2\2v\32\3\2\2\2\21\2:AFJORU[ahjnsu\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}