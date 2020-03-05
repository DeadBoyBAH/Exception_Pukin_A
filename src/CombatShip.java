/**
 * Это класс, который описывает боевой корабль
 *
 * @author Pukin Alexey
 * @version 05.03.2020
 */
public final class CombatShip extends Ship implements IAttack {

    private int damage; // урон корабля
    private int guns; // количество пушек
    private boolean isAttacking = false; // режим атаки

    public CombatShip(String name, int damage, int guns) {
        super(100, name, "black", 0);
        System.out.println("Построился боевой корабль");
        this.damage = damage;
        this.guns = guns;
    }

    // включение режима атаки
    @Override
    public final void attackOn() {
        System.out.println("Пушки заряжены");
        this.isAttacking = true;
    }

    // выключение режима атаки
    @Override
    public final void attackOff() {
        System.out.println("Пушки освобождены");
    }

    // показ герба у боевого корабля
    @Override
    public void showGerb() {
        System.out.println("Корабль " + this.name + " показывает боевой герб");
    }

}
