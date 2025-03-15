import java.util.Scanner;

public class Atv3_Baskhara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta;

        System.out.println("Digite o coeficiente (a): ");
        a = sc.nextDouble();
        System.out.println("Digite o coeficiente (b): ");
        b = sc.nextDouble();
        System.out.println("Digite o coeficiente (c): ");
        c = sc.nextDouble();
        
        delta = (b*b) - 4 * a * c;

        double raiz1, raiz2, raizDelta;

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Erro: Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            double resultado = b + c;
            System.out.printf("Essa é uma equação de primeiro grau: %.2f", resultado);
        } else if (delta < 0) {
            System.out.println("Está equação não possui raízes reais.");
        } else if (delta == 0) {
            raizDelta = Math.sqrt(delta);
            raiz1 = (-b + raizDelta) / 2*a;
            raiz2 = (-b - raizDelta) / 2*a;
            System.out.printf("Esta equação possui duas raízes iguais: %.2f", raiz1);
        } else if (delta > 0) {
            raizDelta = Math.sqrt(delta);
            raiz1 = (-b + raizDelta) / 2*a;
            raiz2 = (-b - raizDelta) / 2*a;
            System.out.printf("Esta equação possui duas raízes iguais: %.2f e %.2f", raiz1, raiz2);;
        }

        sc.close();
    }
}