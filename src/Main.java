public class Main {
    public static void main(String[] args) {
        long balance = 100;
        long replenishment = 1200;
        long total;
        if (replenishment >= 1000) {
            long bonus = 100;
            long finalBonuses = replenishment / bonus;
            System.out.println(finalBonuses);
            total = balance + replenishment + finalBonuses;
            System.out.println(total);
        } else {
            total = balance + replenishment;
            System.out.println(total);
        }
    }
}
