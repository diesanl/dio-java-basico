package aulas.oo.part03.heranca.exercicioFinal;

public class Atendente extends Funcionario {
    public Atendente(Double salario) {
        super(salario);
    }

    @Override
    public String recolherImposto() {
        double imposto = getSalario() * 0.01;

        return getFormat(imposto);

    }
}
