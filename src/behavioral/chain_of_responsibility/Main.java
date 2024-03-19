package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.Cnap.Request;
import behavioral.chain_of_responsibility.model.BuildingSection;
import behavioral.chain_of_responsibility.model.DrivingSection;
import behavioral.chain_of_responsibility.model.HuntingSection;
import behavioral.chain_of_responsibility.model.PassportSection;

public class Main {
    public static void main(String[] args) {
        Cnap cnap = new Cnap();
        cnap.openNewService(PassportSection.open());
        cnap.openNewService(DrivingSection.open());
        cnap.openNewService(BuildingSection.open());

        cnap.passRequest(Request.PASSPORT);
        cnap.passRequest(Request.DRIVING_LICENSE);
        cnap.passRequest(Request.BUILDING_LICENSE);
        cnap.passRequest(Request.HUNTING_LICENSE);

        cnap.passRequest(Request.GIVE_GORILKA);
        cnap.passRequest(Request.BOIL_THE_BORSCH);
        cnap.passRequest(Request.FRY_POTATO);

        cnap.openNewService(HuntingSection.open());
        cnap.passRequest(Request.HUNTING_LICENSE);

    }
}
