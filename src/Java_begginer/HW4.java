package Java_begginer;

public class HW4 {
    static int numberTask = 2;

    public static void printTask() {
        System.out.println("************************* Task № " + numberTask + " *************************");
        numberTask++;
    }

    //8**
    static int x;

    public static void checkNumber(int x) {
        if (x > 10) {
            System.out.println(x + " -больше 10");
        } else if (x < 0) {
            System.out.println(x + " -отрицательное число");
        } else if (x == 5) {
            System.out.println("Разность " + x + " и 5 равна 0");
        } else {
            System.out.println("Число " + x + " меньше 11, больше или равно 0, но не равно 5");
        }
    }

    //14**
    static int k = 10;
    static int l = 2;
    static int m = 5;

    public static void divideNumbers(int k, int l, int m) {
        if (k != 0 && l != 0 && m != 0) {
            System.out.println("Результат деления k на l = " + k / l + ", а остаток от деления = " + k % l + "\n"
                    + "Результат деления k на m = " + k / m + ", а остаток от деления  = " + k % m + "\n"
                    + "Результат деления l на m = " + l / m + ", а остаток от деления  = " + l % m + "\n"
                    + "Результат деления m на k = " + m / k + ", а остаток от деления  = " + m % k + "\n");
        } else {
            System.out.println("Одно из чисел равно 0. Введите положительные числа от 0.");
        }
    }

    //16**
    static double speed;

    private static void speedAverage(int distance, int timeMinuts) {
        speed = (((double) distance / (double) timeMinuts) * 60);
        System.out.printf("Если тело преодолело %d км. за %d мин., то его средняя скорость была равна %.2f км/ч.\n", distance, timeMinuts, speed);
    }


    //17**
    //7.
    int apple = 40;
    int student = 6;
    int studentTh = student++;
    int oneApple = apple / studentTh;

    private static void takeApple(int apple, int student, int oneApple) {
        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по " + oneApple + " яблок(a), и " + oneApple + " яблок(а) останется учителю.");
    }

    //8.
    int apple1 = 100;
    int student1 = 21;
    int studentTh1 = student1++;
    int oneApple1 = apple1 / studentTh1;

    public static void takeApple2(int apple1, int student1, int oneApple1) {
        System.out.println("Если " + apple1 + " яблок поделить на " + student1 + " учеников, то каждый ученик получит по " + oneApple1 + " яблок(a), и " + oneApple1 + " яблок(а) останется учителю.");
    }

    //19**
    public static void countDigits(short num) {
        if (num / 100000 == 0) {
            System.out.println(num + " is five-digit number");
        } else if (num / 10000 == 0) {
            System.out.println(num + " is five-digit number");
        } else if (num / 1000 == 0) {
            System.out.println(num + " is five-digit number");
        } else if (num / 100 == 0) {
            System.out.println(num + " is five-digit number");
        } else if (num / 10 == 0) {
            System.out.println(num + " is five-digit number");
        }
    }


