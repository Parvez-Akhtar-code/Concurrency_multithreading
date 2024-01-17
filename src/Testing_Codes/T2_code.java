package Testing_Codes;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class T2_code {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        service.schedule(new Task1(),10 , TimeUnit.SECONDS );
        service.scheduleAtFixedRate(new Task1() ,15,10,TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(new Task1() , 15 , 10 , TimeUnit.SECONDS);
        System.out.println("hello");
    }
    static class Task1 implements Runnable{
        @Override
        public void run() {
            System.out.println("HEYY");
        }
    }
}
