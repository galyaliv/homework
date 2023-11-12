package home_work_1;

public interface ICommunicationPrinter {
    /**
     * Метод возвращает приветствие в зависимости от введенного имени
     * @param name имя пользователя
     * @return строка с приветствием пользователя
     */
    String welcome(String name);
}
