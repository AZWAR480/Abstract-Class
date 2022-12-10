import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        User u = new User ();
    Scanner input = new Scanner(System.in);

    int mau;
    while (true){

        System.out.println("==Selamat Datang di Warnet kami ===");
        System.out.println("[1] PC");
        System.out.println("[2] Billing");
        System.out.println("[3] Keluar");
        System.out.println("===================================");
        System.out.println("Pilih ");
        mau = input.nextInt();
        if (mau == 1 ){
            u.Pc();
        } else if (mau == 2) {
            u.billing();
        } else if (mau == 3) {
            System.exit(0);
        } else {
            System.out.println("salah milih bang?");
        }

    }
    }
}