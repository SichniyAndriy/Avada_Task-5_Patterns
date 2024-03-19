package behavioral.chain_of_responsibility.model;

import behavioral.chain_of_responsibility.Cnap.Request;

public class PassportSection extends BaseHandler{
    private PassportSection() {
        super(Request.PASSPORT);
    }

    public static PassportSection open() {
        return new PassportSection();
    }
}