    //______________________________________________________________________________________
    public static void main(String[] args) {
        printTask();

        //2. Написать метод, который будет печатать номер задания перед каждым ответом. Придумайте свой дизайн.
        printTask();
//      printTask("*************** Task № " + taskNumber++ + "********************");

        //3. Записать в виде кода следующие логические выражения
        printTask();
//        System.out.println((2==2)&&(7==7));
//        System.out.println(!(15<3));
//        System.out.println(("Сосна".equals("Дуб"))||("Вишня".equals("Клен")));
//        System.out.println(!("Cосна".equals("Дуб")));
//        System.out.println((!(15<3))&&(10>20));
////        System.out.println(("Глаза даны, чтобы видеть") && ("Под третьим этажом находится второй этаж"));
//        System.out.println((6/2==3)||(7*5==20));

//    //4. Записать в виде кода следующие выражения
        printTask();
//    //а) Света младше Андрея и Наташи
//        int ageS = 17;
//        int ageA = 18;
//        int ageN = 19;
//        System.out.println((ageS < ageA) && (ageS < ageN));
//    //б) На полке стоят учебники, а на столе лежат справочники.
//        String book1 = "На полке стоят учебники";
//        String book2 = "На соле лежат справочники";
//        System.out.println((book1 == book1) && (book2 == book2));
//    //в) БОльшая часть детей — девочки. Остальные - мальчики.
//        int gils = 10;
//        int boys = 5;
//        if (gils > boys) {
//            System.out.println("Большая часть детей - девочки. Остальные - мальчики");}

        //5.“Водительские права можно получить, только когда исполнится 16 лет.”
        printTask();
//        int age1 = 20;
//        int age = 16;
//        if (age1 >= age) {
//            System.out.println("Можно получить водительские права");
//        } else {
//            System.out.println("Тебе меньше 16 лет");
//        }

        //6. "Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно"
        printTask();
//        String namePethaBus = "Петя не едет в автобусе, ";
//        String namePethaBook = "Но при этом читает книгу";
//        String namePethaCinema = "или смотрит в окно";
//        System.out.println(namePethaBus && namePethaBook || namePethaCinema);

        //7. Записать выражения в виде условий if-else:
        printTask();
//        String you = "с другом";
//        if (you.equals("с другом")){
//            System.out.println("Если с другом ты, это хорошо");
//        } else {
//            System.out.println("Если без друга ты, это плохо");
//        }

        //8. Проверить число x, которое может принимать значения 10, 12, -3, 5 и 0.
        //Если x больше 10, то вывести на печать “x больше 10”.
        //Если x меньше нуля, то вывести на печать “x - отрицательное число”
        //Если x = 5, то вывести на печать “Разность x и 5 равна 0”
        //Иначе вывести на печать “Число x меньше 11, больше или равно 0, но не равно 5”.
        // Проверить, соответствует ли последнее утверждение всем предыдущим утверждениям.
        printTask();

        checkNumber(10);
        checkNumber(12);
        checkNumber(-3);
        checkNumber(5);
        checkNumber(0);


        //9.  Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        // Выведите результат работы алгоритма на печать.Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
        printTask();
//        int a = 11;
//        if (a % 2 == 0) {
//            System.out.println(a * 2);
//        } else {
//            System.out.println(a * a);
//        }

        //10. Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        //Голосовать можно с 18 лет
        //Машину можно водить с 16 лет
        //В школу можно идти с 5 лет
        printTask();
//        int agePerson = 40;
//        if (agePerson <= 150 && agePerson >= 0) {
//            if (agePerson >= 18) {
//                System.out.println("Голосовать можно с 18 лет");
//            } else {
//                System.out.println("Голосовать нельзя");
//            }
//            if (agePerson >= 16) {
//                System.out.println("Машину можно водить с 16 лет");
//            } else {
//                System.out.println("Машину водить нельзя");
//            }
//            if (agePerson >= 5) {
//                System.out.println("В школу можно идти с 5 лет");
//            } else {
//                System.out.println("В школу идти нельзя");
//            }
//        } else {
//            System.out.println("Please enter correct number");
//        }

        //11. Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
        //5 - выдать похвальную грамоту и перевести в следующий класс
        //4 - перевести в следующий класс
        //3 - дать задание на лето и перевести в следующий класс
        //2 - вызвать родителей и оставить в текущем классе на второй год
        //Выведите результат работы алгоритма на печать.
        printTask();
//        int studentGrade = 4;
//        if (studentGrade > 2 || studentGrade >= 6) {
//            if (studentGrade == 5) {
//                System.out.println("Выдать похвальную грамоту и перевести в следующий класс");
//            } else if (studentGrade == 4) {
//                System.out.println("Перевести в следующий класс");
//            } else if (studentGrade == 3) {
//                System.out.println("Дать задание на лето и перевести в следующий класс");
//            } else if (studentGrade == 2) {
//                System.out.println("Вызвать родителей и оставить в текущем классе на второй год");
//            }
//        } else {
//            System.out.println("Введите правильную отметку");
//        }


        //Part 2. 12.Напишите метод, который примет на вход температуру в Цельсиях,
        // и распечатает результат температуры в Цельсиях и в Фаренгейтах.
        printTask();
//        public static void convertTemp(int c){
//            int f = (c + 9/5 + 32);
//            System.out.println("C= " + c);
//            System.out.println("F= " + f);
//        }

        //13. Напишите алгоритм программы, которая проверяет 2 числа.
        // Программа складывает числа, которые делятся на 3 без остатка, и вычитает числа,
        // которые делятся на 5 без остатка. ПРограмма выводит на печать результат вычислений.
        printTask();

//        int number1 = 11;
//        int number2 = 17;
//        int result = number1 * number2;
//        if (((number1 % 3 == 0 && number2 % 3 == 0) || (number1 % 5 == 0) && (number2 % 5 == 0))
//                || ((number1 % 2 == 0) && (number2 % 2 == 0))) {
//            if ((number1 % 3 == 0) && (number2 % 3 == 0)) {
//                int sum = number1 + number2;
//                System.out.println(sum);
//            }
//            if (number1 % 5 == 0 && number2 % 5 == 0) {
//                int sub = number1 - number2;
//                System.out.println(sub);
//            }
//            if ((number1 % 2 == 0 && number2 % 2 == 0)) {
//                int prod = number1 * number2;
//                if ((number1 < 0 || number2 < 0)) {
//                    prod = prod * (-1);
//                }
//                System.out.println(prod);
//            }
//        } else {
//            System.out.println("Невозможно произвести действия");
//        }

        //14.Распечатать следующие выражения, используя метод и параметры k, l, m:
        //Результат деления k на l = …, а остаток от деления  = …
        //Результат деления k на m = …, а остаток от деления  = …
        //Результат деления l на m = …, а остаток от деления  = …
        //Результат деления m на k = …, а остаток от деления  = …
        printTask();

        divideNumbers(10, 2, 5);

        //15. Решить задачу
        //В клетке находятся фазаны и кролики. Известно, что у них 35 голов и 94 ноги.
        // Узнайте число фазанов и число кроликов.
        printTask();
//        int rabbits, fazans;
//        int heads = 35;
//        int legs = 94;
//        int twoLegs = heads * 2;
//        int rabbitsLegs = legs - twoLegs;
//        rabbits = rabbitsLegs / 2;
//        fazans = heads - rabbits;
//        System.out.println("Rabbits = " + rabbits + " Fazans = " + fazans);
//        System.out.println("\nUnit Test");
//        //Test
//        int expectedRabbits = 10;
//        int expectedFazans = 25;
//        int actualRabbits = rabbits;
//        int actualFazans = fazans;
//
//        if (actualRabbits == expectedRabbits && actualFazans == expectedFazans) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }
//        System.out.println();

//16. Написать метод, который рассчитывает среднюю скорость движения (speedAverage) транспортного средства или живого существа с разными параметрами distance и  time.
//Протестировать метод.
//Тестовые данные:
//distance		time
//12			20 min
//150		2,5 hours
//300		1¾ hours
        printTask();

//        int distanceInput = 300;
//        int timeInput = 100;
//
//        speedAverage(distanceInput, timeInput);
//
//        //Test
//        int expectedDistance = 300;
//        int expectedTime = 100;
//        int expectedSpeed = 180;
//        int actualDistance = distanceInput;
//        int actualTime = timeInput;
//        double actualSpeed = speed;
//        if (expectedDistance == actualDistance && expectedTime == actualTime && expectedSpeed == actualSpeed) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }


        //17. Выполнить задание 7 и 8 из HW2 с помощью метода и параметров:
        printTask();
        //(7)
        takeApple(40, 7, 6);
//        //(8)
        takeApple2(100, 22, 4);

        //19. Напишите алгоритм программы, которая проверяет число типа short на количество разрядов, и выводит результат проверки.
        printTask();

        countDigits((short) 60000);
    }
}

