package estudosdevdojo.conceitosbasicos;

public class Aula04EstruturaCondicional02 {

    public static void main(String[] args) {

        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        // Variaveis locais precisam ser inicializadas, se não havera erro de compilação, a não ser que seja inicializada antes com um valor vazio.

        int idade = 20;
        String categoria;

        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria adulto");
        }


        // Forma diferente de fazer
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Adulto";
        }
        System.out.println(categoria);
        //--------------------------------------------------------------------------

        if (idade >= 18) {
            System.out.println("Parabéns você já é maior de idade!");
        } else {
            System.out.println("Infelizmente você ainda não atingiu a maioridade!");
        }


        if (idade >= 18) {
            categoria = "Você já pode dirigir";
        } else {
            categoria = "Você ainda não tem idade para dirigir";
        }
        System.out.println(categoria);


    }
}
