import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        idadeHabilitacao();
        desconto();
        temperatura();
        velocidade();
        precoFrete();


    }

    public static void idadeHabilitacao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Infome sua idade: ");
        int idade = scanner.nextInt();

        if(idade < 18){
            System.out.println("Você não pode receber uma habilitação");
        }else{
            System.out.println("Você pode receber uma habilitação");
        }

    }

    public static void desconto(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da compra: ");
        float valorTotal = scanner.nextFloat();

        float valorDesconto = valorTotal * 10 / 100;

        if (valorTotal >= 100){
            valorTotal = valorTotal - valorDesconto;
            System.out.println("Você está apto para receber o desconto!");
            System.out.println("O valor total com desconto é " + valorTotal);
        }else{
           valorTotal = valorTotal;
            System.out.println("Você não está  apto para receber o desconto!");
            System.out.println("O valor total com desconto é " + valorTotal);
        }

    }

    public static void temperatura(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe qual é a sua temperatura: ");
        int temperatura = scanner.nextInt();

        if(temperatura >= 38){
            System.out.println("Você está com febre!");
        }else{
            System.out.println("Você não está com febre!");
        }


    }

    public static void velocidade(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a velocidade do veículo em km/h: ");
        int velovidade = scanner.nextInt();

        System.out.println("Informe a velocidade máxima permitid em km/h: ");
        int velovidadeMaxima = scanner.nextInt();

        if(velovidade > (velovidadeMaxima * 1.07f)){
            System.out.println("O veículo excedeu a velocidade máxima!");
        }else{
            System.out.println("O veículo não excedeu a velocidade máxima!");
        }

    }

    public static void precoFrete(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o peso do pacote: ");
        int peso = scanner.nextInt();

        System.out.println("Informe o valor do pacote: ");
        float valor = scanner.nextInt();

        float valorTotal;

        if(peso <= 5){
            System.out.println("O valor do frete é R$ 20.00 reais ");
            valorTotal = valor + 20;
            System.out.println("O valor total é: R$ " + valorTotal + " reais. ");
        }else{
            System.out.println("O valor do frete é R$ 50.00 reais ");
            valorTotal = valor + 50;
            System.out.println("O valor total é: R$ " + valorTotal + " reais. ");


        }

    }
}

