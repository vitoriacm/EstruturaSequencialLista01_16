import java.util.Scanner;   
import java.lang.Math;

public class App {

     public static void main(String[] args) throws Exception {
        /* Faça um programa para uma loja de tintas. O programa deverá pedir 
        o tamanho em metros quadrados da área a ser pintada. 
        Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
        Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total. */
    int area ;
    double litros;
    double quantidadeLatas;
    double valorFinal;

      /*O programa deverá pedir 
        o tamanho em metros quadrados da área a ser pintada */
    Scanner input = new Scanner(System.in);
    area =  input.nextInt(); // significa que o q o usuario digitar seria armazenado na variavel área


     /*Calcular a quantidade de latas de tintas a serem compradas e o preço total*/
    
     litros = area / 3; // Saber a quantidade de litros que vou precisar 
     quantidadeLatas = Math.ceil (litros / 18); // será necessario arrendondar para por casa decimal 
     valorFinal = quantidadeLatas * 80;


 /* Mostrar a quantidade de latas de tintas a serem compradas e o preço total */
   System.out.println(quantidadeLatas);
   System.out.println("R$:" + valorFinal);

    }
}
