package estudosdevdojo.conceitosbasicos;

public class Aula04EstruturaCondicional {

    public static void main(String[] args) {

        // If obrigatoriamente deve-se fazer uma expressao que retorne apenas true ou false ex:
        //if (idade){ // Aqui esta errado pois deve sempre ter um retorno booleano
        //}
        // o if sempre fara uma comparação dentro dele e não uma atribuição

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida)  { // Ele só vai executar se a expressao de dentro do if for verdadeira, caso troque para false ele nao vai executar
            System.out.println("Pode comprar bebida");
        }else {
            System.out.println("nao pode comprar bebida");
        }

        if (isAutorizadoComprarBebida == false) { // Outra forma de verificar se é falso
            System.out.println("Nao esta autorizado a comprar nunca mais");
        }

        if (!isAutorizadoComprarBebida) { // Mais uma forma de comprar se a afirmacao é falsa usando o ! antes da variavel
            System.out.println("nao autorizado");
        }


        if (idade >= 18) { // Ele só vai executar se a expressao de dentro do if for verdadeira, caso troque para false ele nao vai executar

            System.out.println("Autorizado a comprar bebida");

        }

    }
}
