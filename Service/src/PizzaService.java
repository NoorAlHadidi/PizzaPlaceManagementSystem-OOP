import java.util.ArrayList;
public class PizzaService implements PizzaInterface{
    ArrayList<Pizza> pizzas;
    public PizzaService() {
        pizzas = new ArrayList();
    }
    @Override
    public void bakePizza(int sizeNum, int typeNum) {
        Pizza newPizza;
        if (sizeNum == 1) {
            if (typeNum == 1) {
                newPizza = new ChickenPizza("Small");
            }
            else if (typeNum == 2) {
                newPizza = new MeatPizza("Small");
            }
            else {
                newPizza = new VeggiePizza("Small");
            }
        }
        else if (sizeNum == 2) {
            if (typeNum == 1) {
                newPizza = new ChickenPizza("Medium");
            }
            else if (typeNum == 2) {
                newPizza = new MeatPizza("Medium");
            }
            else {
                newPizza = new VeggiePizza("Medium");
            }
        }
        else {
            if (typeNum == 1) {
                newPizza = new ChickenPizza("Large");
            }
            else if (typeNum == 2) {
                newPizza = new MeatPizza("Large");
            }
            else {
                newPizza = new VeggiePizza("Large");
            }
        }
        pizzas.add(newPizza);
    }
    @Override
    public void orderPizza(int sizeNum, int typeNum, Customer customer) {
        String size;
        if (sizeNum == 1) {
            size = "Small";
        }
        else if (sizeNum == 2) {
            size = "Medium";
        }
        else {
            size = "Large";
        }
        for (Pizza tempPizza : pizzas) {
            if ((tempPizza.getOrderedBy()).isPresent()) {
                continue;
            }
            else {
                if (!tempPizza.getSize().equals(size)) {
                    continue;
                }
                else {
                    if (typeNum == 1) {
                        if (tempPizza instanceof ChickenPizza) {
                            tempPizza.setOrderedBy(customer);
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                    else if (typeNum == 2) {
                        if (tempPizza instanceof MeatPizza) {
                            tempPizza.setOrderedBy(customer);
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                    else {
                        if (tempPizza instanceof VeggiePizza) {
                            tempPizza.setOrderedBy(customer);
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
            }
        }
    }
}