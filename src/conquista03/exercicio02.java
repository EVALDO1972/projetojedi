package conquista03;

public class exercicio02 {

    public static void main(String[] args) {

        // while, do while, for
        /*
        Criar um código que pede para o usuário inserir um valor numérico de 1 a 10, e caso o valor digitado seja diferente desse intervalo,
        ele deve exibir uma mensagem pedindo para inserir o valor correto.
        O PROGRAMA NÃO PODE ENCERRAR ATÉ O USUÁRIO COLOCAR O VALOR CORRETO.
         */
        int count = 12;
        while (count < 10) {
            System.out.println(++count);
        }
        do {
            System.out.println("Insira o valor correto");
        } while (count <10);
                    }
    }