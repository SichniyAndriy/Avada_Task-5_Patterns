package behavioral.chain_of_responsibility.model;

import behavioral.chain_of_responsibility.Cnap.Request;

public interface RequestHandler {
    void handle(Request request);
}
