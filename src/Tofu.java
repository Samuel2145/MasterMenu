public class Tofu extends MexFoodDecorator {
    public Tofu(MexFood f) {
        super(f);
    }

    @Override
    public float getPrice() {
        return super.getPrice() + 0.79f;
    }

    @Override
    public String getOrder() { return super.getOrder() + ", Tofu"; }
}
