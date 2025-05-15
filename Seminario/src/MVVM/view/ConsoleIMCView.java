package MVVM.view;

import MVVM.viewModel.IMCModelViewMVVM;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;

public class ConsoleIMCView implements PropertyChangeListener {

    private final IMCModelViewMVVM viewModel;
    private final Scanner scanner;

    public ConsoleIMCView(IMCModelViewMVVM viewModel) {
        this.viewModel = viewModel;
        this.scanner = new Scanner(System.in);
        this.viewModel.addPropertyChangeListener(this);
    }

    public void exibirMensagemInicial() {
        System.out.print("=".repeat(30));
        System.out.println();
        System.out.println("Bem vindo ao calculador de IMC");
        System.out.print("=".repeat(30));
        System.out.println();
    }

    public void iniciar() {
        exibirMensagemInicial();

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu peso: ");
        float peso = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();
        scanner.nextLine();

        viewModel.calcularIMC(nome, peso, altura);

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("imc".equals(evt.getPropertyName())) {
            System.out.println(evt.getNewValue());
        }
    }

}
