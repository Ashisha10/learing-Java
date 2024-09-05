
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DirectoryScanRunner {
    public static void main(String[] args) throws IOException {
        Path currentDir = Path.of(".");
        Files.list(currentDir).forEach(System.out::println);
        System.out.println("");
        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        Files.walk(currentDir,9)
                .filter(predicate)
                .forEach(System.out::println);
        System.out.println("");

        BiPredicate<Path, BasicFileAttributes> directorMatcher
                = (path, attributes) -> attributes.isDirectory();
        Files.find(currentDir,4,directorMatcher).forEach(System.out::println);

        System.out.println("");
        BiPredicate<Path, BasicFileAttributes> javaMatcher
                = (path,attributes) -> String.valueOf(path).contains(".java");
        Files.find(currentDir,4,javaMatcher).forEach(System.out::println);
        System.out.println();



        Path pathToRead = Path.of("./resources/data.txt");
        Files.readAllLines(pathToRead).forEach(System.out::println);
        //this is not a good approach -> alternative is as follows
        System.out.println();
        Files.lines(pathToRead)
                .filter(str -> str.contains("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


        Path pathToWrite = Path.of("./resources/data2.txt");
        List<String> list = List.of("hey", "baby", "yes");
        Files.write(pathToWrite, list);

        Files.lines(pathToWrite).forEach(System.out::println);
    }
}