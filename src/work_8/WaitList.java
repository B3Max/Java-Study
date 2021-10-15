package work_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Класс списка реализующий интерфейс
 * @param <E> - тип объектов для хранения в списке
 */
public class WaitList<E> implements IWaitList<E> {
    /**
     * Список объектов
     */
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Конструктор создание списка
     */
    public WaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    /**
     * Коструктор создание списка с объектами из другого списка
     * @param c - коллекция объектов
     */
    public WaitList(Collection<E> c) {
        this.content = new ConcurrentLinkedQueue<>(c);
    }

    /**
     * Конвертация в строку
     * @return - информация о экземпляре класса
     */
    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    /**
     * Добавление элемента в список
     * @param element - элемент для добавления
     */
    @Override
    public void add(E element) {
        this.content.add(element);
    }

    /**
     * Удаление первого элемента из списка
     * @return - удаленный элемент
     */
    @Override
    public E remove() {
        return content.remove();
    }

    /**
     * Проверка наличия определенного элемента в списке
     * @param element - элемент для проверки
     * @return - успех или неудача проверки
     */
    @Override
    public boolean contains(E element) {
        boolean isContains = false;
        for (int i = 0; i < content.size(); i++) {
            E x = content.remove();
            if (x.equals(element))
                isContains = true;
            content.add(x);
        }
        return isContains;
    }

    /**
     *  Проверка наличия множества элементов в списке
     * @param c - коллекция элементов
     * @return - успех или неудача проверки
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        ArrayList<E> arr = new ArrayList<>(c);
        for (int i = 0; i < c.size(); i++) {
            boolean isContains = false;
            for (int j = 0; j < content.size(); j++) {
                E x = content.remove();
                if (x.equals(arr.get(i)))
                    isContains = true;
                content.add(x);
            }
            if (!isContains) return false;
        }
        return true;
    }

    /**
     * Проверка на пустоту списка
     * @return - состояние пустоты списка
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
