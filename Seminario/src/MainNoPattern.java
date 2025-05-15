import java.util.ArrayList;
import java.util.Scanner;

public class MainNoPattern {
    public static void main(String[] args) {
        float imc, peso, altura;
        String nome;
        ArrayList<Float> registroIMC = new ArrayList<Float>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("=".repeat(30));
        System.out.println();
        System.out.println("Bem vindo ao calculador de IMC");
        System.out.print("=".repeat(30));
        System.out.println();
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite seu peso: ");
        peso = scanner.nextFloat();
        System.out.println("Digite sua altura: ");
        altura = scanner.nextFloat();

        imc = (float) (peso / Math.pow(altura, 2));

        System.out.print("=".repeat(30));
        System.out.println();

        System.out.printf(nome + ", seu IMC é " + imc);
        registroIMC.add(imc);
        System.out.println();
        System.out.printf("Lista de IMC: " + registroIMC);
    }
}