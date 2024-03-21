package behavioral.observer.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Admin implements ServerObserver {
    private String name;

    @Override
    public void update(String id, boolean state) {
        System.out.println(name + ": Server " + id + " now is " + state);
    }
}
