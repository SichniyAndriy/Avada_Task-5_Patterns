package behavioral.chain_of_responsibility.model;

import behavioral.chain_of_responsibility.Cnap.Request;

public abstract class BaseHandler implements RequestHandler {
    protected BaseHandler next;
    protected final Request TYPE_OF_REQUEST;

    protected BaseHandler(Request type) {
        TYPE_OF_REQUEST = type;
    }

    public void setNext(BaseHandler handler) {
        if (next == null) {
            next = handler;
        } else {
            next.setNext(handler);
        }
    }

    public void handle(Request request) {
        if (request == TYPE_OF_REQUEST) {
            System.out.println("Видаю " + TYPE_OF_REQUEST.getValue());
        } else if (next != null) {
            next.handle(request);
        } else {
            System.out.println("Запит " + request.getValue() + " неможливо виконати.\n" +
                    "Зверніться до іншої інстанції, або дочекайтксь відкриття відділу");
        }
    }
}
