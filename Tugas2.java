import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPoliteknik, jumlahCabor=4, atletPerCabor=5;
        String cabor="";

        System.out.print("Masukkan jumlah politeknik yang bertanding = ");
        jumlahPoliteknik = sc.nextInt();

        for(int i=0;i<jumlahPoliteknik;i++){
            System.out.println("Memasukkan data pemain politeknik ke " + (i+1));
            for(int j=0;j<jumlahCabor;j++){
                switch (j){ 
                    case 0:
                        cabor = "Badminton";
                        break;
                    case 1:
                        cabor = "Tenis meja";
                        break;
                    case 2:
                        cabor = "Baset";
                        break;
                    case 3:
                        cabor = "Bola voli";
                        break;
                }
                
                System.out.println("Memasukkan pemain untuk cabor " + cabor);

                for(int k=0;k<atletPerCabor;k++){
                    System.out.print("Masukkan nama pemain " + cabor + " ke-" + (k+1) + " = ");
                    String nama = sc.next();
                    System.out.println("--> Nama pemain ke " + (k+1) + " dari cabor " + cabor + " adalah " + nama);
                }

                System.out.println("=================================================");
            }
        }
    }    
}
