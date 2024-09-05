//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(10);
        for (int i = 0; i < 10; i++) {
            v.add(i);
        }
        System.out.println(v);
        System.out.println("========================================");
        v.remove(1);
        System.out.println(v);
        System.out.println("========================================");
        v.add(1, 1);
        for (int i = 0; i < v.size(); i++) {
            v.set(i, v.get(i) + 1);
            System.out.println(v.get(i));
        }
        System.out.println("========================================");
        v.addElement(11);
        v.insertElementAt(1, 1);
        System.out.println(v);
        Vector<Integer> v2 = new Vector<>();
        for (int val : v) {
            v2.add(val);
        }
        v2.insertElementAt(0, 0);
        printingVector(v2);
        System.out.println("========================================");
        List<Integer> l = new ArrayList<>(v2);
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + ", ");
        }
        System.out.println();
        System.out.println("========================================");
        ArrayList<Integer> ArrayList1 = new ArrayList<>();
        ArrayList1.add(1);
        ArrayList1.add(2);
        ArrayList1.add(3);
        ArrayList<Integer> ArrayList2 = (ArrayList<Integer>) ArrayList1.clone();
        for (int i : ArrayList1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("========================================");
        for (int i : ArrayList2) {
            System.out.print(i + " ");
        }
    }

    static void printingVector(Vector<Integer> vec) {
        for (int i = 0; i < vec.size(); i++) {
            if (i == vec.size() - 1) {
                System.out.print(i);
                System.out.println();
                System.out.println(vec.size());
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}