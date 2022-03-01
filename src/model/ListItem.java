package model;

public class ListItem {
    public boolean contains;
    String ItemName;
    int Point;
    int Stock;
    int Index;

    public ListItem(String ItemName, int Point, int Stock){
        this.ItemName = ItemName;
        this.Point = Point;
        this.Stock = Stock;
    }

    public String getItemName(){
        return this.ItemName;
    }

    public void setName(String Name){
        this.ItemName = Name;
    }

    public int getPoint(){
        return this.Point;
    }

    public int getIndex(){
        return this.Index;
    }

    public int getStock(){
        return this.Stock;
    }

    public void setStock(int value){
        this.Stock = value;
    }

    public void setPoint (int point){
        this.Point = point;
    }

    @Override
    public String toString() {
        return "Item Name : " + this.ItemName + ", Point :" + this.Point + ", Stock :" + this.Stock;
    }

}
