public class Chicken extends MexFoodDecorator{

    public Chicken(MexFood f) {
        super(f);
    }

    @Override
    public float getPrice()
    {
        return super.getPrice() + 0.49f;
    }

    @Override
    public String getOrder()
    {
        return super.getOrder() + ", Chicken";
    }
}
