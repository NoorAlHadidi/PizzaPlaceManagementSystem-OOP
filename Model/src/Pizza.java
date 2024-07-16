public abstract class Pizza implements BakeInterface {
    String size;
    String name;
    Customer orderedBy;
    @Override
    public void makeDough() {
        System.out.println("Making dough for " + this.name + "pizza.");
    }
    public abstract void addToppings();
    @Override
    public void putInOven() {
        System.out.println(this.name + " pizza was placed in the oven.");
    }
}