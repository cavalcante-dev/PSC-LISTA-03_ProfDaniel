import java.util.Scanner;

public class Atv2_MaquinaTroco {
    
    public static void main(String[] args) {
        
        int valorPago, valorCompra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra (R$):");
        valorCompra = sc.nextInt();

        System.out.println("Digite o valor pago (R$): ");
        valorPago = sc.nextInt();

        if (valorPago < valorCompra ) {
            System.out.println("Erro: Quantia paga insuficiente para compra.");
        } else {

            int troco = valorPago - valorCompra;

            if (troco == 0) {
                System.out.println("Não há troco necessário.");
            } else {
                System.out.println("Troco calculado = R$ " + troco + ",00");
            }

            //Loop de repetição que calcula a quantidade de notas de cada valor. 

            int [] notas = {50, 20, 10, 5, 2, 1}; //Priorizando sempre o menor número de notas (Ordem Descrescente)

            for (int nota : notas) { // Inicio do loop
                int quantidadeNotas = troco / nota;
                if (quantidadeNotas > 0) { //Condição de encerramento
                    System.out.println("Notas de R$ " + nota + ",00: " + quantidadeNotas);
                    troco &= nota; //Calcula o que falta do troco para ser divido
                }
            }
        }
        sc.close();
    }

}
