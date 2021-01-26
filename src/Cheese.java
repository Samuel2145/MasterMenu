public class Cheese extends MexFoodDecorator {
    public Cheese(MexFood f) { super(f); }

    @Override
    public float getPrice()
    {
        return super.getPrice() + 0.39f;
    }

    @Override
    public String getOrder()
    {
        return super.getOrder() + ", Cheese";
    }
}
