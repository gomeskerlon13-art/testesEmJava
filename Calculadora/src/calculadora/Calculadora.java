
package calculadora;

public class Calculadora{
   int calculo;
   String sinal;
    
    public void calcularAdd(int valor1, int valor2){
           
        calculo = valor1 + valor2;
        System.out.println("O resultado da adição é: " + calculo);
    }
    
    public void calcularSub(int valor1, int valor2){        
        calculo = valor1 - valor2;
        System.out.println("O resultado da subtração é: " + calculo);
             }  
    
    public void calcularMult(int valor1, int valor2){
        calculo = valor1 * valor2;
        System.out.println("O resultado da multiplicação é: " + calculo);
    }
        
    public void calcularDivid(int valor1, int valor2){
        calculo = valor1 / valor2;
        System.out.println("O resultado da subtração é: " + calculo);
    }     
}