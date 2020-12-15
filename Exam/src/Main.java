public class Main {
    public static void main(String[] args) {
        //Exercice 1 :

        //Question 1
        /*
        Item item = new Item("corn flakes", 500);
        System.out.println(item.getPrice());        // affiche: 500
        System.out.println(item.getName());         // affiche: corn flakes
        */

        //Question 2
        /*
        Item item = new Item("corn flakes", 500);
        System.out.println(item);                   // affiche: corn flakes: 5.00 €
        Item chewingGum = new Item("chewing gum",403);
        System.out.println(chewingGum);             // affiche: chewing gum: 4.03 €
        */

        //Exercice 2 :

        //Question 1
        /*
        Item item1 = new Item("corn flakes", 500);
        Item item2 = new Item("caviar", 50000);
        Item item3 = new Item("water", 101);
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        System.out.println(cart.itemCount());       // affiche: 3
        System.out.println(cart.totalPrice());      // affiche: 50601
         */

        //Question 2
        /*
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("corn flakes", 500);
        cart.addItem(item);
        cart.removeItem(new Item("corn flakes", 500));
        System.out.println(cart.itemCount());       // affiche: 0
        */

        //Question 3
        /*
        Item item1 = new Item("corn flakes", 501, 1000);
        Item item2 = new Item("caviar", 50000, 500);
        Item item3 = new Item("water", 500, 5000);
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        //cart.addItem(item3);     // lève java.lang.IllegalStateException
        cart.removeItem(new Item("eau", 500, 5000));
        //cart.addItem(item3);     // lève java.lang.IllegalStateException
        cart.removeItem(new Item("water", 500, 5000));
        cart.addItem(item3);        // ajout possible!
         */

        //Question 4
        /*
        ShoppingCart c1 = new ShoppingCart();
        System.out.println(c1.getId());         // affiche: 1
        Item item1 = new Item("corn flakes", 501, 1000);
        c1.addItem(item1);
        Item item2 = new Item("caviar", 50000, 500);
        c1.addItem(item2);
        System.out.println(c1.getId());         // affiche: 1
        ShoppingCart c2 = new ShoppingCart();
        ShoppingCart c3 = new ShoppingCart();
        Item item3 = new Item("water", 500, 5000);
        c3.addItem(item3);
        System.out.println(c2.getId());         // affiche: 2
        System.out.println(c3.getId());         // affiche: 3
         */

        //Question 5

        ShoppingCart c1 = new ShoppingCart();
        System.out.println(c1.getId());         // affiche: 1
        Item item1 = new Item("corn flakes", 501, 1000);
        c1.addItem(item1);
        Item item2 = new Item("caviar", 50000, 500);
        c1.addItem(item2);
        System.out.println(c1.getId());         // affiche: 1
        ShoppingCart c2 = new ShoppingCart();
        ShoppingCart c3 = new ShoppingCart();
        Item item3 = new Item("water", 500, 5000);
        c3.addItem(item3);
        System.out.println(c2.getId());         // affiche: 2
        System.out.println(c3.getId());         // affiche: 3
        System.out.println(c1);
        // affiche: panier 1 [2 article(s)]
        //            corn flakes: 5.01 €
        //            caviar: 500.00 €
        System.out.println(c2);
        // affiche: panier 2 [0 article(s)]
        System.out.println(c3);
        // affiche: panier 3 [1 article(s)]
        //            water: 5.00 €


        //Exercice 3

        //Question 1
        /*
        Item item1 = new Item("corn flakes", 500, 1000);
        System.out.println(item1);     // affiche: corn flakes: 5.00€
        FreshItem fresh = new FreshItem("Salmon", 1450, 800, "2012-04-11");
        System.out.println(fresh);     // affiche: BBD:2012-04-11 Salmon: 14.50€
        */

        //Question 2

        //Pas eu le temps de trouver une solution a cette question

        /*
        Item tin = new Item("sardine", 500, 500);
        FreshItem fresh = new FreshItem("sardine", 500, 500, "2012-04-11");
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(fresh);
        System.out.println(cart);
        cart.removeItem(tin);
        System.out.println(cart); // affiche: panier 1 [1 article(s)]
        //            BBD: 2012-04-11 sardine: 5.00 €
        */
    }
}
