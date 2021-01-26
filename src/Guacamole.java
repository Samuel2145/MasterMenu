public class Guacamole extends MexFoodDecorator {

    public Guacamole(MexFood f) { super(f); }

    @Override
    public float getPrice()
    {
        return super.getPrice() + .89f;
    }

    @Override
    public String getOrder()
    {
        return super.getOrder() + ", Guacamole";
    }

}
