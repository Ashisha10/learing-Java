import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//concurrenccy at the codt of memory and performance
//the need to sync get, read methods is removed as the copy is made
//efficient where less modif, more reading 

public class CopyOnWriteArrayListRunner {
//CopyOnWriteArrayList achieves thread safety by creating a fresh copy of
// the underlying array every time a modification operation (such as add, set, or remove)
// is performed. This copy-on-write strategy ensures that there are no
// ConcurrentModificationExceptions even if multiple threads are iterating
// over the list while modifications are made.
//When an element is added, modified, or removed
// from a CopyOnWriteArrayList, a new copy of the internal array is created.
// This means that modifications are expensive in terms of memory and performance,
// especially for large lists, as it involves copying the entire array. However,
// reading operations are very efficient as they work on the current snapshot of the array.

//    When to Use:
//    CopyOnWriteArrayList is suitable for scenarios where:
//    -> Iterations vastly outnumber modifications.
//    -> You want to avoid ConcurrentModificationExceptions without the need for explicit synchronization.
//    -> You can tolerate the overhead of creating new copies of the array on each modification.
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        for (String ele:list) {
            System.out.println(ele);
        }
    }
}
