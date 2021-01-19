public class BeverageClient {
    public static void main(String[] args) {
        BeverageFactory bf = new BeverageFactoryAlpha();
        Soda s = bf.createSoda();
        Juice j = bf.createJuice();
        s.artificialFlavor();
        j.fruitFlavor();

        bf = new BeverageFactoryDelta();
        s = bf.createSoda();
        j = bf.createJuice();
        s.artificialFlavor();
        j.fruitFlavor();
    }
}
