package Source;


import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Operacion {
    public Operacion(){}
    
    public double real;
    public double imaginario;
    public double z;
    int banderaFuncion =0;
    int banderaTan =0;
    ArrayList<Double> arregloReales = new ArrayList<>(); 
    ArrayList<Double> arregloImaginarios = new ArrayList<>();
           
    Graficas g = new Graficas();
    public void sumar(double real1,double imaginario1,double real2,double imaginario2){
        double resReal = real1+real2;
        double resImaginario = imaginario1+imaginario2;
       
        real = resReal;
        imaginario = resImaginario;
        if(banderaFuncion == 0)
        g.agregarGrafica(real,imaginario," adición");
       
    }
    
    public void restar(double real1,double imaginario1,double real2,double imaginario2){
        if(real2<0){
            Math.abs(real2);
        }
        if(imaginario2 < 0){
            Math.abs(imaginario2);
        }
        double resReal = real1-real2;
        double resImaginario = imaginario1-imaginario2;
      
        real = resReal;
        imaginario = resImaginario;
       if(banderaFuncion == 0)
        g.agregarGrafica(real,imaginario," diferencia");
    }
    
    public void multiplicar(double real1,double imaginario1,double real2,double imaginario2){
        double resReal = (real1*real2) - (imaginario1*imaginario2);
        double resImaginario = (real1*imaginario2) + (imaginario1 * real2);
       
        real = resReal;
        imaginario = resImaginario;
            if(banderaFuncion == 0)
            g.agregarGrafica(real,imaginario," producto");
    }
    
    public void dividir(double real1,double imaginario1,double real2,double imaginario2){
        double a = real1;
        double b = imaginario1;
        double c = real2;
        double d = imaginario2;
        double denominador = Math.pow(c, 2) + Math.pow(d, 2);
        
        if(denominador==0){
            System.out.println("Error, denominador negativo");
        }
        else{
            double B = ((b*c)-(d*a))/denominador;
            double A = ((c*a)+(b*d))/denominador;
           
            real = A;
            imaginario = B;
            if(banderaFuncion == 0)
            g.agregarGrafica(real,imaginario," cociente");
        }
    }
    
    public void elevarPotencia(double real1,double imaginario1,double real2){
        
       double x = real1;
        double y = imaginario1;
        double n = real2;
        
        
        double r = Math.pow(x, 2)+Math.pow(y, 2);
        double z = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        
        double alpha = Math.atan2(y, x);
        alpha = Math.toDegrees(alpha);
        double theta = 180 - alpha;
        
       // System.out.print("Forma Polar: [√("+r+")^"+n+"] [cos("+alpha*n+")+ isen("+alpha*n+")] = ");
        z = Math.abs(z);
        real = Math.pow(Math.sqrt(r), n)* Math.cos(Math.toRadians(alpha*n));
        imaginario = Math.pow(Math.sqrt(r),n) * Math.sin(Math.toRadians(alpha*n));
       
         if(banderaTan == 0)  
        g.agregarGrafica(real, imaginario," potencia");
    }
    
    public void raiz(double real1,double imaginario1,double real2){
        
        Scanner sc = new Scanner(System.in);
        
        if( real2 < 2){
            System.out.println("n debe tener un valor >= 2");
        }
        else{
            
            double x = real1;
        double y = imaginario1;
        int n = (int)real2;
        //float exp = (float)1/n;
        double r = Math.pow(x, 2)+Math.pow(y, 2);
        double z = Math.sqrt(r);
        
        double alpha = Math.atan2(y, x);
        alpha = Math.toDegrees(alpha);
        double theta = 180 - alpha;
           
        for(int i=0;i<n;i++){
          //  System.out.print("Z"+i+": [√("+r+")^1/"+n+"] [cos("+alpha+"+360*"+i+")/"+n+"  isen("+alpha+"+360*"+i+")/"+n+")]=");
            
            real = Math.pow(z, (float)1/n)*(Math.cos(Math.toRadians(alpha+(360*i))/n));
            imaginario = Math.pow(z, (float)1/n)*(Math.sin(Math.toRadians(alpha+(360*i))/n));
                      
            arregloReales.add(real);
            arregloImaginarios.add(imaginario);
        }
            g.agregarGrafica(arregloReales, arregloImaginarios,n);
            
              
        }
    }
    
    public String obtenerResultado(){
        
        String resultado = real+" +("+imaginario+")i";
        return resultado;
     
    }
    
    public String obtenerArreglos(){
        String arreglos="";
        for(int i=0;i<arregloReales.size();i++){
            arreglos+="Z"+i+":"+arregloReales.get(i)+"+i("+arregloImaginarios.get(i)+")\n";
        }
        return arreglos;
    }
    public void obtenerConjugado(double real1,double imaginario1){
       
        real = real1;
        imaginario = -1*imaginario1;
        g.agregarGrafica(real, imaginario, " conjugado");
       
    }
    
    public void obtenerDistancia(double real1,double imaginario1,double real2,double imaginario2){
        
        
        double z1 = Math.pow(real1, 2) + Math.pow(imaginario1, 2);
        double z2 = Math.pow(real2, 2) + Math.pow(imaginario2, 2);
        g.agregarGrafica(real1, imaginario1, real2, imaginario2);
        if(z1 < 0 || z2 < 0){
            System.out.println("ERROR ARGUMENTO NEGATIVO");
        }
        else{
            z1 = Math.sqrt(z1);
            z2 = Math.sqrt(z2);
            z = Math.abs((z1-z2));
            
        } 
    }
    
    public double obtenerZ(){
        return z;
    }
    
    public void obtenerExponencial(double x,double y){
        //imaginario = Math.sin(Math.toRadians(8));
        real = Math.pow(Math.E, x)*Math.cos(Math.toRadians(y));
        imaginario = Math.pow(Math.E, x)*Math.sin(Math.toRadians(y));
        if(banderaFuncion == 0)
       g.agregarGrafica(real, imaginario, " exponencial");
    }
    
    public void obtenerSeno(double x,double y){
        double r1,r2,i1,i2;
        banderaFuncion = 1;
        multiplicar(x,y,0,1);
        obtenerExponencial(real,imaginario);
        r1 = real;
        i1 = imaginario;
        multiplicar(x,y,0,-1);
        obtenerExponencial(real,imaginario);
        r2 = real;
        i2 = imaginario;
        restar(r1,i1,r2,i2);
        dividir(real,imaginario,0,2);
        if(banderaTan == 0)
        g.agregarGrafica(real, imaginario, " sin");
        banderaFuncion = 0;
    }
    
    public void obtenerCoseno(double x,double y){
        double r1,r2,i1,i2;
        banderaFuncion = 1;
        multiplicar(x,y,0,1);
        obtenerExponencial(real,imaginario);
        r1 = real;
        i1 = imaginario;
        multiplicar(x,y,0,-1);
        obtenerExponencial(real,imaginario);
        r2 = real;
        i2 = imaginario;
        sumar(r1,i1,r2,i2);
        dividir(real,imaginario,2,0);
        if(banderaTan == 0)
        g.agregarGrafica(real, imaginario, " cos");
        banderaFuncion = 0;
    }
    
    public void obtenerTangente(double x,double y){
        double r1,r2,i1,i2;
        banderaTan = 1;
        
        obtenerSeno(x,y);
        r1 = real;
        i1 = imaginario;
       
        obtenerCoseno(x,y);
        r2 = real;
        i2 = imaginario;
       
        banderaFuncion = 1;
        dividir(r1,i1,r2,i2);
        
        g.agregarGrafica(real, imaginario, " tan");
        banderaTan = 0;
        banderaFuncion =0;
    }
    
    public void obtenerCotangente(double x,double y){
       
        double r1,r2,i1,i2;
        banderaTan = 1;
        
        obtenerSeno(x,y);
        r1 = real;
        i1 = imaginario;
        obtenerCoseno(x,y);
        r2 = real;
        i2 = imaginario;
        
        banderaFuncion = 1;
        dividir(r2,i2,r1,i1);
        g.agregarGrafica(real, imaginario, " cot");
        banderaTan = 0;
        banderaFuncion =0;
    }
    
    public void obtenerSecante(double x,double y){
        
        banderaTan = 1;
        
        obtenerCoseno(x,y);
        banderaFuncion = 1;
        dividir(1,0,real,imaginario);
        g.agregarGrafica(real, imaginario, " sec");
        banderaTan = 0;
        banderaFuncion =0;
    }
    
    public void obtenerCosecante(double x,double y){
        banderaTan = 1;
        
        obtenerSeno(x,y);
        banderaFuncion = 1;
        dividir(1,0,real,imaginario);
        g.agregarGrafica(real, imaginario, " csc");
        banderaTan = 0;
        banderaFuncion =0;
    }
    
    public void obtenerSenoHiper(double x,double y){
        double r1,r2,i1,i2;
        banderaFuncion = 1;
        obtenerExponencial(x,y);
        
        r1 = real;
        i1 = imaginario;
        multiplicar(x,y,-1,0);
        
        obtenerExponencial(real,imaginario);
        
        r2 = real;
        i2 = imaginario;
        restar(r1,i1,r2,i2);
        
        dividir(real,imaginario,2,0);
        if(banderaTan!=1)
        g.agregarGrafica(real, imaginario, " sinh");
        banderaFuncion = 0;
    }
    public void obtenerCosenoHiper(double x,double y){
        double r1,r2,i1,i2;
        banderaFuncion = 1;
        obtenerExponencial(x,y);
        
        r1 = real;
        i1 = imaginario;
        multiplicar(x,y,-1,0);
        
        obtenerExponencial(real,imaginario);
        
        r2 = real;
        i2 = imaginario;
        sumar(r1,i1,r2,i2);
        
        dividir(real,imaginario,2,0);
        if(banderaTan != 1)
        g.agregarGrafica(real, imaginario, " cosh");
        banderaFuncion = 0;
    }
    
    public void obtenerTangenteHiper(double x,double y){
        double r1,r2,i1,i2;
        banderaTan = 1;
        
        obtenerSenoHiper(x,y);
        r1 = real;
        i1 = imaginario;
        obtenerCosenoHiper(x,y);
        r2 = real;
        i2 = imaginario;
        banderaFuncion = 1;
        dividir(r1,i1,r2,i2);
        g.agregarGrafica(real, imaginario, " tanh");
        banderaTan = 0;
       banderaFuncion = 0;
    }
    public void obtenerCotangenteHiper(double x,double y){
        double r1,r2,i1,i2;
        banderaTan = 1;
        
        obtenerSenoHiper(x,y);
        r1 = real;
        i1 = imaginario;
        obtenerCosenoHiper(x,y);
        r2 = real;
        i2 = imaginario;
        banderaFuncion = 1;
        dividir(r2,i2,r1,i1);
        g.agregarGrafica(real, imaginario, " coth");
        banderaTan = 0;
       banderaFuncion = 0;
    }
    
    public void obtenerSecanteHiper(double x, double y){
        banderaTan = 1;
        obtenerCosenoHiper(x,y);
        banderaFuncion = 1;
        dividir(1,0,real,imaginario);
        g.agregarGrafica(real,imaginario," sech");
        banderaTan = 0;
        banderaFuncion =0;
        
    }
    
    public void obtenerCosecanteHiper(double x, double y){
        banderaTan = 1;
        obtenerSenoHiper(x,y);
        banderaFuncion = 1;
        dividir(1,0,real,imaginario);
        g.agregarGrafica(real,imaginario," csch");
        banderaTan = 0;
        banderaFuncion =0;
    }
    
    public void obtenerLn(double x, double y){
       
        
        double z = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)); 
        double alpha = Math.atan2(y, x);
        alpha = Math.toDegrees(alpha);
        double theta = 180 - alpha;
        
       
        z = Math.abs(z);
        
        real  = Math.log(z);
        
        imaginario = Math.toRadians(alpha);
        
       if(banderaFuncion == 0)
        g.agregarGrafica(real, imaginario, " Ln");
    }
    public void obtenerArcoSeno(double x, double y){
        
       banderaTan = 1;
       banderaFuncion = 1;
       elevarPotencia(x,y,2);
       restar(1,0,real,imaginario);
       elevarPotencia(real,imaginario,0.5);
       double raux = real,iaux = imaginario;
       multiplicar(0,1,x,y);
       sumar(raux,iaux,real,imaginario);
       obtenerLn(real,imaginario);
       dividir(real,imaginario,0,1);
       if(banderaFuncion != 2)
       g.agregarGrafica(real, imaginario, " asin");
       banderaTan =0;
       banderaFuncion =0;
    }
    
    public void obtenerArcoCoseno(double x, double y){
       banderaTan = 1;
       banderaFuncion = 1;
       elevarPotencia(x,y,2);
       restar(real,imaginario,1,0);
       elevarPotencia(real,imaginario,0.5);
       sumar(x,y,real,imaginario);
       obtenerLn(real,imaginario);
       dividir(real,imaginario,0,1);
       if(banderaFuncion != 2)
       g.agregarGrafica(real, imaginario, " acos");
       banderaTan=0;
    }
    
    public void obtenerArcoTangente(double x,double y){
        double raux,iaux;
        banderaTan = 1;
        banderaFuncion = 1;
        sumar(0,1,x,y);
        raux = real; 
        iaux = imaginario;
        restar(0,1,x,y);
        dividir(raux,iaux,real,imaginario);
        obtenerLn(real,imaginario);
        raux = real;
        iaux = imaginario;
        dividir(0,1,2,0);
        multiplicar(raux,iaux,real,imaginario);
        g.agregarGrafica(real, imaginario, " atan");
        banderaTan = 0;
        banderaFuncion = 0;
        
    }
    public void obtenerArcoCotangente(double x,double y){
        double raux,iaux;
        banderaTan =1;
        banderaFuncion = 1;
        sumar(x,y,0,1);
        raux = real;
        iaux = imaginario;
        restar(x,y,0,1);
        dividir(raux,iaux,real,imaginario);
        obtenerLn(real,imaginario);
        dividir(real,imaginario,0,2);
        
        g.agregarGrafica(real, imaginario, " acot");
        banderaTan =0;
        banderaFuncion = 0;
        //TAMBIEN FUNCIONA CON LA INVERSA DE Z atan(i/z) WOLFRAM TIENE ERROR
        /*
        banderaTan = 1;
        banderaFuncion = 1;
        dividir(1,0,x,y);
        x = real;
        y = imaginario;
        sumar(0,1,x,y);
        raux = real; 
        iaux = imaginario;
        restar(0,1,x,y);
        dividir(raux,iaux,real,imaginario);
        obtenerLn(real,imaginario);
        raux = real;
        iaux = imaginario;
        dividir(0,1,2,0);
        multiplicar(raux,iaux,real,imaginario);
        g.agregarGrafica(real, imaginario, " acot");
        banderaTan = 0;
        banderaFuncion = 0;*/
    }
    public void obtenerArcoSecante(double x,double y){
        banderaFuncion =1;
        banderaTan = 1;
        dividir(1,0,x,y);
        banderaFuncion++;
        obtenerArcoCoseno(real,imaginario);
        g.agregarGrafica(real, imaginario, " asec");
        banderaFuncion =0;
        banderaTan = 0;
    }
    
    public void obtenerArcoCosecante(double x,double y){
        banderaFuncion =1;
        banderaTan = 1;
        dividir(1,0,x,y);
        banderaFuncion++;
        obtenerArcoSeno(real,imaginario);
        g.agregarGrafica(real, imaginario, " asec");
        banderaFuncion =0;
        banderaTan = 0;
    }
    
    public void obtenerArcoSenoHiperbolico(double x,double y){
        banderaFuncion++;
        banderaTan =1;
        elevarPotencia(x,y,2);
        sumar(real,imaginario,1,0);
        elevarPotencia(real,imaginario,0.5);
        sumar(x,y,real,imaginario);
        obtenerLn(real,imaginario);
        if(banderaFuncion != 2){
        g.agregarGrafica(real, imaginario, " asinh");
        }
        banderaFuncion =0;
        banderaTan =0;
    }
    
    public void obtenerArcoCosenoHiperbolico(double x, double y){
        banderaFuncion++;
        banderaTan =1;
        
        elevarPotencia(x,y,2);
        sumar(real,imaginario,-1,0);
        elevarPotencia(real,imaginario,0.5);
        sumar(x,y,real,imaginario);
        obtenerLn(real,imaginario);
        if(banderaFuncion != 2)
        g.agregarGrafica(real, imaginario, " acosh");
        banderaFuncion =0;
        banderaTan =0;
    }
    
    public void obtenerArcoTangenteHiperbolica(double x,double y){
        double raux,iaux;
        banderaTan = 1;
        banderaFuncion =1;
        sumar (x,y,1,0);
        raux = real;
        iaux = imaginario;
        
        restar(1,0,real,imaginario);
        dividir(raux,iaux,real,imaginario);
        obtenerLn(real,imaginario);
        dividir(real,imaginario,2,0);
        if (banderaFuncion !=2)
        g.agregarGrafica(real, imaginario, " atanh");
        banderaTan = 0;
        banderaFuncion =0;
    }
    
    public void obtenerArcoCotangenteHiperbolica(double x, double y){
        banderaTan = 1;
        banderaFuncion =1;
        dividir(1,0,x,y);
        banderaFuncion++;
        obtenerArcoTangenteHiperbolica(real,imaginario);
        g.agregarGrafica(real, imaginario, " acoth");
        banderaTan = 0;
        banderaFuncion =0;
        
    }
    
    public void obtenerArcoSecanteHiperbolica(double x, double y){
        banderaTan = 1;
        banderaFuncion =1;
        dividir(1,0,x,y);
        banderaFuncion++;
        banderaTan++;
        obtenerArcoCosenoHiperbolico(real,imaginario);
        g.agregarGrafica(real, imaginario, " asech");
        banderaTan = 0;
        banderaFuncion =0;
    }
    public void obtenerArcoCosecanteHiperbolica(double x, double y){
        banderaTan = 1;
        banderaFuncion =1;
        dividir(1,0,x,y);
        banderaFuncion=1;
        banderaTan++;
        obtenerArcoSenoHiperbolico(real,imaginario);
        g.agregarGrafica(real, imaginario, " acsch");
        banderaTan = 0;
        banderaFuncion =0;
    
    }
    
}
