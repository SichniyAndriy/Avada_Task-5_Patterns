package behavioral.observer.model;

import java.util.ArrayList;
import java.util.List;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Server {
    @NonNull
    private String id;
    private boolean state = false;
    private final List<ServerObserver> observers = new ArrayList<>();

    public void add(ServerObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void remove(ServerObserver observer) {
        observers.remove(observer);
    }

    public void changeState() {
        state = !state;
        notifyObservers();
    }

    private void notifyObservers() {
        observers.forEach(observer -> observer.update(id, state));
    }
}
