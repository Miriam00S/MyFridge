public class MyFridgeProgram {

    public static void main(String[] args) {

        Fridge fridge = new Fridge();

        //dodajemy pare produktów do lodówki ręcznie

        Product product = new Product("makaron penne");
        Product product1 = new Product("kurczak");
        Product product2 = new Product("szpinak");
        Product product3 = new Product("śmietanka");
        Product product4 = new Product("cytryna");
        Product product5 = new Product("ogórek");
        fridge.addProduct(product);
        fridge.addProduct(product1);
        fridge.addProduct(product2);
        fridge.addProduct(product3);
        fridge.addProduct(product4);
        fridge.addProduct(product5);

        fridge.showProducts();

    }

}
