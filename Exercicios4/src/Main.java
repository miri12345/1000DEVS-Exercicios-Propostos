import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       
    }

    public static void impar(){
        Scanner scanner = new Scanner(System.in);

        int valor;
        boolean ehImpar;
        valor = 0;

        try{
            System.out.print("Digite um valor qualquer: ");
            valor = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Digite um valor válido");
            return;
        }
        ehImpar = (valor % 2 != 0);

         if (ehImpar) {
            System.out.println("O número é ímpar.");
        } else {
            System.out.println("O número " + valor + " é par.");
        }
    }

    public static void emenor(){
        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 0;
        int c = 0;

        try{
            System.out.print("Digite o primeiro valor: ");
            a = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Digite um valor válido");
            return;
        }

        try{
            System.out.print("Digite o segundo valor: ");
            b = scanner.nextInt();

        }catch(Exception e){
            System.out.println("Digite um valor válido");
            return;
        }

        try{
            System.out.print("Digite o terceiro valor: ");
            c = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Digite um valor válido");
            return;
        }

        if (a + b < c) {
            System.out.println("A soma de A + B é menor C");
        } else {
            System.out.println("A soma de A + B não é menor C");
        }
    }

    public static void valormais(){
        int valor = 0, resultado;
        boolean ehImpar;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um valor qualquer: ");
            valor = scanner.nextInt();
        }catch(Exception e) {
            System.out.println("Digite um valor válido");
            return;
        }


        ehImpar = (valor % 2 != 0);

        resultado = ehImpar ? valor + 8 : valor + 5;

        System.out.println("Resultado: " + resultado);

    }

    public static void valorC(){
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;

        try{
            System.out.print("Digite o valor de A: ");
            a = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Digite um valor válido");
            return;
        }
         try{
             System.out.print("Digite o valor de B: ");
             b = scanner.nextInt();
         }catch (Exception e){
             System.out.println("Digite um valor válido");
             return;
         }

       c = (a == b) ? (a + b) : (a * b);

        System.out.println("O valor de C é: " + c);
    }

    public static void pagamento(){
        Scanner scanner = new Scanner(System.in);
        float totalCompra;
        float valorFinalCompra;

        int opcaoPagamento;

        System.out.print("Digite o valor total da compra: R$ ");
        totalCompra = scanner.nextFloat();

        System.out.println("\nCódigo  Descrição");
        System.out.println("1       À vista em dinheiro ou cheque, recebe 10% de desconto");
        System.out.println("2       À vista no cartão de crédito, recebe 15% de desconto");
        System.out.println("3       Em duas vezes, preço normal de etiqueta sem juros");
        System.out.println("4       Em três vezes, preço normal de etiqueta mais juros de 10%");
        System.out.print("Digite a opção de pagamento: ");

        opcaoPagamento = scanner.nextInt();

        switch (opcaoPagamento) {
            case 1: {
                System.out.print("Valor à vista com 10% de desconto: R$ ");
                valorFinalCompra = totalCompra * 0.9f;
            }
            case 2: {
                System.out.print("Valor à vista no cartão de crédito com 15% de desconto: R$ ");
                valorFinalCompra = totalCompra * 0.85f;
            }
            case 3: {
                System.out.print("Em 2x sem juros: R$ ");
                valorFinalCompra = totalCompra;
            }
            case 4:{
                System.out.print("Em 3x com 10% de juros: R$ ");
                valorFinalCompra = totalCompra * 1.1f;
            }
            default:
                System.out.println("Valor inválido");
        }

        System.out.println("Valor da compra: R$ " + totalCompra);

        scanner.close();
    }

}