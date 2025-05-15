package MVC.view;

import java.util.Scanner;

public class IMCViewMVC {
    private final Scanner scanner = new Scanner(System.in);

    public void exibirMensagemInicial() {
        System.out.println("=".repeat(30));
        System.out.println();
        System.out.println("Bem vindo ao calculador de IMC");
        System.out.print("=".repeat(30));
        System.out.println();
    }

    public String pedirNome() {
        System.out.println("Digite seu nome: ");
        return scanner.nextLine();
    }

    public float pedirPeso() {
        System.out.println("Digite seu peso: ");
        return scanner.nextFloat();
    }

    public float pedirAltura() {
        System.out.println("Digite sua altura: ");
        return scanner.nextFloat();
    }

    public void mostrarIMC(String nome, float imc) {
        System.out.print("=".repeat(30));
        System.out.println();
        System.out.printf("%s, seu IMC é %.2f%n", nome, imc);
        System.out.println();
    }

    public void mostrarListaIMC(float[] listaIMC) {
        System.out.print("Lista de IMC: ");
        for (float imc : listaIMC) {
            System.out.printf("%.2f ", imc);
        }
        System.out.println();
    }
}