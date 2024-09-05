import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//stream is just a source of objects


public class Main {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>(List.of("Apple", "Banana", "Cake", "Dumpling", "Maple"));
//        printFoods(food);
//        printFoodsWithFP(food);
//        printFoodsWithFPWithFiltering(food);
//        printFoodsWithFPwithLambdaExp(food);
//        lowerCaseFoodElements(food);
//        lengthFood(food);
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 2, 3, 4, 3, 5, 6, 7, 8, 9));
//        printOddNumbersWithFP(numbers);
//        System.out.println(sum(numbers));
//        System.out.println(sumWithFP(numbers));
//        System.out.println(sumOfOdd(numbers));
//        sortWithFP(numbers);
//        sortUniqueWithFP(numbers);
//        sortMappedSqUniqueWithFP(numbers);
//        printSqOfFirstNNo(10);
        System.out.println(List.of(1,31,24,1,41,331).stream().filter(e -> e % 2 != 0).collect(Collectors.toList()));
        System.out.println(sumOfFirstN(10));
        //boxed for collecting stream elements
        System.out.println(IntStream.range(1,11).map(e->e*e).boxed().collect(Collectors.toList()));

        System.out.println(List.of(1, 3144, 1, 42, 54, 1331, 5223).stream().max((n1, n2) -> Integer.compare(n1, n2)).get());
        System.out.println(List.of(1, 3144, 1, 42, 54, 1331, 5223).stream().min((n1, n2) -> Integer.compare(n1, n2)).get());
    }

    private static void printFoods(ArrayList<String> food) {
        for (String word : food) {
            System.out.println(word);
        }
    }

    private static void printFoodsWithFP(List<String> list) {
        list.stream().forEach(
                //this is not data, this is action
                element -> System.out.println(element)
        );
    }

    private static void printFoodsWithFPwithLambdaExp(List<String> list) {
        list.stream().forEach(
                element -> {
                    System.out.println("The chef needs: ");
                    System.out.println(element);
                }
        );
    }

    private static void printFoodsWithFPWithFiltering(List<String> list) {
        list.stream()
                .filter(
                        element -> element.endsWith("le")
                )
                .forEach(
                        //this is not data, this is action
                        element -> System.out.println(element)
                );
    }

    private static void lowerCaseFoodElements(List<String> list) {
        list.stream().map(e -> e.toLowerCase()).forEach(
                e -> System.out.println(e)
        );
    }

    private static void lengthFood(List<String> list) {
        list.stream().forEach(
                e -> {
                    System.out.println(e.length());
                }
        );
    }

    private static void printOddNumbersWithFP(List<Integer> list) {
        list.stream()
                .filter(
                        element -> element % 2 != 0
                )
                .forEach(
                        element -> System.out.println(element)
                );
    }


    //we are taking stream as input and reducing it to one result i.e called terminal operation
    private static Integer sumWithFP(List<Integer> list) {
        //focuses upon what to do
        return list.stream().reduce(
                0,
                (num1, num2) -> num1 + num2
        );
    }

    private static void sortWithFP(List<Integer> list) {
        //focuses upon what to do
        list.stream().sorted().forEach(
                e -> System.out.print(e + " ")
        );
        System.out.println();
    }

    private static void sortUniqueWithFP(List<Integer> list) {
        //focuses upon what to do
        list.stream().distinct().sorted().forEach(
                e -> System.out.print(e + " ")
        );
        System.out.println();
    }

    private static void sortMappedSqUniqueWithFP(List<Integer> list) {
        //focuses upon what to do
        list.stream().distinct().map(
                e -> e * e
        ).sorted().forEach(
                e -> System.out.print(e + " ")
        );
        System.out.println();
    }

    private static Integer sum(List<Integer> list) {
        //focuses on how to do
        int sum = 0;
        for (int val : list) {
            sum += val; //mutation - val of sum is changing as we keep looping around the loop
        }
        return sum;
    }

    private static Integer sumOfOdd(List<Integer> list) {
        int sum = list.stream()
                .filter(
                        num -> num % 2 != 0
                )
                .reduce(
                        0,
                        //this is called as lambda expression i.e shortcut method
                        (num1, num2) -> num1 + num2
                );
        return sum;
    }

    private static Integer sumOfFirstN(int n) {
        return IntStream.range(1, n + 1).reduce(0, //range- upperbound should be ub+1 for inclusion
                (num1, num2) -> num1 + num2);
    }

    private static void printSqOfFirstNNo(int n) {
        IntStream.range(1, n + 1).map(e -> e * e).forEach(
                e -> System.out.print(e + " ")
        );
        System.out.println();
    }


}
