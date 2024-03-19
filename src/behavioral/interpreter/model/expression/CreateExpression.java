package behavioral.interpreter.model.expression;

import behavioral.interpreter.model.Context;
import behavioral.interpreter.model.Person;

public class CreateExpression extends TerminalExpression {
    private Integer num;
    private Person person;

    public CreateExpression(Context context) {
        super(context);
    }

    public CreateExpression(Context context, Integer n) {
        super(context);
        num = n;
    }

    public CreateExpression(Context context, Person person) {
        super(context);
        this.person = person;
    }

    public String interpret() {
        String line;
        if (num != null) {
            line = context.create(num);
        } else if (person != null) {
            line = context.create(person);
        } else {
            line = context.create();
        }
        return line;
    }
}
