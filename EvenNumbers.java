package dowhile;

public class EvenNumbers {
    public static void main(String[] args) {
        int a=0;
        System.out.println("Even Numbers");
        do {
            if (a % 2 == 0) {
                System.out.println(a);
            }
           a++;
        } while (a<20);
    }

}
