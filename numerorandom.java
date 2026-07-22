package Java.projeto;

import java.util.Random;
import java.util.Scanner;

public class numerorandom {
    public static void main(String[] args) {
        
       Random random = new Random();
       int numeroSecreto = random.nextInt(100) + 1;
       Scanner scanner = new Scanner(System.in);

       int palpite = 0;
       int tentativas = 0;
       
      System.out.println("Adivinhe o número entre 1 e 100!");
     // System.out.println("(DEBUG) Número secreto: " + numeroSecreto); // linha temporária

        while (palpite != numeroSecreto && tentativas < 10) {
        System.out.print("Digite sua tentativa: ");
        palpite = scanner.nextInt();
        tentativas++;
        if (palpite < numeroSecreto) {
            System.out.println("Muito baixo, tente novamente!");
        } else if (palpite > numeroSecreto) {
            System.out.println("Muito alto, tente novamente");
        } 
    }  

        if (palpite == numeroSecreto){
            System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas");
        } else {
            System.out.println("Voce perdeu o numero secreto era: " + numeroSecreto);
        }
        scanner.close();
}}


