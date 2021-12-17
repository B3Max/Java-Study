package work_10;

import java.io.IOException;

public class FactoryMusic implements AbstractFactory {
    public IDocument createNew(String name) throws IOException {
        return new MusicDocument(name);
    }

    public IDocument open(String name) throws IOException {
        return new MusicDocument(name);
    }
}

