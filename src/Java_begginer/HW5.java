package Java_begginer;

public class HW5 {

    //______________________________________________________________________________________________
    static int numberTask = 1;
    private static int expectedResult;

    public static void printTask() {

        System.out.print("Task № " + numberTask++ + "________________________________________" + "\n");
    }

    static int numberTest = 1;

    public static void printTest() {

        System.out.print("TC_" + numberTest++ + "\t-\t");
    }


//_____________________________________________________________________________________________________

    //1. Cоздать метод verifyEquals(expectedResult, actualResult) {}
    //так, как мы делали на уроке. Попробуйте написать его самостоятельно,
    // и потом свериться с кодом с урока.

    public static void printTestResult(String value) {
        System.out.println(value);
        System.out.println();
    }


    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {

            return "Pass";
        } else {

            return "Fail";
        }
    }

    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {

            return "Pass";
        } else {

            return "Fail";
        }
    }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {

            return "Pass";
        } else {

            return "Fail";
        }
    }

    public static String verifyEquals(String expectedResult, double actualResult) {
        if (expectedResult.equals(actualResult)) {

            return "Pass";
        } else {

            return "Fail";
        }
    }

    //2. Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
    // В случае невалидных значений метод возвращает “Error”.
    //Протестировать метод
    public static String returnDay(int number) {
        if (number > 0 && number < 8) {
            if (number == 1) {

                return "Monday";
            }
            if (number == 2) {

                return "Thursday";
            }
            if (number == 3) {

                return "Wednesday";
            }
            if (number == 4) {

                return "Thursday";
            }
            if (number == 5) {

                return "Friday";
            }
            if (number == 6) {

                return "Saturday";
            }
            if (number == 7) {

                return "Sunday";
            }
        }

        return "Error";
    }

    //3.  Написать алгоритм вычисления среднего возраста (int) в семье из 3х человек.
    //Например,
    //int age1 = 20,
    //int age2 = 40,
    //int age3 = 60
    //Average = 40.
    //или
    //age1 = -5;
    //age2 = -30;
    //age3 = -3;
    //должно вернуть  Integer.MIN_VALUE;
    public static int ageAverage(int age1, int age2, int age3) {
        if (age1 >= 0 && age1 <= 150 && age2 >= 0 && age2 <= 150 && age3 >= 0 && age3 <= 150) {
            int average = ((age1 + age2 + age3) / 3);

            return average;
        }

        return Integer.MIN_VALUE;
    }

    //4. Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
    //k и l
    //k, l, m
    //k, l, m, n
    //	Переменные должны быть типа int

    //	Happy path test data:
    //if k = 3, l = 30, m = 300, n = 3000
    //expected results:
    //a) 3
    //b) 3
    //c) 3

    //Написать тесты на каждый метод.


    public static int findMinOfTwo(int k, int l) {
        int min = Math.min(k, l);

        return min;
    }

    public static int findMinOfTree(int k, int l, int m) {
        int min = Math.min(m, (Math.min(k, l)));

        return min;
    }

    public static int findMinOfFour(int k, int l, int m, int n) {
        int min = Math.min(n, (Math.min(m, (Math.min(k, l)))));

        return min;
    }

    //5.Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота. Метод принимает и возвращает значения типа double.
    //Например,
    //t1 = 39
    //t2 = 39
    //t3 = 39
    //t4 = 39
    //t5 = 39
    //TempAverage = 39
    public static double temCat(double a, double b, double c, double d, double e) {
        double catMax = 45.00;
        double catMin = 25.00;

        if (a >= catMin && a <= catMax && b >= catMin && b <= catMax && c >= catMin && c <= catMax
                && d >= catMin && d <= catMax && e >= catMin && e <= catMax) {
            double value = ((a + b + c + d + e) / 5);

            return value;
        }

        return -1;
    }

    //6.Написать метод, который принимает на вход количество часов (int) работы в день, стоимость одного часа работы в десятичном числе, и возвращает заработную плату в месяц в целых единицах.
    //При невалидных значениях метод возвращает -1.
    public static int salary(int hour, double price) {
        if (price >= 12 && hour > 0 && hour <= 24) {
            int salary = (int) (hour * price * 21);

            return salary;
        }

        return -1;
    }

    //7. Написать метод, который принимает на вход 2 параметра -  цену
    // и количество товара (количество в штуках).
    // Алгоритм возвращает сумму покупки в виде десятичного числа.
    //Например,
    //price for 1 = 25 руб 50 коп (25.5)
    //amount = 5
    //expected total = 127 руб 50 коп (127.5)
    //При невалидных значениях метод возвращает -1
    public static double expectTotal(double priceFor1, int amount) {
        if (priceFor1 <= 0 || amount <= 0) {

            return -1;
        }

        return (priceFor1 * amount);
    }


    //8. Написать метод, который принимает на вход необходимые параметры и возвращает строку ведомости выдачи зарплаты сотрудникам.
    //Например:
    //“Смирнова Мария Ивановна 		70000 руб 00 коп”
    //если имя сотрудника придет в виде пустой строки или в виде null (String -  это референсный тип данных и может принимать значение null), то в ведомости должна быть распечатана пустая строка "".
    //Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана, как 0, то в ведомости тоже должна быть распечатана пустая строка ""
    //Протестировать метод.

    static String nameEmployee;
    static double payrollEmployee;

    static public String returnPayrollEmployee(String nameEmployee, double payrollEmployee) {

        int wholePartOfNumber = (int) Math.floor(payrollEmployee);
        int decimalPartOfNumber = (int) Math.ceil(payrollEmployee * 100)
                - wholePartOfNumber * 100;

        if (nameEmployee == null || nameEmployee.equals("") || nameEmployee.equals(" ")
                || payrollEmployee <= 0) {

            return "";
        } else {

            return "" + nameEmployee + "\t" + wholePartOfNumber + " руб "
                    + decimalPartOfNumber + " коп";
        }
    }

    //9.Создать метод, который печатает ведомость для нескольких сотрудников,
    // используя метод из задачи 8, например:
    // Смирнова Мария Ивановна 		70000 руб 00 коп
    // Серебров Иван Петрович 		128059 руб 00 коп

