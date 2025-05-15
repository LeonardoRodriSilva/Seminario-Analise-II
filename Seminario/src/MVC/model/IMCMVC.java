package MVC.model;

public class IMCMVC {
    private String nome;
    private float peso;
    private float altura;
    private float imc;

    public IMCMVC(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.imc = calcularIMC();
    }

    public IMCMVC() {

    }

    public float calcularIMC() {
        return (float) (peso / Math.pow(altura, 2));
    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public float getImc() {
        return imc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

}
