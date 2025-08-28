//Já manjo de if, if else e else.

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Inforne o dano da flecha(1 a 4): ");
        byte n = scanner.nextByte();
        var result = switch (n){
            case 1-> "Falha crítica!! Sua flecha acerta seu aliado no ombro!";
            case 2-> "Fracasso! Seu tiro sai torto!";
            case 3-> "Acerto! Seu tiro acerta o braço do inimigo!";
            case 4-> "Acerto crítico!! Seu desparo acerta em cheio o peito do inimigo, que cai desacordado!!";
            default-> "Informe o dano dentro da margem!";

            /*
            case 1-> System.out.println("Falha crítica!! Sua flecha acerta seu aliado no ombro!");
            case 2-> System.out.println("Fracasso! Seu tiro sai torto!");
            case 3-> System.out.println("Acerto! Seu tiro acerta o braço do inimigo!");
            case 4-> System.out.println("Acerto crítico!! Seu desparo acerta em cheio o peito do inimigo, que cai desacordado!!");
            default-> System.out.println("Informe o dano dentro da margem!");

            case 1:
                System.out.println("Falha crítica!! Sua flecha acerta seu aliado no ombro!");
                break;
            case 2:
                System.out.println("Fracasso! Seu tiro sai torto!");
                break;
            case 3:
                System.out.println("Acerto! Seu tiro acerta o braço do inimigo!");
                break;
            case 4:
                System.out.println("Acerto crítico!! Seu desparo acerta em cheio o peito do inimigo, que cai desacordado!!");
                break;
            default:
                System.out.println("Informe o dano dentro da margem!");
             */
        };
        System.out.println(result);
    }
}
