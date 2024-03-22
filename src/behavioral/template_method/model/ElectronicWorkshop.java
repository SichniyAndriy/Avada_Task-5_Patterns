package behavioral.template_method.model;

public class ElectronicWorkshop implements Workshop {
    @Override
    public void assembling() {
        System.out.println("Збираю електроніку");
    }

    @Override
    public void packing() {
        System.out.println("Пакую електроніку в коробку");
    }
}
