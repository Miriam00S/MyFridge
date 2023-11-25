import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private List<Product> products = new ArrayList<>();
    private static final int MAX_UNAVAILABLE_INGREDIENTS = 3;


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

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void showProducts(){
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }

    //sprawdzamy czy mamy w lodówce składniki z przepisu
    public List<Recipe> giveRecipes(List<Recipe> recipes){
        List<Recipe> proposedRecipes = new ArrayList<>();

        for (Recipe recipe: recipes) {
            List<Product> ingredients = recipe.getIngredients();
            List<Product> ingredientsCopy = new ArrayList<>(ingredients);
            ingredientsCopy.retainAll(products); //usuwamy składniki, które występują w liście products
            int remainingIngredientsCount = ingredientsCopy.size();
            if (remainingIngredientsCount <= MAX_UNAVAILABLE_INGREDIENTS)
                proposedRecipes.add(recipe);
        }

        return proposedRecipes;
    }
    
}
