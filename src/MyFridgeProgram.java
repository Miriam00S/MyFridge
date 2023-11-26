import java.util.Scanner;

public class MyFridgeProgram {

    public static void main(String[] args) {

        System.out.println("MyFridge Console Version. 0.2");
        menu();

    }

    public static void menu(){
        //1.open fridge
        //1.1 display products
        //1.2 ask fo recipes
        //1.3 add product
        //1.4 remove product
        //1.5 display expired product
        //1.6 close fridge
        //2. exit
        System.out.println("Open fridge - press 1 \nExit - press 2");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 1){

        }else if (i == 2){
            System.exit(0);
        }else {
            System.out.println("Niepoprawny numer");
            menu(); //czy wykorzystanie rekurencji w tym miejścu jest dobrym rozwiązaniem?
        }
    }
}
