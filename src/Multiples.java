public class Multiples {
    public static void main(String[] args) {
        int total = 0;
        int total3 = 0;
        int total5 = 0;
        int i = 1;
        while (i <= 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 || divisibleBy5) {
                total += 1;
            }
            if (divisibleBy3){
                total3 += 1;
            }
            if (divisibleBy5){
                total5 += 1;
            }
            i += 1;
        }
        System.out.println("There are " + total + " multiples of 3 or 5.");
        System.out.println("There are " + total3 + " multiples of 3.");
        System.out.println("There are " + total5 + " multiples of 5.");
    }
}
