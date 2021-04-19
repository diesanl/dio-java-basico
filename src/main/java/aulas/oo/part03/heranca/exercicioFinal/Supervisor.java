package aulas.oo.part03.heranca.exercicioFinal;

public class Supervisor extends Funcionario {
    public Supervisor(Double salario) {
        super(salario);
    }

    @Override
    public String recolherImposto() {
        double imposto = getSalario() * 0.05;

        return getFormat(imposto);

    }
}
