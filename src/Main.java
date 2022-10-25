import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("jak masz na imie?");
        String name=sc.next();
        System.out.println("jak masz na nazwisko?");
        String lastname=sc.next();
        System.out.println("W jakiej miejscowości mieszkasz?");
        String town=sc.next();
        System.out.println("ile masz lat");
        int age=sc.nextInt();
        if (age <18) {
            System.out.println("Dowidzenia"+ name + lastname);
        } else {

                System.out.println("Witam" +name + lastname);
        }
    }
}
