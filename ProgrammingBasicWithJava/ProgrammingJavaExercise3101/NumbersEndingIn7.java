package ProgrammingBasic2021.TasksFromExercise.ProgrammingJavaJan2021Ex3101;

public class NumbersEndingIn7 {
    public static void main(String[] args) {

        int i = 7;

        for (; i <= 997; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
