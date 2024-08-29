import java.util.Scanner;
public class Main
{

    public static void main(String[] args) {
        areaTerreno();
        valorSalario();
        ferraduraDeCavalo();
        salarioDesc();
        granjaGalinha();
        sanduiche();

    }


    public static void areaTerreno(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos metros o terreno possui de frente: ");
        float frenteMts = scanner.nextFloat();

        System.out.println("Quantos metros o terreno possui de frente: ");
        float lateralMts = scanner.nextFloat();

        System.out.println("Informe o valor do metro quadrado: ");
        float valorMetroQrd = scanner.nextFloat();

        float areaTotal = frenteMts * valorMetroQrd;
        float valorDoTerreno = valorMetroQrd * areaTotal;

        System.out.println("Area total do terreno " + frenteMts + " metros de frente com " + lateralMts + " metros de lateral ");
        System.out.println(areaTotal + ".mts");
        System.out.println("A área do terreno é: " + areaTotal);
        System.out.println("Valor total do terreno: R$ " + valorDoTerreno);

    }

    public static void valorSalario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do salário mínimo: ");
        float salarioMin = scanner.nextFloat();

        System.out.println("Informe o valor do funcionário: ");
        float salarioFunc = scanner.nextFloat();

        float quantSalarioMin = salarioFunc / salarioMin;

        System.out.println("O funcionário recebe " + quantSalarioMin + " de salário minímo!");
    }

    public static void ferraduraDeCavalo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de cavalos: ");
        int quantiCava = scanner.nextInt();

        System.out.println("Informe o valor de cada ferradura: ");
        float valorFerradura = scanner.nextFloat();

        int ferradurasNece = quantiCava * 4;

        float valorTotal = ferradurasNece * valorFerradura;

        System.out.println("O total de ferraduras necessárias: " + ferradurasNece);
        System.out.println("O valor total para a compra: " + valorTotal);
    }

    public static void salarioDesc(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu salário: ");
        float salario = scanner.nextFloat();

        float salarioReajuste = salario * 15/100;
        float reajuste = salario + salarioReajuste;
        System.out.println("Reajuste do salário: " + reajuste);

        float descontoINSS = salarioReajuste * 11/100;
        System.out.println("Desconto de 11% do INSS: " + descontoINSS);

        float descontoFGTS = salarioReajuste * 8/100;
        System.out.println("Desconto de 8% do FGTS: " + descontoFGTS);

        float totalDesconto = descontoFGTS + descontoINSS;
        System.out.println("Total de descontos: " + totalDesconto);

        float salarioFinal = salario - totalDesconto;
        System.out.println("Salário final: " + salarioFinal);

    }

    public static void granjaGalinha(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de galinha: ");
        int quantGalinha = scanner.nextInt();

        float anelChip = 4;
        float anelAlimento = 7;

        float valorTotal = anelAlimento + anelChip * quantGalinha;

        System.out.println("O total do valor para identificar os frangos é: " + valorTotal);

    }

    public static void sanduiche(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de sanduíches: ");
        int quantLanche = scanner.nextInt();

        double mussarela = 0.5;
        double presunto = 0.5;
        double hamburguer = 0.12;

        double totalMussarela = mussarela * quantLanche;
        double totalPresunto = presunto * quantLanche;
        double totalHamburguer = hamburguer * quantLanche;

        System.out.println("Para produzir " + quantLanche + " sanduíches, será necessários: ");
        System.out.println(totalMussarela + " kgs de mussarela ");
        System.out.println(totalPresunto + " kgs de presunto ");
        System.out.println(totalHamburguer + " kgs de hambúrguer ");

    }
}

