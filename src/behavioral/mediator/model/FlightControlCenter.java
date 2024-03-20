package behavioral.mediator.model;

import behavioral.mediator.model.Plane;

public interface FlightControlCenter {
    void add(Plane plane);

    void remove(Plane plane);

    void receive(Plane plane, String msg);

    void send(Plane plane, String msg);

    void sendAll(String msg);
}
