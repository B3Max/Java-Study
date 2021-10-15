package work_8;

import java.util.Collection;

/**
 * Интерфейс для реализации списков
 * @param <E> - тип объектов для хранения в списке
 */
public interface IWaitList<E> {

    /**
     * Вставка элемента в список
     * @param element - объект для вставки
     */
    void add(E element);

    /**
     * Удаление объекта из списка
     * @return - возврат удаленного объекта
     */
    E remove();

    /**
     * Проверка на содержание объекта в списке
     * @param element - объект на проверку
     * @return - успех или неудача метода
     */
    boolean contains(E element);

    /**
     * Проверка наличия множества объектов в списке
     * @param c - коллекция объектов
     * @return - успех или неудача метода
     */
    boolean containsAll(Collection<E> c);

    /**
     *  Проверка на пустоту списка
     * @return - состояние пустоты списка
     */
    boolean isEmpty();
}
