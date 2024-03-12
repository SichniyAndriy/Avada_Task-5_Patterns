package structural.bridge.model.videocard;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AbstractVideoCard implements VideoCard {
    protected long frequency;
    protected long memory;

    @Override
    public void drawGraphic() {
        System.out.println("Промальовую графіку");
    }

}
