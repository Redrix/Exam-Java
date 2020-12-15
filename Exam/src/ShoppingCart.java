import java.util.*;

public class ShoppingCart {
    private List<Item> cart;
    private int id;

    private static int generalId = 1;

    ShoppingCart(){
        this.cart = new ArrayList<Item>();
        this.id = ShoppingCart.generalId;
        ShoppingCart.generalId++;
    }

    public void addItem(Item item){
        if (this.totalWeight() + item.getWeight() <= 10000){
            cart.add(item);
        }else{
            throw new IllegalStateException("L'ajout de cet article rendrais le panier trop lourd !");
        }
    }

    public boolean removeItem(Item item){
        for (int i = 0; i < this.itemCount(); i++){
            if(this.cart.get(i).getName() == item.getName() && this.cart.get(i).getPrice() == item.getPrice() && this.cart.get(i).getWeight() == item.getWeight()){
                this.cart.remove(i);
                return true;
            }
        }
        return false;
    }

    public int itemCount(){
        return cart.size();
    }

    public long totalPrice(){
        long total = 0;
        for(Item prix: cart){
            total += prix.getPrice();
        }
        return total;
    }

    public int totalWeight(){
        int itemWheight = 0;
        for(Item item: cart){
            itemWheight += item.getWeight();
        }
        return itemWheight;
    }

    @Override
    public String toString() {
        String affichage = "Panier " + String.valueOf(this.id) + " [" + String.valueOf(this.itemCount()) + " article(s)]\n";
        for(Item item: cart){
            affichage += "\t" + item.toString() + "\n";
        }
        return affichage;
    }

    public int getId() {
        return this.id;
    }
}
