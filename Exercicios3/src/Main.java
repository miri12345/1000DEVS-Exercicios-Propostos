import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       salarioAumento();

    }

    public static void calculoMedia(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Informe a segunda nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;


        if(media == 10){
            System.out.println("Aprovado com distinção!");
        }else if(media >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

    }

    public static void combustivel(){
        Scanner scanner = new Scanner(System.in);

        float gasolina = 5.50f;

        float alcool = 3.90f;

        float gasolinaDesconto = gasolina * 0.03f;
        float alcoolDesconto = alcool * 0.04f;
        float totalNormal;
        float totalDesconto;

        while (true){
            System.out.println("Escolha entre 1 - álcool e 2 - gasolina");
            int escolha = scanner.nextInt();

            switch (escolha){
                case 1: {
                    System.out.println("Informe em litros a quantidade de alcool: ");
                    float alcoolLitros = scanner.nextFloat();

                    totalNormal = alcool * alcoolLitros;
                    totalDesconto = (alcool * alcoolLitros) - alcoolDesconto;

                    if(alcoolLitros >= 20){
                        System.out.println("O valor total é: " + totalDesconto);
                    }else{
                        System.out.println("O valor total é: " + totalNormal);

                    }
                    break;
                }
                case 2:{
                    System.out.println("Informe em litros a quantidade de gasolina: ");
                    float gasolinaLitros = scanner.nextFloat();

                    totalNormal = gasolina * gasolinaLitros;
                    totalDesconto = (gasolina * gasolinaLitros) - gasolinaDesconto;

                    if(gasolinaLitros >= 20){
                        System.out.println("O valor total é: " + totalDesconto);
                    }else{
                        System.out.println("O valor total é: " + totalNormal);

                    }
                    break;

                }
                default:
                    System.out.println("Opção inválida.");
            }


        }
    }

    public static void frutas(){
        Scanner scanner = new Scanner(System.in);

        float morangos;
        float macas;
        float total;

        morangos = 2.50f;
        macas = 1.80f;

        System.out.println("Informe o valor em kg das frutas: ");
        float frutasQuilos = scanner.nextFloat();

        total = (morangos + macas) * frutasQuilos;

        if(frutasQuilos <= 5){
          System.out.println("O valor da compra é: " + total);

        }else if(frutasQuilos > 5){
            morangos = 2.20f;
            macas = 1.50f;

            total = (morangos + macas) * frutasQuilos;

            System.out.println("O total da compra é: " + total);
        }
        if(total >= 25 || frutasQuilos >= 8){

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

            /*System.out.println("O salário antes do reajuste: " + salario);
            System.out.println("O percentual de aumento aplicado: 5% ");
            System.out.println("O valor do aumento: " + aumento);
            System.out.println("Valor do salário com aumento: " + salarioAumento);*/

        } else if (salario <= 1500 && salario > 700) {
            aumento = salario * 0.10f;
            salarioAumento = salario + aumento;
            infomacoes(0.10f, aumento, salario);

           /* System.out.println("O salário antes do reajuste: " + salario);
            System.out.println("O percentual de aumento aplicado: 10% ");
            System.out.println("O valor do aumento: " + aumento);
            System.out.println("Valor do salário com aumento: " + salarioAumento);*/

        } else if (salario <= 700 && salario >= 280) {
            aumento = salario * 0.15f;
            salarioAumento = salario + aumento;
            infomacoes(0.15f, aumento, salario);
/*
            System.out.println("O salário antes do reajuste: " + salario);
            System.out.println("O percentual de aumento aplicado: 15% ");
            System.out.println("O valor do aumento: " + aumento);
            System.out.println("Valor do salário com aumento: " + salarioAumento);*/

        } else {
            aumento = salario * 0.20f;
            salarioAumento = salario + aumento;
            infomacoes(0.20f, aumento, salario);
/*
            System.out.println("O salário antes do reajuste: " + salario);
            System.out.println("O percentual de aumento aplicado: 20% ");
            System.out.println("O valor do aumento: " + aumento);
            System.out.println("Valor do salário com aumento: " + salarioAumento);*/
        }
    }

        public static void infomacoes(float porcentagem, float aumento, float salario){
            float salarioAumento = salario + aumento;
            System.out.println("O salário antes do reajuste: " + salario);
            System.out.println("O percentual de aumento aplicado: " + (porcentagem*100) + "% ");
            System.out.println("O valor do aumento: " + aumento);
            System.out.println("Valor do salário com aumento: " + salarioAumento);
        }

        public static void folhaPagamento(){
        
        }

    }

