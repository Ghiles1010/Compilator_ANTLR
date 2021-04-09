// Generated from /home/souad/Documents/Master/cloneCompil/Compilator_ANTLR/src/Lang.g4 by ANTLR 4.9.1
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
		COMPIL=1, AO=2, AF=3, PO=4, PF=5, START=6, PV=7, VG=8, INT=9, FLOAT=10, 
		STRING=11, PLUS=12, MOINS=13, MUL=14, DIV=15, ENTIER=16, REEL=17, CHAINE=18, 
		GRT=19, LSS=20, EQ=21, NEQ=22, AFF=23, IF=24, THEN=25, ELSE=26, DO=27, 
		WHILE=28, READ=29, PRINT=30, COMMENT_S=31, COMMENT_M=32, NOM_PROGRAMME=33, 
		ID=34, WS=35;
	public static final int
		RULE_root = 0, RULE_declaration = 1, RULE_type = 2, RULE_list_id = 3, 
		RULE_operand = 4, RULE_operator = 5, RULE_formule = 6, RULE_formule_next = 7, 
		RULE_affectation = 8, RULE_comparator = 9, RULE_condition = 10, RULE_if_ = 11, 
		RULE_else_ = 12, RULE_do_ = 13, RULE_read_ = 14, RULE_print_ = 15, RULE_instruction = 16, 
		RULE_body = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "declaration", "type", "list_id", "operand", "operator", "formule", 
			"formule_next", "affectation", "comparator", "condition", "if_", "else_", 
			"do_", "read_", "print_", "instruction", "body"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'compil'", "'{'", "'}'", "'('", "')'", "'start'", "';'", "','", 
			"'intCompil'", "'floatCompil'", "'stringCompil'", "'+'", "'-'", "'*'", 
			"'/'", null, null, null, "'>'", "'<'", "'=='", "'!='", "'='", "'if'", 
			"'then'", "'else'", "'do'", "'while'", "'scanCompil'", "'printCompil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMPIL", "AO", "AF", "PO", "PF", "START", "PV", "VG", "INT", "FLOAT", 
			"STRING", "PLUS", "MOINS", "MUL", "DIV", "ENTIER", "REEL", "CHAINE", 
			"GRT", "LSS", "EQ", "NEQ", "AFF", "IF", "THEN", "ELSE", "DO", "WHILE", 
			"READ", "PRINT", "COMMENT_S", "COMMENT_M", "NOM_PROGRAMME", "ID", "WS"
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode START() { return getToken(LangParser.START, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
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
			setState(36);
			match(COMPIL);
			setState(37);
			match(NOM_PROGRAMME);
			setState(38);
			match(PO);
			setState(39);
			match(PF);
			setState(40);
			match(AO);
			setState(41);
			declaration();
			setState(42);
			match(START);
			setState(43);
			body();
			setState(44);
			match(AF);
			setState(45);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declare_emptyContext extends DeclarationContext {
		public Declare_emptyContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDeclare_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDeclare_empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDeclare_empty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List_idContext list_id() {
			return getRuleContext(List_idContext.class,0);
		}
		public TerminalNode PV() { return getToken(LangParser.PV, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclareContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				type();
				setState(48);
				list_id();
				setState(49);
				match(PV);
				setState(50);
				declaration();
				}
				break;
			case START:
				_localctx = new Declare_emptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LangParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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

	public static class List_idContext extends ParserRuleContext {
		public List_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_id; }
	 
		public List_idContext() { }
		public void copyFrom(List_idContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class List_id_finalContext extends List_idContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public List_id_finalContext(List_idContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterList_id_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitList_id_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitList_id_final(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class List_id_nextContext extends List_idContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode VG() { return getToken(LangParser.VG, 0); }
		public List_idContext list_id() {
			return getRuleContext(List_idContext.class,0);
		}
		public List_id_nextContext(List_idContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterList_id_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitList_id_next(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitList_id_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_idContext list_id() throws RecognitionException {
		List_idContext _localctx = new List_idContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_id);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new List_id_nextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(ID);
				setState(58);
				match(VG);
				setState(59);
				list_id();
				}
				break;
			case 2:
				_localctx = new List_id_finalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(ID);
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

	public static class OperandContext extends ParserRuleContext {
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChaineContext extends OperandContext {
		public TerminalNode CHAINE() { return getToken(LangParser.CHAINE, 0); }
		public ChaineContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterChaine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitChaine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitChaine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EntierContext extends OperandContext {
		public TerminalNode ENTIER() { return getToken(LangParser.ENTIER, 0); }
		public EntierContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterEntier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitEntier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitEntier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdtContext extends OperandContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public IdtContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIdt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIdt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIdt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReelContext extends OperandContext {
		public TerminalNode REEL() { return getToken(LangParser.REEL, 0); }
		public ReelContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterReel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitReel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitReel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operand);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTIER:
				_localctx = new EntierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(ENTIER);
				}
				break;
			case REEL:
				_localctx = new ReelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(REEL);
				}
				break;
			case CHAINE:
				_localctx = new ChaineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(CHAINE);
				}
				break;
			case ID:
				_localctx = new IdtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(ID);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LangParser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(LangParser.MOINS, 0); }
		public TerminalNode DIV() { return getToken(LangParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(LangParser.MUL, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MOINS) | (1L << MUL) | (1L << DIV))) != 0)) ) {
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

	public static class FormuleContext extends ParserRuleContext {
		public FormuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formule; }
	 
		public FormuleContext() { }
		public void copyFrom(FormuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Formule_parenthesisContext extends FormuleContext {
		public TerminalNode PO() { return getToken(LangParser.PO, 0); }
		public FormuleContext formule() {
			return getRuleContext(FormuleContext.class,0);
		}
		public TerminalNode PF() { return getToken(LangParser.PF, 0); }
		public Formule_nextContext formule_next() {
			return getRuleContext(Formule_nextContext.class,0);
		}
		public Formule_parenthesisContext(FormuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFormule_parenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFormule_parenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFormule_parenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Formule_operandContext extends FormuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Formule_nextContext formule_next() {
			return getRuleContext(Formule_nextContext.class,0);
		}
		public Formule_operandContext(FormuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFormule_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFormule_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFormule_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormuleContext formule() throws RecognitionException {
		FormuleContext _localctx = new FormuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formule);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTIER:
			case REEL:
			case CHAINE:
			case ID:
				_localctx = new Formule_operandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				operand();
				setState(72);
				formule_next();
				}
				break;
			case PO:
				_localctx = new Formule_parenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(PO);
				setState(75);
				formule();
				setState(76);
				match(PF);
				setState(77);
				formule_next();
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

	public static class Formule_nextContext extends ParserRuleContext {
		public Formule_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formule_next; }
	 
		public Formule_nextContext() { }
		public void copyFrom(Formule_nextContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Formule_operatorContext extends Formule_nextContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public FormuleContext formule() {
			return getRuleContext(FormuleContext.class,0);
		}
		public Formule_operatorContext(Formule_nextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFormule_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFormule_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFormule_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Formule_emptyContext extends Formule_nextContext {
		public Formule_emptyContext(Formule_nextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFormule_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFormule_empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFormule_empty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formule_nextContext formule_next() throws RecognitionException {
		Formule_nextContext _localctx = new Formule_nextContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formule_next);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MOINS:
			case MUL:
			case DIV:
				_localctx = new Formule_operatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				operator();
				setState(82);
				formule();
				}
				break;
			case PF:
			case PV:
			case GRT:
			case LSS:
			case EQ:
			case NEQ:
				_localctx = new Formule_emptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AffectationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode AFF() { return getToken(LangParser.AFF, 0); }
		public FormuleContext formule() {
			return getRuleContext(FormuleContext.class,0);
		}
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAffectation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAffectation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_affectation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ID);
			setState(88);
			match(AFF);
			setState(89);
			formule();
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode GRT() { return getToken(LangParser.GRT, 0); }
		public TerminalNode LSS() { return getToken(LangParser.LSS, 0); }
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LangParser.NEQ, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRT) | (1L << LSS) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
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

	public static class ConditionContext extends ParserRuleContext {
		public List<FormuleContext> formule() {
			return getRuleContexts(FormuleContext.class);
		}
		public FormuleContext formule(int i) {
			return getRuleContext(FormuleContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			formule();
			setState(94);
			comparator();
			setState(95);
			formule();
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

	public static class If_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode PO() { return getToken(LangParser.PO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PF() { return getToken(LangParser.PF, 0); }
		public TerminalNode THEN() { return getToken(LangParser.THEN, 0); }
		public TerminalNode AO() { return getToken(LangParser.AO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode AF() { return getToken(LangParser.AF, 0); }
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIf_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IF);
			setState(98);
			match(PO);
			setState(99);
			condition();
			setState(100);
			match(PF);
			setState(101);
			match(THEN);
			setState(102);
			match(AO);
			setState(103);
			body();
			setState(104);
			match(AF);
			setState(105);
			else_();
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

	public static class Else_Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public TerminalNode AO() { return getToken(LangParser.AO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode AF() { return getToken(LangParser.AF, 0); }
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterElse_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitElse_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(ELSE);
				setState(110);
				match(AO);
				setState(111);
				body();
				setState(112);
				match(AF);
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

	public static class Do_Context extends ParserRuleContext {
		public TerminalNode DO() { return getToken(LangParser.DO, 0); }
		public TerminalNode AO() { return getToken(LangParser.AO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode AF() { return getToken(LangParser.AF, 0); }
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public TerminalNode PO() { return getToken(LangParser.PO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PF() { return getToken(LangParser.PF, 0); }
		public Do_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDo_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDo_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDo_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_Context do_() throws RecognitionException {
		Do_Context _localctx = new Do_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_do_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(DO);
			setState(117);
			match(AO);
			setState(118);
			body();
			setState(119);
			match(AF);
			setState(120);
			match(WHILE);
			setState(121);
			match(PO);
			setState(122);
			condition();
			setState(123);
			match(PF);
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

	public static class Read_Context extends ParserRuleContext {
		public TerminalNode READ() { return getToken(LangParser.READ, 0); }
		public TerminalNode PO() { return getToken(LangParser.PO, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode PF() { return getToken(LangParser.PF, 0); }
		public TerminalNode PV() { return getToken(LangParser.PV, 0); }
		public Read_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterRead_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitRead_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitRead_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_Context read_() throws RecognitionException {
		Read_Context _localctx = new Read_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_read_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(READ);
			setState(126);
			match(PO);
			setState(127);
			match(ID);
			setState(128);
			match(PF);
			setState(129);
			match(PV);
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

	public static class Print_Context extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LangParser.PRINT, 0); }
		public TerminalNode PO() { return getToken(LangParser.PO, 0); }
		public FormuleContext formule() {
			return getRuleContext(FormuleContext.class,0);
		}
		public TerminalNode PF() { return getToken(LangParser.PF, 0); }
		public TerminalNode PV() { return getToken(LangParser.PV, 0); }
		public Print_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterPrint_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitPrint_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitPrint_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_Context print_() throws RecognitionException {
		Print_Context _localctx = new Print_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_print_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(PRINT);
			setState(132);
			match(PO);
			setState(133);
			formule();
			setState(134);
			match(PF);
			setState(135);
			match(PV);
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

	public static class InstructionContext extends ParserRuleContext {
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public TerminalNode PV() { return getToken(LangParser.PV, 0); }
		public Read_Context read_() {
			return getRuleContext(Read_Context.class,0);
		}
		public Print_Context print_() {
			return getRuleContext(Print_Context.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public Do_Context do_() {
			return getRuleContext(Do_Context.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_instruction);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				affectation();
				setState(138);
				match(PV);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				read_();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				print_();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				if_();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				do_();
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

	public static class BodyContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_body);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				instruction();
				setState(147);
				body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u009c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\38\n\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3\6\3\6\5\6"+
		"F\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\t\3\t\3\t\3\t"+
		"\5\tX\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16u\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u0093\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u009a\n\23\3\23\2\2\24\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\13\r\3\2\16\21\3\2\25"+
		"\30\2\u0098\2&\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\b?\3\2\2\2\nE\3\2\2\2\f"+
		"G\3\2\2\2\16Q\3\2\2\2\20W\3\2\2\2\22Y\3\2\2\2\24]\3\2\2\2\26_\3\2\2\2"+
		"\30c\3\2\2\2\32t\3\2\2\2\34v\3\2\2\2\36\177\3\2\2\2 \u0085\3\2\2\2\"\u0092"+
		"\3\2\2\2$\u0099\3\2\2\2&\'\7\3\2\2\'(\7#\2\2()\7\6\2\2)*\7\7\2\2*+\7\4"+
		"\2\2+,\5\4\3\2,-\7\b\2\2-.\5$\23\2./\7\5\2\2/\60\7\2\2\3\60\3\3\2\2\2"+
		"\61\62\5\6\4\2\62\63\5\b\5\2\63\64\7\t\2\2\64\65\5\4\3\2\658\3\2\2\2\66"+
		"8\3\2\2\2\67\61\3\2\2\2\67\66\3\2\2\28\5\3\2\2\29:\t\2\2\2:\7\3\2\2\2"+
		";<\7$\2\2<=\7\n\2\2=@\5\b\5\2>@\7$\2\2?;\3\2\2\2?>\3\2\2\2@\t\3\2\2\2"+
		"AF\7\22\2\2BF\7\23\2\2CF\7\24\2\2DF\7$\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2"+
		"\2ED\3\2\2\2F\13\3\2\2\2GH\t\3\2\2H\r\3\2\2\2IJ\5\n\6\2JK\5\20\t\2KR\3"+
		"\2\2\2LM\7\6\2\2MN\5\16\b\2NO\7\7\2\2OP\5\20\t\2PR\3\2\2\2QI\3\2\2\2Q"+
		"L\3\2\2\2R\17\3\2\2\2ST\5\f\7\2TU\5\16\b\2UX\3\2\2\2VX\3\2\2\2WS\3\2\2"+
		"\2WV\3\2\2\2X\21\3\2\2\2YZ\7$\2\2Z[\7\31\2\2[\\\5\16\b\2\\\23\3\2\2\2"+
		"]^\t\4\2\2^\25\3\2\2\2_`\5\16\b\2`a\5\24\13\2ab\5\16\b\2b\27\3\2\2\2c"+
		"d\7\32\2\2de\7\6\2\2ef\5\26\f\2fg\7\7\2\2gh\7\33\2\2hi\7\4\2\2ij\5$\23"+
		"\2jk\7\5\2\2kl\5\32\16\2l\31\3\2\2\2mu\3\2\2\2nu\3\2\2\2op\7\34\2\2pq"+
		"\7\4\2\2qr\5$\23\2rs\7\5\2\2su\3\2\2\2tm\3\2\2\2tn\3\2\2\2to\3\2\2\2u"+
		"\33\3\2\2\2vw\7\35\2\2wx\7\4\2\2xy\5$\23\2yz\7\5\2\2z{\7\36\2\2{|\7\6"+
		"\2\2|}\5\26\f\2}~\7\7\2\2~\35\3\2\2\2\177\u0080\7\37\2\2\u0080\u0081\7"+
		"\6\2\2\u0081\u0082\7$\2\2\u0082\u0083\7\7\2\2\u0083\u0084\7\t\2\2\u0084"+
		"\37\3\2\2\2\u0085\u0086\7 \2\2\u0086\u0087\7\6\2\2\u0087\u0088\5\16\b"+
		"\2\u0088\u0089\7\7\2\2\u0089\u008a\7\t\2\2\u008a!\3\2\2\2\u008b\u008c"+
		"\5\22\n\2\u008c\u008d\7\t\2\2\u008d\u0093\3\2\2\2\u008e\u0093\5\36\20"+
		"\2\u008f\u0093\5 \21\2\u0090\u0093\5\30\r\2\u0091\u0093\5\34\17\2\u0092"+
		"\u008b\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0091\3\2\2\2\u0093#\3\2\2\2\u0094\u0095\5\"\22\2\u0095\u0096"+
		"\5$\23\2\u0096\u009a\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0094\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a%\3\2\2\2"+
		"\n\67?EQWt\u0092\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}