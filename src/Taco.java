public class Taco implements MexFood {


    @Override
    public float getPrice() {
        return 1.49f;
    }

    @Override
    public String getOrder() {
        return "Taco with";
    }
}
