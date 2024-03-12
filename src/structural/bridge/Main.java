package structural.bridge;

import java.util.List;
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

public class Main {
    private final static Faker faker = new Faker();
    public static void main(String[] args) {
        RealComputer computer1 = new RealComputer();
        computer1.putProcessor(
                new AmdProcessor(faker.computer().platform(),3_000_000_000L,2_000_000_000L, 16)
        );
        computer1.putMemory(
                new DDR4Memory(2_400_000_000L, 16_000_000_000L)
        );
        computer1.putDrive(
                new NVMeDrive(faker.computer().brand(),2_000_000_000_000L)
        );
        computer1.putVideoCard(
                new NVidiaGraphicCard(16_000_000_000L, 8_000_000_000L)
        );
        computer1.install(new TextEditor(faker.funnyName().name(), faker.code().isbn13()));
        computer1.install(new GraphicEditor(faker.funnyName().name(), faker.code().isbn10()));
        computer1.install(new TextEditor(faker.funnyName().name(), faker.code().ean13()));
        computer1.install(new Browser(faker.funnyName().name(), faker.code().isbnGs1()));
        computer1.install(new Game(faker.funnyName().name(), faker.gameOfThrones().dragon()));

        List<AbstractProgram> programList = computer1.getPrograms().stream()
                .map(p -> (AbstractProgram) p)
                .toList();
        for (int i = 0; i < 3; ++i) {
            computer1.start(programList.get(faker.random().nextInt(0, programList.size() - 1)).getName());
        }
    }
}
