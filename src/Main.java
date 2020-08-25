import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String memberName;
        String relation;
        int age;

        System.out.println("Full Name: ");
        memberName=input.nextLine();

        System.out.println("Relation to Cedric: ");
        relation=input.nextLine();

        System.out.println("Age: ");
        age =input.nextInt();

        System.out.println(memberName+"is Cedric's "+relation + "\nAge: "+ age);


    }
}
