package estudosdevdojo.conceitosbasicos;

public class Aula04EstruturaCondicionalExercicio {
    public static void main(String[] args) {

        double salario = 5000;
        double taxes = 9.70 / 100;
        double taxes2 = 37.35 / 100;
        double taxes3 = 49.50 / 100;
        double valorImposto;

        // Para certificação pode ser que caia o if no lugar de um else, ele funciona porem ele faz a verificação novamente e como ele é menor que 68 mil ele vai cair na segunda verificação e não na primeira

        if (salario <= 34.712) {
            valorImposto = salario * taxes;
        } else if (salario > 34.712 || salario <= 68.507) {
            valorImposto = salario * taxes2;
        } else {
            valorImposto = salario * taxes3;
        }

        System.out.println("Seu valor de imposto pago será de: " + valorImposto);

    }
}
