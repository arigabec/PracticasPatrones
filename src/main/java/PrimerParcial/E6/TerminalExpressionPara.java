package PrimerParcial.E6;

public class TerminalExpressionPara extends AbstractExpression {

    public TerminalExpressionPara(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(ContextGherkins context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
        if (context.input.startsWith("Para")){
            context.output = context.output + "Then ";
            context.input = context.input.substring(digit);
        }
    }
}
