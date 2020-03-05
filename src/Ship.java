/**
 * Это абстрактный класс всех кораблей
 *
 * @author Pukin Alexey
 * @version 05.03.2020
 */

public abstract class Ship implements ShipInterface {
    protected boolean isMoving = false; // признак движения
    protected int size; // размер
    protected String name; // имя
    protected String color; // цвет
    protected int speed; // скорость корабля

    public Ship(int size, String name, String color, int speed) {
        this.size = size;
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    // движение корабля
    @Override
    public final void move(final int newSpeed) {
        System.out.println("Корабль " + this.name + " поплыл");
        this.isMoving = true;
        this.speed = newSpeed;
    }

    // остановка корабля
    @Override
    public final void stop() {
        System.out.println("Корабль " + this.name + " остановился");
        this.isMoving = false;
        this.speed = 0;
    }

    // показ, движется ли корабль
    @Override
    public final boolean isMoving() {
        return this.speed > 0;
    }

    // получение скорости корабля
    @Override
    public final int getSpeed() {
        if (this.speed > 0) {
            return this.speed;
        } else {
            return 0;
        }
    }

    @Override
    public void showGerb() {
        System.out.println("Корабль " + this.name + " показывает герб");
    }


}
