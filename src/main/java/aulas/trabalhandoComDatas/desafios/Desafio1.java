package aulas.trabalhandoComDatas.desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Desafio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int a = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int total = a*b; // Altere o valor da variável com o cálculo esperado
        System.out.println("PROD = " + total);
    }

}
