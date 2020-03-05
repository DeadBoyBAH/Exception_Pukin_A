import java.sql.SQLOutput;

/**
 * Этот класс описывает торговый корабль
 *
 * @author Pukin Alexey
 * @version 05.03.2020
 */

public final class TradeShip extends Ship {

    private int cargo = 0; // количество груза


    public TradeShip(String name) {
        super(20, name, "yellow", 0);
        System.out.println("Построился торговый корабль");
    }

    // погрузка товара
    public final void shipment(int newCargo) {
        this.cargo = newCargo;
        System.out.println("На корабль погружено " + this.cargo + " груза");
    }

    public final void unloading() {
        this.cargo = 0;
        System.out.println("Корабль " + this.name + " разгружен");
    }

    // показ герба у торгового корабля
    @Override
    public void showGerb() {
        System.out.println("Корабль " + this.name + " показывает торговый герб");
    }

}
