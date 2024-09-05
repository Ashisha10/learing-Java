import java.util.concurrent.*;

public class CallableRunner {


    static class CallableTask implements Callable {
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
    public void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        //future is A PROMISE that we will have  a result on a later point of tine
        Future<String> welcomeFuture =
        executorService.submit(new CallableTask("Ash"));
        System.out.println("welcomed");
        System.out.println(welcomeFuture.get());
        System.out.println("done");
        executorService.shutdown();
    }
}
