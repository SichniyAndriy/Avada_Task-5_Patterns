package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.model.BaseHandler;

public class Cnap {
    private BaseHandler chain;

    public void openNewService(BaseHandler handler) {
        if (chain == null) {
            chain = handler;
        } else {
            chain.setNext(handler);
        }
    }

    public void passRequest(Request request) {
        if (chain == null) {
            System.out.println("ЦНАП закритий");
            return;
        }
        chain.handle(request);
    }

    public enum Request {
        PASSPORT("Паспорт"),
        DRIVING_LICENSE("Водійське посвідчення"),
        BUILDING_LICENSE("Дозвіл на будівництво"),
        HUNTING_LICENSE("Мисливська ліцензія"),
        BOIL_THE_BORSCH("Звари борщу"),
        FRY_POTATO("Піджарь картоплі"),
        GIVE_GORILKA("Налий стакан для апетиту");

        private final String value;

        Request(String s) {
            value = s;
        }

        public String getValue() {
            return value;
        }

    }
}
