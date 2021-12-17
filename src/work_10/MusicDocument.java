package work_10;

public class MusicDocument implements IDocument {
    MusicDocument() {
        System.out.println("Создан файл музыки");
    }

    MusicDocument(String name) {
        System.out.println("Создан файл музыки с названием " + name);
    }
}
