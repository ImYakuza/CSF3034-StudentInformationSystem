package studentinformationsystem;
import java.util.Scanner;
public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int mark1, mark2, Total;
        
        System.out.println("Name : AHMAD IRHAM AL-HARIDHI BIN ZAIDI");
        System.out.println("Student ID : S88478");
        
        System.out.print("Enter first test mark (0-50): ");
        mark1 = input.nextInt();
        
        System.out.print("Enter second test mark (0-50): ");
        mark2 = input.nextInt();
        
        Total = mark1 + mark2;
        
        System.out.println("Your total mark is : " +Total);
        
        if (Total <= 100  && Total >= 80) {
            System.out.println("Exelent");
        }
        else if (Total < 80  && Total >= 60) {
            System.out.println("Good");
        }
        else if (Total < 60  && Total >= 40) {
            System.out.println("Okay");
        }
        else if (Total < 40  && Total >= 20) {
            System.out.println("Need improvement");
        }
        else if (Total < 20  && Total >= 0) {
            System.out.println("Do better");
        }
    } 
}
