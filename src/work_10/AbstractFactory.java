package work_10;

import java.io.IOException;

public interface AbstractFactory {
    IDocument createDoc(String type, String name) throws IOException;
}
