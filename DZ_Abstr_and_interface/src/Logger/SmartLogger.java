package Logger;

import java.time.LocalDateTime;

public class SmartLogger implements  Logger{
    private int count = 1;

    @Override
    public void log(String massage) {

        System.out.printf("%s#%d [%s] %s\n",
                       massage.toLowerCase().contains("ошибка") ? "ERROR" : "INFO",
                      count  ,
                LocalDateTime.now(),
                massage);
        count++;
    }
}