//    public static String returnNameAndSalary(String nameAndSurname, double salary) {
//        if (nameAndSurname.equals("") || nameAndSurname == null || salary <= 0) {
//
//            return "";
//        }
//        int rub = (int) salary;
//        int kop = (int) ((salary - rub) * 100);
//        String kop1;
//        if (kop >= 0 && kop <= 9) {
//            kop1 = "0" + kop;
//        }else {
//            kop1 = "" + kop1;
//        }
//
//        return  nameAndSurname + " " + rub + " руб " + kop1 + " коп";
//    }

    public static String returnDoubleNameAndSurname(String nameEmployee, double payrollEmployee,
                                                    String nameEmployee2, double payrollEmployee2) {

        return returnPayrollEmployee(nameEmployee, payrollEmployee) + "\n"
                + returnPayrollEmployee(nameEmployee2, payrollEmployee2);
    }

    //10. Записать в виде метода и протестировать:
    //дано int x

    public static String checkIfNumberPositiveOrNegativeOrZero(int x) {
        if (x < 0) {

            return "x is negative";
        } else if (x > 0) {

            return "x is positive";
        }

        return "x is zero";
    }

    //11.Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.
    public static String getPrice(double price) {
        if (price > 0) {
            double intNumber = Math.floor(price);
            double subNumber = price % intNumber;
            subNumber = subNumber * 100;

            return (int) intNumber + " rub " + (int) subNumber + " cop";
        }

        return "Enter number than bigger than 0";
    }

    //12.Написать метод, который принимает на вход десятичное число (например, 10,075) и возвращает строку “10 кг 75 гр”.
    public static String convertNumber(double weight) {
        if (weight >= 0) {
            int kg = (int) weight;
            int gr = (int) (Math.round((weight - kg) * 1000));

//            String gr1;
//            if (gr >= 0 && gr < 9) {
//                gr1 = "0" + gr;
//            }else {
//                gr1 = "" + gr;
//            }

            return kg + " кг " + gr + " гр";
        }

        return "Error";
    }

    //13.Написать метод, который принимает на вход необходимые параметры, и печатает чек. Этот метод тестировать не нужно,
    // но необходимо использовать все раннее написанные методы (в задачах из Part 1 тоже могут пригодиться некоторые методы)

