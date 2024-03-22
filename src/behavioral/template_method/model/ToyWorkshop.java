package behavioral.template_method.model;

public class ToyWorkshop implements Workshop {
    @Override
    public void assembling() {
        System.out.println("Збираю іграшку");
    }

    @Override
    public void packing() {
        System.out.println("Загортаю в коробку");
    }
}
