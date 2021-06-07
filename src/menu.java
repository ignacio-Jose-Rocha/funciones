
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cuadratica cuad =new cuadratica();
        lineal li = new lineal();
        System.out.println("ingrese que calculo quiere hacer 1-lineal 2-cuadratica");
        int casoa = scanner.nextInt() ;
        switch (casoa) {
            case 1:
                System.out.println("ingrese si conoce los datos de la funcion 1-si 2-no 3-parcialmente");
                int caso = scanner.nextInt();
                switch (caso) {
                    case 1:
                        System.out.println("ingrese el dato para la funcion lineal");
                        Double dato = scanner.nextDouble();
                        System.out.println("ingrese el dato de limite de la funcion lineal");
                        Double fin = scanner.nextDouble();
                        System.out.println("ingrese el dato de la pendiente");
                        Double pendiente = scanner.nextDouble();
                        System.out.println("ingrese el dato de la ordenada al origen");
                        Double ordenada = scanner.nextDouble();
                        for (double i = dato; i <=fin; i++) {
                            System.out.println(li.datos(pendiente, i, ordenada));
                        }
                        break;
                    case 2:
                        System.out.println("ingrese un punto de la recta en x si la conoce");
                        Double x = scanner.nextDouble();
                        System.out.println("ingrese otro punto de la recta en x si la conoce");
                        Double x1 = scanner.nextDouble();
                        System.out.println("ingrese un punto de la recta en y si la conoce");
                        Double y =scanner.nextDouble();
                        System.out.println("ingrese otro punto de la recta en y si la conoce");
                        Double y1 = scanner.nextDouble();
                        System.out.println(li.datosConPuntos(x, y, x1, y1));

                        break;

                    case 3:
                        System.out.println("ingrese 1 si conoce el pendiente o 2 si conoce la ordenada al origen");
                        int i = scanner.nextInt();
                        if(i==1) {
                            System.out.println("ingrese el punto x de la recta");
                            Double u = scanner.nextDouble();
                            System.out.println("ingrese el punto y de la recta");
                            Double qw = scanner.nextDouble();
                            System.out.println("ingrese pendiente");
                            Double hgf = scanner.nextDouble();
                            System.out.println(li.datosSemipunto(u, qw, hgf));
                        }
                        else{
                            System.out.println("ingrese el punto x de la recta");
                            Double ux = scanner.nextDouble();
                            System.out.println("ingrese el punto y de la recta");
                            Double qwx = scanner.nextDouble();
                            System.out.println("ingrese ordenada al origen");
                            Double hgfx = scanner.nextDouble();
                            System.out.println(li.datosSemipunto2(ux, qwx, hgfx));
                        }
                        break;
                }
                break;
            case 2:
                System.out.println("ingrese el tipo de funcion cuadratica 1-comun 2-cannonica 3-factorizaada");
                int cas=scanner.nextInt();
                switch (cas) {
                    case 1:
                        System.out.println("ingrese a");
                        Double a = scanner.nextDouble();
                        System.out.println("ingrese b");
                        Double b = scanner.nextDouble();
                        System.out.println("ingrese c");
                        Double c = scanner.nextDouble();
                        if (cuad.datoFormaComunPrimeraParte(a, b, c) == 0) {
                            System.out.println("es una funcion sin raices");
                        }
                        else {
                            if (cuad.datoFormaComunPrimeraParte(a, b, c) == 1) {
                                System.out.println("el resultado es: " + cuad.CatoUnaRaiz(a, b, c));
                            } else {
                                System.out.println("el resultado es: " + cuad.catoDosRaices(a, b, c));
                            }
                        }
                break;
                    }

        }}}