//    public static void receipt(String item, String units, double price, double amount){
//        if (item == null || units == null || price <= 0 || amount <=0){
//            System.out.println("Error");
//        } else {
//            System.out.println("\n" + item);
//            System.out.println("Цена за 1" + units + "\t\t\t" + toRubKop(price));
//
//            if (units.equalsIgnoreCase("кг")){
//                System.out.println("Количество товара\t\t" + tokgG(amount));
//            } else {
//                System.out.println("Количество товара\t\t" + (int) amount + " шт");
//            }
//            System.out.println("______________________________________");
//            System.out.println("Сумма к оплате\t\t\t" + toRubKop(price + amount));
//            }
//        }

    //14.Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
    // Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
    public static int happyInt(int birthdayDate) {
        int number = birthdayDate;
        int stepDigit = 9;
        if (birthdayDate > 0) {
            while (number > stepDigit) {
                number = sumNumberDigits(number);
            }

            return (sumNumberDigits(number));
        }

        return (-1);
    }

    public static int sumNumberDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        return sum;
    }

    //15.
    // а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
    //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
    //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
    //b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
    //*Медиана - это серединное число в отсортированном наборе чисел.
    //1, 3, 9 → медиана 3
    //12, 13, 101 → медиана 13
    //14, 2, 12 → медиана 12
    //ВСе параметры приходят в int, расчеты производим в int
    //Протестировать оба метода - a) и b)

    public static String median(int a1, int b2, int c3, int median1) {
        if (((a1 + b2 + c3) / 3 - median1) > 2) {

            return "Среднее значение " + (a1 + b2 + c3) / 3 + " отличается от медианы "
                    + median1 + " на" + ((a1 + b2 + c3) / 3 - median1) + ".";
        }

        return "Среднее значение = " + (a1 + b2 + c3) / 3 + ", медиана = " + median1 + ".";
    }

    //16.Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
    // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.

    public static String countTotalToPlay(double price) {
        if (price >= 0) {
            String totalToPay = convertNumber(Math.floor(price));

            return totalToPay;
        }

        return "Error";
    }

    //19.Написать метод, который с помощью методов класса Math высчитывает случайно сгенерированную степень сгенерированного случайного числа. Метод возвращает значение и выводит на экран: “Число … в степени … = …”
    //Число может быть в пределах от 0 до 1 исключительно.
    //Степень числа может быть от 0 до 10 включительно

    public static double findRandomNumber() {
        double a = Math.random();
        double n = (int) (Math.random() * 11);
        double randomNumber = Math.pow(a, n);
        System.out.println("Число " + a + " в степени " + n + " = " + randomNumber);

        return randomNumber;
    }

    //20.Написать метод, который возвращает целочисленное случайное число в пределах от 1 до 99 включительно.
    // Затем написать метод, который возвращает случайное число в пределах от -1 до -99 включительно

    public static long yRandomPos() {
        long y = (int) (Math.random() * 99) + 1;

        return y;
    }

    public static long zRandomPos() {
        long z = (int) (Math.random() * 99) - 99;

        return z;
    }


    //____________________________________________________________________________________________________________
    public static void main(String[] args) {

        //1.
        printTask();
        System.out.println(verifyEquals(5, 5));

        //2.
        //System.out.println(returnDay(8));

        //4.
//        findMinOfTwo(3, 30);
//        findMinOfTree(3, 30, 300);
//        findMinOfFour(3, 30, 300, 3000);
        //5.

//        System.out.println(temCat(39.00, 39.00, 39.00, 39.00, 39.00));

        //7.
//        System.out.println(expectTotal(25.50,5));
        //8.
        //System.out.println(returnPayrollEmployee("Смирнова Мария Ивановна", 70000.00 ));

        //11.

        //19.
//        System.out.println(findRandomNumber());

        //20.
//        System.out.println(yRandomPos());
//        System.out.println(zRandomPos());

//__________________________________________________________________________________________
        //Auto Test

        //TC_1*******
        printTask();

        //arrange
        int number = 8;
        String expectedResultString = "Error";


        //act
        String actualResultString = returnDay(number);


        //assert
        verifyEquals(expectedResultString, actualResultString);


        //report
        printTest();
        printTestResult(verifyEquals(expectedResultString, actualResultString));
//________________________________________________________________________________________

        //TC_2.1*******
        printTask();

        //arrange
        int age1 = 20;
        int age2 = 40;
        int age3 = 60;
        int expectedResult2_1 = 40;

        //act
        int actualResult2_1 = ageAverage(age1, age2, age3);


        //assert
        verifyEquals(expectedResult2_1, actualResult2_1);


        //report
        printTest();
        printTestResult(verifyEquals(expectedResult2_1, actualResult2_1));
//________________________________________________________________________________________

        //TC_2.2*******

        //arrange
        age1 = -5;
        age2 = -30;
        age3 = -3;
        int expectedResult2_2 = Integer.MIN_VALUE;

        //act
        int actualResult2_2 = ageAverage(age1, age2, age3);


        //assert
        verifyEquals(expectedResult2_2, actualResult2_2);


        //report
        printTest();
        printTestResult(verifyEquals(expectedResult2_2, actualResult2_2));
//________________________________________________________________________________________

        //TC_4.1*******
        printTask();
        //arrange
        int k = 3;
        int l = 30;
        int m = 300;
        int n = 3000;
        double expectedResult = 3;

        //act
        double actualResult = findMinOfTree(k, l, m);


        //assert
        verifyEquals(expectedResult, actualResult);


        //report
        printTest();
        printTestResult(verifyEquals(expectedResult, actualResult));

//________________________________________________________________________________________

        //TC_4.2*******
        //arrange
        k = 3;
        l = 30;
        m = 300;
        n = 3000;
        expectedResult = 3;

        //act
        actualResult = findMinOfTwo(k, l);


        //assert
        verifyEquals(expectedResult, actualResult);


        //report
        printTest();
        printTestResult(verifyEquals(expectedResult, actualResult));
//________________________________________________________________________________________

        //TC_4.3*******
        //arrange
        k = 3;
        l = 30;
        m = 300;
        n = 3000;
        expectedResult = 3;

        //act
        actualResult = findMinOfFour(k, l, m, n);


        //assert
        verifyEquals(expectedResult, actualResult);


        //report
        printTest();
        printTestResult(verifyEquals(expectedResult, actualResult));
//________________________________________________________________________________________

        //TC_5.1*******
        printTask();

        //arrange

        double a = 39.00;
        double b = 39.00;
        double c = 39.00;
        double d = 39.00;
        double e = 39.00;
        expectedResult = 39.00;

        //act
        actualResult = temCat(a, b, c, d, e);

        //assert
        verifyEquals(expectedResult, actualResult);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult, actualResult));
