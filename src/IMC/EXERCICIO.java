package IMC;

import java.util.Scanner;

public class EXERCICIO {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double pesoKg;
        double alturaEmMetros;
        double imc;
        System.out.println("Vamos calcular seu IMC");
        System.out.println("Criado no século 19 pelo matemático Lambert Quételet, o Índice de Massa Corporal,");
        System.out.println("conhecido pela sigla IMC, é um cálculo simples que permite medir se alguém está ou não com o ");
        System.out.println("peso ideal.");


        System.out.printf("digite seu peso: ");
        pesoKg = scan.nextDouble();
        System.out.printf("digite sua altura: ");
        alturaEmMetros = scan.nextDouble();
        imc = pesoKg / (alturaEmMetros * alturaEmMetros);
        System.out.println(imc);
        if (imc < 18.5) {
            System.out.println("abaixo do peso" + " - Como mais rapadura");
        } else if (imc < 25) {
            System.out.println("Peso excelente" + " - Mantenha o foco e determinação");
        } else if (imc < 30) {
            System.out.println("Levemente acima do peso" + "- comece a introduzir na sua alimentação verduras e legumes");
        } else if (imc < 35) {
            System.out.println("Obseidade grau 1" + "- Pare de comer mocotó");
        } else if (imc < 40) {
            System.out.println("Obesidade grau 2 (SEVERA)" + "- Meu amigo comece a fazer exercícios e melhorar a alimentação");
        } else {
            System.out.println("Obsidade Grau 3 (MÓRBIDA)" + "você vai morrer de tanto comer seu glutão");
        }
    }
}
