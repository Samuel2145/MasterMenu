public class Bowl implements MexFood {


    @Override
    public float getPrice() {
        return 6.99f;
    }

    @Override
    public String getOrder() {
        return "Bowl with";
    }
}
