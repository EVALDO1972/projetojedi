package Conquista01;

//Criar um código que verifica expressões booleanas (verdadeiro ou falso) utilizando operadores de comparação e operadores lógicos.
//Ex: boolean ativo = true; ativo == true && ativo != false
public class exercicio07 {
    public static void main(String[] args) {
    int numero01=45;
    int numero02=55;

    boolean isnumero01maiorquenumero02=numero01>30 && numero02>=100;
    boolean isnumero02maiorquenumero01=numero01>130 && numero02>=1200;
    boolean isnumero02igualnumero01=numero01==45 && numero02==55;
    boolean isnumero02menorquenumero01=numero01<=45 && numero02<=55;


        System.out.println("isnumero01maiorquenumero02"+isnumero01maiorquenumero02);
        System.out.println("isnumero02maiorquenumero01"+isnumero02maiorquenumero01);
        System.out.println("isnumero02igualnumero01"+isnumero02igualnumero01);
        System.out.println("isnumero02menorquenumero01"+isnumero02menorquenumero01);
    }
}
