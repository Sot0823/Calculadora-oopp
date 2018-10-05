package calc;
import calc.cc;

import java.util.Scanner;

public class cb {

        public static void main(String[] args) {
            Scanner Teclado = new Scanner(System.in);

            double a ,b, d;
            int o;
            cc Cal;

            System.out.println("Dame el Valor de A: ");
            a = Teclado.nextDouble();

            System.out.println("Dame el Valor de B: ");
            b = Teclado.nextDouble();

            System.out.println("Que operacion deseas hacer? \n 1. + \n 2. - \n 3. / \n 4. * ");
            o = Teclado.nextInt();

            Cal = new cc(a, b);

            switch (o) {
                case 1:
                    d = Cal.Sumar();
                    System.out.println("El Valor es:" + d);
                    break;
                case 2:
                    d = Cal.Restar();
                    System.out.println("El valor es:" + d);
                    break;
                case 3:
                    d = Cal.Dividir();
                    System.out.println("El valor es:" + d);
                    break;

                case 4:
                    d = Cal.Multiplicar();
                    System.out.println("El valor es:" + d);
                    break;
            }

        }
    }
