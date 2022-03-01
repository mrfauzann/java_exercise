import model.ItemSold;
import model.ListItem;
import model.manageItem;
import model.buyItem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("------ Item Information -------");

        ArrayList<ListItem> items = new ArrayList<>();

        items.add(new ListItem("Watch", 130, 23));
        items.add(new ListItem("Shoes", 100, 24));
        items.add(new ListItem("Bag", 50, 50));

        for (ListItem item : items){
            System.out.println(item);
        }

        System.out.println("------ Item Sold Information -------");

        ArrayList<ItemSold> sold = new ArrayList<>();

        buyItem.buyItems(items, 1,3, sold);
        buyItem.buyItems(items, 0,5, sold);
        manageItem.manageItem(items, 1, "Adidas", 180);

        for (ItemSold solds : sold){
            System.out.println(solds);
        }

        System.out.println("------ Display Result from Manage Item -------");

        for (ListItem item : items){
            System.out.println(item);
        }
    }
}
