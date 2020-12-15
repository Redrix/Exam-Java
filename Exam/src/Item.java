public class Item {
    protected String name;
    protected long price;
    protected int weight;

    Item(String nom, long prix, int poid){
        this.name = nom;
        this.price = prix;
        this.weight = poid;
    }

    Item(String nom, long prix){
        this.name = nom;
        this.price = prix;
    }

    public long getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name + ": " + String.format("%d.%02d", this.price / 100, this.price % 100)+ " €";
    }
}
