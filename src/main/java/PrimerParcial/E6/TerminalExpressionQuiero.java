package PrimerParcial.E6;

public class TerminalExpressionQuiero extends AbstractExpression {

    public TerminalExpressionQuiero(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(ContextGherkins context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
        if (context.input.startsWith("Quiero")){
            context.output = context.output + "When ";
            context.input = context.input.substring(digit);
        }
    }
}
