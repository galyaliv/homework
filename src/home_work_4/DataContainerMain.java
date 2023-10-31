package home_work_4;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container1 = new DataContainer<>(new String[0]);
        int str_index1 = container1.add("Привет");
        int str_index2 = container1.add("Как дела");
        int str_index3 = container1.add("Работаю");
        int str_index4 = container1.add("Давай потом");
        String text1 = container1.get(str_index1);
        String text2 = container1.get(str_index2);
        String text3 = container1.get(str_index3);
        String text4 = container1.get(str_index4);
        System.out.println(text1); // Привет
        System.out.println(text2); // Как дела
        System.out.println(text3); // Работаю
        System.out.println(text4); // Давай потом
        container1.delete(text1);
        System.out.println(container1.get(str_index1)); // Как дела
        container1.sort(new StringComparator()); // Сортируется по длине
        System.out.println(container1); // ["Работаю", "Как дела", "Давай потом"]

        DataContainer<Integer> container2 = new DataContainer<>(new Integer[0]);
        int int_index1 = container2.add(2);
        int int_index2 = container2.add(3);
        int int_index3 = container2.add(1);
        int int_index4 = container2.add(3);
        int int_index5 = container2.add(777);
        System.out.println(container2.get(int_index1));
        System.out.println(container2.get(int_index2));
        System.out.println(container2.get(int_index3));
        System.out.println(container2.get(int_index4));
        System.out.println(container2.get(int_index5));
        container2.delete(Integer.valueOf(3));
        System.out.println(container2.get(int_index2));
        container2.sort(new IntegerComparator());
        System.out.println(container2);
    }

}
