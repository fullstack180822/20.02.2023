package company.products;

import lombok.Getter;
import lombok.Setter;

import javax.management.InstanceAlreadyExistsException;

public abstract class BaseProduct implements IPrice {

    @Getter
    @Setter
    protected String m_product_name;

    public BaseProduct(String m_product_name) {
        this.m_product_name = m_product_name;
    }

    public void regularMethod() {

    }

    // abstract class may contain abstract method
    public abstract String getBarCode();

    //private abstract String getBarCode(); // private abstract is an error!!
}
