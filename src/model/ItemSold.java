package model;

import java.time.LocalDate;

public class ItemSold {
    String ItemName;
    int totalSold;
    LocalDate date;

    public ItemSold(String ItemName, int totalSold){
        this.ItemName = ItemName;
        this.totalSold = totalSold;
    }

    public ItemSold(ListItem listItem, int qty, LocalDate now) {
        this.ItemName = listItem.ItemName;
        this.totalSold = qty;
        this.date = LocalDate.now();
    }

    public String getItemName(){
        return this.ItemName;
    }

    public void settotalSold(int total){
        this.totalSold = total;
    }
    
    public void setDate(String date){
        this.setDate(date);
    }

    @Override
    public String toString() {
        return "Date : " + this.date + ", Item Name : " + this.ItemName + ", Total Sold :" + this.totalSold;
    }
}
