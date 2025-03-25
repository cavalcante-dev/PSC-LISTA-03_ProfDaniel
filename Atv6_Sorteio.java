import java.util.Random;
import java.util.Scanner;

public class Atv6_Sorteio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random sorteio = new Random();
        int sorteio1, sorteio2, menorNum, maiorNum;

        System.out.println("Digite o intervalo de números a serem sorteados: ");
        sorteio1 = sc.nextInt();
        sorteio2 = sc.nextInt();

        menorNum = Math.min(sorteio1, sorteio2);        
        maiorNum = Math.max(sorteio1, sorteio2); 

        int sorteado = sorteio.nextInt(menorNum, maiorNum);
        
        if (sorteado % 2 == 0) {
            System.out.println("O número sorteado foi: " + sorteado + " (Número Par)");
        } else {
            System.out.println("O número sorteado foi: " + sorteado + " (Número Ímpar)");
        }
        sc.close();
    }
}