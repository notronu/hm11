// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }

        public static void checkLeapYear(int year) {
           if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
               System.out.println(year + " год является високосным ");
           }
           else {
               System.out.println(year + " год не является високосным ");
           }
    }

        public static void task1() {
            System.out.println("Задача 1");
            int yearToCheck = 1927;
            checkLeapYear(yearToCheck);
        }


            public static void checkDeviceClient(int deviceOS, int deviceYear) {

                if (deviceOS == 0) {
                    if (deviceYear >= 2015) {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    } else {
                        System.out.println("Установите обычную версию приложения для iOS по ссылке");
                    }
                } else if (deviceOS == 1) {
                    if (deviceYear >= 2015) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    } else {
                        System.out.println("Установите обычную версию приложения для iOS по ссылке");
                    }
                } else {
                    System.out.println("Выберете операционную систему вашего устройства");
                }
            }
            public static void task2() {
                System.out.println("Задача 2");
                int clientDeviceOs = 0;
                int clientDeviceYear = 2015;
                checkDeviceClient(clientDeviceOs,clientDeviceYear);
            }


    public static int checkDistanceDay (int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        if (deliveryDistance > 100) {
            deliveryDay++;
        }
        return deliveryDay;
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryDay = checkDistanceDay(deliveryDistance);
        if (deliveryDay > 3) {
            System.out.println("Доставка свыше 100 км не действует");
        } else {
            System.out.println("Потребуется для доставки дней: " + deliveryDay);
        }
    }

            }








