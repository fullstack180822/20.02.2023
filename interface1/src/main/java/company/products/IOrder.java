package company.products;

import java.util.ArrayList;

public interface IOrder {

    float getTotalPrice();

    String getQACode();

    ArrayList<String> getProducts();

}
