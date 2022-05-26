package PrimerParcial.E6;

public class TerminalExpressionAny extends AbstractExpression {

    public TerminalExpressionAny(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(ContextGherkins context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
        context.output = context.output + context.input.substring(0, this.digit) + " ";
        context.input = context.input.substring(this.digit);
    }
}
