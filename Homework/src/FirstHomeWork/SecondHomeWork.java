package FirstHomeWork;

import java.util.Arrays;
import java.util.Random;

public class SecondHomeWork {

    public static void main(String[] args) {

        //დაბეჭდეთ კენტი რიცხვები 0 დან 30 ის ჩათვლით

        for (int i = 0; i <=30; i++) {
            if (i % 2 == 1) {
                System.out.println(i + "----");
            }
        }

        //დაბეჭდეთ რენდომ რიცხვები 0 დან 100მდე, სავალდებულო არ არის რომ მთელი რიცხვები იყოს
        Random randomnumber = new Random();
        for (int i = 0; i < 5; i++){
            int number = randomnumber.nextInt(100);
            System.out.println(number);
        }

        //შექმენით double ტიპის მასივი და დაითვალეთ მასივის საშუალო არითმეტიკული(საშუალო არითმეტიკული = ელემეტების ჯამი/ელემენტების რაოდენობასთან)
        double[] num_array1 = {10.3, 1.20, 3.10, 40};
        double sum = 0;
        double result = 0;
        for (int i = 0; i < num_array1.length; i++){
            sum = sum + num_array1[i];
        }
        result = sum / num_array1.length;
        System.out.println("result = " + result);


        //დაწერეთ ინტეჯერების მასივი და იპოვეთ ამ მასივში მინიმალური ელემენტი, არ გამოიყენოთ სორტირება; მეორე ArrayList გააკეთეთ ეს ამოცანა;
        int[] num = {7, 8, 87, 90, 2, 24, 1};
        int min = num[0];
        for (int i = 0; i < num.length; i++){
            if (min > num[i]){
                min = num[i];
            }
        }
        System.out.println("min = " + min);
        
    }
}