//________________________________________________________________________________________

        //TC_5.2*******

        //arrange
        a = 24.00;
        b = 39.00;
        c = 39.00;
        d = 39.00;
        e = 39.00;
        expectedResult = -1;

        //act
        actualResult = temCat(a, b, c, d, e);

        //assert
        verifyEquals(expectedResult, actualResult);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult, actualResult));
//________________________________________________________________________________________

        //TC_6.1*******
        printTask();

        //arrange

        int hour = 9;
        int price = 12;
        int expectedResult6 = 2268;

        //act
        int actualResult6 = salary(hour, price);

        //assert
        verifyEquals(expectedResult6, actualResult6);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult6, actualResult6));
//________________________________________________________________________________________

        //TC_6.2*******

        //arrange
        hour = 9;
        price = 10;
        expectedResult6 = -1;

        //act
        actualResult6 = salary(hour, price);

        //assert
        verifyEquals(expectedResult6, actualResult6);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult6, actualResult6));
//________________________________________________________________________________________

        //TC_7.1*******
        printTask();

        //arrange
        double priceFor1 = 25.5;
        int amount = 5;
        expectedResult = 127.5;

        //act
        actualResult = expectTotal(priceFor1, amount);

        //assert
        verifyEquals(expectedResult, actualResult);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult, actualResult));
//________________________________________________________________________________________

        //TC_7.2*******
        printTask();

        //arrange
        priceFor1 = 25.5;
        amount = 0;
        expectedResult = -1;

        //act
        actualResult = expectTotal(priceFor1, amount);

        //assert
        verifyEquals(expectedResult, actualResult);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult, actualResult));
//_______________________________________________________________________________________
        //9.
        printTask();
        System.out.println((returnDoubleNameAndSurname("Смирнова Мария Ивановна", 70000.00,
                "Себров Иван Петрович", 128059.00)));
//________________________________________________________________________________________

        //10.1
        printTask();

        //arrange
        int x = 5;
        String expectedResult10_1 = "x is positive";

        //act
        String actualResult10_1 = checkIfNumberPositiveOrNegativeOrZero(x);

        //assert
        verifyEquals(expectedResult10_1, actualResult10_1);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult10_1, actualResult10_1));
//________________________________________________________________________________________

        //10.2

        //arrange
        x = -5;
        expectedResult10_1 = "x is negative";

        //act
        actualResult10_1 = checkIfNumberPositiveOrNegativeOrZero(x);

        //assert
        verifyEquals(expectedResult10_1, actualResult10_1);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult10_1, actualResult10_1));
        //________________________________________________________________________________________

        //10.3

        //arrange
        x = 0;
        expectedResult10_1 = "x is zero";

        //act
        actualResult10_1 = checkIfNumberPositiveOrNegativeOrZero(x);

        //assert
        verifyEquals(expectedResult10_1, actualResult10_1);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult10_1, actualResult10_1));
