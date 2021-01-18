public abstract class Character {
    WeaponBehavior weapon;

    public abstract void display();

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
