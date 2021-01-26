import java.util.Scanner;

class MasterMenu {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int items = 0;

        System.out.println("Welcome to the Master Menu");
        Menu menu = new Menu();
        FoodComponent order = new FoodComposite("Order");

        boolean ordering = true;

        while(ordering){

            menu.displayMenu();
            int choice = scan.nextInt();

            switch(choice){
                case 1:
                    items++;
                    System.out.println("Build your Taco");
                    order.add(new FoodLeaf(toppingsLoop(new Taco())));
                    break;
                case 2:
                    items++;
                    System.out.println("Build your Burrito");
                    order.add(new FoodLeaf(toppingsLoop(new Burrito())));
                    break;
                case 3:
                    items++;
                    System.out.println("Build your Bowl");
                    order.add(new FoodLeaf(toppingsLoop(new Bowl())));
                    break;
                case 4:
                    items++;
                    System.out.println("Taco Salad");
                    FoodComposite TacoSalad = new FoodComposite("Taco Salad");
                    TacoSalad.add(new FoodLeaf(new Bowl()));
                    for(int i = 0; i < 3;i++){
                        TacoSalad.add(new FoodLeaf(new TacoSalad(toppingsLoop(new Taco()))));
                    }
                    order.add(TacoSalad);
                    break;
                case 5:
                    items++;
                    System.out.println("Double-Decker Taco");
                    MexFood firstTaco = toppingsLoop(new Taco());
                    MexFood secondTaco = toppingsLoop(new Taco());
                    MexFood dd = new DoubleDecker(firstTaco,secondTaco);
                    dd = doubleDeckerLoop(dd);
                    order.add(new FoodLeaf(dd));

                    break;
                case 6:
                    items++;
                    FoodComponent OrderOfTacos = new FoodComposite("Order of Tacos");
                    for(int i = 0; i < 3;i++){
                        System.out.println("Taco #" + i+1);
                        OrderOfTacos.add(new FoodLeaf(toppingsLoop(new Taco())));
                    }
                    order.add(OrderOfTacos);
                    break;
                case 7:
                    items++;
                    FoodComponent TravelPack = new FoodComposite("Traveler's Pack");
                    System.out.println("Taco #1");
                    TravelPack.add(new FoodLeaf(toppingsLoop(new Taco())));
                    System.out.println("Taco #2");
                    TravelPack.add(new FoodLeaf(toppingsLoop(new Taco())));
                    System.out.println("Burrito");
                    TravelPack.add(new FoodLeaf(toppingsLoop(new Burrito())));
                    order.add(TravelPack);
                    break;
                case 8:
                    items++;
                    FoodComponent Sampler = new FoodComposite("Sampler Pack");
                    System.out.println("Build your Taco");
                    Sampler.add(new FoodLeaf(toppingsLoop(new Taco())));
                    System.out.println("Build your Burrito");
                    Sampler.add(new FoodLeaf(toppingsLoop(new Burrito())));
                    System.out.println("Build your Bowl");
                    Sampler.add(new FoodLeaf(toppingsLoop(new Bowl())));
                    order.add(Sampler);
                    break;
                case 9:
                    items++;
                    FoodComponent Party = new FoodComposite("Party Platter");
                    FoodComponent OrderOfTacos1 = new FoodComposite("Order of Tacos #1");
                    FoodComponent OrderOfTacos2 = new FoodComposite("Order of Tacos #2");
                    FoodComponent OrderOfTacos3 = new FoodComposite("Order of Tacos #3");

                    System.out.println("Order of Tacos #1");
                    for(int i = 0; i < 3;i++){
                        System.out.println("Taco #" + i+1);
                        OrderOfTacos1.add(new FoodLeaf(toppingsLoop(new Taco())));
                    }

                    System.out.println("Order of Tacos #2");
                    for(int i = 0; i < 3;i++){
                        System.out.println("Taco #" + i+1);
                        OrderOfTacos2.add(new FoodLeaf(toppingsLoop(new Taco())));
                    }

                    System.out.println("Order of Tacos #3");
                    for(int i = 0; i < 3;i++){
                        System.out.println("Taco #" + i+1);
                        OrderOfTacos3.add(new FoodLeaf(toppingsLoop(new Taco())));
                    }

                    Party.add(OrderOfTacos1);
                    Party.add(OrderOfTacos2);
                    Party.add(OrderOfTacos3);
                    System.out.println("Build your Taco #1");
                    Party.add(new FoodLeaf(toppingsLoop(new Burrito())));
                    System.out.println("Build your Taco #2");
                    Party.add(new FoodLeaf(toppingsLoop(new Burrito())));
                    System.out.println("Build your Bowl");
                    Party.add(new FoodLeaf(toppingsLoop(new Bowl())));
                    order.add(Party);
                    break;
                case 10:
                    System.out.println("Number of items in order: " + items);
                    ordering = false;
                    break;

            }
        }
        order.print();
    }

    public static MexFood toppingsLoop(MexFood f){
        Menu m = new Menu();
        Scanner scan = new Scanner(System.in);
        int choice;
        while(true){
            f = m.getFilling(f);
            System.out.println("Do you want to add more fillings?\n1. Yes\n2. No");
            choice = scan.nextInt();
            if(choice == 2) {
                break;
            }
        }
        while(true){
            f = m.getTopping(f);
            System.out.println("Do you want to add more toppings?\n1. Yes\n2. No");
            choice = scan.nextInt();
            if(choice == 2) {
                break;
            }
        }
        return f;
    }

    public static MexFood doubleDeckerLoop(MexFood f){
        Scanner scan = new Scanner(System.in);
        int choice;
        boolean dd = true;
        while(dd){
            System.out.println("Do you want to add another layer?\n1. Yes\n2. No");
            choice = scan.nextInt();
            if(choice == 1){
                f = new DoubleDecker(f, toppingsLoop(new Taco()));

            }else{
                dd = false;
            }
        }
        return f;
    }
}

