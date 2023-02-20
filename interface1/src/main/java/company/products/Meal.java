package company.products;

public class Meal implements IPrice {

    int[] items_prices;

    @Override
    public float getPrice() {
        int sum = 0;
        for (int item_price: items_prices) {
            sum += item_price;
        }
        return sum;
    }
}
