package mahfuz;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Section: ");
        String section = input.nextLine();

        Info info = new Info();
        Hobby hobby = new Hobby();

        System.out.println("\nSection: " + section + " \n" + "Name: " + info.name + " \n" + "ID: " + info.id + " \n"
                + "Hobby: " + hobby.hobbyName);
    }
}

    /*
        Name: Mahfuzur Rahman Chowdhury
        ID: 2012020117
        Section: C
        Email: cse_2012020117@lus.ac.bd
        Date: 14th July, 2021
    */