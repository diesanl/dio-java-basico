package aulas.oo.part03.heranca.exercicioFinal;

public class Funcionario {

    private Double salario;

    public Funcionario(Double salario) {
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String recolherImposto() {
        double imposto = salario * 0.01;

        return getFormat(imposto);
    }

    public String getFormat(double imposto) {
        return String.format("Método executado da classe " + getClass().getSimpleName() + "\n" +
                "Imposto: %s", imposto);
    }

}
