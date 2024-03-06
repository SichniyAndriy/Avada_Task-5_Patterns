package creation.factory_method.model;

public interface Transportable {
    void loadCargo();
    void followRoute(String from, String to);
    void unloadCargo();
}
