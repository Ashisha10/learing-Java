import java.util.ArrayList;

public class GListArray {
    private static ArrayList<String> groceryList = new ArrayList<String>();

    static void addItems(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item.toLowerCase());
        }
    }
    static void printItems(int pos) {
        System.out.println(pos + ". " + groceryList.get(pos-1));
    }
    static void printItems() {
        System.out.println("there are " + groceryList.size() + " items in the list, which are: ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + 1 + ". " + groceryList.get(i));
        }
    }

    static void modifyItems(String newItem) {
        int pos = findItem(newItem);
        if (pos >= 0) {
            modifyItems(pos, newItem);
        }
    }
    static void modifyItems(String oldItem, String newItem) {
        int pos = findItem(oldItem);
        if (pos >= 0) {
            modifyItems(pos, newItem);
        }
    }

    static void modifyItems(int pos, String newItem) {
        if (pos >= 0) {
            groceryList.set(pos - 1, newItem);
        }
    }

    static int findItem(String item) {
        if (groceryList.contains(item)) {
            return groceryList.indexOf(item);
        } else
            return -1;
    }

    static void rmItem(int pos) {
        if (pos >= 0) {
            groceryList.remove(pos - 1);
        }
    }

    static void rmItem(String item) {
        int pos = findItem(item);
        if (pos >= 0) {
            groceryList.remove(pos);
        }
    }


}
