package behavioral.chain_of_responsibility.model;

import behavioral.chain_of_responsibility.Cnap.Request;

public class HuntingSection extends BaseHandler {
    private HuntingSection() {
        super(Request.HUNTING_LICENSE);
    }
    public static HuntingSection open() {
        return new HuntingSection();
    }
}
