#Documentação

##GIT

comando para criação do repositório
    
    git init

comanda para adicionar arquivos 

    git add .

##JAVA

definição de variável:

## ATALHOS 
alt + shift + click do mouse: seleciona a linha
rodinha do mouse: seleciona linha
ctrl + L: indenta o codigo
ctrl + D: copia linha
sout:
psvm:

## 1 – Escopo de Variáveis
O escopo é a vida de uma variável em Java, tratando-se dos locais nos quais ela pode ser acessada. Em Java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada. A variável é criada no primeiro acesso a ela e destruída após o interpretador sair do bloco de execução ao qual ela pertence.

## 2 – Estrutura de classe

public class NomeDaClasse ------------	definição da classe

{   								INÍCIO DA CLASSE
private int            atributo1;  			
private double     atributo2; 
private String      atributo3;  			ATRIBUTOS DA CLASSE
private boolean   atributo4;  
private char       atributo5;   

public NomeDaClasse()  				MÉTODO CONSTRUTOR:
(possui o mesmo nome da classe e não possui tipo de retorno. 
É chamado na criação de um novo objeto. Neste método, inicializam-se os atributos da classe.)
{      
//implementação do método   		
}   


public void metodo1(String a, int b)  	DEMAIS MÉTODOS 
 {   //implementação do método 
}   
public int metodo2()  
{
   //implementação do método   
return atributo1; //exemplo de retorno
 }  
public String metodo3()  
{ 
  //implementação do método
   return atributo3; //exemplo de retorno
 }  
}  –------------------------------	–--	fim da classe 
## Variáveis
As variáveis são formadas por quatro elementos: nome, tipo, tamanho e valor. Dependendo da programação, o básico de uma declaração de variável pode ter somente um tipo, um nome e um valor. O Java possui dois tipos de dados que são divididos em por valor (tipos primitivos) e por referência (tipos por referência). 

## método 
em Java é equivalente a uma função, subrotina ou procedimento em outras linguagens de programação. Não existe em Java o conceito de métodos globais. Todos os métodos devem sempre ser definidos dentro de uma classe. 

## Variáveis primitivas – Os tipos primitivos são: 
boolean, 
byte, 
char, 
short, 
int, 
long, 
float e 
double. 

## método Main() 
é o ponto onde o programa inicia sua execução. É o ponto de entrada principal do programa e que executa todos os objetos e invoca métodos a serem executados. Pode haver apenas um método Main(). No entanto, o método Main() pode ter ou não um tipo de retorno.

###Como declarar o método main: Como vimos, para nossa aplicação executar precisamos do método main, porém o Java só entende que é o método main na nossa aplicação se seguir essa assinatura: public static void main(String[] args).

##Operadores Aritméticos
São aqueles que estudamos na escola, aquelas funções básicas de somar, subtrair, multiplicar, dividir, etc.

## Operadores de comparação: 
são  usados  para comparar strings de caracteres ou numéricas, manipular dados e retornar um valor TRUE (1) ou FALSE (0). 
= igual a
> maior que
< menor que
>= maior que ou igual a 
<= menor que ou igual a
<> diferente de
!= diferente de 
^= diferente de

##Operadores lógicos
- AND, NAND, OR, XOR e NOT são os principais operadores lógicos, base para a construção de sistemas digitais e da Lógica proposicional, e também muito usado em linguagem de programação. Os operadores AND, NAND, OR e XOR são operadores binários, ou seja, necessitam de dois elementos, enquanto o NOT é unário. 
Operadores de Incremento e decremento: o de incremento e o de decremento. O de incremento é representado por dois sinais de ++ , enquanto o de decremento, por dois sinais de menos --. 

##Operador de atribuição
é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. Em seu uso, o operando à esquerda representa a variável para a qual desejamos atribuir o valor informado à direita. 

##Operadores de atribuição
Nome						Operador encurtado	Significado

Atribuição	- 					x=y			/	x=y

Atribuição de adição -  			x +=y		/	x = x + y

Atribuição de subtração	 - 		x -=		/	x = x - y

Atribuição de multiplicação  -		x*=y		/	x = x*y
