package behavioral.interpreter.model.expression;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class NonTerminalExpression implements Expression{
    protected Expression left;
    protected Expression right;
}
