public class BeverageFactoryAlpha implements BeverageFactory {
    @Override
    public Juice createJuice() {
        return new OrangeJuice();
    }

    @Override
    public Soda createSoda() {
        return new Coke();
    }
}
