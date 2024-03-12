package structural.bridge.model;

import structural.bridge.model.drive.Drive;
import structural.bridge.model.memory.Memory;
import structural.bridge.model.processor.Processor;
import structural.bridge.model.program.Program;
import structural.bridge.model.videocard.VideoCard;

public interface Computer {

    void turnOn();

    void turnOff();

    void start(String program);

    void run(Program program);

    void close(String program);

    void install(Program program);

    void uninstall(Program program);

    void putProcessor(Processor processor);

    void popProcessor();

    void putMemory(Memory memory);

    void popMemory();

    void putDrive(Drive drive);

    void popDrive();

    void putVideoCard(VideoCard videoCard);

    void popVideoCard();

}
