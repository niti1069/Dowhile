package dowhile;

public class OddNumbers {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Odd Numbers");
        do {
            if (a % 2 == 1){
                System.out.println(a);
            }
            a++;
        } while (a < 20);
    }
}
