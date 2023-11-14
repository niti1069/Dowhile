package dowhile;

public class TablesOfNine {
    public static void main(String[] args) {
        // Nine times table
        int inc = 1;
        System.out.println("Tables of Nine");
        do {
            int result = 9 * inc;
            System.out.println(result);
            inc++;
        } while (inc <= 10);
    }
}
