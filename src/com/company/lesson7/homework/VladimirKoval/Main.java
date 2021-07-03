package com.company.lesson7.homework.VladimirKoval;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AirPlane boeing = new AirPlane();
        Scanner scan = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("Симулятор самолета");
        System.out.println("------------------");

        while (boeing.gameStatus) {
            System.out.println("1.Завести мотор  2.Начать взлет  3.Набрать высоту  4.Снизить высоту  5.Режим стабильного полета  6.Посадка  7.Экстренная посадка");
            boolean isInt = scan.hasNextInt();
            while (isInt == false) {
                scan.nextLine();
                System.out.println("Вы не ввели число");
                isInt = scan.hasNextInt();
            }

            int controller = scan.nextInt();

            switch (controller) {
                case 1 -> boeing.startEngine();
                case 2 -> boeing.startFly();
                case 3 -> boeing.heightUp();
                case 4 -> boeing.heightDown();
                case 5 -> boeing.stableFlight();
                case 6 -> boeing.landingPlane();
                case 7 -> boeing.emergencyLanding();
            }
        }
    }
}

