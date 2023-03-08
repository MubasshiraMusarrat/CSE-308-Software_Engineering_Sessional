import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Your order is placed.");
        Burger burgerbuilder = new Burger();
        Director director = new Director();

        System.out.println("Will you like to add extra patties: y or n");
        String a=sc.nextLine();
            if(a.equalsIgnoreCase("y")) {
                System.out.println("How many?");
                arr[0] = Integer.parseInt(sc.nextLine());
            }
                else
                    arr[0] = 0;

        System.out.println("Will you like to add cheese: y or n");
        a=sc.nextLine();
        if(a.equalsIgnoreCase("y")) {
            System.out.println("How many?");
            arr[1] = Integer.parseInt(sc.nextLine());
        }
        else
            arr[1] = 0;

        System.out.println("Will you like to add salad: y or n");
        a=sc.nextLine();
        if(a.equalsIgnoreCase("y")) {
            System.out.println("How many?");
            arr[2] = Integer.parseInt(sc.nextLine());
        }
        else
            arr[2] = 0;

        System.out.println("Will you like to add BBQ Sausce: y or n");
        a=sc.nextLine();
        if(a.equalsIgnoreCase("y")) {
            System.out.println("How many?");
            arr[3] = Integer.parseInt(sc.nextLine());
        }
        else
            arr[3] = 0;
        director.make(burgerbuilder, arr[0], arr[1], arr[2], arr[3]);
        Product burger = burgerbuilder.getBurger();
        burger.show();
    }
}
