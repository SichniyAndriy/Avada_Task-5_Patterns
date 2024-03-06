package creation.factory_method.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RoadTransport extends Transport {
    public RoadTransport(double payload) {
        super();
        this.payload = payload;
    }
}
