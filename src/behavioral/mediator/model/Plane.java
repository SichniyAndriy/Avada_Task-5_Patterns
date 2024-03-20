package behavioral.mediator.model;

public class Plane {
    public final String model;
    private FlightControlCenter flightControlCenter;

    public Plane(String model) {
        this.model = model;
    }

    public void register(FlightControlCenter flightControlCenter) {
        if (this.flightControlCenter != null) {
            System.out.println("Registration error");
            return;
        }
        this.flightControlCenter = flightControlCenter;
        flightControlCenter.add(this);
    }

    public void unregister() {
        if (flightControlCenter == null) {
            System.out.println("Error");
            return;
        }
        flightControlCenter.remove(this);
        flightControlCenter = null;

    }

    public void send(String msg) {
        flightControlCenter.send(this, msg);
    }

    public void receive(String msg) {
        System.out.println(model+ ": " + msg + " received");
    }
}
