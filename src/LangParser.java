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
		RULE_operand = 5, RULE_operator = 6, RULE_formule = 7, RULE_formule_next = 8, 
		RULE_affectation = 9, RULE_comparator = 10, RULE_condition = 11, RULE_if_ = 12, 
		RULE_else_ = 13, RULE_do_ = 14, RULE_read_ = 15, RULE_content = 16, RULE_print_ = 17, 
		RULE_instruction = 18, RULE_body = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "declaration", "type", "id", "list_id", "operand", "operator", 
			"formule", "formule_next", "affectation", "comparator", "condition", 
			"if_", "else_", "do_", "read_", "content", "print_", "instruction", "body"
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
			setState(40);
			match(COMPIL);
			setState(41);
			match(ID_MAJ);
			setState(42);
			match(PO);
			setState(43);
			match(PF);
			setState(44);
			match(AO);
			setState(45);
			declaration();
			setState(46);
			match(START);
			setState(47);
			body();
			setState(48);
			match(AF);
			setState(49);
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				type();
				setState(52);
				list_id();
				setState(53);
				match(PV);
				setState(54);
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
			setState(59);
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
			setState(61);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List_id_finalContext(List_idContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitList_id_final(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class List_id_nextContext extends List_idContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode VG() { return getToken(LangParser.VG, 0); }
		public List_idContext list_id() {
			return getRuleContext(List_idContext.class,0);
		}
		public List_id_nextContext(List_idContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitList_id_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_idContext list_id() throws RecognitionException {
		List_idContext _localctx = new List_idContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list_id);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new List_id_nextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				id();
				setState(64);
				match(VG);
				setState(65);
				list_id();
				}
				break;
			case 2:
				_localctx = new List_id_finalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				id();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitChaine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EntierContext extends OperandContext {
		public TerminalNode ENTIER() { return getToken(LangParser.ENTIER, 0); }
		public EntierContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitEntier(this);
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
	public static class ReelContext extends OperandContext {
		public TerminalNode REEL() { return getToken(LangParser.REEL, 0); }
		public ReelContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitReel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operand);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTIER:
				_localctx = new EntierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(ENTIER);
				}
				break;
			case REEL:
				_localctx = new ReelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(REEL);
				}
				break;
			case CHAINE:
				_localctx = new ChaineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(CHAINE);
				}
				break;
			case ID_MAJ:
			case ID_MIN:
				_localctx = new IdtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
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
		enterRule(_localctx, 12, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		enterRule(_localctx, 14, RULE_formule);
		try {
			setState(86);
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
				setState(78);
				operand();
				setState(79);
				formule_next();
				}
				break;
			case PO:
				_localctx = new Formule_parenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(PO);
				setState(82);
				formule();
				setState(83);
				match(PF);
				setState(84);
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
		enterRule(_localctx, 16, RULE_formule_next);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MOINS:
			case MUL:
			case DIV:
				_localctx = new Formule_operatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				operator();
				setState(89);
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
		enterRule(_localctx, 18, RULE_affectation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			id();
			setState(95);
			match(AFF);
			setState(96);
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
		enterRule(_localctx, 20, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			formule();
			setState(101);
			comparator();
			setState(102);
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
		enterRule(_localctx, 24, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IF);
			setState(105);
			match(PO);
			setState(106);
			condition();
			setState(107);
			match(PF);
			setState(108);
			match(THEN);
			setState(109);
			match(AO);
			setState(110);
			body();
			setState(111);
			match(AF);
			setState(112);
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
		enterRule(_localctx, 26, RULE_else_);
		try {
			setState(121);
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
				setState(116);
				match(ELSE);
				setState(117);
				match(AO);
				setState(118);
				body();
				setState(119);
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
		enterRule(_localctx, 28, RULE_do_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(DO);
			setState(124);
			match(AO);
			setState(125);
			body();
			setState(126);
			match(AF);
			setState(127);
			match(WHILE);
			setState(128);
			match(PO);
			setState(129);
			condition();
			setState(130);
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
		enterRule(_localctx, 30, RULE_read_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(READ);
			setState(133);
			match(PO);
			setState(134);
			id();
			setState(135);
			match(PF);
			setState(136);
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
		enterRule(_localctx, 32, RULE_content);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(CHAINE);
				}
				break;
			case ID_MAJ:
			case ID_MIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
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
		enterRule(_localctx, 34, RULE_print_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(PRINT);
			setState(143);
			match(PO);
			setState(144);
			content();
			setState(145);
			match(PF);
			setState(146);
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
		enterRule(_localctx, 36, RULE_instruction);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_MAJ:
			case ID_MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				affectation();
				setState(149);
				match(PV);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				read_();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				print_();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				if_();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
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
		enterRule(_localctx, 38, RULE_body);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				instruction();
				setState(158);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\5\6G\n\6\3\7\3\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\tY\n\t\3\n\3\n\3\n\3\n\5\n_\n\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17|\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u008f\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u009e\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00a5\n\25\3\25\2\2\26\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2\13\r\3\2#$\3\2\16\21\3"+
		"\2\25\30\2\u00a2\2*\3\2\2\2\4;\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nF\3\2\2"+
		"\2\fL\3\2\2\2\16N\3\2\2\2\20X\3\2\2\2\22^\3\2\2\2\24`\3\2\2\2\26d\3\2"+
		"\2\2\30f\3\2\2\2\32j\3\2\2\2\34{\3\2\2\2\36}\3\2\2\2 \u0086\3\2\2\2\""+
		"\u008e\3\2\2\2$\u0090\3\2\2\2&\u009d\3\2\2\2(\u00a4\3\2\2\2*+\7\3\2\2"+
		"+,\7#\2\2,-\7\6\2\2-.\7\7\2\2./\7\4\2\2/\60\5\4\3\2\60\61\7\b\2\2\61\62"+
		"\5(\25\2\62\63\7\5\2\2\63\64\7\2\2\3\64\3\3\2\2\2\65\66\5\6\4\2\66\67"+
		"\5\n\6\2\678\7\t\2\289\5\4\3\29<\3\2\2\2:<\3\2\2\2;\65\3\2\2\2;:\3\2\2"+
		"\2<\5\3\2\2\2=>\t\2\2\2>\7\3\2\2\2?@\t\3\2\2@\t\3\2\2\2AB\5\b\5\2BC\7"+
		"\n\2\2CD\5\n\6\2DG\3\2\2\2EG\5\b\5\2FA\3\2\2\2FE\3\2\2\2G\13\3\2\2\2H"+
		"M\7\22\2\2IM\7\23\2\2JM\7\24\2\2KM\5\b\5\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2"+
		"\2LK\3\2\2\2M\r\3\2\2\2NO\t\4\2\2O\17\3\2\2\2PQ\5\f\7\2QR\5\22\n\2RY\3"+
		"\2\2\2ST\7\6\2\2TU\5\20\t\2UV\7\7\2\2VW\5\22\n\2WY\3\2\2\2XP\3\2\2\2X"+
		"S\3\2\2\2Y\21\3\2\2\2Z[\5\16\b\2[\\\5\20\t\2\\_\3\2\2\2]_\3\2\2\2^Z\3"+
		"\2\2\2^]\3\2\2\2_\23\3\2\2\2`a\5\b\5\2ab\7\31\2\2bc\5\20\t\2c\25\3\2\2"+
		"\2de\t\5\2\2e\27\3\2\2\2fg\5\20\t\2gh\5\26\f\2hi\5\20\t\2i\31\3\2\2\2"+
		"jk\7\32\2\2kl\7\6\2\2lm\5\30\r\2mn\7\7\2\2no\7\33\2\2op\7\4\2\2pq\5(\25"+
		"\2qr\7\5\2\2rs\5\34\17\2s\33\3\2\2\2t|\3\2\2\2u|\3\2\2\2vw\7\34\2\2wx"+
		"\7\4\2\2xy\5(\25\2yz\7\5\2\2z|\3\2\2\2{t\3\2\2\2{u\3\2\2\2{v\3\2\2\2|"+
		"\35\3\2\2\2}~\7\35\2\2~\177\7\4\2\2\177\u0080\5(\25\2\u0080\u0081\7\5"+
		"\2\2\u0081\u0082\7\36\2\2\u0082\u0083\7\6\2\2\u0083\u0084\5\30\r\2\u0084"+
		"\u0085\7\7\2\2\u0085\37\3\2\2\2\u0086\u0087\7\37\2\2\u0087\u0088\7\6\2"+
		"\2\u0088\u0089\5\b\5\2\u0089\u008a\7\7\2\2\u008a\u008b\7\t\2\2\u008b!"+
		"\3\2\2\2\u008c\u008f\7\24\2\2\u008d\u008f\5\b\5\2\u008e\u008c\3\2\2\2"+
		"\u008e\u008d\3\2\2\2\u008f#\3\2\2\2\u0090\u0091\7 \2\2\u0091\u0092\7\6"+
		"\2\2\u0092\u0093\5\"\22\2\u0093\u0094\7\7\2\2\u0094\u0095\7\t\2\2\u0095"+
		"%\3\2\2\2\u0096\u0097\5\24\13\2\u0097\u0098\7\t\2\2\u0098\u009e\3\2\2"+
		"\2\u0099\u009e\5 \21\2\u009a\u009e\5$\23\2\u009b\u009e\5\32\16\2\u009c"+
		"\u009e\5\36\20\2\u009d\u0096\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\'\3\2\2\2\u009f\u00a0"+
		"\5&\24\2\u00a0\u00a1\5(\25\2\u00a1\u00a5\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5)\3\2\2\2\13;FLX^{\u008e\u009d\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}