import java.util.Scanner;

public class Menu {

    public void displayMenu(){
        System.out.println("What would you like to order?\n1. Taco");
        System.out.println("2. Burrito\n3. Bowl\n4. Taco Salad");
        System.out.println("5. Double-Decker Taco\n6. Order of Tacos (3 Tacos)");
        System.out.println("7. Traveler's Pack (2 Tacos and 1 Burrito)\n8. Sampler Pack (1 Taco, 1 Burrito, 1 Bowl)");
        System.out.println("9. Party Platter (3 Orders of Tacos, 2 Burritos, 1 Bowl)\n10. Nothing more");
    }

    public void fillingMenu(){ System.out.println("Choose a filling\n1. Chicken\n2. Beef\n3. Tofu"); }

    public void toppingMenu(){ System.out.println("Choose a topping\n1. Guacamole\n2. Cheese\n3. Pico de Gallo"); }

    public MexFood getFilling(MexFood f){
        Scanner scan = new Scanner(System.in);
        fillingMenu();
        int choice = scan.nextInt();
        switch(choice){
                case 1:
                    f = new Chicken(f);
                    break;
                case 2:
                    f = new Beef(f);
                    break;
                case 3:
                    f = new Tofu(f);
                    break;
        }
        return f;
    }

    public MexFood getTopping(MexFood f){
        Scanner scan = new Scanner(System.in);
        toppingMenu();
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                f = new Guacamole(f);
                break;
            case 2:
                f = new Cheese(f);
                break;
            case 3:
                f = new PicoDeGallo(f);
                break;
        }

        return f;
    }
}
