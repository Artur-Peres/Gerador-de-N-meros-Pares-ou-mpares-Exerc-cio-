import java.util.ArrayList;
import java.util.Scanner;

public class ExerciciosRepticao {
    public static void main(String[] args){
        /*for(int i=1; i<=10; i++){

            for(int j=1; j<=10; j++){
                int result= i*j;

                System.out.printf("%d x %d = %d\n", i, j, result);
                if(j==10){
                    System.out.println();
                }
            }

        }*/
        ArrayList<Integer> listaPAR = new ArrayList<>();
        ArrayList<Integer> listaIMPAR = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeiro número:");
        int primeiroN= scanner.nextInt();
        System.out.println("Segundo número:");
        int segundoN= scanner.nextInt();

        while(primeiroN>segundoN){
            System.out.println("Segundo número menor que o primeiro. Informe outro número!");
            segundoN = scanner.nextInt();
        }

        System.out.println("Informe se quer os números pares(PAR) ou impares(IMPAR)!");
        String parOUimpar= scanner.next();

        while(!parOUimpar.equals("PAR") & !parOUimpar.equals("IMPAR")){
            System.out.println("Valor inválido!");
            parOUimpar= scanner.next();
        }


        for(int i=primeiroN; i<=segundoN; i++){
            if(parOUimpar.equals("PAR")){
                if(i%2==0){
                    listaPAR.addFirst(i);
                }
            } else if (parOUimpar.equals("IMPAR")){
                if(i%2!=0){
                    listaIMPAR.addFirst(i);
                }
            }
        }

        switch (parOUimpar){
            case "PAR":
                System.out.println("Números pares na margem escolhida:");
                System.out.println(listaPAR);
                break;
            case "IMPAR":
                System.out.println("Números impares na margem escolhida:");
                System.out.println(listaIMPAR);
        }

    }
}