//________________________________________________________________________________________

        //TC_8.1*******
        printTask();

        //arrange
        String nameEmployee = "Смирнова Мария Ивановна";
        double payrollEmployee = 70000.00;
        String expectedResult8 = "Смирнова Мария Ивановна\t70000 руб 0 коп";

        //act
        String actualResult8 = returnPayrollEmployee(nameEmployee, payrollEmployee);

        //assert
        verifyEquals(expectedResult8, actualResult8);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult8, actualResult8));

//________________________________________________________________________________________

        //TC_8.2*******

        //arrange
        nameEmployee = "";
        payrollEmployee = 70000.00;
        expectedResult8 = "";

        //act
        actualResult8 = returnPayrollEmployee(nameEmployee, payrollEmployee);

        //assert
        verifyEquals(expectedResult8, actualResult8);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult8, actualResult8));
//________________________________________________________________________________________

        //TC_8.3*******

        //arrange
        nameEmployee = "Смирнова Мария Ивановна";
        payrollEmployee = 00.00;
        expectedResult8 = "";

        //act
        actualResult8 = returnPayrollEmployee(nameEmployee, payrollEmployee);

        //assert
        verifyEquals(expectedResult8, actualResult8);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult8, actualResult8));
//________________________________________________________________________________________

        //TC_8.4*******

        //arrange
        nameEmployee = null;
        payrollEmployee = 4456.54333;
        expectedResult8 = "";

        //act
        actualResult8 = returnPayrollEmployee(nameEmployee, payrollEmployee);

        //assert
        verifyEquals(expectedResult8, actualResult8);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult8, actualResult8));

//________________________________________________________________________________________

        //TC_11.1*******

        printTask();
        //arrange
        double priceTC = 10.75;
        String priceStringTC = "10 rub 75 cop";
        expectedResultString = priceStringTC;

        //act
        actualResultString = getPrice(priceTC);

        //assert
        verifyEquals(expectedResultString, actualResultString);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        //________________________________________________________________________________________

//        //TC_11.2*******
//
//        //arrange
//        priceTC = -10.75;
//        priceStringTC = -1;
//        expectedResultString = priceStringTC;
//
//        //act
//        actualResultString = getPrice(priceTC);
//
//        //assert
//        verifyEquals(expectedResultString, actualResultString);
//
//        //report
//        printTest();
//        printTestResult(verifyEquals(expectedResultString, actualResultString));
//________________________________________________________________________________________

        //TC_12.1*******

        printTask();
        //arrange
        double weight = 10.005;
        expectedResultString = "10 кг 5 гр";

        //act
        actualResultString = convertNumber(weight);

        //assert
        verifyEquals(expectedResultString, actualResultString);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResultString, actualResultString));
//________________________________________________________________________________________

        //TC_12.2*******

        //arrange
        weight = -3.75;
        expectedResultString = "Error";

        //act
        actualResultString = convertNumber(weight);

        //assert
        verifyEquals(expectedResultString, actualResultString);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResultString, actualResultString));
//________________________________________________________________________________________

//        //TC_13*******
//
//        printTask();
//        //arrange
//        weight = 0;
//        expectedResultString = "Error";
//
//        //act
//        actualResultString = toKgG(weight);
//
//        //assert
//        verifyEquals(expectedResultString, actualResultString);
//
//        //report
//        printTest();
//        printTestResult(verifyEquals(expectedResultString, actualResultString));
//________________________________________________________________________________________

        //TC_14.1*******

        printTask();
        //arrange
        int burthdayDate = 1999;
        int expectedResult14 = 1;

        //act
        int actualResult14 = happyInt(burthdayDate);

        //assert
        verifyEquals(expectedResult14, actualResult14);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult14, actualResult14));
        System.out.println("Год рождения " + burthdayDate + "\n"
                + "Счастливое число " + sumNumberDigits(expectedResult14));
//________________________________________________________________________________________

        //TC_14.2*******

        //arrange
        burthdayDate = -50;
        expectedResult14 = -1;

        //act
        actualResult14 = happyInt(burthdayDate);

        //assert
        verifyEquals(expectedResult14, actualResult14);

        //report
        printTest();
        printTestResult(verifyEquals(expectedResult14, actualResult14));
//________________________________________________________________________________________

        //TC_15.1*******

//        //arrange
//        int a1 = 1;
//        int b2 = 2;
//        int c3 = 3;
//        int median1 = 4;
//        String expectedResult = "Среднее значение = 2, медиана = 4";
////
////        //act
//        double actualResult = median(a1, b2, c3, median1);
////
////        //assert
//        verifyEquals(expectedResult, actualResult);
////
////        //report
//        printTest();
//        printTestResult(verifyEquals(expectedResult, actualResult));
//        System.out.println(median(a1, b2, c3, median1));
    }
}

