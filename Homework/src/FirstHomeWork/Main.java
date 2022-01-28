package FirstHomeWork;

public class Main {
    //1.ცვლადები
    public static void main(String[] args) {
        String name = "Hello Nino";
        int num = 1993;
        float newFloatNum = 7.55f;
        char newLetter = 'N';
        boolean newBool = true;
        System.out.println("");

        //2.მათემატიკური ოპერატორები 2 მაგალითი
        int num_1 = 5;
        int num_2 = 8;
        int num_3 = 2;
        int sum = num_1 + num_2 + num_3;
        System.out.println(sum);

        int num_4 = 20;
        int num_5 = 11;
        int num_6 = ++num_4;
        System.out.println(num_4 + num_5 + num_6);

        //3.ლოგიკური ოპერატორები
        int x = 10;
        x -= 2;
        System.out.println(x + "-----------");

        int y = 15;
        y /= 5;
        System.out.println(y);

        boolean bol_xy = x > 1 || y < 2;
        System.out.println(bol_xy + "-------");

        //4. დაბადების წელი
        String yr1993 = "date of birth";
        String yr28 = "year";
        int currentYear = 2022;
        int birthYear = 1993;
        int age = currentYear - birthYear;
        System.out.println(age);
        
    }
}
