package aulas.oo.part02.construtores.exemplo003;

public class ExercicioInstanciaObjeto {
    public static void main(String[]args){

        Carro carro = new Carro("VW", "Gol", 2003);
        carro.setVersão("GTI 1.8");

        String msg = String.format("O carro da marca %s e modelo %s %s foi lançado no ano de %s ", carro.getMarca(), carro.getModelo(), carro.getVersão(), carro.getAno());

        System.out.println(msg);
    }

}
