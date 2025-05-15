package MVP.view;

public interface IMCViewMVP {

    void exibirMensagemInicial();
    String pedirNome();
    Float pedirPeso();
    Float pedirAltura();
    void mostrarIMC(String nome, float imc);
}
