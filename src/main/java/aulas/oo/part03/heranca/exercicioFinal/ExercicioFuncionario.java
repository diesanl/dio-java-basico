package aulas.oo.part03.heranca.exercicioFinal;

public class ExercicioFuncionario {

    public static void main(String[] main) {

        Funcionario funcionario1 = new Gerente(10000.0);
        Funcionario funcionario2 = new Supervisor(6000.0);
        Funcionario funcionario3 = new Atendente(1500.0);

        System.out.println(funcionario1.recolherImposto());
        System.out.println(funcionario2.recolherImposto());
        System.out.println(funcionario3.recolherImposto());
    }
}
