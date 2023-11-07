package home_work_4;

import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;
     public DataContainer(T[] data){
         this.data = data;
     }

    /**
     * Добавляет данные во внутреннее поле data и возвращает номер ячейки массива, куда были помещены данные
     * @param item переданное число
     * @return номер позиции (-1 в случае ошибки)
     */
     public int add(T item){
         if(item == null) {
             return -1;
         }

         for(int i=0; i < data.length; i++) {
             if (data[i] == null) {
                 data[i] = item;
                 return i;
             }
         }

         data = Arrays.copyOf(data, data.length + 1);
         data[data.length-1] = item;
         return data.length-1;
    }

    /**
     * Возвращает данные массива по номеру элемента
     * @param index номер элемента массива
     * @return данные массива
     */
    public T get(int index){
         if(data.length > index && index >= 0){
             return data[index];
         }
         else{
             return null;
         }
    }

    /**
     * Возвращает массив из поля data
     * @return массив данных
     */
    public T[] getItems(){
        return data;
    }

    /**
     * Удаляет элемент поля по индексу
     * @param index номер элемента
     * @return true или false в зависимости от того, произошли ли изменения
     */
    public boolean delete(int index){
        if (index < 0 || index >= data.length){
            return false;
        }
        else {
            for(int i = index; i < data.length - 1; i++){
                T temp = data[i];
                data[i] = data[i+1];
                data[i+1] = temp;
            }
            data = Arrays.copyOf(data, data.length-1);
            return true;
        }
    }

    /**
     * Удаляет получаемый элемент из поля
     * @param item элемент
     * @return true или false в зависимости от того, произошли ли изменения
     */
    public boolean delete(T item){
        if(item != null) {
            for(int i = 0; i < data.length; i++){
                if (data[i] == item){
                    return delete(i);
                }
            }
        }
        return false;
    }

    /**
     * Сортирует объекты поля
     * @param comparator
     */
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j > 0 && comparator.compare(data[j-1], data[j]) > 0; j--) {
                T temp = data[j];
                data[j] = data[j-1];
                data[j-1] = temp;
            }
        }
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        boolean isFirst = true;
        string.append("[");

        for(int i = 0; i < data.length; i++){
            if(data[i] != null){
                if(!isFirst){
                    string.append(", ");
                }
                string.append(data[i]);
                isFirst = false;
            }
        }

        string.append("]");
        return string.toString();
    }
}