public abstract class Pizza implements BakeInterface {
    String name;
    String size;
    Customer orderedBy;
    public Pizza(String size) {
        this.size = size;
        orderedBy = null;
    }
    @Override
    public void makeDough() {
        System.out.println("Making dough for " + this.name + "pizza.");
    }
    public abstract void addToppings();
    @Override
    public void putInOven() {
        System.out.println(this.name + " pizza was placed in the oven.");
    }
    public String getName() {
        return this.name;
    }
    public String getSize() {
        return this.size;
    }
    public Customer getOrderedBy() {
        return orderedBy;
    }
    public void setOrderedBy(Customer customer) {
        this.orderedBy = customer;
    }
}