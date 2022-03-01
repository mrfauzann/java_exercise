package model;

import java.util.List;

public class FindItem {
    public FindItem findUsingEnhancedForLoop(
            String name, List<ListItem> items) {

        for (ListItem item : items) {
            if (item.getItemName().equals(name)) {

            }
        }
        return null;
    }
}
