package work_8;

/**
 * Класс ограниченного списка расширяющий класс простого списка
 * @param <E> - тип элементов в списке
 */
public class BoundedWaitList<E> extends WaitList<E> {
    /**
     * Размер списка
     */
    private final int capacity;

    /**
     * Конструктор создающий список конкретного размера
     * @param capacity - размер списка
     */
    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    /**
     * Получение размера списка
     * @return - размер списка
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Добавление элемента в список если список не полный
     * @param element - элемент для добавления
     */
    @Override
    public void add(E element) {
        if (content.size() < capacity)
            content.add(element);
    }

    /**
     * Конвертация в строку
     * @return - информация о экземпляре класса
     */
    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
