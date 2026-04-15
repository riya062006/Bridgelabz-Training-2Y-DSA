import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();
        }

        for (int age : ages) {
            if (age < 0)
                System.out.println("Invalid age");
            else if (age >= 18)
                System.out.println("Age " + age + " can vote");
            else
                System.out.println("Age " + age + " cannot vote");
        }
    }
}