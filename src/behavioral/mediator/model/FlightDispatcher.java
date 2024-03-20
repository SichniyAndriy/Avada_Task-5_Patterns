package behavioral.mediator.model;

import java.util.HashSet;
import java.util.Set;

public class FlightDispatcher implements FlightControlCenter {
    private final Set<Plane> planes = new HashSet<>();

    @Override
    public void add(Plane plane) {
        planes.add(plane);
    }

    @Override
    public void remove(Plane plane) {
        planes.remove(plane);
    }

    @Override
    public void receive(Plane plane, String msg) {
        System.out.println(msg + " from " + plane.model);
    }

    @Override
    public void send(Plane plane, String msg) {

        System.out.println(msg + " to " + plane.model);
    }

    public void sendAll(String msg) {
        for (Plane p: planes) {
            send(p, msg);
        }
    }
}
