package MVP.Presenter;

import MVP.model.IMCMVP;
import MVP.view.IMCViewMVP;

public class IMCPresenterMVP {
    private final IMCViewMVP view;

    public IMCPresenterMVP(IMCViewMVP view) {
        this.view = view;
    }

    public void iniciar() {
        view.exibirMensagemInicial();
        String nome = view.pedirNome();
        Float peso = view.pedirPeso();
        Float altura = view.pedirAltura();

        IMCMVP imcModel = new IMCMVP(nome, peso, altura);
        float imc = imcModel.calcularIMC();
        view.mostrarIMC(nome, imc);
    }
}
