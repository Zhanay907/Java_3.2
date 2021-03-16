public class Main {
    public static void main(String[] args) {
        int initial = 500;
        int addition = 1100;
        int bonus = addition / 100;
        if (addition <= 1000) {
            bonus = 0;
        }
        System.out.println(bonus);


        int total = initial + addition;
        System.out.println(total);
    }
}
