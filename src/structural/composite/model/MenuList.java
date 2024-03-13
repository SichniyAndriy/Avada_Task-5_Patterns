package structural.composite.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MenuList implements MenuComponent {
    @NonNull
    private final String name;
    private final List<MenuComponent> menu = new ArrayList<>();

    public boolean add(MenuComponent component) {
        return menu.add(component);
    }

    public boolean remove(MenuComponent component) {
        return menu.remove(component);
    }

    @Override
    public String info() {
        StringBuilder stringBuilder = new StringBuilder(name + "\n");
        menu.forEach(el -> stringBuilder.append(el.info()).append("\n"));
        return stringBuilder.toString();
    }
}
