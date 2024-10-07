import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the Salary");
       int Salary = input.nextInt();
       if(Salary > 100000){
        Salary = Salary + 2000;
       }
       else if(Salary >150000 & Salary < 20000){
        Salary += 30000;
       }
       else{
        Salary = Salary + 1000;
       }
       System.out.println("Revised Salary:"+Salary);
       input.close();

    }
    
}
