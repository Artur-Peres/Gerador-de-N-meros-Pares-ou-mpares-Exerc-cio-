import java.util.Scanner;

public class EstruturaRepticao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*for (int i=1; i<=3; i++){
            for (int j=1; j<=3; j++){
                System.out.printf("x ");
                if(j==3){
                    System.out.printf("\n");
                }
            }
        }*/
        String c ="";
        while(!c.equals("x")){
            System.out.println("Digite um comando:");
            c = scanner.next();
            String x="";
            switch (c){
                case "Receba"->x="Melhor de todos! SIIIIIIIIIRRRRR!!";
                case "PlayTV"->x="Nois ta como? Xambão! Ai caralho, vem com o pix!";
                case "QueIssoBK?"->x="que cerula é esse?";
            }
            System.out.println(x);
        }
    }
}
