public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }

        System.out.println("Задача 2");
        int clientDeviceYear = 2014;

        boolean applicationOS = clientDeviceYear >= 2015;
        if (clientOS == 0 && applicationOS == true) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            if (clientOS == 0 && applicationOS == false) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        }
        if (clientOS == 1 && applicationOS == true) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOS == 1 && applicationOS == false) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        System.out.println("Задача 3");
        int year = 2021;
        int a = 4;
        int b = 100;
        int c = 400;
        float balanceFour = year % a;
        float balanceOneHundred = year % b;
        float balanceFourHundred = year % c;
        boolean leapYear = balanceFour == 0.0 && balanceOneHundred != 0 && balanceFourHundred != 0;
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");

        System.out.println("Задача 4");
        int deliveryDistance = 70;
        int days = 0;
        if (deliveryDistance <= 20) {
            days += 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            days += 2;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            days += 3;
        }
        System.out.println(days);

        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }


    }
}

