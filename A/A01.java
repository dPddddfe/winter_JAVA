package A;
import java.util.Scanner;

class A01 {
    public static void main(String[] args){
        A01 stepA = new A01();
        stepA.a01();
    }

    void a01(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a birth year > ");
        int birth_year = sc.nextInt();
        int age = 2025 - birth_year + 1;

        System.out.println("You are "+age+" year's old.");
        sc.close();
    }
    
}
