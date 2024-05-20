package CarService;
public interface NotificationService { /** Перенесли данный метод в отдельный класс, так как нарушался принцип ответственности */
    
    void sendMessage (String message); /** метод для отправления сообщения и ожидания того что будет введён адрес эл. почты */
     
}
