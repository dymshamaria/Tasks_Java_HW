package Java_begginer;

public class Lesson6 {
    public static void main(String[] args) {

//        for(; ;){
//
//        }

        //Печатаем "Java for begginers" для всех чисел от 1 до 5 включительно

//        for(int i=1; i < 6; i++){
//
//            System.out.println("Java for begginers");
//        }

        //Печатаем числа от 1 до 5 включительно

//        for (int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }

        //Печатаем все числа от 5 до 1 включительно

//        for (int i=5; i >= 1; i-=1){
//            System.out.println(i);
//        }

        //Печатаем только нечетные числа от 1 до 10 включительно

//        for(int i = 1; i<=10; i+=2){
//            System.out.println(i);
//        }

        //Печатаем только нечетные числа от -1 до -10 включительно

//        for(int i = -1; i>=-10; i-=2){
//            System.out.println(i);
//        }


        //Печатаем только нечетные числа от 1 до 100 включительно с шагом 10

//        for (int i=1; i<=100; i+=10){
//            System.out.println(i);
//        }

        //Печатаем все числа в промежутке от 0 до 100 включительно, кратные 15

        for (int i = 0; i <= 100; i += 15) {
            System.out.println(i);
        }

        //Печатаем все числа в промежутке от -100 до 100 исключительно, кратные 50

        for (int i = -50; i < 100; i += 50) {
            System.out.println(i);
        }

        //Печатаем все буквы от русской "а" до русской "я" включительно

//        char Character
        char letter = 'я';
        System.out.println((int) letter);

        for (char i = 'a'; i <= 'я'; i++) {
            System.out.println(i);
        }

    }
}