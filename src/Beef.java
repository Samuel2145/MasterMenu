public class Beef extends MexFoodDecorator {
    public Beef(MexFood f) {
        super(f);
    }

    @Override
    public float getPrice() {
        return super.getPrice() + 0.69f;
    }

    @Override
    public String getOrder() {
        return super.getOrder() + ", Beef";
    }
}
