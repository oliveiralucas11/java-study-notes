package estudosdevdojo.conceitosbasicos;

public class Aula03Operadores {

    public static void main(String[] args) {

        //Operadores Aritmeticos
        // + Adição
        // - Subtração
        // * Multiplicação
        // / Divisão

        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        System.out.println(resultado);
        System.out.println(numero02 + numero01);

        // Se colocarmos o valor depois de uma string o java vai entender como concatenação e não uma soma ex:
        System.out.println("valor é "+numero02+numero01);

        //Já se colocarmos antes da string ele vai entender como uma soma e não uma concatenação
        System.out.println(numero02 + numero01 + " Esse é o valor");

        //Operador de Resto da Divisao
        //% Pode ser usado para identificar se o numero é par ou impar
        int resto = 21 % 2;
        System.out.println(resto);

        //Operadores Logicos
        //Sempre vão retornar um valor booleano true ou false
        // < Menor
        // > Maior
        // <= Menor igual
        // >= Maior igual
        // == Igual (comparação)
        // != Diferença

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezMaiorIgualVinte = 10 >= 20;
        boolean isDezMenorIgualVinte = 10 <= 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);

        // && (AND) ambas as condições precisam ser verdadeiras para retornar o valor
        // || (or) ou -> qualquer uma  das condições pode ser verdadeira para retornar o valor
        // ! (not) negação

        int idadeMaior = 18;
        float salarioMaior = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idadeMaior > 30 && salarioMaior >= 4612; // Os dois precisam ser verdadeiros caso ao contrario ira retornar false
        boolean isDentroDaLeiMenorQueTrinta = idadeMaior < 30 && salarioMaior <= 4612; // Nesse caso retornara true pois ambas condições estão corretas.

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystation = 5000;

        // Usando || qualquer dos valores que estiver correto na comparação ele ira retornar true nao dependendo do outro.
        boolean isGonnaBuyPs5 = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println(isGonnaBuyPs5);



    }
}
