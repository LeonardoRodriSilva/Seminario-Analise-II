package MVC.controller;

import MVC.model.IMCMVC;
import MVC.view.IMCViewMVC;

public class IMCControllerMVC {
    private final IMCMVC imcModel;
    private final IMCViewMVC imcView;

    public IMCControllerMVC(IMCMVC imcModel, IMCViewMVC imcView) {
        this.imcModel = imcModel;
        this.imcView = imcView;
    }

    public void iniciar() {
        imcView.exibirMensagemInicial();
        String nome = imcView.pedirNome();
        float peso = imcView.pedirPeso();
        float altura = imcView.pedirAltura();

        imcModel.setNome(nome);
        imcModel.setPeso(peso);
        imcModel.setAltura(altura);

        float imc = imcModel.calcularIMC();
        imcView.mostrarIMC(nome, imc);
        float[] listaIMC = {imc};
        imcView.mostrarListaIMC(listaIMC);
    }
}
