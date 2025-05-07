import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Números: ");
        int n = sc.nextInt();

        int[] v = new int[n];

        for(int i=0; i<v.length; i++){
            System.out.print("Digite um número: ");
            v[i] = sc.nextInt();
        }


        System.out.println("NÚMERO NEGATIVOS: ");
        for(int i =0; i<v.length; i++){
            if (v[i] < 0){
                System.out.println(v[i]);
            }
        }

        sc.close();
    }
}
