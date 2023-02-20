package company.products;

public class CarCharger extends SuperCharger {

    public CarCharger(String m_product_name, int speed) {
        super(m_product_name, speed);
    }

    public void drive() {
        System.out.format("Driving with %s", m_product_name);
    }

//    @Override
//    public float getPrice() {
//        return 340;
//    }

//    @Override
//    public void Charge() {
//        System.out.println("Charging with super charger....");
//    }
}
