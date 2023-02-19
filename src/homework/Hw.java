package homework;

public class Hw {
    public static void Task1(){
        var clientOS = 0;
        System.out.println("Task 1:");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке : https://mybank.com/ios");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке: https://mybank.com/android");
        }
        System.out.println("");
    }
    public static void Task2(){
        var clientOS = 1;
        var releaseDate = 2016;
        System.out.println("Task 2:");
        if (clientOS == 0) {
            if (releaseDate >= 2015){
                System.out.println("Установите версию приложения для iOS по ссылке : https://mybank.com/ios");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке: https://mybank.com/ios/light_version");
            }
        }
        else {
            if (releaseDate >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке: https://mybank.com/android");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке: https://mybank.com/android/light_version");
            }
        }
        System.out.println("");
    }
    public static void Task3(){
        var year = 2021;
        System.out.println("Task 3:");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("");
    }
    public static void Task4(){
        var deliveryDistance = 45;
        var deliveryTime = 0;
        System.out.println("Task 4:");
        if (deliveryDistance <= 20){
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        }
        System.out.println("");
    }
    public static void Task5(){
        var monthNumber = 10;
        System.out.println("Task 5:");
        switch (monthNumber){
            case 1:
                System.out.println("Месяц: Январь, Сезон года: Зима");
                break;
            case 2:
                System.out.println("Месяц: Февраль, Сезон года: Зима");
                break;
            case 3:
                System.out.println("Месяц: Март, Сезон года: Весна");
                break;
            case 4:
                System.out.println("Месяц: Апрель, Сезон года: Весна");
                break;
            case 5:
                System.out.println("Месяц: Май, Сезон года: Весна");
                break;
            case 6:
                System.out.println("Месяц: Июнь, Сезон года: Лето");
                break;
            case 7:
                System.out.println("Месяц: Июль, Сезон года: Лето");
                break;
            case 8:
                System.out.println("Месяц: Август, Сезон года: Лето");
                break;
            case 9:
                System.out.println("Месяц: Сентябрь, Сезон года: Осень");
                break;
            case 10:
                System.out.println("Месяц: Октябрь, Сезон года: Осень");
                break;
            case 11:
                System.out.println("Месяц: Ноябрь, Сезон года: Осень");
                break;
            case 12:
                System.out.println("Месяц: Декабрь, Сезон года: Зима");
                break;
            default:
                System.out.println("Ошибка в набранном вами месяце");
        }
        System.out.println("");
    }
}
