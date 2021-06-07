public class lineal {
    double r;
    double e;
    public double datos(double a,double b, double c){
        double o=0;
        o=a*b+c;
        return o;
    }
    public String datosConPuntos(double x,double y, double x1, double y1){
        double a=0,c=0,d=0;
        r= (y-y1)/(x-x1);
        //r=pendiente
        e=r*x-y;
        //e = ordenada al origen

        return String.format("y=%.2f*x+%.2f",r,e);


    }
    public String datosSemipunto(double x,double y, double pendiente){
        double a=0,b=0,c=0;
        a=pendiente;
        c=pendiente*x-y;



        return String.format("y=%.2f*x+%.2f",a,c);
    }
    public String datosSemipunto2(double x,double y, double ordenada){
        double a=0,b=0;
        a=(y-ordenada)/x;
        return String.format("y=%.2f*x+%.2f",a,ordenada);
    }
}
