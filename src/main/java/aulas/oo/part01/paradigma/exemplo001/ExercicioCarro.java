package aulas.oo.part01.paradigma.exemplo001;

public class ExercicioCarro {

    public static void main(String [] args){
        Carro carro = new Carro();

        System.out.println(carro.getQtdPassageiros());

//        System.out.println(carro.addPassageiro(1));;

        System.out.println(carro.removePassageiro(4));

        System.out.println(carro.addPassageiro(5));;
    }

}
