package company.products;

public class Main {

    public static void main(String[] args) {
        //BaseProduct p = new BaseProduct();

        CarCharger carCharger = new CarCharger("Samsung car charger Lexus", 800);
        MobilePhone mobilePhone = new MobilePhone("Samsung S23 Ultra", "Android", "S23", 6.7f, 2000);

        IPrice[] iPriceItems = { carCharger, mobilePhone, new Meal() };

        ((CarCharger)iPriceItems[0]).drive();

        BaseProduct[] products = { carCharger, mobilePhone };
    }

    static void printPrice(IPrice iPrice) {
        System.out.format("The price for this item is: %d", iPrice.getPrice());
    }

    static IPrice getItemWithPrice() {
        return new Meal();
    }

//    static void printPriceForProduct(BaseProduct b) {
//        System.out.format("The price for this product is: %d", b.getPrice());
//    }

//    static void printPrice(CarCharger c) {
//        System.out.format("The price for this product is: %d", c.getPrice());
//    }
//
//    static void printPrice(MobilePhone m) {
//        System.out.format("The price for this product is: %d", m.getPrice());
//    }

}
