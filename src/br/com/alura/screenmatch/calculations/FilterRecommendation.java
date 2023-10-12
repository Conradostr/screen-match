package br.com.alura.screenmatch.calculations;

public class FilterRecommendation {

    public void filter(Classificable classificable){
        if(classificable.getClassification() >= 4){
            System.out.println("Está entre os preferidos no momento");
        }else if(classificable.getClassification() >= 2){
            System.out.println("Muito bem avaliado no momento");
        }else {
            System.out.println("Coloque em assistir mais tarde");
        }
    }
}
