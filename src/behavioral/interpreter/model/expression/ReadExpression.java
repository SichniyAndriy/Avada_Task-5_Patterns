package behavioral.interpreter.model.expression;

import behavioral.interpreter.model.Context;
import behavioral.interpreter.model.Person;

public class ReadExpression extends TerminalExpression {
    private final Integer firstNum;
    private Integer secondNum;

    public ReadExpression(Context context, Integer n) {
        super(context);
        firstNum = n;
    }

    public ReadExpression(Context context, Integer from, Integer to) {
        super(context);
        firstNum = from;
        secondNum = to;
    }

    @Override
    public String interpret() {
        if (firstNum != null && secondNum != null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (var v: context.read(firstNum, secondNum).entrySet()) {
                stringBuilder.append(v).append("\n");
            }
            return stringBuilder.toString();
        }
        Person person = context.read(firstNum);
        return person != null ? person.toString() : "No result";
    }
}
