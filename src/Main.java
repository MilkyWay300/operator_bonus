public class Main {

    public static void main(String[] args) {
        int check = 100;
        int sum = 1325;
        int bonus;
        if (sum > 1000) {
            bonus = sum / 100;
        } else {
            bonus = 0;
        }
        int total = check + sum + bonus;

        System.out.println("Итоговый бонус:" + bonus);
        System.out.println("Итоговый счет:" + total);
    }
}