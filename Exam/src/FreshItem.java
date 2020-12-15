public class FreshItem extends Item{
    private String bestBeforeDate;

    FreshItem(String nom, long prix, int poid, String dateLimite){
        super(nom, prix, poid);
        this.bestBeforeDate = dateLimite;
    }

    @Override
    public String toString() {
        return "BDD : " + this.bestBeforeDate + " " + this.name + ": " + String.format("%d.%02d", this.price / 100, this.price % 100)+ " €";
    }
}
