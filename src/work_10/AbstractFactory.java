package work_10;

import java.io.IOException;

public interface AbstractFactory {
    IDocument createNew(String name) throws IOException;

    IDocument open(String name) throws IOException;
}
