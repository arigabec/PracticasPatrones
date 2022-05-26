package PrimerParcial.E6;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends AbstractExpression {
    private List<AbstractExpression> grammar =new ArrayList<>();
    private ContextGherkins context;

    public Interpreter(String msgToInterpret) {
        context = new ContextGherkins(msgToInterpret);
        for (String charOriginal : msgToInterpret.split(" ")) {
            switch (charOriginal){
                case "Como":
                    grammar.add(new TerminalExpressionComo(charOriginal.length()));
                    break;
                case "Quiero":
                    grammar.add(new TerminalExpressionQuiero(charOriginal.length()));
                    break;
                case "Para":
                    grammar.add(new TerminalExpressionPara(charOriginal.length()));
                    break;
                default:
                    grammar.add(new TerminalExpressionAny(charOriginal.length()));
                    break;
            }
        }
    }

    public String evaluateMsg(){
        for (AbstractExpression expression : grammar) {
            expression.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(ContextGherkins context) {

    }
}
