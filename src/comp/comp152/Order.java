package comp.comp152;

import java.util.ArrayList;

/**
 * Class Order
 */
public class Order {

    private ShippingAddress destination;
    private Customer orderedBy;
    ArrayList<MerchandiseItem> cartForOrder;

    /**
     * @param        dest
     * @param        cust
     */
    public Order(ShippingAddress dest, Customer cust, ArrayList<MerchandiseItem> itemsOrdered)
    {
        destination = dest;  //Setting up variables
        orderedBy = cust;
        cartForOrder = itemsOrdered;
    }

    /**
     * @return       String
     */
    public String getDestination()
    {
        return destination.toString();
    }

    /**
     * @return       String
     */
    public String getOrder()
    {
        return orderedBy.toString();
    }





}