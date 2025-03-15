import java.util.Scanner;

public class Atv1_Calculos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3, media;

        System.out.println("Digite 3 números: "); 
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        media = (num1 + num2 + num3) / 3;

        double maior; //Processo para descobrir o número maior. 

        //Armazena o valor de num1 ou num2 em uma variavel diferente (maior).
        if (num1 < num2) { 
            maior = num2;
        } else if (num2 < num1){
            maior = num1;
        } else {
            maior = num3;
        }
   
        //Compara o valor armazenado em maior com num3
        if (maior <= num3) {
           System.out.printf("\n O maior dos números é: %.2f", num3);
        } else {
           System.out.printf("\n O maior dos números é: %.2f", maior);
        } 

        double menor; //Processo para descobrir o número menor. 

        if (num1 > num2) { //Daria pra usar Math.min mas decidi deixar essa solução para exercitar a lógica.
         menor = num1;
        } else if (num2 > num1){
         menor = num2;
        } else {
         menor = num3;
        }
        
        if (menor >= num3) { 
            System.out.printf("\n O menor dos números é: %.2f", num3);
        } else {
            System.out.printf("\n O menor dos números é: %.2f", menor);
        }

        System.out.printf("\n A média dos números é: %.2f", media);

        sc.close();

    }

} 