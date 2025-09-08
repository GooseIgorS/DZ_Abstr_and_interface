package Logger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
      //  Logger logger = new SimpleLogger();
        Logger logger = new SmartLogger();
        logger.log("Пошел гулять");
        Thread.sleep(1000);
        logger.log("Зашел в кофейню");
        Thread.sleep(1000);
        logger.log("Купил кофе");
        Thread.sleep(1000);
        logger.log("Забыл купить булочку. ошибка");
        Thread.sleep(1000);
        logger.log("Вернулся за булочкой");
        Thread.sleep(1000);
        logger.log("Вернулся домой");
        Thread.sleep(1000);
    }
}
