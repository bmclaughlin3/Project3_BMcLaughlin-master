package comp.comp152;

import java.util.ArrayList;

public class BusinessCustomer extends Customer{


    private double purchaseOrderBalance;

    public BusinessCustomer(String Name, int ID) {
        super(Name, ID);
    }

    public BusinessCustomer(String newName) {
        super();
    }


    @Override
    public double payForOrder(ArrayList<MerchandiseItem> itemsInOrder) {
        System.out.println("This order is for " +getName() + " and will be paid for with a purchase order");
        double total  = 0.0;
        for (int i =0; i < itemsInOrder.size(); i++){
            total +=itemsInOrder.get(i).getPrice();
        }
        purchaseOrderBalance += total;
        return 0;
    }

    public double payOutstandingBalance(){
        if (purchaseOrderBalance >1000) {
            purchaseOrderBalance = purchaseOrderBalance - (purchaseOrderBalance * .05);
        }
        double priceAfterDiscount = purchaseOrderBalance;
        purchaseOrderBalance = 0.0;
        return priceAfterDiscount;
    }
    public void arrangeDelivery(){
        System.out.println("customer name:" + getName() + ", deliver anytime");
    }

}

