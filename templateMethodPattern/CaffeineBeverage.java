public abstract class CaffeineBeverage {
    public final void prepareRecipe() {

    }

    public abstract void brew();
    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water.");
    }

    public void pourInCup() {
        System.out.println("Pouring into a cup.");
    }
}
