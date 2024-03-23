package behavioral.interpreter;

import behavioral.interpreter.model.Context;
import behavioral.interpreter.model.expression.AndExpression;
import behavioral.interpreter.model.expression.CreateExpression;
import behavioral.interpreter.model.expression.DeleteExpression;
import behavioral.interpreter.model.expression.ReadExpression;

/*
* Pattern Interpreter can interpret new grammar expressions.
* Its represent grammar like object
*/
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        System.out.println(new CreateExpression(context).interpret());
        System.out.println(new CreateExpression(context, 100).interpret());
        System.out.println(new CreateExpression(context, context.generateNewPerson()).interpret());

        System.out.println(new AndExpression(
                        new CreateExpression(context, 50),
                        new ReadExpression(context, 100, 150)
        ).interpret());

        System.out.println(new ReadExpression(context, 25).interpret());
        System.out.println(new ReadExpression(context, 50).interpret());
        System.out.println(new ReadExpression(context, 100).interpret());
        System.out.println(new ReadExpression(context, 150).interpret());
        System.out.println(new ReadExpression(context, 15, 75).interpret());

        System.out.println(new AndExpression(
                        new ReadExpression(context, 45),
                        new DeleteExpression(context, 45)
        ).interpret());

        System.out.println(new DeleteExpression(context, 25).interpret());
        System.out.println(new DeleteExpression(context, 10, 90).interpret());


    }
}
