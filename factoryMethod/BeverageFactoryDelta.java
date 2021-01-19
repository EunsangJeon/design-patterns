public class BeverageFactoryDelta implements BeverageFactory {
    @Override
    public Soda createSoda() {
        return new Sprite();
    }

    @Override
    public Juice createJuice() {
        return new GrapeJuice();
    }
}
