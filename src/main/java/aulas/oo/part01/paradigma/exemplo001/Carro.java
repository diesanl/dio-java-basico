package aulas.oo.part01.paradigma.exemplo001;

public class Carro {

    private final Integer NUMPASSAGEIROSMAX = 5 ;
    private Integer qtdPassageiros;

    public Integer getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(Integer qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public String removePassageiro (Integer qtd){

        if (qtdPassageiros==0 ){
            return String.format("No momento o carro tem %s passageiros. Não eh possível excluir mais passageiros",  qtdPassageiros);
        }
        else if(qtd>qtdPassageiros){
            return String.format("Não eh possível excluir mais passageiros. A qtd de Passageiros eh menor q %s",  qtd);
        }
        else if (qtd<=qtdPassageiros){
            qtdPassageiros-=qtd;
            return String.format("Restaram %s no carro", +qtdPassageiros);
        }
        return null;
    }
    public String addPassageiro(Integer qtd){

        if (qtdPassageiros == NUMPASSAGEIROSMAX){
            return "N eh possível adicionar nenhum passageiro. Carro lotado";
        }
        else{
            qtdPassageiros +=qtd;
        }
        return String.format("%s passageiro(s) foram adicionado(s), totalizando %s passageiros", qtd, qtdPassageiros);
    }

    public Carro() {
        this.qtdPassageiros = NUMPASSAGEIROSMAX;
    }
}
