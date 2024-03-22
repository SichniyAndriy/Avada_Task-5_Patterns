package behavioral.template_method.model;

public interface Workshop {
    default void create() {
        assembling();
        packing();
        labeling();
        shipping();
    }

    void assembling();

    void packing();

    default void labeling() {
        System.out.println("Наношу маркування на товар");
    }

    default void shipping() {
        System.out.println("Відвожу товар на склад");
    }
}
