package estudosdevdojo.conceitosbasicos;

/*
* Pratica
*
* Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

* Eu <nome>, morando no endereco <endereco>,
* confirmo que recebi o salario de <salario>, na data <data>
* */

public class Aula02TiposPrimitivosExercicio {

    public static void main(String[] args) {

        String nomePessoa1 = "Lucas Oliveira";
        String endereco = "Rua poconé";
        int salario = 800;
        String dataDoDia = "19/08/2059";
        String relatorio = "Eu " + nomePessoa1 + ", morando no endereco " + endereco + ", confirmo que recebi o salario de R$" + salario + " , na data de " + dataDoDia;


        System.out.println("Eu " + nomePessoa1 + ", morando no endereco " + endereco + ", confirmo que recebi o salario de R$" + salario + " , na data de " + dataDoDia);
        System.out.println(relatorio);


    }
}
