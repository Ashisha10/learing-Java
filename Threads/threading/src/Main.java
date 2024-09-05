//Thread allows running tasks in parallel, increasing CPU efficiency
//Thread has states:
// -> New: has started
// -> Running: in execusion
// -> Runnable: ready to run - has started but another thread is getting executed
// -> Blocked/ Waiting: is waiting for some external server/ db etc
// -> Terminated/ dead: Execusion has been completed


import java.util.jar.JarException;

class Task1 extends Thread {
    public void run() {
        System.out.println("Task1 initialised");
        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }
        System.out.println("task1 ended");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task2 initialised");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("task2 ended");
    }
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Task1 called");
        Task1 task1 = new Task1();
        task1.start(); //task1.run() wont allow threading, beginner error --> this is extended Thread
//        System.out.println("Task21 called");
//        Task2 task21 = new Task2(); //threaded with task1
//        task21.run(); //task2.start() is not even a fn, this will do the threadinfd ---> implements Runnable

        //OR
        System.out.println("Task22 called");
        Task2 task22 = new Task2();
        Thread task2thread = new Thread(task22); //threaded with task3 
        task2thread.start();
        task2thread.setPriority(1);

        task1.join(); //start task3 only after task1 is done
        System.out.println("Task3 initialised");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("task3 ended");
    }
}