import java.util.ArrayList;

public class GroceryList {
    private static ArrayList<String> groceryList = new ArrayList<String>();

    static void addItems(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item.toLowerCase());
        }
    }

    static void printItems() {
        System.out.println("there are " + groceryList.size() + " items in the list, which are: ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + 1 + ". " + groceryList.get(i));
        }
    }

    static void ModifyItems(int position, String newItem) {
        groceryList.set(position - 1, newItem);
        System.out.println(position + ". " + newItem);
    }

    static String findItem(String item) {
        if (groceryList.contains(item)) {
            return item;
        } else return item + "not found";
    }

    static void rmItem(String item) {
        if (groceryList.contains(item.toLowerCase())) {
            groceryList.remove(item.toLowerCase());
        }
    }
}
