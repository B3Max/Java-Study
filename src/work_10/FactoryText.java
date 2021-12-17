package work_10;

import java.io.IOException;

public class FactoryText implements AbstractFactory {
    public IDocument createNew(String name) throws IOException {
        return new TextDocument(name);
    }

    public IDocument open(String name) throws IOException {
        return new TextDocument(name);
    }
}
