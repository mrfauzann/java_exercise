package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class buyItem {
    String ItemName;
    int qty;

    public static void buyItems(ArrayList<ListItem> items, int index, int qty, ArrayList<ItemSold> sold){
        int totalQty = items.get(index).getStock();
        items.get(index).setStock(totalQty-qty);
        sold.add(new ItemSold(items.get(index), qty, LocalDate.now()));
    }
}
