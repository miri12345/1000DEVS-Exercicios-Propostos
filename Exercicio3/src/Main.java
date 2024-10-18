import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    }

    public static void calculoMedia() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Informe a segunda nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;


        if (media == 10) {
            System.out.println("Aprovado com distinção!");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }

    public static void combustivel() {
        Scanner scanner = new Scanner(System.in);

        float gasolina = 5.50f;

        float alcool = 3.90f;

        float gasolinaDesconto = gasolina * 0.03f;
        float alcoolDesconto = alcool * 0.04f;
        float totalNormal;
        float totalDesconto;

        while (true) {
            System.out.println("Escolha entre 1 - álcool e 2 - gasolina");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1: {
                    System.out.println("Informe em litros a quantidade de alcool: ");
                    float alcoolLitros = scanner.nextFloat();

                    totalNormal = alcool * alcoolLitros;
                    totalDesconto = (alcool * alcoolLitros) - alcoolDesconto;

                    if (alcoolLitros >= 20) {
                        System.out.println("O valor total é: " + totalDesconto);
                    } else {
                        System.out.println("O valor total é: " + totalNormal);

                    }
                    break;
                }
                case 2: {
                    System.out.println("Informe em litros a quantidade de gasolina: ");
                    float gasolinaLitros = scanner.nextFloat();

                    totalNormal = gasolina * gasolinaLitros;
                    totalDesconto = (gasolina * gasolinaLitros) - gasolinaDesconto;

                    if (gasolinaLitros >= 20) {
                        System.out.println("O valor total é: " + totalDesconto);
                    } else {
                        System.out.println("O valor total é: " + totalNormal);

                    }
                    break;

                }
                default:
                    System.out.println("Opção inválida.");
            }


        }
    }

    public static void frutas() {
        Scanner scanner = new Scanner(System.in);

        float morangos;
        float macas;
        float total;

        morangos = 2.50f;
        macas = 1.80f;

        System.out.println("Informe o valor em kg das frutas: ");
        float frutasQuilos = scanner.nextFloat();

        total = (morangos + macas) * frutasQuilos;

        if (frutasQuilos <= 5) {
            System.out.println("O valor da compra é: " + total);

        } else if (frutasQuilos > 5) {
            morangos = 2.20f;
            macas = 1.50f;

            total = (morangos + macas) * frutasQuilos;

            System.out.println("O total da compra é: " + total);
        }
        if (total >= 25 || frutasQuilos >= 8) {

            float totalDesconto = total * 0.10f;

            total = total - totalDesconto;

            System.out.println("O total da compra com desconto é: " + total);
        }

    }

    public static void salarioAumento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu salário: ");
        float salario = scanner.nextFloat();

        float aumento;
        float total;
        float salarioAumento;

        if (salario > 1500) {
            aumento = salario * 0.05f;
            salarioAumento = salario + aumento;
            infomacoes(0.05f, aumento, salario);


        } else if (salario <= 1500 && salario > 700) {
            aumento = salario * 0.10f;
            salarioAumento = salario + aumento;
            infomacoes(0.10f, aumento, salario);


        } else if (salario <= 700 && salario >= 280) {
            aumento = salario * 0.15f;
            salarioAumento = salario + aumento;
            infomacoes(0.15f, aumento, salario);


        } else {
            aumento = salario * 0.20f;
            salarioAumento = salario + aumento;
            infomacoes(0.20f, aumento, salario);

        }
    }

    public static void infomacoes(float porcentagem, float aumento, float salario) {
        float salarioAumento = salario + aumento;
        System.out.println("O salário antes do reajuste: " + salario);
        System.out.println("O percentual de aumento aplicado: " + (porcentagem * 100) + "% ");
        System.out.println("O valor do aumento: " + aumento);
        System.out.println("Valor do salário com aumento: " + salarioAumento);
    }


    public static void folhaPagamento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantas horas foram trabalhadas: ");
        float quantidadeTrabalhadas = scanner.nextFloat();

        System.out.println("Informe o valor da sua hora trabalhada: ");
        float valorHora = scanner.nextFloat();

        float totalSalarioBruto = valorHora * quantidadeTrabalhadas;

        float sindicatoDesconto = totalSalarioBruto * 0.03f;

        float fgtsAumento = totalSalarioBruto * 0.11f;

        float inssDesconto = totalSalarioBruto * 0.20f;

        float totalDesconto = inssDesconto + sindicatoDesconto;

        float salarioLiquido = totalSalarioBruto - totalDesconto;

        if (totalSalarioBruto > 2500) {

            informacoesFolhaPagamento(0.20f, quantidadeTrabalhadas, valorHora, totalSalarioBruto, sindicatoDesconto, inssDesconto, fgtsAumento, totalDesconto, salarioLiquido);

        } else if (totalSalarioBruto > 1500 && totalSalarioBruto < 2500) {
            inssDesconto = totalSalarioBruto * 0.10f;
            informacoesFolhaPagamento(0.10f, quantidadeTrabalhadas, valorHora, totalSalarioBruto, sindicatoDesconto, inssDesconto, fgtsAumento, totalDesconto, salarioLiquido);
        } else if (totalSalarioBruto > 900 && totalSalarioBruto < 1500) {
            inssDesconto = totalSalarioBruto * 0.05f;
            informacoesFolhaPagamento(0.05f, quantidadeTrabalhadas, valorHora, totalSalarioBruto, sindicatoDesconto, inssDesconto, fgtsAumento, totalDesconto, salarioLiquido);
        } else {
            inssDesconto = 0.0f;
            System.out.println("Você está isento do imposto INSS.");
            informacoesFolhaPagamento(0.0f, quantidadeTrabalhadas, valorHora, totalSalarioBruto, sindicatoDesconto, inssDesconto, fgtsAumento, totalDesconto, salarioLiquido);
        }

    }

    public static void informacoesFolhaPagamento(float porcentagem, float quantidadeTrabalhada, float valorHora, float totalSalarioBruto, float sindicatoDesconto, float inssDesconto, float fgtsAumento, float totalDesconto, float salarioLiquido) {
        System.out.println("Quantidade de horas trabalhadas: " + quantidadeTrabalhada);
        System.out.println("Valor da hora trabalhada R$: " + valorHora);
        System.out.println("Salário bruto: R$ " + totalSalarioBruto);
        System.out.println("(-) IR 3%: R$ " + sindicatoDesconto);
        System.out.println("(-) INSS " + (porcentagem * 100) + " %: R$ " + inssDesconto);
        System.out.println("FGTS: R$ " + fgtsAumento);
        System.out.println("Total de descontos: R$ " + totalDesconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }

    public static void diaSemana() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Informe um número entre 1 e 7: ");
            int numero = scanner.nextInt();

            switch (numero) {
                case 1: {
                    System.out.println("O número 1 corresponde ao Domingo nos dias da semana.");
                    break;
                }
                case 2: {
                    System.out.println("O número 2 corresponde a Segunda-feira nos dias da semana.");
                    break;
                }
                case 3: {
                    System.out.println("O número 3 corresponde a Terça-feira nos dias da semana.");
                    break;
                }
                case 4: {
                    System.out.println("O número 4 corresponde a Quarta-feira nos dias da semana.");
                    break;
                }
                case 5: {
                    System.out.println("O número 5 corresponde a Quinta-feira nos dias da semana.");
                }
                case 6: {
                    System.out.println("O número 6 corresponde a Sexta-feira nos dias da semana.");
                    break;
                }
                case 7: {
                    System.out.println("O número 7 corresponde ao Sábado nos dias da semana.");
                    break;
                }
                default:
                    System.out.println("Valor inválido");

            }
        }

    }

    public static void notaParcil() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Informe sua segunda nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media <= 10 && media > 9) {
            System.out.println("O conceito obtido é A");
        } else if (media <= 9 && media > 7.5) {
            System.out.println("O conceito obtido é B");
        } else if (media <= 7.5 && media > 6) {
            System.out.println("O conceito obtido é C");
        } else if (media <= 6 && media > 4) {
            System.out.println("O conceito obtido é D");
        } else {
            System.out.println("O conceito obtido é E");
        }

    }

    public static void triangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos verificar se é um triângulo e qual tipo de triângulo!");

        System.out.println("Informe o primeiro lado: ");
        float lado1 = scanner.nextFloat();

        System.out.println("Informe o segundo lado: ");
        float lado2 = scanner.nextFloat();

        System.out.println("Informe o terceiro lado: ");
        float lado3 = scanner.nextFloat();

        if(lado1 > (lado2+lado3) || lado2 > (lado1+lado3) || lado3 > (lado1+lado2) ){
            System.out.println("Não é um triângulo");
        }else if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            System.out.println("É um equilátero");
        }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("Isósceles");
        }else{
            System.out.println("É um escaleno");
        }

    }

    public static void perguntaCrime() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda com 1 (sim ou 0 (não) para as perguntas)");

        System.out.println("Telefonou para a vítima?");
        int resposta1 = scanner.nextInt();

        System.out.println("esteve no local do crime?");
        int resposta2 = scanner.nextInt();

        System.out.println("Mora perto da vítima?");
        int resposta3 = scanner.nextInt();

        System.out.println("Devia para a vítima?");
        int resposta4 = scanner.nextInt();

        System.out.println("Já trabalhou com a vítima?");
        int resposta5 = scanner.nextInt();

        int positivos = 0;

        if (resposta1 == 1) {
            positivos = positivos + 1;
        }
        if (resposta2 == 1) {
            positivos = positivos + 1;
        }
        if (resposta3 == 1) {
            positivos = positivos + 1;
        }
        if (resposta4 == 1) {
            positivos = positivos + 1;
        }
        if (resposta5 == 1) {
            positivos = positivos + 1;
        }

        if (positivos == 2) {
            System.out.println("Esta pessoa é suspeita do crime");
        } else if (positivos >= 3 && positivos <= 4) {
            System.out.println("Esta pessoa é cúmplice do crime");
        } else {
            System.out.println("Esta pessoa é o assassino!");

        }
    }

    public static void verificaNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        float valor = scanner.nextFloat();

        if (valor == 0) {
            System.out.println("O número digitado é neutro");
        }
        if (valor > 0) {
            System.out.println("O número " + valor + " é positivo");

        }else{
            System.out.println("O número " + valor + " é negativo");
        }

        if((valor % 2) == 0){
            System.out.print(" O número " + valor + " é par");
        }else{
            System.out.println("O número " + valor + " é impar");
        }

    }

    // 11, 12

     public static void anoBissexto(){
        Scanner scanner = new Scanner(System.in);
        int dia = 0, mes = 0, ano = 0;
        boolean anoNaoEhBissexto;

        try{
            System.out.print("Digite o dia do mes: ");
            dia = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Digite uma data válida");
        }

        try{
            System.out.print("Digite o mes do ano: ");
            mes = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Digite uma data válida");
        }

        try{
            System.out.print("Digite o ano: ");
            ano = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Digite uma data válida");
        }

        anoEhBissexto = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
         
         // Verifica se o mês está fora do intervalo válido
        if (mes < 1 || mes > 12) {
            System.out.println("A data é inválida, pois o mês deve ser entre 1 e 12.");
        // Verifica o dia para meses que possuem 30 ou menos dias
        } else if (dia < 1 || (dia == 31 && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11))) {
            System.out.println("A data é inválida, pois o mês " + mes + " não tem 31 dias.");
        // Verifica dias em fevereiro
        } else if (mes == 2 && (dia > 29 || (dia == 29 && !anoEhBissexto))) {
            System.out.println("A data é inválida, pois fevereiro não tem " + dia + " dias nesse ano.");
        // Verifica se o dia é maior que 31 para outros meses
        } else if (dia > 31) {
            System.out.println("A data é inválida, pois não existe dia maior que 31.");
        } else {
            System.out.println("A data é válida.");
        }
        
        teclado.close();
    }

    public static void numeroMaior(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float n1 = scanner.nextFloat();

        System.out.println("Digite o segundo número: ");
        float n2 = scanner.nextFloat();

        System.out.println("Digite o terceiro número: ");
        float n3 = scanner.nextFloat();

        if(n1 > n2 && n1 > n3){
            System.out.println("O número "+n1+" é o maior");
        }else if(n2 > n1 && n2 > n3){
            System.out.println("O número "+n2+" é o maior");
        }else{
            System.out.println("O número "+n3+" é o maior");

        }

    }


}

