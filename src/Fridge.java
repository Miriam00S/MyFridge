import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Fridge {
    private List<Product> products = new ArrayList<>();
    private static final int MAX_UNAVAILABLE_INGREDIENTS = 3;
    private final Scanner scanner = new Scanner(System.in);


    public Fridge(List<Product> ingredients) {
        this.products = ingredients;
    }

    public Fridge() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    //w tej metodzie będziemy się łączyć się z bazą danych
    public void addProduct(){
        System.out.println("Podaj nazwę produktu");
        String name = scanner.nextLine();
        Product product = new Product(name);
        products.add(product);
    }

    public void removeProduct(){
        System.out.println("Podaj nazwę produktu");
        String name = scanner.nextLine();
        products.removeIf(product -> Objects.equals(product.getName(), name));
    }

    public void showProducts(){
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }

    public void showExpiredProducts() {
        for (Product product: products){
            if (Objects.equals(product.getExpireDate(), LocalDate.now())){
                System.out.println(product.getName());
            }
        }
    }

    //sprawdzamy czy mamy w lodówce składniki z przepisu
    public List<Recipe> giveRecipes(List<Recipe> recipes){
        List<Recipe> proposedRecipes = new ArrayList<>();
        for (Recipe recipe: recipes) {
            List<Product> ingredients = recipe.getIngredients();
            ingredients.retainAll(products); //usuwamy składniki, które występują w liście products
            int remainingIngredientsCount = ingredients.size();
            if (remainingIngredientsCount <= MAX_UNAVAILABLE_INGREDIENTS)
                proposedRecipes.add(recipe);
        }
        return proposedRecipes;
    }

    public void showRecipes(List<Recipe> recipes){
        List<Recipe> proposedRecipes = giveRecipes(recipes);
        for (Recipe recipe: proposedRecipes){
            System.out.println(recipe.getName());
        }
    }
    
}
