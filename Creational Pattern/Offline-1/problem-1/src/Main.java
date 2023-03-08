import builders.PCBuilder;
import factories.PCFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //input
        PCFactory pcFactory = new PCFactory(); //factory method to choose pc
        PCBuilder pcBuilder;
        boolean flag =false; //flag to ensure at least one order
        while(true){
            System.out.println("Enter 'O' to place an order & 'E' to end the order.");
            String input = sc.nextLine();
            if(input.equals("O")) {
                while (true) {
                    System.out.println("Which PC will you like to order?");
                    System.out.println("1. Gaming PC");
                    System.out.println("2. Regular PC with intel Core i5 Processor");
                    System.out.println("3. Regular PC with intel Core i7 Processor");
                    System.out.println("4. Regular PC with intel Core i9 Processor");
                    input = sc.nextLine();
                    if (input.equals("O")) {
                        System.out.println("Error. Do you want to finish your ongoing order? Press 'E'");
                        input = sc.nextLine();
                        if (input.equals("E"))
                            continue;
                        else {
                            System.out.println("Enter the previous input again."); //repeat the process
                            input = sc.nextLine();
                        }
                    }
                    String pc = input;
                    System.out.println("Will you like to add a RAM?");
                    System.out.println("Press Y or N");
                    input = sc.nextLine();
                    if (input.equals("O")) {
                        System.out.println("Error. Do you want to finish your ongoing order? Press 'E'"); //Error message
                        input = sc.nextLine();
                        if (input.equals("E")) {
                            flag = true;
                            pcBuilder = pcFactory.getPCBuilder(pc, null, null); //get output until now
                            pcBuilder.getProduct().show();
                            break;
                        }
                        else {
                            System.out.println("Enter the previous input again.");
                            input = sc.nextLine();
                        }
                    }
                    String ram = null;
                    if (input.equals("N"))
                        ram = null;
                    else {
                        System.out.println("Which RAM will you like to choose?");
                        System.out.println("1. 2666 MHz");
                        System.out.println("2. 3200 MHz");
                        input = sc.nextLine();
                        if (input.equals("O")) {
                            System.out.println("Error. Do you want to finish your ongoing order? Press 'E'");
                            input = sc.nextLine();
                            if (input.equals("E")) {
                                flag = true;
                                pcBuilder = pcFactory.getPCBuilder(pc, null, null);
                                pcBuilder.getProduct().show();
                                break;
                            }
                            else {
                                System.out.println("Enter the previous input again.");
                                input = sc.nextLine();
                            }
                        }
                        ram = input;
                    }
                    System.out.println("Will you like to add a graphics card?");
                    System.out.println("Press Y or N");
                    input = sc.nextLine();
                    if (input.equals("O")) {
                        System.out.println("Error. Do you want to finish your ongoing order? Press 'E'");
                        input = sc.nextLine();
                        if (input.equals("E")) {
                            flag = true;
                            pcBuilder = pcFactory.getPCBuilder(pc, ram, null);
                            pcBuilder.getProduct().show();
                            break;
                        }
                        else {
                            System.out.println("Enter the previous input again.");
                            input = sc.nextLine();
                        }
                    }
                    String graphicsCard = null;
                    if (input.equals("N"))
                        graphicsCard = null;
                    else {
                        System.out.println("Which graphics card will you like to choose?");
                        System.out.println("1. 2GB");
                        System.out.println("2. 4GB");
                        input = sc.nextLine();
                        if (input.equals("O")) {
                            System.out.println("Error. Do you want to finish your ongoing order? Press 'E'");
                            input = sc.nextLine();
                            if (input.equals("E")) {
                                flag = true;
                                pcBuilder = pcFactory.getPCBuilder(pc, ram, null);
                                pcBuilder.getProduct().show();
                                break;
                            }
                            else {
                                System.out.println("Enter the previous input again.");
                                input = sc.nextLine();
                            }
                        }
                        graphicsCard = input;
                    }
                    pcBuilder = pcFactory.getPCBuilder(pc, ram, graphicsCard);
                    pcBuilder.getProduct().show(); //final product
                    System.out.println("Do you want to continue ordering?Y or N");
                    input = sc.nextLine();
                    if (input.equals("N")) {
                        flag = true;
                        break;
                    }
                    else
                        continue;
                    }
                }
            else if(input.equals("E") && flag == true){
                break;
            }
            else if(input.equals("E") && flag == false){
                System.out.println("You have to place at least one item in the order.");
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }
}
