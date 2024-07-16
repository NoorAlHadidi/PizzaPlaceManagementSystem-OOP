public class MeatPizza extends Pizza{
    public MeatPizza(String size) {
        super(size);
        this.name = "Meat";
    }
    @Override
    public void addToppings() {
        System.out.println("Added cheese, pepperoni and sausage toppings for " + this.name + " pizza.");
    }
}
