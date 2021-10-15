package work_8;

/**
 * Класс списка с доступом к любому элементу расширяющий класс простого списка
 * @param <E> - тип элементов списка
 */
public class UnfairWaitList<E> extends WaitList<E> {

    /**
     * Конструктор создающий список с доступом к любому элементу
     */
    public UnfairWaitList() {
        super();
    }

    /**
     * Удаление люого элемента из списка
     * @param element - элемент для удаления
     */
    public void remove(E element) {
        boolean removed = false;
        for (int i = 0; i < content.size(); i++) {
            E x = content.remove();
            if (!removed && x.equals(element)) {
                removed = true;
                i--;
            }
            else
                content.add(x);
        }
    }

    /**
     * Смещение элемента в конец списка
     * @param element - элемент для смещения
     */
    public void moveToBack(E element) {
        int size = content.size();
        remove(element);
        if (content.size() < size)
            content.add(element);
    }
}
