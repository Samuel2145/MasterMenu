

public class FoodLeaf extends FoodComponent{

    MexFood food;

    public FoodLeaf(MexFood f){
        this.food = f;
    }

    @Override
    public void add(FoodComponent f) {
        //Do nothing
    }

    @Override
    public void remove(FoodComponent f) {
        //Do nothing
    }

    @Override
    public String getFoodName() {
        return food.getOrder();
    }

    @Override
    public float getPrice() {
        return food.getPrice();
    }

    @Override
    public void print(){
        System.out.printf("%.2f", getPrice());
        System.out.println(" " + getFoodName());
    }
}