package behavioral.template_method.model;

public class CarWorkshop implements Workshop {
    @Override
    public void assembling() {
        System.out.println("Збираю машину");
    }

    @Override
    public void packing() {
        System.out.println("Загортаю в чехол");
    }
}
