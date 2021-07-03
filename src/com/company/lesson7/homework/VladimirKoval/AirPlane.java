package com.company.lesson7.homework.VladimirKoval;

public class AirPlane {

    boolean engineStatus = false;
    boolean startFly = false;
    boolean stableFlight = false;
    int heightKm = 0;
    boolean gameStatus = true;

    public boolean startEngine() {
        if (!engineStatus) {
            System.out.println("* Мотор заведен *");
            System.out.println();
            return engineStatus = true;
        } else
            System.out.println("!!!Мотор уже был активирован ранее!!!");
        System.out.println();
        return engineStatus;
    }

    public int startFly() {
        if (engineStatus && !startFly) {
            System.out.println("Приветствуем Вас на борту Boeing 747 Hillel Airlines. Пристегните ремни, взлетаем! Идет набор высоты!");
            setStartFly();
            showHeight();
        } else if (!engineStatus) {
            System.out.println("!!!Не можем начать взлет! Заведите мотор!!!");
            System.out.println();
        } else if (startFly) {
            System.out.println("!!!Взлет не может быть активирован повторно! В команде отказано!!!");
            System.out.println();
        }
        return heightKm;
    }

    public int heightUp() {
        if (engineStatus && startFly && heightKm < 10) {
            System.out.println("Продолжаем набор высоты, не растегивайте ремни безопасности!");
            setHeightUp();
        } else if (!engineStatus) {
            System.out.println("!!!Мотор не заведен! Не может набирать высоту!!!");
            System.out.println();
        } else if (heightKm >= 10) {
            System.out.println("!!!Вы достигли максимально возможной высоты! Набор высоты не возможен!!!");
            showHeight();
        } else if (!startFly) {
            System.out.println("!!!Процедура взлета не была выполнена! Не можем набирать высоту!");
        }
        return heightKm;
    }

    public int heightDown() {
        if (heightKm > 2) {
            System.out.println("Снижаем высоту");
            setHeightDown();
            setStableFlightOff();
            System.out.println();
        } else if (heightKm == 2) {
            System.out.println("!!!Снижение высоты не возможно! Начните процедуру посадки либо набирайте высоту!!!");
            showHeight();
        } else if (heightKm < 2) {
            System.out.println("!!!Самолет не в состоянии полета. Не возможно понизить высоту!!!");
            showHeight();
        }
        return heightKm;
    }

    public boolean stableFlight() {
        if (heightKm >= 10 && !stableFlight) {
            System.out.println("Мы закончили набирать высоту! Активирован стабильный полет. Можете расстегнуть ремни и начать распивать дьютик, хорошего полета!");
            System.out.println();
            return stableFlight = true;
        } else if (heightKm < 10) {
            System.out.println("!!!Недостаточная высота для стабильного полета. Наберите высоту 10км!!!");
            return !stableFlight;
        } else if (stableFlight) {
            System.out.println("Вы уже активировали стабильный полет ранее");
            return stableFlight;
        }
        return stableFlight;
    }

    public boolean landingPlane() {
        if (heightKm == 2) {
            System.out.println("Заходим на посадку");
            System.out.println("Посадка прошла успешно! Спасибо что поспользовались нашими Авиалиниями");
            return gameStatus = false;
        } else if (heightKm > 2) {
            System.out.println("!!!Посадка не возможна, необходимо снизить высоту до 2км!!!");
            showHeight();
        } else if (heightKm < 2) {
            System.out.println("!!!Высота 0км! Посадка не возможна");
        }
        return gameStatus;
    }

    public boolean emergencyLanding() {
        if (heightKm >= 2) {
            System.out.println("Всем пристегнуть ремни! Совершаем экстренную посадку...");
            System.out.println("Фуууух, сели без жертв *шум аплодисментов");
            setHeightMin();
            return gameStatus = false;
        } else System.out.println("!!!Самолет находится на земле. В экстренной посадке отказано!!!");
        System.out.println();
        return gameStatus;
    }

    public void setHeightMin() {
        heightKm = 0;
        stableFlight = false;
        startFly = false;
    }

    public void setStartFly() {
        heightKm += 2;
        startFly = true;
    }

    public void setHeightUp() {
        heightKm += 2;
        System.out.println("Текущая высота >>> " + heightKm + "км <<<");
        System.out.println();
    }

    public void setHeightDown() {
        heightKm -= 2;
        System.out.println("Текущая высота >>> " + heightKm + "км <<<");
        System.out.println();
    }
    public boolean setStableFlightOff(){
        return stableFlight = false;
    }
    public void showHeight(){
        System.out.println("Текущая высота " + heightKm + "км");
        System.out.println();
    }
}
