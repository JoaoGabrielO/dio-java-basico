package edu.joao.primeirasemana.tipos_variaveis;

public class operadoresCondicionais {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;


        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }

        if(condicao1 && (7 > 4)){
            System.out.println("as duas condições são verdadeiras");
        }

        System.out.println("=========================== FIM ===========================");
    }
}
