package Java.Projetos.CalculadoraJava;

import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] args) {
        

        Scanner scanner =  new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Calculadora");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz Quadrada");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            if(opcao >= 1 && opcao <= 6) {

                double resultado = 0;
                boolean operacaovalida = true;

               if ( opcao == 6){
                System.out.println("Digite o numero: ");
                double num = scanner.nextDouble();

                resultado = raizquadrada(num);
               } else {

                System.out.println("Digite o primeiro numero: ");
                double num1 = scanner.nextDouble();

                System.out.println("digite o segundo numero: ");
                double num2 = scanner.nextDouble();

                
                switch (opcao) {
                    case 1:
                        resultado = adicionar(num1, num2);
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = dividir(num1, num2);
                        } else {
                            System.out.println("Divisão por zero não é permitida!");
                            operacaovalida = false;
                        }
                        break;
                     case 5:
                        resultado = potencia(num1, num2);
                        break;

                        default: 
                            operacaovalida = false;
                            break;
                }
            }

                if (operacaovalida) {
                    System.out.println("Resultado: " + resultado);
                }


            } else if (opcao != 0) {
                System.out.println("Opção invalida.");
            }


        } while(opcao != 0);

        System.out.println("Calculadora encerrada");
        scanner.close();
    }

    public static double adicionar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static double raizquadrada(double a) {
        return Math.sqrt(a);
    }
}
