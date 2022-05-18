package conquista02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer,
não atendendo em nenhum momentos as 3 condições e finalizando o fluxo no ELSE
 */
public class exercicio03 {
    public static void main(String[] args) {
        int numero01 = 651;
        if (numero01 <= 650){
            System.out.println(numero01<=650);
        }
        if (numero01 !=651){
            System.out.println(numero01 !=651);
        }
        if (numero01 ==501){
            System.out.println(numero01 ==501);
        }
        else System.out.println("os cristérios não atendem");
    }
}
