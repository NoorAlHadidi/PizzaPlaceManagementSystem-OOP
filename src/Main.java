import java.util.Scanner;
import Interface.PizzaInterface;
import Model.Customer;
import Model.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaService pizzaServ = new PizzaService();
        Scanner scanner = new Scanner(System.in);
        //adding pizzas
        int totalPizzas;
        System.out.println("Enter the number of pizzas you want to bake");
        totalPizzas = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < totalPizzas; i++) {
            Pizza newPizza;
            System.out.println("Enter 1 for a chicken pizza, 2 for a meat pizza, or 3 for a veggie pizza:");
            String pizzaType;
            while (true) {
                pizzaType = scanner.nextLine();
                if (pizzaType.equals("1") || pizzaType.equals("2") || pizzaType.equals("3")) {
                    break;
                }
                System.out.println("Please re-enter a correct number:");
            }
            System.out.println("Enter 1 for a small pizza, 2 for a medium pizza, or 3 for a large pizza:");
            String pizzaSize;
            while (true) {
                pizzaSize = scanner.nextLine();
                if (pizzaSize.equals("1") || pizzaSize.equals("2") || pizzaSize.equals("3")) {
                    break;
                }
                System.out.println("Please re-enter a correct number:");

            }
            pizzaServ.bakePizza(Integer.parseInt(pizzaSize), Integer.parseInt(pizzaType));
        }
        //ordering pizza
        System.out.println("Enter customer name (First Last):");
        String customerName = scanner.nextLine();
        String[] customerDetails = customerName.split(" ");
        Customer customer = new Customer(customerDetails[0], customerDetails[1]);
        System.out.println("Enter 1 for a chicken pizza, 2 for a meat pizza, or 3 for a veggie pizza:");
        String pizzaType;
        while (true) {
            pizzaType = scanner.nextLine();
            if (pizzaType.equals("1") || pizzaType.equals("2") || pizzaType.equals("3")) {
                break;
            }
            System.out.println("Please re-enter a correct number:");
        }
        System.out.println("Enter 1 for a small pizza, 2 for a medium pizza, or 3 for a large pizza:");
        String pizzaSize;
        while (true) {
            pizzaSize = scanner.nextLine();
            if (pizzaSize.equals("1") || pizzaSize.equals("2") || pizzaSize.equals("3")) {
                break;
            }
            System.out.println("Please re-enter a correct number:");

        }
        pizzaServ.orderPizza(Integer.parseInt(pizzaSize), Integer.parseInt(pizzaType), customer);
    }
}
