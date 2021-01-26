public abstract class MexFoodDecorator implements MexFood {
    protected MexFood food;

    public MexFoodDecorator(MexFood f){
        this.food = f;
    }

    @Override
    public float getPrice() {
        return food.getPrice();
    }

    @Override
    public String getOrder() {
        return food.getOrder();
    }
}
