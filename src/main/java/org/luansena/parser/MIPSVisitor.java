package org.luansena.parser;

import org.luansena.antlr.MIPSBaseVisitor;
import org.luansena.antlr.MIPSParser;
import org.luansena.hardware.Memory;

public class MIPSVisitor extends MIPSBaseVisitor<Object> {

    @Override
    public Object visitAdd_instruction(MIPSParser.Add_instructionContext ctx) {

        int regValue1 = Memory.getValueByLabel(ctx.getChild(3).getText());
        int regValue2 = Memory.getValueByLabel(ctx.getChild(5).getText());

        Memory.setValueByLabel(ctx.getChild(1).getText(), regValue1 + regValue2);
        return null;
    }
}
