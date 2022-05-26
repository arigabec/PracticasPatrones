package PrimerParcial.E6;

public class TerminalExpressionComo extends AbstractExpression {

    public TerminalExpressionComo(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(ContextGherkins context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
        if (context.input.startsWith("Como")){
            context.output = context.output + "Given ";
            context.input = context.input.substring(digit);
        }
    }
}
