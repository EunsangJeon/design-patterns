abstract public class Character {
    WeaponBehavior weapon;

    abstract public void display();

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
