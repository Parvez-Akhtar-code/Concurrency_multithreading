package Testing_Codes;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class T1_code {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i=0;i<100;i++) {
            service.execute(new task());
            System.out.println("hello");
        }
    }
    static class task implements Runnable{
        public void run(){
            System.out.println("heyy");
        }
    }
}
