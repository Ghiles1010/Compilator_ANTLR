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
		STRING=11, PLUS=12, MOINS=13, MUL=14, DIV=15, ENTIER=16, REEL=17, GRT=18, 
		LSS=19, EQ=20, NEQ=21, AFF=22, IF=23, THEN=24, ELSE=25, DO=26, WHILE=27, 
		READ=28, PRINT=29, COMMENT_S=30, COMMENT_M=31, NOM_PROGRAMME=32, ID=33, 
		WS=34;
	public static final int
		RULE_root = 0, RULE_declaration = 1, RULE_type = 2, RULE_list_id = 3, 
		RULE_operand = 4, RULE_operator = 5, RULE_formule = 6, RULE_formule_next = 7, 
		RULE_affectation = 8, RULE_comparator = 9, RULE_condition = 10, RULE_if_ = 11, 
		RULE_else_ = 12, RULE_do_ = 13, RULE_instruction = 14, RULE_body = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "declaration", "type", "list_id", "operand", "operator", "formule", 
			"formule_next", "affectation", "comparator", "condition", "if_", "else_", 
			"do_", "instruction", "body"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'compil'", "'{'", "'}'", "'('", "')'", "'start'", "';'", "','", 
			"'intCompil'", "'floatCompil'", "'stringCompil'", "'+'", "'-'", "'*'", 
			"'/'", null, null, "'>'", "'<'", "'=='", "'!='", "'='", "'if'", "'then'", 
			"'else'", "'do'", "'while'", "'scanCompil'", "'printCompil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMPIL", "AO", "AF", "PO", "PF", "START", "PV", "VG", "INT", "FLOAT", 
			"STRING", "PLUS", "MOINS", "MUL", "DIV", "ENTIER", "REEL", "GRT", "LSS", 
			"EQ", "NEQ", "AFF", "IF", "THEN", "ELSE", "DO", "WHILE", "READ", "PRINT", 
			"COMMENT_S", "COMMENT_M", "NOM_PROGRAMME", "ID", "WS"
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
			setState(32);
			match(COMPIL);
			setState(33);
			match(NOM_PROGRAMME);
			setState(34);
			match(PO);
			setState(35);
			match(PF);
			setState(36);
			match(AO);
			setState(37);
			declaration();
			setState(38);
			match(START);
			setState(39);
			body();
			setState(40);
			match(AF);
			setState(41);
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				type();
				setState(44);
				list_id();
				setState(45);
				match(PV);
				setState(46);
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
			setState(51);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitList_id_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_idContext list_id() throws RecognitionException {
		List_idContext _localctx = new List_idContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_id);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new List_id_nextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(ID);
				setState(54);
				match(VG);
				setState(55);
				list_id();
				}
				break;
			case 2:
				_localctx = new List_id_finalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
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
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
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
		enterRule(_localctx, 8, RULE_operand);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTIER:
				_localctx = new EntierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(ENTIER);
				}
				break;
			case REEL:
				_localctx = new ReelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(REEL);
				}
				break;
			case ID:
				_localctx = new IdtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
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
			setState(64);
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
		enterRule(_localctx, 12, RULE_formule);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTIER:
			case REEL:
			case ID:
				_localctx = new Formule_operandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				operand();
				setState(67);
				formule_next();
				}
				break;
			case PO:
				_localctx = new Formule_parenthesisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(PO);
				setState(70);
				formule();
				setState(71);
				match(PF);
				setState(72);
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
		enterRule(_localctx, 14, RULE_formule_next);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MOINS:
			case MUL:
			case DIV:
				_localctx = new Formule_operatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				operator();
				setState(77);
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
			setState(82);
			match(ID);
			setState(83);
			match(AFF);
			setState(84);
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
		enterRule(_localctx, 18, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			formule();
			setState(89);
			comparator();
			setState(90);
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
		enterRule(_localctx, 22, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IF);
			setState(93);
			match(PO);
			setState(94);
			condition();
			setState(95);
			match(PF);
			setState(96);
			match(THEN);
			setState(97);
			match(AO);
			setState(98);
			body();
			setState(99);
			match(AF);
			setState(100);
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
		enterRule(_localctx, 24, RULE_else_);
		try {
			setState(109);
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
				setState(104);
				match(ELSE);
				setState(105);
				match(AO);
				setState(106);
				body();
				setState(107);
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
		enterRule(_localctx, 26, RULE_do_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(DO);
			setState(112);
			match(AO);
			setState(113);
			body();
			setState(114);
			match(AF);
			setState(115);
			match(WHILE);
			setState(116);
			match(PO);
			setState(117);
			condition();
			setState(118);
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

	public static class InstructionContext extends ParserRuleContext {
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public TerminalNode PV() { return getToken(LangParser.PV, 0); }
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
		enterRule(_localctx, 28, RULE_instruction);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				affectation();
				setState(121);
				match(PV);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				if_();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
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
		enterRule(_localctx, 30, RULE_body);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				instruction();
				setState(128);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0089\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\5\6A\n\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\3\t\5\tS\n\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16p\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0080\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0087\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \2\5\3\2\13\r\3\2\16\21\3\2\24\27\2\u0084\2\"\3\2\2\2\4\63"+
		"\3\2\2\2\6\65\3\2\2\2\b;\3\2\2\2\n@\3\2\2\2\fB\3\2\2\2\16L\3\2\2\2\20"+
		"R\3\2\2\2\22T\3\2\2\2\24X\3\2\2\2\26Z\3\2\2\2\30^\3\2\2\2\32o\3\2\2\2"+
		"\34q\3\2\2\2\36\177\3\2\2\2 \u0086\3\2\2\2\"#\7\3\2\2#$\7\"\2\2$%\7\6"+
		"\2\2%&\7\7\2\2&\'\7\4\2\2\'(\5\4\3\2()\7\b\2\2)*\5 \21\2*+\7\5\2\2+,\7"+
		"\2\2\3,\3\3\2\2\2-.\5\6\4\2./\5\b\5\2/\60\7\t\2\2\60\61\5\4\3\2\61\64"+
		"\3\2\2\2\62\64\3\2\2\2\63-\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\66\t"+
		"\2\2\2\66\7\3\2\2\2\678\7#\2\289\7\n\2\29<\5\b\5\2:<\7#\2\2;\67\3\2\2"+
		"\2;:\3\2\2\2<\t\3\2\2\2=A\7\22\2\2>A\7\23\2\2?A\7#\2\2@=\3\2\2\2@>\3\2"+
		"\2\2@?\3\2\2\2A\13\3\2\2\2BC\t\3\2\2C\r\3\2\2\2DE\5\n\6\2EF\5\20\t\2F"+
		"M\3\2\2\2GH\7\6\2\2HI\5\16\b\2IJ\7\7\2\2JK\5\20\t\2KM\3\2\2\2LD\3\2\2"+
		"\2LG\3\2\2\2M\17\3\2\2\2NO\5\f\7\2OP\5\16\b\2PS\3\2\2\2QS\3\2\2\2RN\3"+
		"\2\2\2RQ\3\2\2\2S\21\3\2\2\2TU\7#\2\2UV\7\30\2\2VW\5\16\b\2W\23\3\2\2"+
		"\2XY\t\4\2\2Y\25\3\2\2\2Z[\5\16\b\2[\\\5\24\13\2\\]\5\16\b\2]\27\3\2\2"+
		"\2^_\7\31\2\2_`\7\6\2\2`a\5\26\f\2ab\7\7\2\2bc\7\32\2\2cd\7\4\2\2de\5"+
		" \21\2ef\7\5\2\2fg\5\32\16\2g\31\3\2\2\2hp\3\2\2\2ip\3\2\2\2jk\7\33\2"+
		"\2kl\7\4\2\2lm\5 \21\2mn\7\5\2\2np\3\2\2\2oh\3\2\2\2oi\3\2\2\2oj\3\2\2"+
		"\2p\33\3\2\2\2qr\7\34\2\2rs\7\4\2\2st\5 \21\2tu\7\5\2\2uv\7\35\2\2vw\7"+
		"\6\2\2wx\5\26\f\2xy\7\7\2\2y\35\3\2\2\2z{\5\22\n\2{|\7\t\2\2|\u0080\3"+
		"\2\2\2}\u0080\5\30\r\2~\u0080\5\34\17\2\177z\3\2\2\2\177}\3\2\2\2\177"+
		"~\3\2\2\2\u0080\37\3\2\2\2\u0081\u0082\5\36\20\2\u0082\u0083\5 \21\2\u0083"+
		"\u0087\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0081\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087!\3\2\2\2\n\63;@LRo"+
		"\177\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}