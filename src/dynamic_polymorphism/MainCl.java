package dynamic_polymorphism;

import java.util.Scanner;

public class MainCl {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Animal animal;

        System.out.println("Choose Animal\n1: Cat\n2: Dog");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                animal = new Cat();
                animal.speak();
                break;
            case 2:
                animal = new Dog();
                animal.speak();
                break;
            default:
                System.out.println("Invalid choice");
                animal = new Animal();
                animal.speak();
                break;
        }

        sc.close();

    }
    
}
