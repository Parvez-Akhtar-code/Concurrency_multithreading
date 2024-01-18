package Testing_Codes;

import java.util.Random;
import java.util.concurrent.*;

public class T3_code {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        Future<Integer> future = service.submit(new task3());

        try {
            Integer result = future.get();
            System.out.println("Result from the task " + result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    static class task3 implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            return new Random().nextInt();
        }
    }
}
