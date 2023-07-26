package org.luansena.antlr;

// Generated from MIPS.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MIPSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, HEX_NUMBER=43, DEC_NUMBER=44, 
		ID=45, WS=46;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_instruction = 2, RULE_label = 3, 
		RULE_add_instruction = 4, RULE_sub_instruction = 5, RULE_addi_instruction = 6, 
		RULE_lw_instruction = 7, RULE_sw_instruction = 8, RULE_register = 9, RULE_immediate = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "instruction", "label", "add_instruction", "sub_instruction", 
			"addi_instruction", "lw_instruction", "sw_instruction", "register", "immediate"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'add'", "','", "'sub'", "'addi'", "'lw'", "'('", "')'", 
			"'sw'", "'$zero'", "'$at'", "'$v0'", "'$v1'", "'$a0'", "'$a1'", "'$a2'", 
			"'$a3'", "'$t0'", "'$t1'", "'$t2'", "'$t3'", "'$t4'", "'$t5'", "'$t6'", 
			"'$t7'", "'$t8'", "'$t9'", "'$s0'", "'$s1'", "'$s2'", "'$s3'", "'$s4'", 
			"'$s5'", "'$s6'", "'$s7'", "'$k0'", "'$k1'", "'$gp'", "'$sp'", "'$fp'", 
			"'$ra'", "'0x'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "HEX_NUMBER", "DEC_NUMBER", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "MIPS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MIPSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MIPSParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIPSVisitor ) return ((MIPSVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35184372089460L) != 0) );
			setState(27);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIPSVisitor ) return ((MIPSVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__4:
			case T__5:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				instruction();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				label();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public Add_instructionContext add_instruction() {
			return getRuleContext(Add_instructionContext.class,0);
		}
		public Sub_instructionContext sub_instruction() {
			return getRuleContext(Sub_instructionContext.class,0);
		}
		public Addi_instructionContext addi_instruction() {
			return getRuleContext(Addi_instructionContext.class,0);
		}
		public Lw_instructionContext lw_instruction() {
			return getRuleContext(Lw_instructionContext.class,0);
		}
		public Sw_instructionContext sw_instruction() {
			return getRuleContext(Sw_instructionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIPSVisitor ) return ((MIPSVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				add_instruction();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				sub_instruction();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				addi_instruction();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				lw_instruction();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				sw_instruction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MIPSParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIPSVisitor ) return ((MIPSVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ID);
			setState(41);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Add_instructionContext extends ParserRuleContext {
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public Add_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIPSVisitor ) return ((MIPSVisitor<? extends T>)visitor).visitAdd_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_instructionContext add_instruction() throws RecognitionException {
		Add_instructionContext _localctx = new Add_instructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_add_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__1);
			setState(44);
			register();
			setState(45);
			match(T__2);
			setState(46);
			register();
			setState(47);
			match(T__2);
			setState(48);
			register();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sub_instructionContext extends ParserRuleContext {
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public Sub_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIPSVisitor ) return ((MIPSVisitor<? extends T>)visitor).visitSub_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_instructionContext sub_instruction() throws RecognitionException {
		Sub_instructionContext _localctx = new Sub_instructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sub_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__3);
			setState(51);
			register();
			setState(52);
			match(T__2);
			setState(53);
			register();
			setState(54);
			match(T__2);
			setState(55);
			register();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Addi_instructionContext extends ParserRuleContext {
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public Addi_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addi_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIPSVisitor ) return ((MIPSVisitor<? extends T>)visitor).visitAddi_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Addi_instructionContext addi_instruction() throws RecognitionException {
		Addi_instructionContext _localctx = new Addi_instructionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addi_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__4);
			setState(58);
			register();
			setState(59);
			match(T__2);
			setState(60);
			register();
			setState(61);
			match(T__2);
			setState(62);
			immediate();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lw_instructionContext extends ParserRuleContext {
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public Lw_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lw_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIPSVisitor ) return ((MIPSVisitor<? extends T>)visitor).visitLw_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lw_instructionContext lw_instruction() throws RecognitionException {
		Lw_instructionContext _localctx = new Lw_instructionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lw_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__5);
			setState(65);
			register();
			setState(66);
			match(T__2);
			setState(67);
			immediate();
			setState(68);
			match(T__6);
			setState(69);
			register();
			setState(70);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sw_instructionContext extends ParserRuleContext {
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public Sw_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIPSVisitor ) return ((MIPSVisitor<? extends T>)visitor).visitSw_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_instructionContext sw_instruction() throws RecognitionException {
		Sw_instructionContext _localctx = new Sw_instructionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sw_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__8);
			setState(73);
			register();
			setState(74);
			match(T__2);
			setState(75);
			immediate();
			setState(76);
			match(T__6);
			setState(77);
			register();
			setState(78);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RegisterContext extends ParserRuleContext {
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIPSVisitor ) return ((MIPSVisitor<? extends T>)visitor).visitRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_register);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 11);
				{
				setState(90);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 12);
				{
				setState(91);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 13);
				{
				setState(92);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 14);
				{
				setState(93);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 15);
				{
				setState(94);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 16);
				{
				setState(95);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 17);
				{
				setState(96);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 18);
				{
				setState(97);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 19);
				{
				setState(98);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 20);
				{
				setState(99);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 21);
				{
				setState(100);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 22);
				{
				setState(101);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 23);
				{
				setState(102);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 24);
				{
				setState(103);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 25);
				{
				setState(104);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 26);
				{
				setState(105);
				match(T__34);
				}
				break;
			case EOF:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__7:
			case T__8:
			case ID:
				enterOuterAlt(_localctx, 27);
				{
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 28);
				{
				setState(107);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 29);
				{
				setState(108);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 30);
				{
				setState(109);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 31);
				{
				setState(110);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 32);
				{
				setState(111);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 33);
				{
				setState(112);
				match(T__40);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImmediateContext extends ParserRuleContext {
		public TerminalNode HEX_NUMBER() { return getToken(MIPSParser.HEX_NUMBER, 0); }
		public TerminalNode DEC_NUMBER() { return getToken(MIPSParser.DEC_NUMBER, 0); }
		public ImmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immediate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIPSVisitor ) return ((MIPSVisitor<? extends T>)visitor).visitImmediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImmediateContext immediate() throws RecognitionException {
		ImmediateContext _localctx = new ImmediateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_immediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				{
				setState(115);
				match(T__41);
				setState(116);
				match(HEX_NUMBER);
				}
				break;
			case DEC_NUMBER:
				{
				setState(117);
				match(DEC_NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\u0004\u0001.y\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018\b\u0000"+
		"\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001 \b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tr\b\t\u0001\n\u0001\n\u0001\n\u0003"+
		"\nw\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0000\u0094\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0002\u001f\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006"+
		"(\u0001\u0000\u0000\u0000\b+\u0001\u0000\u0000\u0000\n2\u0001\u0000\u0000"+
		"\u0000\f9\u0001\u0000\u0000\u0000\u000e@\u0001\u0000\u0000\u0000\u0010"+
		"H\u0001\u0000\u0000\u0000\u0012q\u0001\u0000\u0000\u0000\u0014v\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001"+
		"\u0000\u0000\u0000\u001d \u0003\u0004\u0002\u0000\u001e \u0003\u0006\u0003"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 \u0003\u0001\u0000\u0000\u0000!\'\u0003\b\u0004\u0000\"\'\u0003"+
		"\n\u0005\u0000#\'\u0003\f\u0006\u0000$\'\u0003\u000e\u0007\u0000%\'\u0003"+
		"\u0010\b\u0000&!\u0001\u0000\u0000\u0000&\"\u0001\u0000\u0000\u0000&#"+
		"\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000"+
		"\u0000\'\u0005\u0001\u0000\u0000\u0000()\u0005-\u0000\u0000)*\u0005\u0001"+
		"\u0000\u0000*\u0007\u0001\u0000\u0000\u0000+,\u0005\u0002\u0000\u0000"+
		",-\u0003\u0012\t\u0000-.\u0005\u0003\u0000\u0000./\u0003\u0012\t\u0000"+
		"/0\u0005\u0003\u0000\u000001\u0003\u0012\t\u00001\t\u0001\u0000\u0000"+
		"\u000023\u0005\u0004\u0000\u000034\u0003\u0012\t\u000045\u0005\u0003\u0000"+
		"\u000056\u0003\u0012\t\u000067\u0005\u0003\u0000\u000078\u0003\u0012\t"+
		"\u00008\u000b\u0001\u0000\u0000\u00009:\u0005\u0005\u0000\u0000:;\u0003"+
		"\u0012\t\u0000;<\u0005\u0003\u0000\u0000<=\u0003\u0012\t\u0000=>\u0005"+
		"\u0003\u0000\u0000>?\u0003\u0014\n\u0000?\r\u0001\u0000\u0000\u0000@A"+
		"\u0005\u0006\u0000\u0000AB\u0003\u0012\t\u0000BC\u0005\u0003\u0000\u0000"+
		"CD\u0003\u0014\n\u0000DE\u0005\u0007\u0000\u0000EF\u0003\u0012\t\u0000"+
		"FG\u0005\b\u0000\u0000G\u000f\u0001\u0000\u0000\u0000HI\u0005\t\u0000"+
		"\u0000IJ\u0003\u0012\t\u0000JK\u0005\u0003\u0000\u0000KL\u0003\u0014\n"+
		"\u0000LM\u0005\u0007\u0000\u0000MN\u0003\u0012\t\u0000NO\u0005\b\u0000"+
		"\u0000O\u0011\u0001\u0000\u0000\u0000Pr\u0005\n\u0000\u0000Qr\u0005\u000b"+
		"\u0000\u0000Rr\u0005\f\u0000\u0000Sr\u0005\r\u0000\u0000Tr\u0005\u000e"+
		"\u0000\u0000Ur\u0005\u000f\u0000\u0000Vr\u0005\u0010\u0000\u0000Wr\u0005"+
		"\u0011\u0000\u0000Xr\u0005\u0012\u0000\u0000Yr\u0005\u0013\u0000\u0000"+
		"Zr\u0005\u0014\u0000\u0000[r\u0005\u0015\u0000\u0000\\r\u0005\u0016\u0000"+
		"\u0000]r\u0005\u0017\u0000\u0000^r\u0005\u0018\u0000\u0000_r\u0005\u0019"+
		"\u0000\u0000`r\u0005\u001a\u0000\u0000ar\u0005\u001b\u0000\u0000br\u0005"+
		"\u001c\u0000\u0000cr\u0005\u001d\u0000\u0000dr\u0005\u001e\u0000\u0000"+
		"er\u0005\u001f\u0000\u0000fr\u0005 \u0000\u0000gr\u0005!\u0000\u0000h"+
		"r\u0005\"\u0000\u0000ir\u0005#\u0000\u0000jr\u0001\u0000\u0000\u0000k"+
		"r\u0005$\u0000\u0000lr\u0005%\u0000\u0000mr\u0005&\u0000\u0000nr\u0005"+
		"\'\u0000\u0000or\u0005(\u0000\u0000pr\u0005)\u0000\u0000qP\u0001\u0000"+
		"\u0000\u0000qQ\u0001\u0000\u0000\u0000qR\u0001\u0000\u0000\u0000qS\u0001"+
		"\u0000\u0000\u0000qT\u0001\u0000\u0000\u0000qU\u0001\u0000\u0000\u0000"+
		"qV\u0001\u0000\u0000\u0000qW\u0001\u0000\u0000\u0000qX\u0001\u0000\u0000"+
		"\u0000qY\u0001\u0000\u0000\u0000qZ\u0001\u0000\u0000\u0000q[\u0001\u0000"+
		"\u0000\u0000q\\\u0001\u0000\u0000\u0000q]\u0001\u0000\u0000\u0000q^\u0001"+
		"\u0000\u0000\u0000q_\u0001\u0000\u0000\u0000q`\u0001\u0000\u0000\u0000"+
		"qa\u0001\u0000\u0000\u0000qb\u0001\u0000\u0000\u0000qc\u0001\u0000\u0000"+
		"\u0000qd\u0001\u0000\u0000\u0000qe\u0001\u0000\u0000\u0000qf\u0001\u0000"+
		"\u0000\u0000qg\u0001\u0000\u0000\u0000qh\u0001\u0000\u0000\u0000qi\u0001"+
		"\u0000\u0000\u0000qj\u0001\u0000\u0000\u0000qk\u0001\u0000\u0000\u0000"+
		"ql\u0001\u0000\u0000\u0000qm\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0013\u0001"+
		"\u0000\u0000\u0000st\u0005*\u0000\u0000tw\u0005+\u0000\u0000uw\u0005,"+
		"\u0000\u0000vs\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000w\u0015"+
		"\u0001\u0000\u0000\u0000\u0005\u0019\u001f&qv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}