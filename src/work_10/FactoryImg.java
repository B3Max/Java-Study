package work_10;

import java.io.IOException;

public class FactoryImg implements AbstractFactory {
    public IDocument createNew(String name) throws IOException {
        return new ImageDocument(name);
    }

    public IDocument open(String name) throws IOException {
        return new ImageDocument(name);
    }
}

