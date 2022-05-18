package conquista02;

/*
Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é igual ao case (a, b, c e default).
O código deve executar apenas o default com a mensagem: “O valor não é compatível”.

 */
public class exercicio06 {
    public static void main(String[] args) {
        char letra = 'w';
        switch (letra) {
            case 'a':
                System.out.println(letra = 'a');
                break;
            case 'b':
                System.out.println(letra = 'b');
                break;
            case 'c':
                System.out.println(letra = 'c');
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}
