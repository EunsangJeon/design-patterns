public class Game {
    public static void main(String args[]) {
        Character king = new King();
        king.setWeapon(new AxeBehavior());
        king.display();
        king.fight();
    }
}
