package conquista02;

/*
Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer,
sendo atendida na segunda condição, não executando a terceira e nem um ELSE

 */
public class exercicio04 {
    public static void main(String[] args) {
        int numero01 = 651;
        if (numero01 <= 650) {
            System.out.println(numero01 <= 650);
        }
        if (numero01 != 500) {
            System.out.println(numero01 != 500);
        }
        if (numero01 == 501) {
            System.out.println(numero01 == 501);
        } else System.out.println("");
    }
}
