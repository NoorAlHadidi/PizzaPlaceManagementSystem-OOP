package Interface;
import Model.Customer;

public interface PizzaInterface {
    public void bakePizza(int sizeNum, int typeNum);
    public void orderPizza(int sizeNum, int typeNum, Customer customer);
}
