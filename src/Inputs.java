import java.util.Scanner;

public class Inputs {
    public void bevitel(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Szám1: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Szám2: ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Név: ");
        String name = sc.nextLine();
        System.out.println("Szia "+name+ "\nA számaid: "+num1+", "+num2);
        sc.close();
    }
}
