import java.util.Scanner;

/**
 * Это класс, который запускает программу
 *
 * @author Pukin Alexey
 * @version 05.03.2020
 */

public class Main {
    public static void main(String[] args) throws NextIntException {


        CombatShip space = new CombatShip("space", 50, 25);

        space.showGerb();
        System.out.println(space.name + " движется? - " + space.isMoving);
        space.move(20);
        System.out.println(space.name + " движется? - " + space.isMoving);
        System.out.println("Корабль " + space.name + " движется со скоростью " + space.getSpeed());
        space.attackOn();
        space.attackOff();
        space.stop();
        System.out.println(space.name + " движется? - " + space.isMoving);
        System.out.println();

        TradeShip venecia = new TradeShip("venecia");

        venecia.shipment(50);
        venecia.move(70);
        System.out.println("Корабль " + venecia.name + " движется со скоростью " + venecia.getSpeed());
        System.out.println("Корабль " + venecia.name + " прибыл в Севастопль");
        venecia.stop();
        venecia.unloading();
        System.out.println();

        PassengerShip titanic = new PassengerShip("titanic");

        titanic.landing(100);
        titanic.debarkation();
        titanic.landing(130, 15);
        titanic.move(30);
        titanic.showGerb();

        // Исключение на ввод целого числа с существующим исключением
        Scanner in = new Scanner(System.in);
        int num = 10;
        try {
            System.out.print("Введите целое число: ");
            num = in.nextInt();
            System.out.println(num);
        } catch (Exception e) {
            e.getMessage();
            System.out.println("К сожалению, Вы ввели не целое число");
        } finally {
            System.out.println("Если Вы всё сделали правильно, у вас выведется число");
        }

        // Исключение с собственным исключением

        try {
            if (num == 0){
                System.out.println("Вы вышли из игры");
            }else {
                throw new NextIntException("Такого пункта в меню нет");
            }
        } catch (NextIntException e){
            e.printStackTrace();
        }

    }

}
