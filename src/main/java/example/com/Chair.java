package example.com;

/**
 * <h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Itay hau
 * @version 1.0
 * @since   2023-02-20
 */
public class Chair {
    private String m_model;
    private int m_num_legs;
    private float m_price;

    /**
     * This is a getter which returns thed model name of the chair
     * @return model name.
     */
    public String getM_model() {
        return m_model;
    }

    public void setM_model(String m_model) {
        this.m_model = m_model;
    }

    public int getM_num_legs() {
        return m_num_legs;
    }

    public void setM_num_legs(int m_num_legs) {
        this.m_num_legs = m_num_legs;
    }

    public float getM_price() {
        return m_price;
    }

    public void setM_price(float m_price) {
        this.m_price = m_price;
    }

    public Chair(String m_model, int m_num_legs, float m_price) {
        this.m_model = m_model;
        this.m_num_legs = m_num_legs;
        this.m_price = m_price;
    }

    public void printChair() {
        System.out.println(this.toString());
    }

    public float calculatePrice(int numberOfChairs) {
        return m_price * numberOfChairs;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "m_model='" + m_model + '\'' +
                ", m_num_legs=" + m_num_legs +
                ", m_price=" + m_price +
                '}';
    }
}
