package company.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuperCharger extends BaseProduct {

    protected int speed;

    public SuperCharger(String m_product_name, int speed) {
        super(m_product_name);
        this.speed = speed;
    }

    @Override
    public float getPrice() {
        return 200;
    }

    @Override
    public String getBarCode() {
        return null;
    }

    // final cannot be overriden in the subclass
    public final void Charge() {
        System.out.println("Charging with super charger....");
    }
}
