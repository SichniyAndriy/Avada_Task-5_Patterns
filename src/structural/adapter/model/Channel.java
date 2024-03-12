package structural.adapter.model;

public interface Channel {
    void sendPacket(int value);

    int receivePacket();

}
