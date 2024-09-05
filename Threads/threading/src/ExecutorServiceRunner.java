import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
    int num;

    public Task(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Task " + num +" initialised");
        for (int i = 100*num; i <= 100*num+99; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Task " + num + " ended");
    }
}

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));

        executorService.shutdown();
    }
}


//ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.execute(new Task1());
//        executorService.execute(new Thread(new Task2()));
//        System.out.println("Task3 initialised");
//        for (int i = 301; i <= 399; i++) {
//        System.out.print(i + " ");
//        }
//                System.out.println("task3 ended");
//        executorService.shutdown();
