package behavioral.template_method.model;

public class MeetWorkshop implements Workshop {
    @Override
    public void assembling() {
        System.out.println("Варю ковбасу");
    }

    @Override
    public void packing() {
        System.out.println("Загортаю в упаковку");
    }
}
