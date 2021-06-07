public class cuadratica {
    public double datoFormaComunPrimeraParte(double a,double b, double c){
        double ac=0.0;
        double bc=1.0;
        double cx=2.0;
        double x=((b*b)-4*a*c);
        if(x<0){
            return ac;
        }
        else{
            if(x==0){
                return bc;
            }
            else{
                return cx;
            }
        }
    }
    public double CatoUnaRaiz(double a, double b, double c){
        double resultado= -b/2*a;
        return resultado;
    }
    public String catoDosRaices(double a,double b,double c){
        double i=0,o=0,x=0;
        double asdf=Math.sqrt((b*b)-4*a*c);
        o=(-b+(asdf)/2*a);
        i=(-b-(asdf)/2*a);

        return String.format(" raiz primera = %.2f raiz segunda = %.2f",o,i);

    }

}
