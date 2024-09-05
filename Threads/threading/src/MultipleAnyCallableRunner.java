import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<CallableTask> tasks = List.of(
                new CallableTask("ASH"),
                new CallableTask("bANANA"),
                new CallableTask("PIE"));
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        String future = executorService.invokeAny(tasks);
        System.out.println(future);
        executorService.shutdown();
    }
}
