package model;

import java.util.ArrayList;

public class manageItem {
    String ItemName;
    int Point;
    int Stock;

    public static void manageItem(ArrayList<ListItem> items, int Index, String name, int point){
        items.get(Index).setName(name);
        items.get(Index).setPoint(point);
    }
}
