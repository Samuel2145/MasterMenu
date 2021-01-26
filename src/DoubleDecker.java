public class DoubleDecker extends MexFoodDecorator {
    protected MexFood secondTaco;

    public DoubleDecker(MexFood f, MexFood s) {
        super(f);
        secondTaco = s;
    }

    @Override
    public float getPrice()
    {
        return super.getPrice() + secondTaco.getPrice();
    }

    public String getOrder(){
        return super.getOrder() + " inside a " + secondTaco.getOrder();
    }


}
