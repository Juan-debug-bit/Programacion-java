package ExamExtra.Ejercicios_Bucles;

public class Beta2 {
    public static void main(String[] args) {
        int sum = 0, mult = 1;
        for (int i = 1; i <=10; i++) {
            sum = sum + i;
            mult = mult *i;
        }
        System.out.println(sum);
        System.out.println(mult);
    }
}
