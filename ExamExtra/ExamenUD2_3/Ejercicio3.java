package ExamExtra.ExamenUD2_3;

public class Ejercicio3 {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        System.out.print("Secuencia de fibonacci: ");
        for (int i = 1; i <= 60; i++) {
            System.out.print(a + ", ");

            long sum = a + b;
            a = b;
            b = sum;
        }
    }
}
