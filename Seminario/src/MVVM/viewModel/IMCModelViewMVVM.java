package MVVM.viewModel;

import MVVM.model.IMCModelMVVM;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class IMCModelViewMVVM {

    private final PropertyChangeSupport support;
    private IMCModelMVVM model;
    private String nome;
    private String mensagemIMC;

    public IMCModelViewMVVM() {
        this.support = new PropertyChangeSupport(this);
    }

    public void calcularIMC (String nome, float peso, float altura) {
        this.model = new IMCModelMVVM(nome, peso, altura);
        float imc = model.calcularIMC();
        this.nome = nome;
        this.mensagemIMC = String.format("O IMC de %s é %.2f", nome, imc);

        support.firePropertyChange("imc", null, this.mensagemIMC);
    }


    public String getMensagemIMC() {
        return mensagemIMC;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        if (support == null) {
            System.err.println("PropertyChangeSupport não foi inicializado!");
            return;
        }
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        if (support == null) {
            System.err.println("PropertyChangeSupport não foi inicializado!");
            return;
        }
        support.removePropertyChangeListener(listener);
    }
}

