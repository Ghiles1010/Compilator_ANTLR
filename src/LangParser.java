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
		COMPIL=1, AO=2, AF=3, PO=4, PF=5, START=6, PV=7, VG=8, INT=9, FLOAT=10, 
		STRING=11, PLUS=12, MOINS=13, MUL=14, DIV=15, ENTIER=16, REEL=17, CHAINE=18, 
		GRT=19, LSS=20, EQ=21, NEQ=22, AFF=23, IF=24, THEN=25, ELSE=26, DO=27, 
		WHILE=28, READ=29, PRINT=30, COMMENT_S=31, COMMENT_M=32, ID_MAJ=33, ID_MIN=34, 
		WS=35;
	public static final int
		RULE_root = 0, RULE_declaration = 1, RULE_type = 2, RULE_id = 3, RULE_list_id = 4, 
		RULE_initialisation = 5, RULE_list_id_next = 6, RULE_constant = 7, RULE_operand = 8, 
		RULE_operator = 9, RULE_formule = 10, RULE_formule_next = 11, RULE_affectation = 12, 
		RULE_comparator = 13, RULE_condition = 14, RULE_if_ = 15, RULE_else_ = 16, 
		RULE_do_ = 17, RULE_read_ = 18, RULE_content = 19, RULE_print_ = 20, RULE_instruction = 21, 
		RULE_body = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "declaration", "type", "id", "list_id", "initialisation", "list_id_next", 
			"constant", "operand", "operator", "formule", "formule_next", "affectation", 
			"comparator", "condition", "if_", "else_", "do_", "read_", "content", 
			"print_", "instruction", "body"
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
			"READ", "PRINT", "COMMENT_S", "COMMENT_M", "ID_MAJ", "ID_MIN", "WS"
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
		public TerminalNode ID_MAJ() { return getToken(LangParser.ID_MAJ, 0); }
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
			setState(46);
			match(COMPIL);
			setState(47);
			match(ID_MAJ);
			setState(48);
			match(PO);
			setState(49);
			match(PF);
			setState(50);
			match(AO);
			setState(51);
			declaration();
			setState(52);
			match(START);
			setState(53);
			body();
			setState(54);
			match(AF);
			setState(55);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				type();
				setState(58);
				list_id();
				setState(59);
				match(PV);
				setState(60);
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
			setState(65);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID_MAJ() { return getToken(LangParser.ID_MAJ, 0); }
		public TerminalNode ID_MIN() { return getToken(LangParser.ID_MIN, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==ID_MAJ || _la==ID_MIN) ) {
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public InitialisationContext initialisation() {
			return getRuleContext(InitialisationContext.class,0);
		}
		public List_id_nextContext list_id_next() {
			return getRuleContext(List_id_nextContext.class,0);
		}
		public List_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitList_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_idContext list_id() throws RecognitionException {
		List_idContext _localctx = new List_idContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			id();
			setState(70);
			initialisation();
			setState(71);
			list_id_next();
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

	public static class InitialisationContext extends ParserRuleContext {
		public InitialisationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialisation; }
	 
		public InitialisationContext() { }
		public void copyFrom(InitialisationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitContext extends InitialisationContext {
		public TerminalNode AFF() { return getToken(LangParser.AFF, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public InitContext(InitialisationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Not_initContext extends InitialisationContext {
		public Not_initContext(InitialisationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitNot_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialisationContext initialisation() throws RecognitionException {
		InitialisationContext _localctx = new InitialisationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initialisation);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AFF:
				_localctx = new InitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(AFF);
				setState(74);
				constant();
				}
				break;
			case PV:
			case VG:
				_localctx = new Not_initContext(_localctx);
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

	public static class List_id_nextContext extends ParserRuleContext {
		public List_id_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_id_next; }
	 
		public List_id_nextContext() { }
		public void copyFrom(List_id_nextContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class List_id_finalContext extends List_id_nextContext {
		public List_id_finalContext(List_id_nextContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitList_id_final(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class List_id_nxtContext extends List_id_nextContext {
		public TerminalNode VG() { return getToken(LangParser.VG, 0); }
		public List_idContext list_id() {
			return getRuleContext(List_idContext.class,0);
		}
		public List_id_nxtContext(List_id_nextContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitList_id_nxt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_id_nextContext list_id_next() throws RecognitionException {
		List_id_nextContext _localctx = new List_id_nextContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list_id_next);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VG:
				_localctx = new List_id_nxtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(VG);
				setState(79);
				list_id();
				}
				break;
			case PV:
				_localctx = new List_id_finalContext(_localctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChaineContext extends ConstantContext {
		public TerminalNode CHAINE() { return getToken(LangParser.CHAINE, 0); }
		public ChaineContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitChaine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EntierContext extends ConstantContext {
		public TerminalNode ENTIER() { return getToken(LangParser.ENTIER, 0); }
		public EntierContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitEntier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReelContext extends ConstantContext {
		public TerminalNode REEL() { return getToken(LangParser.REEL, 0); }
		public ReelContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitReel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTIER:
				_localctx = new EntierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(ENTIER);
				}
				break;
			case REEL:
				_localctx = new ReelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(REEL);
				}
				break;
			case CHAINE:
				_localctx = new ChaineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(CHAINE);
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
	public static class ConstantTContext extends OperandContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantTContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitConstantT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdtContext extends OperandContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdtContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIdt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operand);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTIER:
			case REEL:
			case CHAINE:
				_localctx = new ConstantTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				constant();
				}
				break;
			case ID_MAJ:
			case ID_MIN:
				_localctx = new IdtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				id();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFormule_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormuleContext formule() throws RecognitionException {
		FormuleContext _localctx = new FormuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formule);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTIER:
			case REEL:
			case CHAINE:
			case ID_MAJ:
			case ID_MIN:
				_localctx = new Formule_operandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				operand();
				setState(95);
				formule_next();
				}
				break;
			case PO:
				_localctx = new Formule_parenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(PO);
				setState(98);
				formule();
				setState(99);
				match(PF);
				setState(100);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFormule_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Formule_emptyContext extends Formule_nextContext {
		public Formule_emptyContext(Formule_nextContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFormule_empty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formule_nextContext formule_next() throws RecognitionException {
		Formule_nextContext _localctx = new Formule_nextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formule_next);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MOINS:
			case MUL:
			case DIV:
				_localctx = new Formule_operatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				operator();
				setState(105);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode AFF() { return getToken(LangParser.AFF, 0); }
		public FormuleContext formule() {
			return getRuleContext(FormuleContext.class,0);
		}
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAffectation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_affectation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			id();
			setState(111);
			match(AFF);
			setState(112);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			formule();
			setState(117);
			comparator();
			setState(118);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IF);
			setState(121);
			match(PO);
			setState(122);
			condition();
			setState(123);
			match(PF);
			setState(124);
			match(THEN);
			setState(125);
			match(AO);
			setState(126);
			body();
			setState(127);
			match(AF);
			setState(128);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_else_);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
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
				setState(132);
				match(ELSE);
				setState(133);
				match(AO);
				setState(134);
				body();
				setState(135);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDo_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_Context do_() throws RecognitionException {
		Do_Context _localctx = new Do_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_do_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(DO);
			setState(140);
			match(AO);
			setState(141);
			body();
			setState(142);
			match(AF);
			setState(143);
			match(WHILE);
			setState(144);
			match(PO);
			setState(145);
			condition();
			setState(146);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PF() { return getToken(LangParser.PF, 0); }
		public TerminalNode PV() { return getToken(LangParser.PV, 0); }
		public Read_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitRead_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_Context read_() throws RecognitionException {
		Read_Context _localctx = new Read_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_read_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(READ);
			setState(149);
			match(PO);
			setState(150);
			id();
			setState(151);
			match(PF);
			setState(152);
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

	public static class ContentContext extends ParserRuleContext {
		public TerminalNode CHAINE() { return getToken(LangParser.CHAINE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_content);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(CHAINE);
				}
				break;
			case ID_MAJ:
			case ID_MIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				id();
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

	public static class Print_Context extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LangParser.PRINT, 0); }
		public TerminalNode PO() { return getToken(LangParser.PO, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode PF() { return getToken(LangParser.PF, 0); }
		public TerminalNode PV() { return getToken(LangParser.PV, 0); }
		public Print_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitPrint_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_Context print_() throws RecognitionException {
		Print_Context _localctx = new Print_Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_print_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(PRINT);
			setState(159);
			match(PO);
			setState(160);
			content();
			setState(161);
			match(PF);
			setState(162);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_instruction);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_MAJ:
			case ID_MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				affectation();
				setState(165);
				match(PV);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				read_();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				print_();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				if_();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_body);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				instruction();
				setState(174);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\b\5\bT\n"+
		"\b\3\t\3\t\3\t\5\tY\n\t\3\n\3\n\5\n]\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\fi\n\f\3\r\3\r\3\r\3\r\5\ro\n\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u008c\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\5\25\u009f\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00ae\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u00b5\n\30\3"+
		"\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\6\3\2\13"+
		"\r\3\2#$\3\2\16\21\3\2\25\30\2\u00b0\2\60\3\2\2\2\4A\3\2\2\2\6C\3\2\2"+
		"\2\bE\3\2\2\2\nG\3\2\2\2\fN\3\2\2\2\16S\3\2\2\2\20X\3\2\2\2\22\\\3\2\2"+
		"\2\24^\3\2\2\2\26h\3\2\2\2\30n\3\2\2\2\32p\3\2\2\2\34t\3\2\2\2\36v\3\2"+
		"\2\2 z\3\2\2\2\"\u008b\3\2\2\2$\u008d\3\2\2\2&\u0096\3\2\2\2(\u009e\3"+
		"\2\2\2*\u00a0\3\2\2\2,\u00ad\3\2\2\2.\u00b4\3\2\2\2\60\61\7\3\2\2\61\62"+
		"\7#\2\2\62\63\7\6\2\2\63\64\7\7\2\2\64\65\7\4\2\2\65\66\5\4\3\2\66\67"+
		"\7\b\2\2\678\5.\30\289\7\5\2\29:\7\2\2\3:\3\3\2\2\2;<\5\6\4\2<=\5\n\6"+
		"\2=>\7\t\2\2>?\5\4\3\2?B\3\2\2\2@B\3\2\2\2A;\3\2\2\2A@\3\2\2\2B\5\3\2"+
		"\2\2CD\t\2\2\2D\7\3\2\2\2EF\t\3\2\2F\t\3\2\2\2GH\5\b\5\2HI\5\f\7\2IJ\5"+
		"\16\b\2J\13\3\2\2\2KL\7\31\2\2LO\5\20\t\2MO\3\2\2\2NK\3\2\2\2NM\3\2\2"+
		"\2O\r\3\2\2\2PQ\7\n\2\2QT\5\n\6\2RT\3\2\2\2SP\3\2\2\2SR\3\2\2\2T\17\3"+
		"\2\2\2UY\7\22\2\2VY\7\23\2\2WY\7\24\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2"+
		"Y\21\3\2\2\2Z]\5\20\t\2[]\5\b\5\2\\Z\3\2\2\2\\[\3\2\2\2]\23\3\2\2\2^_"+
		"\t\4\2\2_\25\3\2\2\2`a\5\22\n\2ab\5\30\r\2bi\3\2\2\2cd\7\6\2\2de\5\26"+
		"\f\2ef\7\7\2\2fg\5\30\r\2gi\3\2\2\2h`\3\2\2\2hc\3\2\2\2i\27\3\2\2\2jk"+
		"\5\24\13\2kl\5\26\f\2lo\3\2\2\2mo\3\2\2\2nj\3\2\2\2nm\3\2\2\2o\31\3\2"+
		"\2\2pq\5\b\5\2qr\7\31\2\2rs\5\26\f\2s\33\3\2\2\2tu\t\5\2\2u\35\3\2\2\2"+
		"vw\5\26\f\2wx\5\34\17\2xy\5\26\f\2y\37\3\2\2\2z{\7\32\2\2{|\7\6\2\2|}"+
		"\5\36\20\2}~\7\7\2\2~\177\7\33\2\2\177\u0080\7\4\2\2\u0080\u0081\5.\30"+
		"\2\u0081\u0082\7\5\2\2\u0082\u0083\5\"\22\2\u0083!\3\2\2\2\u0084\u008c"+
		"\3\2\2\2\u0085\u008c\3\2\2\2\u0086\u0087\7\34\2\2\u0087\u0088\7\4\2\2"+
		"\u0088\u0089\5.\30\2\u0089\u008a\7\5\2\2\u008a\u008c\3\2\2\2\u008b\u0084"+
		"\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008c#\3\2\2\2\u008d"+
		"\u008e\7\35\2\2\u008e\u008f\7\4\2\2\u008f\u0090\5.\30\2\u0090\u0091\7"+
		"\5\2\2\u0091\u0092\7\36\2\2\u0092\u0093\7\6\2\2\u0093\u0094\5\36\20\2"+
		"\u0094\u0095\7\7\2\2\u0095%\3\2\2\2\u0096\u0097\7\37\2\2\u0097\u0098\7"+
		"\6\2\2\u0098\u0099\5\b\5\2\u0099\u009a\7\7\2\2\u009a\u009b\7\t\2\2\u009b"+
		"\'\3\2\2\2\u009c\u009f\7\24\2\2\u009d\u009f\5\b\5\2\u009e\u009c\3\2\2"+
		"\2\u009e\u009d\3\2\2\2\u009f)\3\2\2\2\u00a0\u00a1\7 \2\2\u00a1\u00a2\7"+
		"\6\2\2\u00a2\u00a3\5(\25\2\u00a3\u00a4\7\7\2\2\u00a4\u00a5\7\t\2\2\u00a5"+
		"+\3\2\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00a8\7\t\2\2\u00a8\u00ae\3\2\2"+
		"\2\u00a9\u00ae\5&\24\2\u00aa\u00ae\5*\26\2\u00ab\u00ae\5 \21\2\u00ac\u00ae"+
		"\5$\23\2\u00ad\u00a6\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae-\3\2\2\2\u00af\u00b0\5,\27\2"+
		"\u00b0\u00b1\5.\30\2\u00b1\u00b5\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"/\3\2\2\2\rANSX\\hn\u008b\u009e\u00ad\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}