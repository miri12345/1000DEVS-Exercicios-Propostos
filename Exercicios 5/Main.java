import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
		exerciciooito();
	}
	
	public static void exercicioum(){
	    int numero = 0;
	    
	    do{
	        numero = numero + 1;
	        System.out.println(numero);
	    }while(numero < 10);
	}
	
	public static void exerciciodois(){
	    int numero = 0;
	    
	    while(numero < 10){
	        numero++;
	        System.out.println(numero);
	    }
	}
	
	public static void exerciciotres(){
	    for (int numero = 1; numero <= 10; numero++){
	        System.out.println(numero);
	    }
	}
	
	public static void exercicioquatro() {
    Scanner scanner = new Scanner(System.in);
    String escolha = "s";

    while (!escolha.equals("n")) { // !escolha.equals para comparar strings
        System.out.println("Deseja continuar? (Digite 'n' para sair)");
        escolha = scanner.nextLine();

        if (escolha.equals("n")) {
            System.out.println("Encerrando o programa.");
            System.exit(0);
        }
    }

    scanner.close();
}

public static void exerciciocinco(){
        Scanner scanner = new Scanner(System.in);
        String escolha = "s";
        
        do{
            
        System.out.println("Deseja continuar? (Digite 'n' para sair)");
        escolha = scanner.nextLine();

        if (escolha.equals("n")) {
            System.out.println("Encerrando o programa.");
            System.exit(0);
        }
            
        }while(!escolha.equals("n"));

}

public static void exercicioseis(){
    Scanner scanner = new Scanner(System.in);
    int negativos = 0, positivos = 0;
    int valor = 0;
    int quantidade = 0;
    
    while(quantidade <= 4){
        
        System.out.println("Digite um valor: ");
        valor = scanner.nextInt();
        
        if(valor < 0){
            negativos++;
        }
        if(valor >= 0){
            positivos++;
        }
        quantidade++;
       
    }
    
    System.out.println("Valores positivos: " + positivos);
    System.out.println("Valores negativos: " + negativos);

}

public static void exerciciosete(){
    Scanner scanner = new Scanner(System.in);
    
    int soma = 0;
    int quantidade = 0;
    int negativos = 0;
    int positivos = 0;
    int escolha = 0;
    
    do{
        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();
        
        soma += valor;
        
        quantidade++;
        
        System.out.println("Deseja continuar? Digite 1(SIM) ou 2(NÃO)");
        escolha = scanner.nextInt();
        
        if(valor < 0){
            negativos++;
        }else{
            positivos++;
        }
        

    }while(escolha == 1);
    
    if (quantidade > 0) { 
            double media = soma / quantidade;
            System.out.println("A média dos valores digitados é: " + media);
        } else {
            System.out.println("Nenhum valor foi inserido.");
        }

        System.out.println("Valores positivos: " + positivos + " e valores negativos: " + negativos);
        
        scanner.close();
}

public static void exerciciooito(){
    Scanner scanner = new Scanner(System.in);
   int maior = Integer.MIN_VALUE; 
   int menor = Integer.MAX_VALUE; 
    
    for(int contador = 1; contador <= 6; contador++){
        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();
        
        if (contador == 1) {
                maior = valor;
                menor = valor;
            } else {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
        
    }
}
     System.out.println("O maior número é: " + maior + " eo menor é: " + menor);
    
    scanner.close();

}
}
