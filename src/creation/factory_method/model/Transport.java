package creation.factory_method.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.log4j.Logger;

@Getter
@NoArgsConstructor
public abstract class Transport implements Transportable {
    protected double payload;
    protected final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @Override
    public void loadCargo() {
        logger.info(" завантажується");
    }

    @Override
    public void followRoute(String from, String to) {
        loadCargo();
        logger.info(String.format(" cлідує маршрутом %s - %s", from, to));
        unloadCargo();
    }
    @Override
    public void unloadCargo() {
        logger.info(" розвавантажується");
    }
}
