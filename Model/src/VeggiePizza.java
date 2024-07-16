public class VeggiePizza extends Pizza{
    public VeggiePizza(String size) {
        super(size);
        this.name = "Veggie";
    }
    @Override
    public void addToppings() {
        System.out.println("Added cheese, pepper and onion toppings for " + this.name + " pizza.");
    }
}
