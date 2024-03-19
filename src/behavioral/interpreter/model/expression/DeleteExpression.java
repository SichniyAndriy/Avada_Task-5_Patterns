package behavioral.interpreter.model.expression;

import behavioral.interpreter.model.Context;

public class DeleteExpression extends TerminalExpression {
    private Integer firstNum;
    private Integer secondNum;

    public DeleteExpression(Context context, Integer n) {
        super(context);
        firstNum = n;
    }

    public DeleteExpression(Context context, Integer from, Integer to) {
        super(context);
        firstNum = from;
        secondNum = to;
    }

    @Override
    public String interpret() {
        if (firstNum != null && secondNum != null) {
            return context.delete(firstNum, secondNum);
        } else if (firstNum != null) {
            return context.delete(firstNum);
        }
        return "No result";
    }
}
