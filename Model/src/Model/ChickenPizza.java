package Model;
public class ChickenPizza extends Pizza{
    public ChickenPizza(String size) {
        super(size);
        this.name = "Chicken";
    }
    @Override
    public void addToppings() {
        System.out.println("Added cheese and chicken toppings for " + this.name + " pizza.");
    }
}
