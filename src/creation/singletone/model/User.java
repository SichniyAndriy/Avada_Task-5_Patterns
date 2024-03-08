package creation.singletone.model;

import creation.singletone.SingleUniqueTool;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
    private String name;

    public Result use(SingleUniqueTool tool) {
        System.out.println(name + " use " + tool.getClass().getSimpleName() + " - " + tool.getName());
        Result result = new Result();
        System.out.print("Return ");
        return result;
    }
}
