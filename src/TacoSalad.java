public class TacoSalad extends MexFoodDecorator{
    public TacoSalad(MexFood f) {
        super(f);
    }

    @Override
    public float getPrice()
    {
        return 0.00f;
    }

    @Override
    public String getOrder() {
        return super.getOrder() + " (Crushed)";
    }
}
