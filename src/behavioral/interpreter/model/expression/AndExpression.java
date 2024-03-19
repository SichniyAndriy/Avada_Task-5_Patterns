package behavioral.interpreter.model.expression;

public class AndExpression extends NonTerminalExpression {
    public AndExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String interpret() {
        return left.interpret() + right.interpret();
    }
}
