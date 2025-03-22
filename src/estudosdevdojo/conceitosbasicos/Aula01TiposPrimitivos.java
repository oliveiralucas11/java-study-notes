package estudosdevdojo.conceitosbasicos;

public class Aula01TiposPrimitivos {

    public static void main(String[] args) {

        //Tipos Primitivos
        //Sao tipos que vao guardar na memoria um valor especifico como uma variavel ou constante eles sao:

        // int, double, float, char, byte, short, long, boolean

        //Para criar uma variavel precisamos primeiro dizer o tipo dela e em seguida um nome

        //Tipo int, long
        int age = 24;
        int age2 = 32;
        int fatherAge = 49;
        int grandFatherAge = 92;
        long numeroGrande = 100000;


        //Tipo double, float, byte, short, long, boolean, char
        double salarioDouble = 2000.20;
        double paycheck = 4000.00;
        float salarioFloat = 2500.32F;
        float paycheckFloat = 3000.32F;
        byte idadeByte = 10;
        byte ageByte = 5;
        short idadeShort = 10;
        short shortAge = 1;
        boolean verdadeiro = true;
        boolean isTrue = true;
        boolean isFalse = false;
        boolean falso = false;
        char caractere = 'A'; // Somente 1 caractere como tipo de sexo masculino ou feminino

        //String tipo de referencia, nao sendo um tipo primitivo e sim uma classe
        String textoGrande = "Um grande texto";
        String nomePessoa = "Lucas Oliveira";
        String bigText = "This is a big text box";



        System.out.println(textoGrande);
        System.out.println("Oi meu nome é " + nomePessoa);
        System.out.println(age);
        System.out.println("A idade é: " + fatherAge + " anos");
        System.out.println(numeroGrande);
        System.out.println("Nice to meet you sir, my name is: " + nomePessoa + " and i have " + fatherAge + " years old.");



    }
}
