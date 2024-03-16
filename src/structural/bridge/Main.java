package structural.bridge;

import net.datafaker.Faker;
import structural.bridge.model.RealComputer;
import structural.bridge.model.drive.NVMeDrive;
import structural.bridge.model.memory.DDR4Memory;
import structural.bridge.model.processor.AmdProcessor;
import structural.bridge.model.program.AbstractProgram;
import structural.bridge.model.program.Browser;
import structural.bridge.model.program.Game;
import structural.bridge.model.program.GraphicEditor;
import structural.bridge.model.program.TextEditor;
import structural.bridge.model.videocard.NVidiaGraphicCard;

/*
* Pattern Bridge divides abstraction from implementation and allow
* to evolve separately. It transforms inheritance to aggregation or
* composition
*/
public class Main {
    private final static Faker faker = new Faker();
    public static void main(String[] args) {
        RealComputer computer = new RealComputer();
        computer.putProcessor(
                new AmdProcessor(faker.computer().platform(),3_000_000_000L,2_000_000_000L, 16)
        );
        computer.putMemory(
                new DDR4Memory(2_400_000_000L, 16_000_000_000L)
        );
        computer.putDrive(
                new NVMeDrive(faker.computer().brand(),2_000_000_000_000L)
        );
        computer.putVideoCard(
                new NVidiaGraphicCard(16_000_000_000L, 8_000_000_000L)
        );
        computer.install(new TextEditor(faker.funnyName().name(), faker.code().isbn13()));
        computer.install(new GraphicEditor(faker.funnyName().name(), faker.code().isbn10()));
        computer.install(new TextEditor(faker.funnyName().name(), faker.code().ean13()));
        computer.install(new Browser(faker.funnyName().name(), faker.code().isbnGs1()));
        computer.install(new Game(faker.funnyName().name(), faker.gameOfThrones().dragon()));

        computer.programs.forEach(prog -> computer.start(((AbstractProgram) prog).getName()));
    }
}
