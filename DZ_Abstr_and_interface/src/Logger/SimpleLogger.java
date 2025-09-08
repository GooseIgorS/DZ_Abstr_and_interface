package Logger;

import java.time.LocalDateTime;


public class SimpleLogger implements Logger{

    @Override
    public void log(String massage) {
        System.out.printf("[%s] %s\n",
                LocalDateTime.now(),
                massage);
    }
}
