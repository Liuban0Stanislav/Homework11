import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isLeapYear(2014);
        doNeedLightApp(1, 2000);
        System.out.println(howMuchDeliveryDaysNeed(101));
    }

    private static void isLeapYear(int year) {
        System.out.println("Задача 1");

        /*Задача 1
        Реализуйте метод, который получает в качестве параметра год, проверяет,
        является ли он високосным, и выводит результат в консоль.
        Эту проверку вы уже реализовывали в задании по условным операторам.*/

        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else if (year % 100 == 0) {
            System.out.println(year + " год - не високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
        System.out.println();
    }

    private static void doNeedLightApp(int clientOSVersion, int clientDeviceYear) {
        System.out.println("Задача 2");

        /*Напишите метод, куда подаются два параметра: тип операционной
        системы (0 — iOS, 1 — Android ) и год выпуска устройства.
        Если устройство старше текущего года, предложите ему установить облегченную версию.
        Текущий год можно получить таким способом:
        int currentYear = LocalDate.now().getYear();
        Или самим задать значение вручную — ввести в переменную числовое значение.
        В результате программа должна выводить в консоль сообщение, какую версию
        приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.*/

        int currentYear = LocalDate.now().getYear();
        if (clientOSVersion == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOSVersion == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOSVersion == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOSVersion == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    private static int howMuchDeliveryDaysNeed(int deliveryDistance) {
        System.out.println("Задача 3");

        /*Ваша задача — доработать код, а именно написать метод, который на вход
        принимает дистанцию и возвращает итоговое количество дней доставки. */

        int deliveryDay = 0;
        if (deliveryDistance <= 20) {
            deliveryDay = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay ++;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDay ++;
        } else if (deliveryDistance > 100) {
            return -1;
        }
        return deliveryDay;
    }

}