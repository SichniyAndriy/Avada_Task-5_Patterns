package structural.bridge.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.Getter;
import lombok.NoArgsConstructor;
import structural.bridge.model.drive.Drive;
import structural.bridge.model.memory.Memory;
import structural.bridge.model.processor.Processor;
import structural.bridge.model.program.AbstractProgram;
import structural.bridge.model.program.Program;
import structural.bridge.model.videocard.VideoCard;

@Getter
@NoArgsConstructor
public class RealComputer implements Computer {
    protected Processor processor;
    protected Memory memory;
    protected Drive drive;
    protected VideoCard videoCard;
    protected List<Program> programs = new ArrayList<>();

    @Override
    public void turnOn() {
        System.out.println("Вмикаю " + this.getClass().getSimpleName());
    }

    @Override
    public void turnOff() {
        System.out.println("Вмикаю " + this.getClass().getSimpleName());
    }

    public void start(String programName) {
        System.out.println("Шукаю програму " + programName + " на компьютері");
        Optional<Program> optionalProgram = isPresent(programName);
        if (optionalProgram.isPresent()) {
            System.out.println("Запускаю програму " + programName);
            run(optionalProgram.get());
        } else {
            System.out.println("Спочатку встановіть таку програму");
        }
    }

    @Override
    public void run(Program program) {
        AbstractProgram currentProgram = (AbstractProgram) program;
        processor.execute(currentProgram);
        memory.load(currentProgram);
        drive.read(currentProgram.getData());
        videoCard.drawGraphic();
        drive.write(currentProgram.getData());
        videoCard.drawGraphic();
        drive.write(currentProgram.getData());
        videoCard.drawGraphic();
        memory.unload(currentProgram);
        close(currentProgram.getName());
    }

    @Override
    public void close(String programName) {
        System.out.println("Зупиняю програму");
    }

    @Override
    public void install(Program program) {
        programs.add(program);
    }

    @Override
    public void uninstall(Program program) {
        programs.remove(program);
    }

    @Override
    public void putProcessor(Processor processor) {
        if (this.processor != null) {
            System.out.println("Спочатку вийміть процесор");
            return;
        }
        this.processor = processor;
    }

    @Override
    public void popProcessor() {
        if (this.processor == null) {
            System.out.println("Спочатку вставте процесор");
            return;
        }
        this.processor = null;
    }

    @Override
    public void putMemory(Memory memory) {
        if (this.memory != null) {
            System.out.println("Спочатку вийміть пам'ять");
            return;
        }
        this.memory = memory;
    }

    @Override
    public void popMemory() {
        if (this.memory == null) {
            System.out.println("Спочатку вставте пам'ять");
            return;
        }
        this.memory = null;
    }

    @Override
    public void putDrive(Drive drive) {
        if (this.drive != null) {
            System.out.println("Спочатку вийміть диск");
            return;
        }
        this.drive = drive;
    }

    @Override
    public void popDrive() {
        if (this.drive == null) {
            System.out.println("Спочатку вставте диск");
            return;
        }
        this.drive = null;
    }

    @Override
    public void putVideoCard(VideoCard videoCard) {
        if (this.videoCard != null) {
            System.out.println("Спочатку вийміть графічну карту");
            return;
        }
        this.videoCard = videoCard;
    }

    @Override
    public void popVideoCard() {
        if (this.drive == null) {
            System.out.println("Спочатку вставте графічну карту");
            return;
        }
        this.videoCard = null;
    }

    private Optional<Program> isPresent(String programName) {
        return programs.stream()
                .filter(p -> ((AbstractProgram) p).getName().equals(programName))
                .findFirst();
    }
}
