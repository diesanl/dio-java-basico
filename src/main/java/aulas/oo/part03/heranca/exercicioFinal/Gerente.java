package aulas.oo.part03.heranca.exercicioFinal;

public class Gerente extends Funcionario {

    public Gerente(Double salario) {
        super(salario);
    }

    @Override
    public String recolherImposto() {
        double imposto = getSalario() * 0.09;
        return getFormat(imposto);
    }
}
