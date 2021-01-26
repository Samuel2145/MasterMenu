import java.util.ArrayList;

public class FoodComposite extends FoodComponent{

    private String pName;
    ArrayList<FoodComponent> items = new ArrayList<>();

    public FoodComposite(String name){
        pName = name;
    }


    public void add(FoodComponent f) {
        items.add(f);
    }

    public void remove(FoodComponent f) {
        items.remove(f);
    }

    @Override
    public String getFoodName() {
        return pName;
    }

    @Override
    public float getPrice() {
        return 0.0f;
    }

    @Override
    public void print() {

        System.out.println(pName + "-");
        for(FoodComponent item : items)
            item.print();
    }
}
