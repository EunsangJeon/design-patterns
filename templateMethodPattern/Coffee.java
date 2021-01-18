public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee from the machine.");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }
}
