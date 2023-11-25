import java.util.List;

public class Recipe {

    private String name;
    private List<Product> ingredients;


    public Recipe(String name, List<Product> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Product> ingredients) {
        this.ingredients = ingredients;
    }


}
