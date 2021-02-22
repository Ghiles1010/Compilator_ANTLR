// Generated from C:/Personnal/M1/compil/tp/Projet Compil/Compilateur/src\Lang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMPIL=1, NOM_PROGRAMME=2, ID=3, AO=4, AF=5, PO=6, PF=7, START=8, PV=9, 
		INT=10, FLOAT=11, String=12, PLUS=13, MOINS=14, MUL=15, DIV=16, ENTIER=17, 
		REEL=18, GRT=19, LSS=20, EQ=21, NEQ=22, AFF=23, IF=24, THEN=25, ELSE=26, 
		DO=27, WHILE=28, READ=29, PRINT=30, COMMENT_S=31, COMMENT_M=32, WS=33;
	public static final int
		RULE_root = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"root"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'compil'", null, null, "'{'", "'}'", "'('", "')'", "'start'", 
			"';'", "'intCompil'", "'floatCompil'", "'StringCompil'", "'+'", "'-'", 
			"'*'", "'/'", null, null, "'>'", "'<'", "'=='", "'!='", "'='", "'if'", 
			"'then'", "'else'", "'do'", "'while'", "'scanCompil'", "'printCompil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMPIL", "NOM_PROGRAMME", "ID", "AO", "AF", "PO", "PF", "START", 
			"PV", "INT", "FLOAT", "String", "PLUS", "MOINS", "MUL", "DIV", "ENTIER", 
			"REEL", "GRT", "LSS", "EQ", "NEQ", "AFF", "IF", "THEN", "ELSE", "DO", 
			"WHILE", "READ", "PRINT", "COMMENT_S", "COMMENT_M", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode COMPIL() { return getToken(LangParser.COMPIL, 0); }
		public TerminalNode NOM_PROGRAMME() { return getToken(LangParser.NOM_PROGRAMME, 0); }
		public TerminalNode PO() { return getToken(LangParser.PO, 0); }
		public TerminalNode PF() { return getToken(LangParser.PF, 0); }
		public TerminalNode AO() { return getToken(LangParser.AO, 0); }
		public TerminalNode START() { return getToken(LangParser.START, 0); }
		public TerminalNode AF() { return getToken(LangParser.AF, 0); }
		public TerminalNode EOF() { return getToken(LangParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(COMPIL);
			setState(3);
			match(NOM_PROGRAMME);
			setState(4);
			match(PO);
			setState(5);
			match(PF);
			setState(6);
			match(AO);
			setState(7);
			match(START);
			setState(8);
			match(AF);
			setState(9);
			match(EOF);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\16\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\f\2\4\3\2\2\2\4\5\7\3"+
		"\2\2\5\6\7\4\2\2\6\7\7\b\2\2\7\b\7\t\2\2\b\t\7\6\2\2\t\n\7\n\2\2\n\13"+
		"\7\7\2\2\13\f\7\2\2\3\f\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}