package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExeutorDemo {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);


        Runnable runnableTask = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        executorService.execute(runnableTask);

        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(3000);
            for(int i=1;i<10;i++) {
                return String.valueOf(i);
            }
            return "Task's execution";
        };

        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);

        Future<String> future = executorService.submit(callableTask);

        System.out.println(future.get());
        executorService.shutdown();
    }

}
