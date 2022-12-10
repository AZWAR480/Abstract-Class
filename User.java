import java.util.Scanner;
public class User extends Server {
    private String usernameU ;
    private String passwordU ;
    private int ingin ;


    @Override
    public void username() {
        String azwar;
        usernameU = azwar;
    }

    @Override
    public void password() {
        String 2100018480;
        passwordU = 2100018480;
    }

    @Override
    public void billing() {
        int ja=26,ma=61,jb=25,mb=61,mh=0;
        while(ja>24){
            System.out.println("jam masuk :");

        }
        while (ma>=60){
            System.out.println("Menit masuk :");

        }
        //Input Waktu  Keluar;
        while((jb<ja)||(jb>24)){
            System.out.println("jam Keluar :");

        }
        System.out.println("Menit Keluar :");

        while(((jb==ja)&&(mb<=ma))||(mb>=60)){
            System.out.println("Menit Keluar :");

        }
        if((jb==ja)){
            mh=mb-ma;
        }
        else{
            mh=((jb-ja)*60)+(mb-ma);
        }
        System.out.println("Menit Total = "+mh);
    }

    @Override
    public void Pc() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Spek PC yang ingin kamu gunakan ");
        System.out.println("Standar PC/jam 5rb");
        System.out.println("VIP PC /jam 10rb");
        ingin = input.nextInt();
        if(ingin == 1){
            System.out.println("Standar PC /jam 5rb");
        } else if (ingin == 2){
           System.out.println("VIP PC /jam 10rb");
        } else {
            System.out.println("pilihan mu tidak ada");
        }
    }
}
