package estudosdevdojo.conceitosbasicos;

public class Aula04EstruturaCondicional03 {
    public static void main(String[] args) {

        // Operador Ternário
        // Criado especificamente para simplificar as operações de condição if/else
        // Principalmente quando precisamos fazer uma associação direta a uma variavel.


        // Doar se salario > 5000
        double salario = 2000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições";
        String resultado;

        // Como ficaria isso do jeito tradicional sem operador ternario
        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        // Forma de fazer usando a sintaxe de operador ternario
        // Ele sempre vai associar um valor diretamente pra uma variavel ou retorno de metodo.
        // ex String resultado = (condicao) ? verdadeiro : falso

        String resultado2 = salario > 5000 ? mensagemDoar : mensagemNaoDoar; // Sempre associando valor diretamente. Primeiramente damos a condição como no if/else apos isso usamos o sinal de ? para caso verdadeiro e : para falso
        System.out.println(resultado2);

        // Outra forma mais simplificada ainda de fazer operador ternario

        String resultado3 = salario > 5000 ? "Eu vou doar 500 pro devdojo" : "Ainda não tenho condições, mas vou ter !";
        System.out.println(resultado3);


        // Também funciona dentro de um print, pois o valor que esta sendo comparado está sendo validado pelo println
        System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);



    }
}
