package creation.builder.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Tank {
    private String id;
    private String name;
    private Integer weight;
    private String base;
    private String chassis;
    private String engine;
    private String tower;
    private String gun;
    private String machineGun;
}
