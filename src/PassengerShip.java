import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Этот класс описывает пасажирский корабль
 *
 * @author Pukin Alexey
 * @version 05.03.2020
 */

public final class PassengerShip extends Ship {

    private int passengers = 0; // количеств пассажиров
    private int generals = 0; // количество генералов

    public PassengerShip(String name) {
        super(100, name, "white", 0);
        System.out.println("Построился пассажирский корабль");
    }

    // посадка пассажиров
    public final void landing(final int newPassengers) {
        this.passengers = newPassengers;
        System.out.println("Теперь на корабле " + this.passengers + " пассажиров");
    }

    public final void debarkation() {
        this.passengers = 0;
        this.generals = 0;
        System.out.println("Произошла высадка пассажиров");
    }

    // посадка пассажиров с генералами
    public final void landing(final int newPassangers, final int newGenerals) {
        this.passengers = newPassangers;
        this.generals = newGenerals;
        System.out.println("Теперь на корабле " + this.passengers + " пассажиров и " + this.generals + " генералов");
    }

    // показ количества пассажиров
    public final int getPassengers() {
        return this.passengers;
    }

    // показ герба у пассажирского корабля
    @Override
    public void showGerb() {
        System.out.println("Корабль " + this.name + " показывает пассажирский герб");
    }


}
