package home_work_4;

public interface Comparator<T> {
    /**
     * Сравнивает 2 числа
     * @param o1
     * @param o2
     * @return значение типа int
     */
    int compare(T o1, T o2);
}
