package MVP.view;

import java.util.Scanner;

public class ConsoleIMCViewMVP implements IMCViewMVP {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void exibirMensagemInicial() {
        System.out.println("=".repeat(30));
        System.out.println("Bem-vindo ao cálculo de IMC!");
    }

    @Override
    public String pedirNome() {
        System.out.println("Digite seu nome: ");
        return scanner.nextLine();
    }

    @Override
    public Float pedirPeso() {
        System.out.println("Digite seu peso: ");
        return scanner.nextFloat();
    }

    @Override
    public Float pedirAltura() {
        System.out.println("Digite sua altura: ");
        return scanner.nextFloat();
    }

    @Override
    public void mostrarIMC(String nome, float imc) {
        System.out.print("=".repeat(30));
        System.out.println();
        System.out.printf("%s, seu IMC é %.2f%n", nome, imc);
        System.out.println();
    }
}
