package comp.comp152;

class MerchandiseItem {
    private ItemType taxibleType;
    private String Name;
    private double price;

    //Setting up strings
    public  MerchandiseItem(String itemName, double cost, ItemType type){
        Name = itemName;
        price = cost;
        taxibleType = type;
    }

    public String getName(){
        return Name;
    }

    public double getPrice(){
        return price;
    }

    public ItemType getTaxibleType(){
        return taxibleType;
    }
}