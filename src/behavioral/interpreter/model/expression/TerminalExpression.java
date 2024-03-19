package behavioral.interpreter.model.expression;

import behavioral.interpreter.model.Context;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class TerminalExpression implements Expression {
    protected Context context;
}
