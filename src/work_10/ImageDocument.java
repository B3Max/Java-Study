package work_10;

public class ImageDocument implements IDocument{
    ImageDocument(){
        System.out.println("Создан файл изображения");
    }
    ImageDocument(String name){
        System.out.println("Создан файл изображения с названием " + name);
    }
}
