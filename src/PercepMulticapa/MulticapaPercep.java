package PercepMulticapa;

import java.util.Scanner;
import java.util.Random;

public class MulticapaPercep {

    double[][] arr = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 1, 1},
            {0, 0, 0}
    };

    double w1X1, w2X1, w1X2, w2X2, w1Y1,
            w1Y2, wBias1, wBias2, wBias3,
            FA = 0.5, ED1 = 0,
            ED2 = 0, ED3 = 0,
            y1 = 0, y2 = 0, y3 = 0;

    int f = 0, ite = 1;

    public static void main(String[] args) {


        System.out.println("       Introduce la Cantidad de Iteracciones"+"\n"+"Entre mas Iteraciones, mas se acercara al valor esperado");
        Scanner leerX1 = new Scanner(System.in);
        int x = Integer.parseInt(leerX1.next());




    }

}
