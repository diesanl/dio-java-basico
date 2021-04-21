package aulas.trabalhandoComDatas.desafios;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        for (int i = 0; i <= num; i++) { //complete seu codigo aqui
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
