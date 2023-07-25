package org.luansena.antlr;
// Generated from MIPS.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MIPSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MIPSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MIPSParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MIPSParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MIPSParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(MIPSParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(MIPSParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#add_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_instruction(MIPSParser.Add_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#sub_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_instruction(MIPSParser.Sub_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#addi_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddi_instruction(MIPSParser.Addi_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#lw_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLw_instruction(MIPSParser.Lw_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#sw_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSw_instruction(MIPSParser.Sw_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(MIPSParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIPSParser#immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmediate(MIPSParser.ImmediateContext ctx);
}