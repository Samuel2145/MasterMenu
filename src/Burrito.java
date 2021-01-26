public class Burrito implements MexFood {

    @Override
    public float getPrice() {
        return 6.49f;
    }

    @Override
    public String getOrder() {
        return "Burrito with";
    }
}
