package behavioral.chain_of_responsibility.model;

import behavioral.chain_of_responsibility.Cnap.Request;

public class DrivingSection extends BaseHandler{
    private DrivingSection() {
        super(Request.DRIVING_LICENSE);
    }

    public static DrivingSection open() {
        return new DrivingSection();
    }
}
