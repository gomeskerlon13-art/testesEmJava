package calculadora;

import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora minhaCalculadora= new Calculadora();
        int valor1, valor2, calculo;
        String sinal;
        String operacao = "";
        
        System.out.println("Insira o primeiro número: ");
        valor1 = entrada.nextInt();
        
        System.out.println("Insira o segundo número: ");
        valor2 = entrada.nextInt();
        
        System.out.println("Qual será a operação?");
        entrada.nextLine();
        sinal = entrada.nextLine();
        
        switch(sinal){
            case "+":
                minhaCalculadora.calcularAdd(valor1, valor2);
            break;
            
            case "-":
                minhaCalculadora.calcularSub(valor1, valor2);
            break;
            
            case "X":
                minhaCalculadora.calcularMult(valor1, valor2);
            break;
            
            case "/":
                minhaCalculadora.calcularDivid(valor1, valor2);
            break;
            
            default: System.out.println("Operação inválida");
        }
    }
    
}
