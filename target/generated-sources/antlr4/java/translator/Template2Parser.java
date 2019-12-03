// Generated from Template2.g4 by ANTLR 4.7.1
package translator;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Template2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, FUNCTION=41, INTEGERTYPE=42, FLOATTYPE=43, INT=44, 
		DOUBLE=45, DISTHOLE=46, CONSTHOLE=47, DISTXHOLE=48, COMPLEX=49, WS=50, 
		ID=51, STRING=52;
	public static final int
		RULE_primitive = 0, RULE_number = 1, RULE_dtype = 2, RULE_array = 3, RULE_vector = 4, 
		RULE_dims = 5, RULE_vectorDIMS = 6, RULE_decl = 7, RULE_limits = 8, RULE_data = 9, 
		RULE_prior = 10, RULE_param = 11, RULE_params = 12, RULE_distexpr = 13, 
		RULE_loopcomp = 14, RULE_for_loop = 15, RULE_if_stmt = 16, RULE_else_blk = 17, 
		RULE_function_call = 18, RULE_fparam = 19, RULE_fparams = 20, RULE_return_or_param_type = 21, 
		RULE_function_decl = 22, RULE_block = 23, RULE_transformedparam = 24, 
		RULE_transformeddata = 25, RULE_generatedquantities = 26, RULE_functions = 27, 
		RULE_expr = 28, RULE_assign = 29, RULE_observe = 30, RULE_statement = 31, 
		RULE_query = 32, RULE_template = 33;
	public static final String[] ruleNames = {
		"primitive", "number", "dtype", "array", "vector", "dims", "vectorDIMS", 
		"decl", "limits", "data", "prior", "param", "params", "distexpr", "loopcomp", 
		"for_loop", "if_stmt", "else_blk", "function_call", "fparam", "fparams", 
		"return_or_param_type", "function_decl", "block", "transformedparam", 
		"transformeddata", "generatedquantities", "functions", "expr", "assign", 
		"observe", "statement", "query", "template"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "','", "'<'", "'>'", "'lower'", "'='", "'upper'", 
		"':'", "':='", "'('", "')'", "'for'", "'in'", "'if'", "'else'", "'void'", 
		"'{'", "'}'", "'transformedparam'", "'transformeddata'", "'generatedquantities'", 
		"'functions'", "'''", "'?'", "'^'", "'/'", "'*'", "'+'", "'-'", "'./'", 
		"'.*'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'observe'", "'posterior'", 
		"'expectation'", null, "'int'", "'float'", null, null, "'DIST'", "'CONST'", 
		"'DISTX'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "FUNCTION", "INTEGERTYPE", "FLOATTYPE", 
		"INT", "DOUBLE", "DISTHOLE", "CONSTHOLE", "DISTXHOLE", "COMPLEX", "WS", 
		"ID", "STRING"
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

	@Override
	public String getGrammarFileName() { return "Template2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Template2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrimitiveContext extends ParserRuleContext {
		public TerminalNode INTEGERTYPE() { return getToken(Template2Parser.INTEGERTYPE, 0); }
		public TerminalNode FLOATTYPE() { return getToken(Template2Parser.FLOATTYPE, 0); }
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitPrimitive(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==INTEGERTYPE || _la==FLOATTYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Template2Parser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(Template2Parser.DOUBLE, 0); }
		public TerminalNode CONSTHOLE() { return getToken(Template2Parser.CONSTHOLE, 0); }
		public VectorDIMSContext vectorDIMS() {
			return getRuleContext(VectorDIMSContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_number);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(DOUBLE);
				}
				break;
			case CONSTHOLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(CONSTHOLE);
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(73);
					vectorDIMS();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode COMPLEX() { return getToken(Template2Parser.COMPLEX, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitDtype(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dtype);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				primitive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(79);
				primitive();
				setState(80);
				match(T__0);
				setState(81);
				dims();
				setState(82);
				match(T__1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(COMPLEX);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<VectorContext> vector() {
			return getRuleContexts(VectorContext.class);
		}
		public VectorContext vector(int i) {
			return getRuleContext(VectorContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__0);
				setState(88);
				expr(0);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(89);
					match(T__2);
					setState(90);
					expr(0);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__0);
				setState(99);
				array();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(100);
					match(T__2);
					setState(101);
					array();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(T__0);
				setState(110);
				vector();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(111);
					match(T__2);
					setState(112);
					vector();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(T__0);
				setState(121);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<VectorContext> vector() {
			return getRuleContexts(VectorContext.class);
		}
		public VectorContext vector(int i) {
			return getRuleContext(VectorContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vector);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__3);
				setState(125);
				expr(0);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(126);
					match(T__2);
					setState(127);
					expr(0);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__3);
				setState(136);
				vector();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(137);
					match(T__2);
					setState(138);
					vector();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__3);
				setState(147);
				array();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(148);
					match(T__2);
					setState(149);
					array();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(T__3);
				setState(158);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			expr(0);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(162);
				match(T__2);
				setState(163);
				expr(0);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorDIMSContext extends ParserRuleContext {
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VectorDIMSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorDIMS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterVectorDIMS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitVectorDIMS(this);
		}
	}

	public final VectorDIMSContext vectorDIMS() throws RecognitionException {
		VectorDIMSContext _localctx = new VectorDIMSContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vectorDIMS);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__3);
			setState(170);
			dims();
			setState(171);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Template2Parser.ID, 0); }
		public LimitsContext limits() {
			return getRuleContext(LimitsContext.class,0);
		}
		public List<DimsContext> dims() {
			return getRuleContexts(DimsContext.class);
		}
		public DimsContext dims(int i) {
			return getRuleContext(DimsContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			dtype();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(174);
				limits();
				}
			}

			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(177);
				match(T__0);
				setState(178);
				dims();
				setState(179);
				match(T__1);
				}
			}

			setState(183);
			match(ID);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(184);
				match(T__0);
				setState(185);
				dims();
				setState(186);
				match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LimitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterLimits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitLimits(this);
		}
	}

	public final LimitsContext limits() throws RecognitionException {
		LimitsContext _localctx = new LimitsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_limits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__3);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(191);
				match(T__5);
				setState(192);
				match(T__6);
				setState(193);
				expr(0);
				setState(194);
				match(T__2);
				setState(195);
				match(T__7);
				setState(196);
				match(T__6);
				setState(197);
				expr(0);
				}
				break;
			case 2:
				{
				setState(199);
				match(T__5);
				setState(200);
				match(T__6);
				setState(201);
				expr(0);
				}
				break;
			case 3:
				{
				setState(202);
				match(T__7);
				setState(203);
				match(T__6);
				setState(204);
				expr(0);
				}
				break;
			}
			setState(207);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Template2Parser.ID, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DistexprContext distexpr() {
			return getRuleContext(DistexprContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitData(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(209);
				match(ID);
				setState(210);
				match(T__8);
				setState(211);
				dtype();
				}
				break;
			case 2:
				{
				setState(212);
				match(ID);
				setState(213);
				match(T__8);
				setState(214);
				expr(0);
				}
				break;
			case 3:
				{
				setState(215);
				match(ID);
				setState(216);
				match(T__8);
				setState(217);
				array();
				}
				break;
			case 4:
				{
				setState(218);
				match(ID);
				setState(219);
				match(T__8);
				setState(220);
				distexpr();
				}
				break;
			case 5:
				{
				setState(221);
				match(ID);
				setState(222);
				match(T__8);
				setState(223);
				vector();
				}
				break;
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(226);
				match(T__0);
				setState(227);
				dims();
				setState(228);
				match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PriorContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DistexprContext distexpr() {
			return getRuleContext(DistexprContext.class,0);
		}
		public LimitsContext limits() {
			return getRuleContext(LimitsContext.class,0);
		}
		public PriorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterPrior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitPrior(this);
		}
	}

	public final PriorContext prior() throws RecognitionException {
		PriorContext _localctx = new PriorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prior);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expr(0);
			setState(233);
			match(T__9);
			setState(234);
			distexpr();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(235);
				limits();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode CONSTHOLE() { return getToken(Template2Parser.CONSTHOLE, 0); }
		public VectorDIMSContext vectorDIMS() {
			return getRuleContext(VectorDIMSContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(CONSTHOLE);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(239);
					vectorDIMS();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			param();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(246);
				match(T__2);
				setState(247);
				param();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistexprContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode DISTHOLE() { return getToken(Template2Parser.DISTHOLE, 0); }
		public TerminalNode ID() { return getToken(Template2Parser.ID, 0); }
		public VectorDIMSContext vectorDIMS() {
			return getRuleContext(VectorDIMSContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode DISTXHOLE() { return getToken(Template2Parser.DISTXHOLE, 0); }
		public DistexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterDistexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitDistexpr(this);
		}
	}

	public final DistexprContext distexpr() throws RecognitionException {
		DistexprContext _localctx = new DistexprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_distexpr);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISTHOLE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==DISTHOLE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(254);
					vectorDIMS();
					}
				}

				setState(257);
				match(T__10);
				setState(258);
				params();
				setState(259);
				match(T__11);
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(260);
					match(T__0);
					setState(261);
					dims();
					setState(262);
					match(T__1);
					}
					break;
				}
				}
				break;
			case DISTXHOLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(DISTXHOLE);
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(267);
					vectorDIMS();
					}
					break;
				}
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(270);
					match(T__0);
					setState(271);
					dims();
					setState(272);
					match(T__1);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopcompContext extends ParserRuleContext {
		public DistexprContext distexpr() {
			return getRuleContext(DistexprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Template2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Template2Parser.ID, i);
		}
		public LoopcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterLoopcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitLoopcomp(this);
		}
	}

	public final LoopcompContext loopcomp() throws RecognitionException {
		LoopcompContext _localctx = new LoopcompContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loopcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__0);
			setState(279);
			distexpr();
			setState(280);
			match(T__12);
			setState(281);
			match(ID);
			setState(282);
			match(T__13);
			setState(283);
			match(ID);
			setState(284);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Template2Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__12);
			setState(287);
			match(T__10);
			setState(288);
			match(ID);
			setState(289);
			match(T__13);
			setState(290);
			expr(0);
			setState(291);
			match(T__8);
			setState(292);
			expr(0);
			setState(293);
			match(T__11);
			setState(294);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blkContext else_blk() {
			return getRuleContext(Else_blkContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__14);
			setState(297);
			match(T__10);
			setState(298);
			expr(0);
			setState(299);
			match(T__11);
			setState(300);
			block();
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(301);
				else_blk();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blkContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_blk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterElse_blk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitElse_blk(this);
		}
	}

	public final Else_blkContext else_blk() throws RecognitionException {
		Else_blkContext _localctx = new Else_blkContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_else_blk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(T__15);
			setState(305);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Template2Parser.FUNCTION, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(FUNCTION);
			setState(308);
			match(T__10);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__29) | (1L << FUNCTION) | (1L << INT) | (1L << DOUBLE) | (1L << CONSTHOLE) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(309);
				params();
				}
			}

			setState(312);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FparamContext extends ParserRuleContext {
		public Return_or_param_typeContext return_or_param_type() {
			return getRuleContext(Return_or_param_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Template2Parser.ID, 0); }
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterFparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitFparam(this);
		}
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			return_or_param_type();
			setState(315);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FparamsContext extends ParserRuleContext {
		public List<FparamContext> fparam() {
			return getRuleContexts(FparamContext.class);
		}
		public FparamContext fparam(int i) {
			return getRuleContext(FparamContext.class,i);
		}
		public FparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterFparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitFparams(this);
		}
	}

	public final FparamsContext fparams() throws RecognitionException {
		FparamsContext _localctx = new FparamsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			fparam();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(318);
				match(T__2);
				setState(319);
				fparam();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_or_param_typeContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Return_or_param_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_or_param_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterReturn_or_param_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitReturn_or_param_type(this);
		}
	}

	public final Return_or_param_typeContext return_or_param_type() throws RecognitionException {
		Return_or_param_typeContext _localctx = new Return_or_param_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_return_or_param_type);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				dtype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(T__16);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(327);
				dtype();
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(328);
					match(T__0);
					setState(329);
					match(T__1);
					}
					}
					setState(332); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declContext extends ParserRuleContext {
		public Return_or_param_typeContext return_or_param_type() {
			return getRuleContext(Return_or_param_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Template2Parser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FparamsContext fparams() {
			return getRuleContext(FparamsContext.class,0);
		}
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterFunction_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitFunction_decl(this);
		}
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			return_or_param_type();
			setState(337);
			match(ID);
			setState(338);
			match(T__10);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << INTEGERTYPE) | (1L << FLOATTYPE) | (1L << COMPLEX))) != 0)) {
				{
				setState(339);
				fparams();
				}
			}

			setState(342);
			match(T__11);
			setState(343);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);
		int _la;
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(T__17);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__29) | (1L << T__37) | (1L << FUNCTION) | (1L << INTEGERTYPE) | (1L << FLOATTYPE) | (1L << INT) | (1L << DOUBLE) | (1L << CONSTHOLE) | (1L << COMPLEX) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(346);
					statement();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(352);
				match(T__18);
				}
				break;
			case T__10:
			case T__12:
			case T__14:
			case T__29:
			case T__37:
			case FUNCTION:
			case INTEGERTYPE:
			case FLOATTYPE:
			case INT:
			case DOUBLE:
			case CONSTHOLE:
			case COMPLEX:
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformedparamContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TransformedparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformedparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterTransformedparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitTransformedparam(this);
		}
	}

	public final TransformedparamContext transformedparam() throws RecognitionException {
		TransformedparamContext _localctx = new TransformedparamContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_transformedparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__19);
			setState(357);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformeddataContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TransformeddataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformeddata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterTransformeddata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitTransformeddata(this);
		}
	}

	public final TransformeddataContext transformeddata() throws RecognitionException {
		TransformeddataContext _localctx = new TransformeddataContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_transformeddata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__20);
			setState(360);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratedquantitiesContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GeneratedquantitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedquantities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterGeneratedquantities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitGeneratedquantities(this);
		}
	}

	public final GeneratedquantitiesContext generatedquantities() throws RecognitionException {
		GeneratedquantitiesContext _localctx = new GeneratedquantitiesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_generatedquantities);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__21);
			setState(363);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionsContext extends ParserRuleContext {
		public List<Function_declContext> function_decl() {
			return getRuleContexts(Function_declContext.class);
		}
		public Function_declContext function_decl(int i) {
			return getRuleContext(Function_declContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitFunctions(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__22);
			setState(366);
			match(T__17);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << INTEGERTYPE) | (1L << FLOATTYPE) | (1L << COMPLEX))) != 0)) {
				{
				{
				setState(367);
				function_decl();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ValContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitVal(this);
		}
	}
	public static class DivopContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterDivop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitDivop(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(Template2Parser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitString(this);
		}
	}
	public static class ExponopContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExponopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterExponop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitExponop(this);
		}
	}
	public static class Array_accessContext extends ExprContext {
		public TerminalNode ID() { return getToken(Template2Parser.ID, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public Array_accessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterArray_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitArray_access(this);
		}
	}
	public static class AddopContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitAddop(this);
		}
	}
	public static class MinusopContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MinusopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterMinusop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitMinusop(this);
		}
	}
	public static class LtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitLt(this);
		}
	}
	public static class UnaryContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitUnary(this);
		}
	}
	public static class EqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitEq(this);
		}
	}
	public static class GtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitGt(this);
		}
	}
	public static class BracketsContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracketsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitBrackets(this);
		}
	}
	public static class RefContext extends ExprContext {
		public TerminalNode ID() { return getToken(Template2Parser.ID, 0); }
		public RefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitRef(this);
		}
	}
	public static class GeqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GeqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterGeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitGeq(this);
		}
	}
	public static class MulopContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitMulop(this);
		}
	}
	public static class AndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitAnd(this);
		}
	}
	public static class FunctionContext extends ExprContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitFunction(this);
		}
	}
	public static class VecmulopContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VecmulopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterVecmulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitVecmulop(this);
		}
	}
	public static class NeContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterNe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitNe(this);
		}
	}
	public static class LeqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LeqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterLeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitLeq(this);
		}
	}
	public static class TransposeContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TransposeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterTranspose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitTranspose(this);
		}
	}
	public static class VecdivopContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VecdivopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterVecdivop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitVecdivop(this);
		}
	}
	public static class TernaryContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TernaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitTernary(this);
		}
	}
	public static class SubsetContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubsetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterSubset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitSubset(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(376);
				function_call();
				}
				break;
			case 2:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(377);
				match(T__29);
				setState(378);
				expr(6);
				}
				break;
			case 3:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(379);
				match(T__10);
				setState(380);
				expr(0);
				setState(381);
				match(T__11);
				}
				break;
			case 4:
				{
				_localctx = new ValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(383);
				number();
				}
				break;
			case 5:
				{
				_localctx = new RefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(384);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new Array_accessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385);
				match(ID);
				setState(386);
				match(T__0);
				setState(387);
				dims();
				setState(388);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(390);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(450);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new TernaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(393);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(394);
						match(T__24);
						setState(395);
						expr(0);
						setState(396);
						match(T__8);
						setState(397);
						expr(24);
						}
						break;
					case 2:
						{
						_localctx = new ExponopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(399);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(400);
						match(T__25);
						setState(401);
						expr(23);
						}
						break;
					case 3:
						{
						_localctx = new DivopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(402);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(403);
						match(T__26);
						setState(404);
						expr(22);
						}
						break;
					case 4:
						{
						_localctx = new MulopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(405);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(406);
						match(T__27);
						setState(407);
						expr(21);
						}
						break;
					case 5:
						{
						_localctx = new AddopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(408);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(409);
						match(T__28);
						setState(410);
						expr(20);
						}
						break;
					case 6:
						{
						_localctx = new MinusopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(411);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(412);
						match(T__29);
						setState(413);
						expr(19);
						}
						break;
					case 7:
						{
						_localctx = new VecdivopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(414);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(415);
						match(T__30);
						setState(416);
						expr(18);
						}
						break;
					case 8:
						{
						_localctx = new VecmulopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(417);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(418);
						match(T__31);
						setState(419);
						expr(17);
						}
						break;
					case 9:
						{
						_localctx = new LtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(420);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(421);
						match(T__3);
						setState(422);
						expr(16);
						}
						break;
					case 10:
						{
						_localctx = new LeqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(423);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(424);
						match(T__32);
						setState(425);
						expr(15);
						}
						break;
					case 11:
						{
						_localctx = new GtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(426);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(427);
						match(T__4);
						setState(428);
						expr(14);
						}
						break;
					case 12:
						{
						_localctx = new GeqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(429);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(430);
						match(T__33);
						setState(431);
						expr(13);
						}
						break;
					case 13:
						{
						_localctx = new NeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(432);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(433);
						match(T__34);
						setState(434);
						expr(12);
						}
						break;
					case 14:
						{
						_localctx = new EqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(435);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(436);
						match(T__35);
						setState(437);
						expr(11);
						}
						break;
					case 15:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(438);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(439);
						match(T__36);
						setState(440);
						expr(10);
						}
						break;
					case 16:
						{
						_localctx = new TransposeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(441);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(442);
						match(T__23);
						}
						break;
					case 17:
						{
						_localctx = new SubsetContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(443);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(444);
						match(T__0);
						setState(445);
						expr(0);
						setState(446);
						match(T__8);
						setState(447);
						expr(0);
						setState(448);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Template2Parser.ID, 0); }
		public DistexprContext distexpr() {
			return getRuleContext(DistexprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assign);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(ID);
				setState(456);
				match(T__6);
				setState(457);
				distexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(ID);
				setState(459);
				match(T__6);
				setState(460);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				expr(0);
				setState(462);
				match(T__6);
				setState(463);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				expr(0);
				setState(466);
				match(T__6);
				setState(467);
				distexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObserveContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DistexprContext distexpr() {
			return getRuleContext(DistexprContext.class,0);
		}
		public LoopcompContext loopcomp() {
			return getRuleContext(LoopcompContext.class,0);
		}
		public ObserveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterObserve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitObserve(this);
		}
	}

	public final ObserveContext observe() throws RecognitionException {
		ObserveContext _localctx = new ObserveContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_observe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__37);
			setState(472);
			match(T__10);
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(473);
				expr(0);
				}
				break;
			case 2:
				{
				setState(474);
				distexpr();
				}
				break;
			case 3:
				{
				setState(475);
				loopcomp();
				}
				break;
			}
			setState(478);
			match(T__2);
			setState(479);
			expr(0);
			setState(480);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public ObserveContext observe() {
			return getRuleContext(ObserveContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public PriorContext prior() {
			return getRuleContext(PriorContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statement);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				observe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				if_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(486);
				prior();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(487);
				decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(488);
				function_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Template2Parser.ID, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(492);
			match(T__10);
			setState(493);
			match(ID);
			setState(494);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateContext extends ParserRuleContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public TransformeddataContext transformeddata() {
			return getRuleContext(TransformeddataContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TransformedparamContext transformedparam() {
			return getRuleContext(TransformedparamContext.class,0);
		}
		public GeneratedquantitiesContext generatedquantities() {
			return getRuleContext(GeneratedquantitiesContext.class,0);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Template2Listener ) ((Template2Listener)listener).exitTemplate(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_template);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(496);
				functions();
				}
			}

			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(499);
					data();
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(505);
				transformeddata();
				}
			}

			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(508);
					statement();
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(514);
				transformedparam();
				}
			}

			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__29) | (1L << T__37) | (1L << FUNCTION) | (1L << INTEGERTYPE) | (1L << FLOATTYPE) | (1L << INT) | (1L << DOUBLE) | (1L << CONSTHOLE) | (1L << COMPLEX) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(517);
				statement();
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(523);
				generatedquantities();
				}
			}

			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38 || _la==T__39) {
				{
				{
				setState(526);
				query();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 21);
		case 3:
			return precpred(_ctx, 20);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 11);
		case 13:
			return precpred(_ctx, 10);
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 24);
		case 16:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0217\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\3\3\5\3M\n\3\5\3O\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5t\n\5\f\5\16\5w\13\5\3\5\3\5\3\5\3\5\5\5}\n\5\3\6\3\6\3\6\3\6\7\6"+
		"\u0083\n\6\f\6\16\6\u0086\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f"+
		"\6\16\6\u0091\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c"+
		"\13\6\3\6\3\6\3\6\3\6\5\6\u00a2\n\6\3\7\3\7\3\7\7\7\u00a7\n\7\f\7\16\7"+
		"\u00aa\13\7\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00b2\n\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00b8\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bf\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d0\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e3"+
		"\n\13\3\13\3\13\3\13\3\13\5\13\u00e9\n\13\3\f\3\f\3\f\3\f\5\f\u00ef\n"+
		"\f\3\r\3\r\5\r\u00f3\n\r\3\r\5\r\u00f6\n\r\3\16\3\16\3\16\7\16\u00fb\n"+
		"\16\f\16\16\16\u00fe\13\16\3\17\3\17\5\17\u0102\n\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u010b\n\17\3\17\3\17\5\17\u010f\n\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0115\n\17\5\17\u0117\n\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0131\n\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\5\24\u0139\n\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u0143\n"+
		"\26\f\26\16\26\u0146\13\26\3\27\3\27\3\27\3\27\3\27\6\27\u014d\n\27\r"+
		"\27\16\27\u014e\5\27\u0151\n\27\3\30\3\30\3\30\3\30\5\30\u0157\n\30\3"+
		"\30\3\30\3\30\3\31\3\31\7\31\u015e\n\31\f\31\16\31\u0161\13\31\3\31\3"+
		"\31\5\31\u0165\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\7\35\u0173\n\35\f\35\16\35\u0176\13\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u018a\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u01c5\n\36\f\36\16\36\u01c8\13\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01d8"+
		"\n\37\3 \3 \3 \3 \3 \5 \u01df\n \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u01ec"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3#\5#\u01f4\n#\3#\7#\u01f7\n#\f#\16#\u01fa\13"+
		"#\3#\5#\u01fd\n#\3#\7#\u0200\n#\f#\16#\u0203\13#\3#\5#\u0206\n#\3#\7#"+
		"\u0209\n#\f#\16#\u020c\13#\3#\5#\u020f\n#\3#\7#\u0212\n#\f#\16#\u0215"+
		"\13#\3#\2\3:$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BD\2\5\3\2,-\4\2\60\60\65\65\3\2)*\2\u024d\2F\3\2\2\2\4N\3\2\2"+
		"\2\6W\3\2\2\2\b|\3\2\2\2\n\u00a1\3\2\2\2\f\u00a3\3\2\2\2\16\u00ab\3\2"+
		"\2\2\20\u00af\3\2\2\2\22\u00c0\3\2\2\2\24\u00e2\3\2\2\2\26\u00ea\3\2\2"+
		"\2\30\u00f5\3\2\2\2\32\u00f7\3\2\2\2\34\u0116\3\2\2\2\36\u0118\3\2\2\2"+
		" \u0120\3\2\2\2\"\u012a\3\2\2\2$\u0132\3\2\2\2&\u0135\3\2\2\2(\u013c\3"+
		"\2\2\2*\u013f\3\2\2\2,\u0150\3\2\2\2.\u0152\3\2\2\2\60\u0164\3\2\2\2\62"+
		"\u0166\3\2\2\2\64\u0169\3\2\2\2\66\u016c\3\2\2\28\u016f\3\2\2\2:\u0189"+
		"\3\2\2\2<\u01d7\3\2\2\2>\u01d9\3\2\2\2@\u01eb\3\2\2\2B\u01ed\3\2\2\2D"+
		"\u01f3\3\2\2\2FG\t\2\2\2G\3\3\2\2\2HO\7.\2\2IO\7/\2\2JL\7\61\2\2KM\5\16"+
		"\b\2LK\3\2\2\2LM\3\2\2\2MO\3\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2O\5\3"+
		"\2\2\2PX\5\2\2\2QR\5\2\2\2RS\7\3\2\2ST\5\f\7\2TU\7\4\2\2UX\3\2\2\2VX\7"+
		"\63\2\2WP\3\2\2\2WQ\3\2\2\2WV\3\2\2\2X\7\3\2\2\2YZ\7\3\2\2Z_\5:\36\2["+
		"\\\7\5\2\2\\^\5:\36\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2"+
		"\2a_\3\2\2\2bc\7\4\2\2c}\3\2\2\2de\7\3\2\2ej\5\b\5\2fg\7\5\2\2gi\5\b\5"+
		"\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\4\2"+
		"\2n}\3\2\2\2op\7\3\2\2pu\5\n\6\2qr\7\5\2\2rt\5\n\6\2sq\3\2\2\2tw\3\2\2"+
		"\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\4\2\2y}\3\2\2\2z{\7\3\2"+
		"\2{}\7\4\2\2|Y\3\2\2\2|d\3\2\2\2|o\3\2\2\2|z\3\2\2\2}\t\3\2\2\2~\177\7"+
		"\6\2\2\177\u0084\5:\36\2\u0080\u0081\7\5\2\2\u0081\u0083\5:\36\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\7\2\2\u0088"+
		"\u00a2\3\2\2\2\u0089\u008a\7\6\2\2\u008a\u008f\5\n\6\2\u008b\u008c\7\5"+
		"\2\2\u008c\u008e\5\n\6\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0093\7\7\2\2\u0093\u00a2\3\2\2\2\u0094\u0095\7\6\2\2\u0095"+
		"\u009a\5\b\5\2\u0096\u0097\7\5\2\2\u0097\u0099\5\b\5\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\7\2\2\u009e\u00a2\3\2"+
		"\2\2\u009f\u00a0\7\6\2\2\u00a0\u00a2\7\7\2\2\u00a1~\3\2\2\2\u00a1\u0089"+
		"\3\2\2\2\u00a1\u0094\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\13\3\2\2\2\u00a3"+
		"\u00a8\5:\36\2\u00a4\u00a5\7\5\2\2\u00a5\u00a7\5:\36\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\r\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\6\2\2\u00ac\u00ad\5\f\7\2"+
		"\u00ad\u00ae\7\7\2\2\u00ae\17\3\2\2\2\u00af\u00b1\5\6\4\2\u00b0\u00b2"+
		"\5\22\n\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b7\3\2\2\2"+
		"\u00b3\u00b4\7\3\2\2\u00b4\u00b5\5\f\7\2\u00b5\u00b6\7\4\2\2\u00b6\u00b8"+
		"\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00be\7\65\2\2\u00ba\u00bb\7\3\2\2\u00bb\u00bc\5\f\7\2\u00bc\u00bd\7"+
		"\4\2\2\u00bd\u00bf\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\21\3\2\2\2\u00c0\u00cf\7\6\2\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\7\t\2"+
		"\2\u00c3\u00c4\5:\36\2\u00c4\u00c5\7\5\2\2\u00c5\u00c6\7\n\2\2\u00c6\u00c7"+
		"\7\t\2\2\u00c7\u00c8\5:\36\2\u00c8\u00d0\3\2\2\2\u00c9\u00ca\7\b\2\2\u00ca"+
		"\u00cb\7\t\2\2\u00cb\u00d0\5:\36\2\u00cc\u00cd\7\n\2\2\u00cd\u00ce\7\t"+
		"\2\2\u00ce\u00d0\5:\36\2\u00cf\u00c1\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf"+
		"\u00cc\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\7\2\2\u00d2\23\3\2\2"+
		"\2\u00d3\u00d4\7\65\2\2\u00d4\u00d5\7\13\2\2\u00d5\u00e3\5\6\4\2\u00d6"+
		"\u00d7\7\65\2\2\u00d7\u00d8\7\13\2\2\u00d8\u00e3\5:\36\2\u00d9\u00da\7"+
		"\65\2\2\u00da\u00db\7\13\2\2\u00db\u00e3\5\b\5\2\u00dc\u00dd\7\65\2\2"+
		"\u00dd\u00de\7\13\2\2\u00de\u00e3\5\34\17\2\u00df\u00e0\7\65\2\2\u00e0"+
		"\u00e1\7\13\2\2\u00e1\u00e3\5\n\6\2\u00e2\u00d3\3\2\2\2\u00e2\u00d6\3"+
		"\2\2\2\u00e2\u00d9\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3"+
		"\u00e8\3\2\2\2\u00e4\u00e5\7\3\2\2\u00e5\u00e6\5\f\7\2\u00e6\u00e7\7\4"+
		"\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\25\3\2\2\2\u00ea\u00eb\5:\36\2\u00eb\u00ec\7\f\2\2\u00ec\u00ee\5\34\17"+
		"\2\u00ed\u00ef\5\22\n\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\27\3\2\2\2\u00f0\u00f2\7\61\2\2\u00f1\u00f3\5\16\b\2\u00f2\u00f1\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f6\5:\36\2\u00f5"+
		"\u00f0\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\31\3\2\2\2\u00f7\u00fc\5\30\r"+
		"\2\u00f8\u00f9\7\5\2\2\u00f9\u00fb\5\30\r\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\33\3\2\2"+
		"\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\t\3\2\2\u0100\u0102\5\16\b\2\u0101"+
		"\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7\r"+
		"\2\2\u0104\u0105\5\32\16\2\u0105\u010a\7\16\2\2\u0106\u0107\7\3\2\2\u0107"+
		"\u0108\5\f\7\2\u0108\u0109\7\4\2\2\u0109\u010b\3\2\2\2\u010a\u0106\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u0117\3\2\2\2\u010c\u010e\7\62\2\2\u010d"+
		"\u010f\5\16\b\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0114\3"+
		"\2\2\2\u0110\u0111\7\3\2\2\u0111\u0112\5\f\7\2\u0112\u0113\7\4\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2"+
		"\2\2\u0116\u00ff\3\2\2\2\u0116\u010c\3\2\2\2\u0117\35\3\2\2\2\u0118\u0119"+
		"\7\3\2\2\u0119\u011a\5\34\17\2\u011a\u011b\7\17\2\2\u011b\u011c\7\65\2"+
		"\2\u011c\u011d\7\20\2\2\u011d\u011e\7\65\2\2\u011e\u011f\7\4\2\2\u011f"+
		"\37\3\2\2\2\u0120\u0121\7\17\2\2\u0121\u0122\7\r\2\2\u0122\u0123\7\65"+
		"\2\2\u0123\u0124\7\20\2\2\u0124\u0125\5:\36\2\u0125\u0126\7\13\2\2\u0126"+
		"\u0127\5:\36\2\u0127\u0128\7\16\2\2\u0128\u0129\5\60\31\2\u0129!\3\2\2"+
		"\2\u012a\u012b\7\21\2\2\u012b\u012c\7\r\2\2\u012c\u012d\5:\36\2\u012d"+
		"\u012e\7\16\2\2\u012e\u0130\5\60\31\2\u012f\u0131\5$\23\2\u0130\u012f"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131#\3\2\2\2\u0132\u0133\7\22\2\2\u0133"+
		"\u0134\5\60\31\2\u0134%\3\2\2\2\u0135\u0136\7+\2\2\u0136\u0138\7\r\2\2"+
		"\u0137\u0139\5\32\16\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013b\7\16\2\2\u013b\'\3\2\2\2\u013c\u013d\5,\27\2\u013d"+
		"\u013e\7\65\2\2\u013e)\3\2\2\2\u013f\u0144\5(\25\2\u0140\u0141\7\5\2\2"+
		"\u0141\u0143\5(\25\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145+\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0151\5\6\4\2\u0148\u0151\7\23\2\2\u0149\u014c\5\6\4\2\u014a\u014b\7"+
		"\3\2\2\u014b\u014d\7\4\2\2\u014c\u014a\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u0147\3\2"+
		"\2\2\u0150\u0148\3\2\2\2\u0150\u0149\3\2\2\2\u0151-\3\2\2\2\u0152\u0153"+
		"\5,\27\2\u0153\u0154\7\65\2\2\u0154\u0156\7\r\2\2\u0155\u0157\5*\26\2"+
		"\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159"+
		"\7\16\2\2\u0159\u015a\5\60\31\2\u015a/\3\2\2\2\u015b\u015f\7\24\2\2\u015c"+
		"\u015e\5@!\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2"+
		"\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0165"+
		"\7\25\2\2\u0163\u0165\5@!\2\u0164\u015b\3\2\2\2\u0164\u0163\3\2\2\2\u0165"+
		"\61\3\2\2\2\u0166\u0167\7\26\2\2\u0167\u0168\5\60\31\2\u0168\63\3\2\2"+
		"\2\u0169\u016a\7\27\2\2\u016a\u016b\5\60\31\2\u016b\65\3\2\2\2\u016c\u016d"+
		"\7\30\2\2\u016d\u016e\5\60\31\2\u016e\67\3\2\2\2\u016f\u0170\7\31\2\2"+
		"\u0170\u0174\7\24\2\2\u0171\u0173\5.\30\2\u0172\u0171\3\2\2\2\u0173\u0176"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\u0178\7\25\2\2\u01789\3\2\2\2\u0179\u017a\b\36\1"+
		"\2\u017a\u018a\5&\24\2\u017b\u017c\7 \2\2\u017c\u018a\5:\36\b\u017d\u017e"+
		"\7\r\2\2\u017e\u017f\5:\36\2\u017f\u0180\7\16\2\2\u0180\u018a\3\2\2\2"+
		"\u0181\u018a\5\4\3\2\u0182\u018a\7\65\2\2\u0183\u0184\7\65\2\2\u0184\u0185"+
		"\7\3\2\2\u0185\u0186\5\f\7\2\u0186\u0187\7\4\2\2\u0187\u018a\3\2\2\2\u0188"+
		"\u018a\7\66\2\2\u0189\u0179\3\2\2\2\u0189\u017b\3\2\2\2\u0189\u017d\3"+
		"\2\2\2\u0189\u0181\3\2\2\2\u0189\u0182\3\2\2\2\u0189\u0183\3\2\2\2\u0189"+
		"\u0188\3\2\2\2\u018a\u01c6\3\2\2\2\u018b\u018c\f\31\2\2\u018c\u018d\7"+
		"\33\2\2\u018d\u018e\5:\36\2\u018e\u018f\7\13\2\2\u018f\u0190\5:\36\32"+
		"\u0190\u01c5\3\2\2\2\u0191\u0192\f\30\2\2\u0192\u0193\7\34\2\2\u0193\u01c5"+
		"\5:\36\31\u0194\u0195\f\27\2\2\u0195\u0196\7\35\2\2\u0196\u01c5\5:\36"+
		"\30\u0197\u0198\f\26\2\2\u0198\u0199\7\36\2\2\u0199\u01c5\5:\36\27\u019a"+
		"\u019b\f\25\2\2\u019b\u019c\7\37\2\2\u019c\u01c5\5:\36\26\u019d\u019e"+
		"\f\24\2\2\u019e\u019f\7 \2\2\u019f\u01c5\5:\36\25\u01a0\u01a1\f\23\2\2"+
		"\u01a1\u01a2\7!\2\2\u01a2\u01c5\5:\36\24\u01a3\u01a4\f\22\2\2\u01a4\u01a5"+
		"\7\"\2\2\u01a5\u01c5\5:\36\23\u01a6\u01a7\f\21\2\2\u01a7\u01a8\7\6\2\2"+
		"\u01a8\u01c5\5:\36\22\u01a9\u01aa\f\20\2\2\u01aa\u01ab\7#\2\2\u01ab\u01c5"+
		"\5:\36\21\u01ac\u01ad\f\17\2\2\u01ad\u01ae\7\7\2\2\u01ae\u01c5\5:\36\20"+
		"\u01af\u01b0\f\16\2\2\u01b0\u01b1\7$\2\2\u01b1\u01c5\5:\36\17\u01b2\u01b3"+
		"\f\r\2\2\u01b3\u01b4\7%\2\2\u01b4\u01c5\5:\36\16\u01b5\u01b6\f\f\2\2\u01b6"+
		"\u01b7\7&\2\2\u01b7\u01c5\5:\36\r\u01b8\u01b9\f\13\2\2\u01b9\u01ba\7\'"+
		"\2\2\u01ba\u01c5\5:\36\f\u01bb\u01bc\f\32\2\2\u01bc\u01c5\7\32\2\2\u01bd"+
		"\u01be\f\n\2\2\u01be\u01bf\7\3\2\2\u01bf\u01c0\5:\36\2\u01c0\u01c1\7\13"+
		"\2\2\u01c1\u01c2\5:\36\2\u01c2\u01c3\7\4\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u018b\3\2\2\2\u01c4\u0191\3\2\2\2\u01c4\u0194\3\2\2\2\u01c4\u0197\3\2"+
		"\2\2\u01c4\u019a\3\2\2\2\u01c4\u019d\3\2\2\2\u01c4\u01a0\3\2\2\2\u01c4"+
		"\u01a3\3\2\2\2\u01c4\u01a6\3\2\2\2\u01c4\u01a9\3\2\2\2\u01c4\u01ac\3\2"+
		"\2\2\u01c4\u01af\3\2\2\2\u01c4\u01b2\3\2\2\2\u01c4\u01b5\3\2\2\2\u01c4"+
		"\u01b8\3\2\2\2\u01c4\u01bb\3\2\2\2\u01c4\u01bd\3\2\2\2\u01c5\u01c8\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7;\3\2\2\2\u01c8\u01c6"+
		"\3\2\2\2\u01c9\u01ca\7\65\2\2\u01ca\u01cb\7\t\2\2\u01cb\u01d8\5\34\17"+
		"\2\u01cc\u01cd\7\65\2\2\u01cd\u01ce\7\t\2\2\u01ce\u01d8\5:\36\2\u01cf"+
		"\u01d0\5:\36\2\u01d0\u01d1\7\t\2\2\u01d1\u01d2\5:\36\2\u01d2\u01d8\3\2"+
		"\2\2\u01d3\u01d4\5:\36\2\u01d4\u01d5\7\t\2\2\u01d5\u01d6\5\34\17\2\u01d6"+
		"\u01d8\3\2\2\2\u01d7\u01c9\3\2\2\2\u01d7\u01cc\3\2\2\2\u01d7\u01cf\3\2"+
		"\2\2\u01d7\u01d3\3\2\2\2\u01d8=\3\2\2\2\u01d9\u01da\7(\2\2\u01da\u01de"+
		"\7\r\2\2\u01db\u01df\5:\36\2\u01dc\u01df\5\34\17\2\u01dd\u01df\5\36\20"+
		"\2\u01de\u01db\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e1\7\5\2\2\u01e1\u01e2\5:\36\2\u01e2\u01e3\7\16\2\2"+
		"\u01e3?\3\2\2\2\u01e4\u01ec\5<\37\2\u01e5\u01ec\5 \21\2\u01e6\u01ec\5"+
		"> \2\u01e7\u01ec\5\"\22\2\u01e8\u01ec\5\26\f\2\u01e9\u01ec\5\20\t\2\u01ea"+
		"\u01ec\5&\24\2\u01eb\u01e4\3\2\2\2\u01eb\u01e5\3\2\2\2\u01eb\u01e6\3\2"+
		"\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01ecA\3\2\2\2\u01ed\u01ee\t\4\2\2\u01ee\u01ef\7\r\2\2"+
		"\u01ef\u01f0\7\65\2\2\u01f0\u01f1\7\16\2\2\u01f1C\3\2\2\2\u01f2\u01f4"+
		"\58\35\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f8\3\2\2\2\u01f5"+
		"\u01f7\5\24\13\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3"+
		"\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fd\5\64\33\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0201\3"+
		"\2\2\2\u01fe\u0200\5@!\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2"+
		"\2\2\u0204\u0206\5\62\32\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u020a\3\2\2\2\u0207\u0209\5@!\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2\2"+
		"\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a"+
		"\3\2\2\2\u020d\u020f\5\66\34\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2"+
		"\u020f\u0213\3\2\2\2\u0210\u0212\5B\"\2\u0211\u0210\3\2\2\2\u0212\u0215"+
		"\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214E\3\2\2\2\u0215"+
		"\u0213\3\2\2\2\64LNW_ju|\u0084\u008f\u009a\u00a1\u00a8\u00b1\u00b7\u00be"+
		"\u00cf\u00e2\u00e8\u00ee\u00f2\u00f5\u00fc\u0101\u010a\u010e\u0114\u0116"+
		"\u0130\u0138\u0144\u014e\u0150\u0156\u015f\u0164\u0174\u0189\u01c4\u01c6"+
		"\u01d7\u01de\u01eb\u01f3\u01f8\u01fc\u0201\u0205\u020a\u020e\u0213";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}