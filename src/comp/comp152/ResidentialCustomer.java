package comp.comp152;

import java.util.ArrayList;

//Residential customer info prep
public class ResidentialCustomer extends Customer{
    /**
     * @param custName
     * @param i
     */
    public ResidentialCustomer(String custName, int i) {
        super(custName);
    }

    @Override
    public double payForOrder(ArrayList<MerchandiseItem> itemsInOrder) {
        return 0;
    }
}

