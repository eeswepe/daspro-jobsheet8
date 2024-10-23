import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Masukkan nilai N (minimal 3, 0 untuk berhenti): ");
            int n = input.nextInt();
            if(n==0){
                System.out.println("Program berhenti.");
                break;
            }else if(n < 3){
                System.out.println("Input tidak valid, ulangi kembali.");
                input.nextLine();
                continue;
            }
            
            for (int i = 0; i < n; i++) {
                if(i == 0 || i == n-1){
                    for (int j = 0; j < n; j++) {
                        System.out.print(n);
                    }
                }else{
                    System.out.print(n);
                    for (int j = 0; j < n-2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print(n);
                }
                System.out.println();
            }
        }
    }
    
}