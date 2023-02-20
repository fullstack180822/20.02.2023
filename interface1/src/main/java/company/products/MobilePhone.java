package company.products;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MobilePhone extends BaseProduct implements IGetOsVersionNameAndNumber,
        IWrittenByItay {

    private String m_vendor;
    private String m_model;
    private float m_size;
    private float m_price;

    public MobilePhone(String m_product_name, String m_vendor,
                           String m_model, float m_size, float m_price) {
        super(m_product_name);
        this.m_vendor = m_vendor;
        this.m_model = m_model;
        this.m_size = m_size;
        this.m_price = m_price;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "m_vendor='" + m_vendor + '\'' +
                ", m_model='" + m_model + '\'' +
                ", m_size=" + m_size +
                '}';
    }

    // abstract method can only reside inside abstract class
    // public abstract void foo();

    @Override
    public String getOsVersionNameAndNumber() {
        return null;
    }

    @Override
    public float getPrice() {
        return m_price;
    }

    @Override
    public String getBarCode() {
        return "#8865943839485756";
    }
}
