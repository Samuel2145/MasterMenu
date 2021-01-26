public class PicoDeGallo extends MexFoodDecorator {

    public PicoDeGallo(MexFood f) { super(f); }

    @Override
    public float getPrice()
    {
        return super.getPrice() + 0.19f;
    }

    @Override
    public String getOrder()
    {
        return super.getOrder() + ", Pico de Gallo";
    }
}
