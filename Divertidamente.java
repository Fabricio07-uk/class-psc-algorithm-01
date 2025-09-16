import java.util.Scanner;

public class Divertidamente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;

        System.out.print("Quantas novas amizades Riley fez na cidade? ");
        int amizades = input.nextInt();

        if (amizades > 0) {
            alegria += amizades * 10;
        } else {
            tristeza += 30;
        }

        System.out.print("Digite a nota da prova A1 (0 a 10): ");
        double A1 = input.nextDouble();

        System.out.print("Digite a nota da prova A2 (0 a 10): ");
        double A2 = input.nextDouble();

        System.out.print("Digite a nota da prova A3 (0 a 10): ");
        double A3 = input.nextDouble();

        double media = (A1 + A2 + A3) / 3.0;

        if (media >= 7) {
            alegria += 50;
        } else {
            tristeza += 50;
        }

        System.out.print("Quantos exercícios de programação Riley conseguiu resolver (0 a 10)? ");
        int exercicios = input.nextInt();

        alegria += exercicios * 10;
        tristeza += (10 - exercicios) * 10;

        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        input.close();
    }
}
