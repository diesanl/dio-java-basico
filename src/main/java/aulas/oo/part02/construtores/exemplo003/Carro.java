package aulas.oo.part02.construtores.exemplo003;

public class Carro {

    private String marca;
    private String modelo;
    private Integer ano;
    private String versão;

    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getVersão() {
        return versão;
    }

    public void setVersão(String versão) {
        this.versão = versão;
    }
}
