package behavioral.chain_of_responsibility.model;

import behavioral.chain_of_responsibility.Cnap.Request;

public class BuildingSection extends BaseHandler {
    private BuildingSection() {
        super(Request.BUILDING_LICENSE);
    }

    public static BuildingSection open() {
        return new BuildingSection();
    }
}
