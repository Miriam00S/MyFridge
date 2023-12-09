import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyFridgeProgram {

    public static void main(String[] args) {

        System.out.println("MyFridge Console Version. 0.3");
        menu();

    }

    public static void menu(){
        Fridge fridge = new Fridge();
        List<Recipe> recipes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i =0;
        while (i != 2) {
            System.out.println("Open fridge - press 1 \nExit - press 2");
            i = scanner.nextInt();
            if (i == 1) {
                int j = 0;
                while (j != 6) {
                    System.out.println(
                            """
                                    1 - display products\s
                                    2 - ask fo recipes\s
                                    3 - add product\s
                                    4 - remove product\s
                                    5 - display expired product\s
                                    6 - close fridge""");
                    j = scanner.nextInt();
                    switch (j) {
                        case 1 -> fridge.showProducts();
                        case 2 -> fridge.showRecipes(recipes);
                        case 3 -> fridge.addProduct();
                        case 4 -> fridge.removeProduct();
                        case 5 -> fridge.showExpiredProducts();
                    }
                }
            } else if (i != 2){
                System.out.println("Niepoprawny numer");
            }
        }
        scanner.close();
        System.exit(0);
    }
}
