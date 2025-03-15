import java.util.Scanner;

public class Atv5_Circulo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double raio;
        int indicador;

        System.out.println("Escolha um tipo de operação: \n 1 - Calcular o périmetro da círculo. \n 2 - Calcular a área do círculo. \n 3 - Calcular o volume da esfera.");
        indicador = sc.nextInt();
        System.out.println("Digite o raio do círculo ou esfera (cm):");
        raio = sc.nextDouble();

        double perimetro, area, volume;

        switch (indicador) {
            case 1:

            perimetro = 2 * Math.PI * raio;  
            
            System.out.printf("O perímetro do círculo é: %.2fcm", perimetro);

                break;
            case 2:

            area = Math.PI * Math.pow(raio, 2);
            System.out.printf("A área do círculo é: %.2fcm²", area);

                break;
            case 3:
            volume = (4.0 / 3.0) * Math.PI * Math.pow(raio,3);
            System.out.printf("O volume da esfera é: %.2fcm³", volume);
                break;
            default:
            System.out.println("Operação Inválida");
                break;
        }

        sc.close();
    }
}