package Service;

import Interface.PizzaInterface;
import Model.*;

import java.util.ArrayList;
public class PizzaService implements PizzaInterface {
    ArrayList<Pizza> pizzas;
    ArrayList<Customer> customers;
    public PizzaService() {
        pizzas = new ArrayList();
        customers = new ArrayList();
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
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
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
                System.out.println("Cannot place order, no available pizza exists.");
                continue;
            }
            else {
                if (!tempPizza.getSize().equals(size)) {
                    System.out.println("Cannot place order, no available pizza exists.");
                    continue;
                }
                else {
                    if (typeNum == 1) {
                        if (tempPizza instanceof ChickenPizza) {
                            tempPizza.setOrderedBy(customers.get(customers.indexOf(customer)));
                            System.out.println("Pizza ordered successfully!");
                            break;
                        }
                        else {
                            System.out.println("Cannot place order, no available pizza exists.");
                            continue;
                        }
                    }
                    else if (typeNum == 2) {
                        if (tempPizza instanceof MeatPizza) {
                            tempPizza.setOrderedBy(customers.get(customers.indexOf(customer)));
                            System.out.println("Pizza ordered successfully!");
                            break;
                        }
                        else {
                            System.out.println("Cannot place order, no available pizza exists.");
                            continue;
                        }
                    }
                    else {
                        if (tempPizza instanceof VeggiePizza) {
                            tempPizza.setOrderedBy(customers.get(customers.indexOf(customer)));
                            System.out.println("Pizza ordered successfully!");
                            break;
                        }
                        else {
                            System.out.println("Cannot place order, no available pizza exists.");
                            continue;
                        }
                    }
                }
            }
        }
    }
}