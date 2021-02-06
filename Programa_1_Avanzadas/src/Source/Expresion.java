package Source;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Expresion {
    char cadena[];
    int contador=0;
    int estadoPrevio = 0;
    String termino = "";
    String segundoTermino = "";
    String terminoAux="";
    int banderaPotencia = 0;
    int banderaRaiz = 0;
    //int banderaDistancia =0;
    double real1;
    double real2;
    double imaginario1;
    double imaginario2;
    int bandera = 0;
    int varAux =1;
    char simboloOperacion;
    int contadorAux;
    int signoReal = 1;
    int signoImaginario = 1;
    int banderaPunto =0;
    public int banderaError =0;
    public String resultado = "";
    String funcion ="";
    Operacion oper = new Operacion();
    public Expresion(){}
    public Expresion(String cadena){
        
        this.cadena = cadena.toCharArray();
        inicio();
    }
    
    public void inicio(){
        if(cadena[cadena.length-1]=='c'){
            contador = 0;
            qp();
        }
        else if(cadena[cadena.length-1]!=')'){
            M();
        }else{
        contador = 0;
        qp();
        }
    }
    
    public void qp(){
        
       // System.out.print("qp");
        signoReal = 1;
        signoImaginario = 1;
        banderaPunto =0;
        varAux =1;
        banderaError =0;
        if(contador < cadena.length){
            if(cadena[contador]=='e'){
                simboloOperacion ='e';
                contador++;
                qp();
            }
            else if(cadena[contador]=='a'&&cadena[contador+1]=='s'&&cadena[contador+2]=='i'&&cadena[contador+3]=='n'&&cadena[contador+4]=='h'){
                funcion = "asinh";
                contador =5;
                qp();
                
            }
            else if(cadena[contador]=='a'&&cadena[contador+1]=='c'&&cadena[contador+2]=='o'&&cadena[contador+3]=='s'&&cadena[contador+4]=='h'){
                funcion = "acosh";
                contador =5;
                qp();
                
            }
            else if(cadena[contador]=='a'&&cadena[contador+1]=='t'&&cadena[contador+2]=='a'&&cadena[contador+3]=='n'&&cadena[contador+4]=='h'){
                funcion = "atanh";
                contador =5;
                qp();
                
            }
            else if(cadena[contador]=='a'&&cadena[contador+1]=='c'&&cadena[contador+2]=='o'&&cadena[contador+3]=='t'&&cadena[contador+4]=='h'){
                funcion = "acoth";
                contador =5;
                qp();
                
            }
            else if(cadena[contador]=='a'&&cadena[contador+1]=='s'&&cadena[contador+2]=='e'&&cadena[contador+3]=='c'&&cadena[contador+4]=='h'){
                funcion = "asech";
                contador =5;
                qp();
                
            }
            else if(cadena[contador]=='a'&&cadena[contador+1]=='c'&&cadena[contador+2]=='s'&&cadena[contador+3]=='c'&&cadena[contador+4]=='h'){
                funcion = "acsch";
                contador =5;
                qp();
                
            }
            else if(cadena[contador]=='a'&&cadena[contador+1]=='s'&&cadena[contador+2]=='i'&&cadena[contador+3]=='n'){
                funcion = "asin";
                contador =4;
                qp();
                
            }
            else if(cadena[contador]=='a'&&cadena[contador+1]=='c'&&cadena[contador+2]=='o'&&cadena[contador+3]=='s'){
                funcion = "acos";
                contador =4;
                qp();
                
            }
            else if(cadena[contador]=='a'&&cadena[contador+1]=='t'&&cadena[contador+2]=='a'&&cadena[contador+3]=='n'){
                funcion = "atan";
                contador =4;
                qp();
                
            }
            else if(cadena[contador]=='a'&&cadena[contador+1]=='s'&&cadena[contador+2]=='e'&&cadena[contador+3]=='c'){
                funcion = "asec";
                contador =4;
                qp();
                
            }
            else if(cadena[contador]=='a'&&cadena[contador+1]=='c'&&cadena[contador+2]=='o'&&cadena[contador+3]=='t'){
                funcion = "acot";
                contador =4;
                qp();
                
            }
            else if(cadena[contador]=='a'&&cadena[contador+1]=='c'&&cadena[contador+2]=='s'&&cadena[contador+3]=='c'){
                funcion = "acsc";
                contador =4;
                qp();
                
            }
            
            else if(cadena[contador]=='s'&&cadena[contador+1]=='i'&&cadena[contador+2]=='n'&&cadena[contador+3]=='h'){
                funcion = "sinh";
                contador =4;
                qp();
                
            }
            else if(cadena[contador]=='c'&&cadena[contador+1]=='o'&&cadena[contador+2]=='s'&&cadena[contador+3]=='h'){
                funcion = "cosh";
                contador =4;
                qp();
                
            }
            else if(cadena[contador]=='t'&&cadena[contador+1]=='a'&&cadena[contador+2]=='n'&&cadena[contador+3]=='h'){
                funcion = "tanh";
                contador =4;
                qp();
                
            }
            else if(cadena[contador]=='s'&&cadena[contador+1]=='e'&&cadena[contador+2]=='c'&&cadena[contador+3]=='h'){
                funcion = "sech";
                contador =4;
                qp();
                
            }
            else if(cadena[contador]=='c'&&cadena[contador+1]=='s'&&cadena[contador+2]=='c'&&cadena[contador+3]=='h'){
                funcion = "csch";
                contador =4;
                qp();
                
            }
            else if(cadena[contador]=='c'&&cadena[contador+1]=='o'&&cadena[contador+2]=='t'&&cadena[contador+3]=='h'){
                funcion = "coth";
                contador =4;
                qp();
                
            }
            else if(cadena[contador]=='s'&&cadena[contador+1]=='i'&&cadena[contador+2]=='n'){
                funcion = "sin";
                contador =3;
                qp();
                
            }
            else if(cadena[contador]=='c'&&cadena[contador+1]=='o'&&cadena[contador+2]=='s'){
                funcion = "cos";
                contador =3;
                qp();
                
            }
            else if(cadena[contador]=='c'&&cadena[contador+1]=='o'&&cadena[contador+2]=='t'){
                funcion = "cot";
                contador =3;
                qp();
                
            }
            else if(cadena[contador]=='t'&&cadena[contador+1]=='a'&&cadena[contador+2]=='n'){
                funcion = "tan";
                contador =3;
                qp();
                
            }
            else if(cadena[contador]=='s'&&cadena[contador+1]=='e'&&cadena[contador+2]=='c'){
                funcion = "sec";
                contador =3;
                qp();
                
            }
            else if(cadena[contador]=='c'&&cadena[contador+1]=='s'&&cadena[contador+2]=='c'){
                funcion = "csc";
                contador =3;
                qp();
                
            }
            
            else if(cadena[contador]=='l'&&cadena[contador+1]=='n'){
                funcion = "ln";
                contador =2;
                qp();
            }
            
            else if(cadena[contador]!='('){
            M();
            }
            else{
            contador++;
            q0();
            }
        }
    }
        
    public void q0(){
        estadoPrevio =0;
        contadorAux = contador;
        //System.out.print(" q0");
        //System.out.println("ZZZ"+cadena[contador]+" banderaPot"+banderaPotencia);
        if(contador < cadena.length){
            //Svalida si es de 0-9 y se va a q1()
            if(banderaPotencia == 0){
            if(cadena[contador]=='0'||cadena[contador]=='1'||cadena[contador]=='2'||
                cadena[contador]=='3'||cadena[contador]=='4'||cadena[contador]=='5'||
                cadena[contador]=='6'||cadena[contador]=='7'||cadena[contador]=='8'||
               cadena[contador]=='9'){

             contador++;
             q1();
             }
            
            //valida si es - y se va a q5
            else if(cadena[contador]=='-'){
                contador++;
                q5();
            }
            //valida si es i y se va a q7();
            else if(cadena[contador]=='i'){
                contador++;
                q7();
            } 
            else {
                 M();
             }
             }
            else if(banderaPotencia == 1||banderaRaiz == 1){
            
                if(cadena[contador]=='0'||cadena[contador]=='1'||cadena[contador]=='2'||
                cadena[contador]=='3'||cadena[contador]=='4'||cadena[contador]=='5'||
                cadena[contador]=='6'||cadena[contador]=='7'||cadena[contador]=='8'||
               cadena[contador]=='9'){

                contador++;
                q1();
                }
                else if(cadena[contador]=='-'){
                    contador++;
                    q5();
                }
                
                else M();
            }
        }
        //Si bandera potencia es true
        
        }
    
        public void q1(){
            
          //  System.out.print(" q1");
            
              estadoPrevio = 1;  
                
           
            
            if(contador < cadena.length){
                if(banderaPotencia == 0 && banderaRaiz == 0 && banderaPunto <=1){
                if(cadena[contador]=='0'||cadena[contador]=='1'||cadena[contador]=='2'||
                cadena[contador]=='3'||cadena[contador]=='4'||cadena[contador]=='5'||
                cadena[contador]=='6'||cadena[contador]=='7'||cadena[contador]=='8'||
                cadena[contador]=='9'){

                contador++;
                 q1();
                }
                else if(cadena[contador] == '.'){
                    banderaPunto++;
                    contador++;
                    q1();
                }
                
                else if(cadena[contador] == '+'){
                contador++;
                q2();
                }
                else if(cadena[contador] == '-'){
                contador++;
                q12();
                }
                else if(cadena[contador] == 'i'){
                contador++;
                q7();
                }
                
                else if(cadena[contador]==')'){
                contador++;
                q10();
                }
                else M();
            }
            else{
                if(cadena[contador]=='0'||cadena[contador]=='1'||cadena[contador]=='2'||
                cadena[contador]=='3'||cadena[contador]=='4'||cadena[contador]=='5'||
                cadena[contador]=='6'||cadena[contador]=='7'||cadena[contador]=='8'||
                cadena[contador]=='9'){

                contador++;
                 q1();
                }
                else if(cadena[contador] == '.'){
                    banderaPunto++;
                    contador++;
                    q1();
                }
                else if(cadena[contador]==')'){
                    contador++;
                    q10();
                }
                else M();
            }
            
            }
            
            
        }
        
        public void q2(){
            if(estadoPrevio==1 && varAux == 0){signoReal=0;}
           estadoPrevio =2;
           banderaPunto = 0;
          // System.out.print(" q2");
             
            if(contador < cadena.length){
                if(cadena[contador]=='0'||cadena[contador]=='1'||cadena[contador]=='2'||
                cadena[contador]=='3'||cadena[contador]=='4'||cadena[contador]=='5'||
                cadena[contador]=='6'||cadena[contador]=='7'||cadena[contador]=='8'||
               cadena[contador]=='9'){

             contador++;
             q3();
             }
                else if(cadena[contador]=='i'){
                    contador++;
                    q6();
                }
                
                else M();
            }
        }
        
        public void q3(){
            if(estadoPrevio == 12){signoImaginario = 0;}
            estadoPrevio =3;
         //   System.out.print(" q3");
             
            if(contador < cadena.length && banderaPunto <= 1){
                if(cadena[contador]=='0'||cadena[contador]=='1'||cadena[contador]=='2'||
                cadena[contador]=='3'||cadena[contador]=='4'||cadena[contador]=='5'||
                cadena[contador]=='6'||cadena[contador]=='7'||cadena[contador]=='8'||
               cadena[contador]=='9'){

             contador++;
             q3();
             }
                else if(cadena[contador]=='.'){
                    banderaPunto++;
                    contador++;
                    q3();
                }
                else if(cadena[contador] == 'i'){
                    contador++;
                    q4();
                }
                else{
                    M();
                }
            }
        }
        
        public void q4(){
          
            //System.out.print(" q4");
            
                estadoPrevio = 4;
                 
            
            if(contador < cadena.length){
                if(cadena[contador] == ')'){
                    contador++;
                    q10();
                }
                else{
                    M();
                }
            }
        }
        
        public void q5(){
           estadoPrevio = 5;
           varAux = 0;
           // System.out.print(" q5");
             
            if(contador < cadena.length){
                if((estadoPrevio == 1 && banderaPotencia ==1)||(estadoPrevio == 1 && banderaRaiz ==1)){
                        signoReal = 0;
                        if(cadena[contador]=='0'||cadena[contador]=='1'||cadena[contador]=='2'||
                        cadena[contador]=='3'||cadena[contador]=='4'||cadena[contador]=='5'||
                        cadena[contador]=='6'||cadena[contador]=='7'||cadena[contador]=='8'||
                        cadena[contador]=='9'){
                        contador++;
                        q1();
                }
                        else M();
                }
                else{
                    if(cadena[contador]=='0'||cadena[contador]=='1'||cadena[contador]=='2'||
                    cadena[contador]=='3'||cadena[contador]=='4'||cadena[contador]=='5'||
                    cadena[contador]=='6'||cadena[contador]=='7'||cadena[contador]=='8'||
                    cadena[contador]=='9'){
                    contador++;
                    q1();
                }
                else if(cadena[contador]=='i'){
                    contador++;
                    q7();
                }
                else M();}
            }
        }
        
        public void q6(){
            if(estadoPrevio == 12){signoImaginario = 0;}
            if(varAux == 0){signoReal = 0;}
            //System.out.print(" q6");
             
                estadoPrevio = 6;
            
            if(contador < cadena.length){
                if(cadena[contador] == ')'){
                    contador++;
                    q10();
                }
                else M();
            }
        }
        
        public void q7(){
           
           // System.out.print(" q7");
           banderaPunto = 0;
            if(estadoPrevio == 5){signoImaginario=0;}
                estadoPrevio = 7;
                 
           
            if(contador < cadena.length){
                if(cadena[contador] == '+'){
                contador ++;
                q8();
                }
                else if(cadena[contador]==')'){
                    contador++;
                    q10();
                }
                else if(cadena[contador] == '-'){
                    contador++;
                    q13();
                }
                else M();
            }
        }
        
        public void q8(){
           
          //  System.out.print(" q8");
            estadoPrevio =8;
             
            if(contador < cadena.length){
                if(cadena[contador]=='0'||cadena[contador]=='1'||cadena[contador]=='2'||
                cadena[contador]=='3'||cadena[contador]=='4'||cadena[contador]=='5'||
                cadena[contador]=='6'||cadena[contador]=='7'||cadena[contador]=='8'||
               cadena[contador]=='9'){
                    contador++;
                    q9();
                }
                else M();
            }
        }
        
        public void q9(){
            if(estadoPrevio==13){signoReal = 0;}
             
         //   System.out.print(" q9");
            
                estadoPrevio = 9;
            
            if(contador < cadena.length && banderaPunto <= 1){
                if(cadena[contador]=='0'||cadena[contador]=='1'||cadena[contador]=='2'||
                cadena[contador]=='3'||cadena[contador]=='4'||cadena[contador]=='5'||
                cadena[contador]=='6'||cadena[contador]=='7'||cadena[contador]=='8'||
               cadena[contador]=='9'){
                    contador++;
                    q9();
                }
                else if(cadena[contador]=='.'){
                    banderaPunto++;
                    contador++;
                    q9();
                }
                else if(cadena[contador]==')'){
                    q10();
                }
                else M();
            }
        }
        
        public void q10(){
            
         //  System.out.print(" q10");
            
             
            bandera++;
            
            if(bandera==1 && estadoPrevio != 9){
                for(int i=1;i<contador-1;i++){
                    
                    termino += cadena[i];
                 }
                
             //    System.out.println(" Primer termino: "+termino);
            }
            if(bandera ==1 && estadoPrevio == 9){
                
                for(int i=1;i<contador;i++){
                    
                    termino += cadena[i];
                 }
                
                // System.out.println(" Primer termino: "+termino);
                 contador++;
            }
            
            if(bandera == 2 && contador <= cadena.length){
                if(estadoPrevio!=9){
                for(int i = contadorAux; i<contador-1;i++){
                segundoTermino += cadena[i];
                }}
                else{
                    for(int i = contadorAux;i<cadena.length-1;i++){
                        segundoTermino += cadena[i];
                    }
                }
            //    System.out.println(" ASegundo termino: "+segundoTermino);
                
            }

            
            if(estadoPrevio == 1){
              //  System.out.println("Forma a + 0b");
            }
            if(estadoPrevio == 4){
               // System.out.println("Forma a +- bi");
            }
            if(estadoPrevio == 7){
               // System.out.println("Forma 0a + bi");
            }
            if(estadoPrevio == 6){
               // System.out.println("Forma a + 1i");
            }
            if(estadoPrevio == 9){
               // System.out.println("Forma bi +- a");
            }
           
        
            if(bandera == 1 && contador < cadena.length){
              //  System.out.println("ACTUAL:"+cadena[contador]);
                simboloOperacion = cadena[contador];
                    if(simboloOperacion == '+'||simboloOperacion == '-'||
                        simboloOperacion == '*'||simboloOperacion == '/'
                            ||simboloOperacion == '^'||simboloOperacion == 'r'
                            ||simboloOperacion == 'd'){
                     //   System.out.println("Simbolo de operacion:"+simboloOperacion);
                            contador++;
                            q11();
                    }
                    else if(simboloOperacion == 'c'){
                    q14();
                    }
                    else M();
            }
            
            if(bandera == 1 && contador == cadena.length && simboloOperacion == 'e'){
                q15();
            }
            
            if(bandera == 1 && contador == cadena.length && funcion == "sin"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "cos"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "tan"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "sec"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "csc"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "sinh"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "cosh"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "tanh"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "coth"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "sech"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "csch"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "cot"){
                q15();
            }
            
            if(bandera == 1 && contador == cadena.length && funcion == "ln"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "asin"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "acos"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "atan"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "acot"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "asec"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "acsc"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "asinh"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "acosh"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "atanh"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "acoth"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "asech"){
                q15();
            }
            if(bandera == 1 && contador == cadena.length && funcion == "acsch"){
                q15();
            }
            if(bandera == 2){
                
                q11();
            }
            
            
         
        }
        public void q11(){
           // System.out.println("Termino1:"+termino);
            //System.out.println("SegundoTermino:"+segundoTermino);
            if(bandera == 1){
                 
                if(estadoPrevio == 1){
                    //Para el primer termino
                    real1 = Double.parseDouble(termino);
                    imaginario1 = 0;
                    
                 //   System.out.println("Real1:"+real1);
                 //   System.out.println("Imaginario1:"+imaginario1);
                    
                }
                
                if(estadoPrevio == 7){
                    if(termino.length()==1){
                        real1 = 0;
                        imaginario1 = 1;
                 //   System.out.println("Real1:"+real1);
                 //   System.out.println("Imaginario1:"+imaginario1);
                    }
                    else if(termino.length()==2 && termino.charAt(0)=='-'){
                     
                        imaginario1 = 1;
                        real1 =0;
                 //       System.out.println("Real1:"+real1);
                 //       System.out.println("Imaginario1:"+imaginario1);
                    }
                    else{
                    for(int i=0;i<termino.length();i++){
                        
                        if(termino.charAt(i)!='i'){
                        terminoAux += termino.charAt(i);
                        }
                        
                        
                        
                    }
                    
                real1 =0;
                imaginario1 = Double.parseDouble(terminoAux);
               
               // System.out.println("Real1:"+real1);
               // System.out.println("Imaginario1:"+imaginario1);
                    }
                }
                if(estadoPrevio == 6){
                    
                    terminoAux ="";
                    imaginario1 = 1;
                    
                    for(int i=0;i<termino.length();i++){
                        
                        if(termino.charAt(i)!='+'&& termino.charAt(i)!='-'){
                            terminoAux += termino.charAt(i);
                        }
                        if(i==termino.length()-2){
                            real1 = Double.parseDouble(terminoAux);
                            
                 //           System.out.println("Real1:"+real1);
                 //           System.out.println("Imaginario1:"+imaginario1);
                        }
                        
                        
                    }
                    
                }
                if(estadoPrevio == 9){
                    terminoAux ="";
                    int conteo = 0;
                    if(termino.charAt(0)=='i'){
                        imaginario1 = 1;
                    }
                    else if(termino.charAt(0)=='-' && termino.charAt(1)=='i'){
                        imaginario1 = 1;
                        conteo++;
                    }
                    else{
                    while(termino.charAt(conteo)!='i'){
                        terminoAux += termino.charAt(conteo);
                        conteo++;
                    }
                    imaginario1 = Double.parseDouble(terminoAux);
                   
                    }
                    conteo++;
                    terminoAux ="";
                    
                    for(int i=conteo+1;i<termino.length();i++){
                        terminoAux += termino.charAt(i);
                        
                    }
                    real1 = Double.parseDouble(terminoAux);
                    
                 //   System.out.println("Real1:"+real1);
                 //   System.out.println("Imaginario1:"+imaginario1);
                }
                
                if(estadoPrevio == 4){
                    int conteo =0;
                    terminoAux ="";
                    if(termino.charAt(0)=='-'){
                        conteo++;signoReal = 0;
                    }
                    while(termino.charAt(conteo)!='+'&&termino.charAt(conteo)!='-'){
                        terminoAux += termino.charAt(conteo);
                        conteo++;
                    }
                    real1 = Double.parseDouble(terminoAux);
                 //   System.out.println("Real1:"+real1);
                    conteo++;
                    terminoAux="";
                    while(termino.charAt(conteo) != 'i'){
                        terminoAux += termino.charAt(conteo);
                        conteo++;
                    }
                    imaginario1 = Double.parseDouble(terminoAux);
                 //       System.out.println("Imaginario:"+imaginario1);
                }
               
                //Se obtiene el ABS de la primera expresion
                   Math.abs(real1);
                   Math.abs(imaginario1);
                 //  System.out.print("ssignoReal:"+signoReal);
                 //  System.out.println(" SARsignoImaginario:"+signoImaginario);
                   if(signoReal == 0){
                       real1 = -1*real1;
                   }
                   if(signoImaginario == 0){
                       imaginario1 = -1*imaginario1;
                       
                   }
                   if(simboloOperacion == '^'){
                       banderaPotencia = 1;
                   }
                   if(simboloOperacion == 'r'){
                       banderaRaiz = 1;
                   }
                   
                
                
            qp();
                
                
            }
            if(bandera == 2){
               //  System.out.print(" signoReal:"+signoReal);
       // System.out.print(" signoImaginario:"+signoImaginario);
                terminoAux="";
                if(estadoPrevio == 1){
                    //Para el segundo termino
                  //  System.out.println("SegTER:"+segundoTermino);
                  real2 = Double.parseDouble(segundoTermino);
                    
                    imaginario2 = 0;
         //           System.out.println("Real2:"+real2);
         //           System.out.println("Imaginario2:"+imaginario2);
                    
                }
                
                if(estadoPrevio == 7){
                    if(segundoTermino.length()==1){
                        real2 = 0;
                        imaginario2 = 1;
         //           System.out.println("Real2:"+real2);
         //           System.out.println("Imaginario2:"+imaginario2);
                    }
                    else if(segundoTermino.length()==2 && segundoTermino.charAt(0)=='-'){
                     
                        imaginario2 = 1;
                        real2 =0;
         //               System.out.println("Real2:"+real2);
         //               System.out.println("Imaginario2:"+imaginario2);
                    }
                    else if(segundoTermino.length()==1 && segundoTermino.charAt(0)=='i'){
                        imaginario2 =1;
                        real2=0;
                    }
                    else{
                    for(int i=0;i<segundoTermino.length();i++){
                        
                        if(segundoTermino.charAt(i)!='i'){
                        terminoAux += segundoTermino.charAt(i);
                        }
                        
                        
                        
                    }
                    
                real2 =0;
                imaginario2 = Double.parseDouble(terminoAux);
               
         //       System.out.println("Real2:"+real2);
         //       System.out.println("Imaginario2:"+imaginario2);
                    }
                }
                if(estadoPrevio == 6){
                    
                    terminoAux ="";
                    imaginario2 = 1;
                    
                    for(int i=0;i<segundoTermino.length();i++){
                        
                        if(segundoTermino.charAt(i)!='+'&& segundoTermino.charAt(i)!='-'){
                            terminoAux += segundoTermino.charAt(i);
                        }
                        if(i==segundoTermino.length()-2){
                            
                            real2 = Double.parseDouble(terminoAux);
         //                   System.out.println("Real2:"+real2);
         //                   System.out.println("Imaginario2:"+imaginario2);
                        }
                        
                        
                    }
                    
                }
                if(estadoPrevio == 9){
                    terminoAux ="";
                    int conteo = 0;
                    
                    if(segundoTermino.charAt(0)=='i'){
                        imaginario2 = 1;
                    }
                    else if(segundoTermino.charAt(0)=='-' && segundoTermino.charAt(1)=='i'){
                        imaginario2 = 1;
                        conteo++;
                    }
                    
                    else{
                    while(segundoTermino.charAt(conteo)!='i'){
                        terminoAux += segundoTermino.charAt(conteo);
                        conteo++;
                    }
                    imaginario2 = Double.parseDouble(terminoAux);
                    
                    }
                    conteo++;
                    terminoAux ="";
                    
                    for(int i=conteo+1;i<segundoTermino.length();i++){
                        terminoAux += segundoTermino.charAt(i);
                    }
                    real2 = Double.parseDouble(terminoAux);
                    
         //           System.out.println("Real2:"+real2);
         //           System.out.println("Imaginario2:"+imaginario2);
                }
                
                if(estadoPrevio == 4){
                    int conteo =0;
                    terminoAux ="";
                    if(segundoTermino.charAt(0)=='-'){
                        conteo++;signoReal = 0;
                    }
                    while(segundoTermino.charAt(conteo)!='+'&&segundoTermino.charAt(conteo)!='-'){
                        terminoAux += segundoTermino.charAt(conteo);
                        
                        conteo++;
                        
                    }
                    real2 = Double.parseDouble(terminoAux);
                    
         //           System.out.println("Real2:"+real2);
                    conteo++;
                    terminoAux="";
                    while(segundoTermino.charAt(conteo) != 'i'){
                        terminoAux += segundoTermino.charAt(conteo);
                        conteo++;
                    }
                    imaginario2 = Double.parseDouble(terminoAux);
                    
         //               System.out.println("Imaginario2:"+imaginario2);
                }
            
            }
                bandera++;
                if(bandera == 3){
                Operacion op = new Operacion();
                   // System.out.println("("+termino+")"+simboloOperacion+"("+segundoTermino+")");
                    Math.abs(real2);
                    Math.abs(imaginario2);
                    if(signoReal == 0){
                        real2 = -1*real2;
                    }
                    if(signoImaginario == 0){
                        imaginario2 = -1*imaginario2;
                    }
               //     System.out.println("REAL1:"+real1);
                //    System.out.println("IMAGINARIO1:"+imaginario1);
                //    System.out.println("REAL2:"+real2);
                 //   System.out.println("IMAGINARIO2:"+imaginario2);
                if(simboloOperacion == '+'){
                  //  System.out.println(" Suma");
                    op.sumar(real1, imaginario1, real2, imaginario2);
                    resultado = op.obtenerResultado();
                }
                if(simboloOperacion == '-'){
                 //   System.out.println(" Diferencia");
                    op.restar(real1, imaginario1, real2, imaginario2);
                    resultado = op.obtenerResultado();
                }
                if(simboloOperacion == '*'){
                  //  System.out.println(" Producto");
                    op.multiplicar(real1, imaginario1, real2, imaginario2);
                    resultado = op.obtenerResultado();
                }
                if(simboloOperacion == '/'){
                  //  System.out.println(" Division");
                    op.dividir(real1, imaginario1, real2, imaginario2);
                    resultado = op.obtenerResultado();
                }
                if(simboloOperacion == '^'){
                    //System.out.println("POT"+real1+" "+imaginario1+" "+real2+" "+imaginario2);
                    op.elevarPotencia(real1, imaginario1, real2);
                    resultado = op.obtenerResultado();
                }
                if(simboloOperacion == 'r'){
                    //System.out.println("RAIZ:"+real1+" "+imaginario1+" "+real2+" "+imaginario2);
                    //falta hacer la operacion de raiz
                    op.raiz(real1,imaginario1,real2);
                    resultado = op.obtenerArreglos();
                    
                }
                if(simboloOperacion == 'd'){
                    
                    
                    
                    
                op.obtenerDistancia(real1,imaginario1,real2,imaginario2);
                resultado += op.obtenerZ();
                }
            }
            
        
        }
        
        public void q12(){
          //  System.out.print(" q12");
          banderaPunto =0;
            estadoPrevio = 12;
            if(contador < cadena.length){
                if(cadena[contador]=='i'){
                contador++;
                q6();
                }
                else if(cadena[contador]=='0'||cadena[contador]=='1'||cadena[contador]=='2'||
                cadena[contador]=='3'||cadena[contador]=='4'||cadena[contador]=='5'||
                cadena[contador]=='6'||cadena[contador]=='7'||cadena[contador]=='8'||
               cadena[contador]=='9'){
                    contador++;
                    q3();
                }
                else M();
            }
        }
        
        public void q13(){
         //   System.out.print(" q13");
            estadoPrevio = 13;
            if(contador < cadena.length){
                if(cadena[contador]=='0'||cadena[contador]=='1'||cadena[contador]=='2'||
                cadena[contador]=='3'||cadena[contador]=='4'||cadena[contador]=='5'||
                cadena[contador]=='6'||cadena[contador]=='7'||cadena[contador]=='8'||
               cadena[contador]=='9'){
                    contador++;
                    q9();
                }
                else M();
            }
        }
        
        public void M(){
            banderaError = 1;
            System.out.println(" Error, verifique la sintáxis");
           // System.exit(1);
        
        }
        
        
        public void q14(){
            //System.out.println(" q14");
           
            if(bandera == 1){
                 
                if(estadoPrevio == 1){
                    //Para el primer termino
                    real1 = Double.parseDouble(termino);
                    imaginario1 = 0;
                    
                 //   System.out.println("Real1:"+real1);
                 //   System.out.println("Imaginario1:"+imaginario1);
                    
                }
                
                if(estadoPrevio == 7){
                    if(termino.length()==1){
                        real1 = 0;
                        imaginario1 = 1;
                 //   System.out.println("Real1:"+real1);
                 //   System.out.println("Imaginario1:"+imaginario1);
                    }
                    else if(termino.length()==2 && termino.charAt(0)=='-'){
                     
                        imaginario1 = 1;
                        real1 =0;
                 //       System.out.println("Real1:"+real1);
                 //       System.out.println("Imaginario1:"+imaginario1);
                    }
                    else{
                    for(int i=0;i<termino.length();i++){
                        
                        if(termino.charAt(i)!='i'){
                        terminoAux += termino.charAt(i);
                        }
                        
                        
                        
                    }
                    
                real1 =0;
                imaginario1 = Double.parseDouble(terminoAux);
               
               // System.out.println("Real1:"+real1);
               // System.out.println("Imaginario1:"+imaginario1);
                    }
                }
                if(estadoPrevio == 6){
                    
                    terminoAux ="";
                    imaginario1 = 1;
                    
                    for(int i=0;i<termino.length();i++){
                        
                        if(termino.charAt(i)!='+'&& termino.charAt(i)!='-'){
                            terminoAux += termino.charAt(i);
                        }
                        if(i==termino.length()-2){
                            real1 = Double.parseDouble(terminoAux);
                            
                 //           System.out.println("Real1:"+real1);
                 //           System.out.println("Imaginario1:"+imaginario1);
                        }
                        
                        
                    }
                    
                }
                if(estadoPrevio == 9){
                    terminoAux ="";
                    int conteo = 0;
                    if(termino.charAt(0)=='i'){
                        imaginario1 = 1;
                    }
                    else if(termino.charAt(0)=='-' && termino.charAt(1)=='i'){
                        imaginario1 = 1;
                        conteo++;
                    }
                    else{
                    while(termino.charAt(conteo)!='i'){
                        terminoAux += termino.charAt(conteo);
                        conteo++;
                    }
                    imaginario1 = Double.parseDouble(terminoAux);
                   
                    }
                    conteo++;
                    terminoAux ="";
                    
                    for(int i=conteo+1;i<termino.length();i++){
                        terminoAux += termino.charAt(i);
                        
                    }
                    real1 = Double.parseDouble(terminoAux);
                    
                 //   System.out.println("Real1:"+real1);
                 //   System.out.println("Imaginario1:"+imaginario1);
                }
                
                if(estadoPrevio == 4){
                    int conteo =0;
                    terminoAux ="";
                    if(termino.charAt(0)=='-'){
                        conteo++;signoReal = 0;
                    }
                    while(termino.charAt(conteo)!='+'&&termino.charAt(conteo)!='-'){
                        terminoAux += termino.charAt(conteo);
                        conteo++;
                    }
                    real1 = Double.parseDouble(terminoAux);
                 //   System.out.println("Real1:"+real1);
                    conteo++;
                    terminoAux="";
                    while(termino.charAt(conteo) != 'i'){
                        terminoAux += termino.charAt(conteo);
                        conteo++;
                    }
                    imaginario1 = Double.parseDouble(terminoAux);
                 //       System.out.println("Imaginario:"+imaginario1);
                }
               
                //Se obtiene el ABS de la primera expresion
                   Math.abs(real1);
                   Math.abs(imaginario1);
                 //  System.out.print("ssignoReal:"+signoReal);
                 //  System.out.println(" SARsignoImaginario:"+signoImaginario);
                   if(signoReal == 0){
                       real1 = -1*real1;
                   }
                   if(signoImaginario == 0){
                       imaginario1 = -1*imaginario1;
                       
                   }
            
                Operacion op = new Operacion();
                
                    op.obtenerConjugado(real1,imaginario1);
                    resultado = op.obtenerResultado();
            }
        }
        
        public void q15(){
            if(simboloOperacion == 'e'){
            termino = termino.substring(1, termino.length());
            }
            if(funcion.length() == 2){
                termino = termino.substring(2,termino.length());
            }
            if(funcion.length() == 3){
                termino = termino.substring(3,termino.length());
            }
            if(funcion.length() == 4){
                termino = termino.substring(4, termino.length());
            }
            if(funcion.length() == 5){
                termino = termino.substring(5, termino.length());
            }
            if(bandera == 1){
                 
                if(estadoPrevio == 1){
                    //Para el primer termino
                    real1 = Double.parseDouble(termino);
                    imaginario1 = 0;
                    
                 //   System.out.println("Real1:"+real1);
                 //   System.out.println("Imaginario1:"+imaginario1);
                    
                }
                
                if(estadoPrevio == 7){
                    if(termino.length()==1){
                        real1 = 0;
                        imaginario1 = 1;
                 //   System.out.println("Real1:"+real1);
                 //   System.out.println("Imaginario1:"+imaginario1);
                    }
                    else if(termino.length()==2 && termino.charAt(0)=='-'){
                     
                        imaginario1 = 1;
                        real1 =0;
                 //       System.out.println("Real1:"+real1);
                 //       System.out.println("Imaginario1:"+imaginario1);
                    }
                    else{
                    for(int i=0;i<termino.length();i++){
                        
                        if(termino.charAt(i)!='i'){
                        terminoAux += termino.charAt(i);
                        }
                        
                        
                        
                    }
                    
                real1 =0;
                imaginario1 = Double.parseDouble(terminoAux);
               
               // System.out.println("Real1:"+real1);
               // System.out.println("Imaginario1:"+imaginario1);
                    }
                }
                if(estadoPrevio == 6){
                    
                    terminoAux ="";
                    imaginario1 = 1;
                    
                    for(int i=0;i<termino.length();i++){
                        
                        if(termino.charAt(i)!='+'&& termino.charAt(i)!='-'){
                            terminoAux += termino.charAt(i);
                        }
                        if(i==termino.length()-2){
                            real1 = Double.parseDouble(terminoAux);
                            
                 //           System.out.println("Real1:"+real1);
                 //           System.out.println("Imaginario1:"+imaginario1);
                        }
                        
                        
                    }
                    
                }
                if(estadoPrevio == 9){
                    terminoAux ="";
                    int conteo = 0;
                    if(termino.charAt(0)=='i'){
                        imaginario1 = 1;
                    }
                    else if(termino.charAt(0)=='-' && termino.charAt(1)=='i'){
                        imaginario1 = 1;
                        conteo++;
                    }
                    else{
                    while(termino.charAt(conteo)!='i'){
                        terminoAux += termino.charAt(conteo);
                        conteo++;
                    }
                    imaginario1 = Double.parseDouble(terminoAux);
                   
                    }
                    conteo++;
                    terminoAux ="";
                    
                    for(int i=conteo+1;i<termino.length();i++){
                        terminoAux += termino.charAt(i);
                        
                    }
                    real1 = Double.parseDouble(terminoAux);
                    
                 //   System.out.println("Real1:"+real1);
                 //   System.out.println("Imaginario1:"+imaginario1);
                }
                
                if(estadoPrevio == 4){
                    int conteo =0;
                    terminoAux ="";
                    if(termino.charAt(0)=='-'){
                        conteo++;signoReal = 0;
                    }
                    while(termino.charAt(conteo)!='+'&&termino.charAt(conteo)!='-'){
                        terminoAux += termino.charAt(conteo);
                        conteo++;
                    }
                    real1 = Double.parseDouble(terminoAux);
                 //   System.out.println("Real1:"+real1);
                    conteo++;
                    terminoAux="";
                    while(termino.charAt(conteo) != 'i'){
                        terminoAux += termino.charAt(conteo);
                        conteo++;
                    }
                    imaginario1 = Double.parseDouble(terminoAux);
                 //       System.out.println("Imaginario:"+imaginario1);
                }
               
                //Se obtiene el ABS de la primera expresion
                   Math.abs(real1);
                   Math.abs(imaginario1);
                 //  System.out.print("ssignoReal:"+signoReal);
                 //  System.out.println(" SARsignoImaginario:"+signoImaginario);
                   if(signoReal == 0){
                       real1 = -1*real1;
                   }
                   if(signoImaginario == 0){
                       imaginario1 = -1*imaginario1;
                       
                   }}
                   if(simboloOperacion == 'e'){
                   oper.obtenerExponencial(real1,imaginario1);
                   resultado = oper.obtenerResultado();
                   }
                   if(funcion == "sin"){
                       oper.obtenerSeno(real1,imaginario1);
                       resultado = oper.obtenerResultado();
                   }
                   if(funcion == "cos"){
                       oper.obtenerCoseno(real1,imaginario1);
                       resultado = oper.obtenerResultado();
                   }
                   if(funcion == "tan"){
                       oper.obtenerTangente(real1,imaginario1);
                       resultado = oper.obtenerResultado();
                   }
                   if(funcion == "sec"){
                       oper.obtenerSecante(real1,imaginario1);
                       resultado = oper.obtenerResultado();
                   }
                   if(funcion == "csc"){
                       oper.obtenerCosecante(real1,imaginario1);
                       resultado = oper.obtenerResultado();
                   }
                   if(funcion == "sinh"){
                       oper.obtenerSenoHiper(real1,imaginario1);
                       resultado = oper.obtenerResultado();
                   }
                   if(funcion == "cosh"){
                       oper.obtenerCosenoHiper(real1,imaginario1);
                       resultado = oper.obtenerResultado();
                   }
                   if(funcion == "tanh"){
                       oper.obtenerTangenteHiper(real1,imaginario1);
                       resultado = oper.obtenerResultado();
                   }
                   if(funcion == "coth"){
                       oper.obtenerCotangenteHiper(real1,imaginario1);
                       resultado = oper.obtenerResultado();
                   }
                   if(funcion == "sech"){
                       oper.obtenerSecanteHiper(real1,imaginario1);
                       resultado = oper.obtenerResultado();
                   }
                   if(funcion == "csch"){
                       oper.obtenerCosecanteHiper(real1,imaginario1);
                       resultado = oper.obtenerResultado();
                   }
                   if(funcion == "cot"){
                       oper.obtenerCotangente(real1,imaginario1);
                       resultado = oper.obtenerResultado();
                   }
                   if(funcion == "ln"){
                        oper.obtenerLn(real1,imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   if(funcion == "asin"){
                        oper.obtenerArcoSeno(real1,imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   if(funcion == "acos"){
                        oper.obtenerArcoCoseno(real1,imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   if(funcion == "atan"){
                        oper.obtenerArcoTangente(real1, imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   if(funcion == "acot"){
                        oper.obtenerArcoCotangente(real1, imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   if(funcion == "asec"){
                        oper.obtenerArcoSecante(real1, imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   if(funcion == "acsc"){
                        oper.obtenerArcoCosecante(real1, imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   if(funcion == "asinh"){
                        oper.obtenerArcoSenoHiperbolico(real1, imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   if(funcion == "acosh"){
                        oper.obtenerArcoCosenoHiperbolico(real1, imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   if(funcion == "atanh"){
                        oper.obtenerArcoTangenteHiperbolica(real1, imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   if(funcion == "acoth"){
                        oper.obtenerArcoCotangenteHiperbolica(real1, imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   if(funcion == "asech"){
                        oper.obtenerArcoSecanteHiperbolica(real1, imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   if(funcion == "acsch"){
                        oper.obtenerArcoCosecanteHiperbolica(real1, imaginario1);
                        resultado = oper.obtenerResultado();
                   }
                   
            
        }
        
}
