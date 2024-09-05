import java.util.List;
import java.util.concurrent.*;

class CallableTask implements Callable<String> {
    String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    }
}

public class MultipleCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<CallableTask> tasks = List.of(
                new CallableTask("ASH"),
                new CallableTask("bANANA"),
                new CallableTask("PIE"));
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = executorService.invokeAll(tasks);
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}
