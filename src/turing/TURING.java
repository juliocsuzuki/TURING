
package turing;

import java.util.Scanner;
public class TURING {

    int CONT;
    char FITA [];
    public static void main(String[] args) {
        TURING MAQ = new TURING();
        Scanner ENTRADA = new Scanner(System.in);
        String PALAVRA;
        System.err.println("Entre com a palavra");
        PALAVRA = ENTRADA.nextLine();
        MAQ.Iniciar(PALAVRA);
    }
    public void Iniciar(String SENTENCA){
        CONT = 0;
        FITA = SENTENCA.toCharArray();
        q0();
    }
    public void q0(){
    if (CONT < FITA.length){
        if(FITA[CONT] =='T'){
            FITA[CONT] = 'T';
            CONT++;
            q4();                              
            }   
        else if (FITA[CONT] == 'B'){
            FITA[CONT] = 'B';
            CONT++;
            q3();
        }
       else if (FITA[CONT] == 'a'){
            FITA[CONT] = 'A';
            CONT++;
            q1();
        }
       else {
           qerro();
       }
        }else {
           qerro();
       }   
    }
    public void q1(){    if (CONT < FITA.length){
        if(FITA[CONT] =='B'){
            FITA[CONT] = 'B';
            CONT++;
            q1();                              
            }   
        else if (FITA[CONT] == 'a'){
            FITA[CONT] = 'a';
            CONT++;
            q1();
        }
       else if (FITA[CONT] == 'b'){
            FITA[CONT] = 'B';
            CONT--;
            q2();
        }
       else {
           qerro();
       }
        }  
}
    public void q2(){
     if(FITA[CONT] =='B'){
            FITA[CONT] = 'B';
            CONT--;
            q2();                              
            }   
        else if (FITA[CONT] == 'a'){
            FITA[CONT] = 'a';
            CONT--;
            q2();
        }
       else if (FITA[CONT] == 'A'){
            FITA[CONT] = 'A';
            CONT++;
            q0();
        }
       else {
           qerro();
       }}
    public void q3(){ if(FITA[CONT] =='B'){
            FITA[CONT] = 'B';
            CONT++;
            q3();                              
            }
    else if (FITA[CONT] == 'T'){
        FITA[CONT] = 'T';
        CONT++;
        q4();
    }       
       else {
           qerro();
       }
    
       }
    public void q4(){
        String PALAVRA = "";
        for(int i = 0; i < (FITA.length - 1); i++){
            PALAVRA = PALAVRA + FITA[i];
        }
    System.err.println("PALAVRA ACEITA!!!:" + PALAVRA);
    }
    public void qerro(){
        String PALAVRA = "";
        for(int i = 0; i < FITA.length; i++){
            PALAVRA = PALAVRA + FITA[i];
        }
    System.err.println("PALAVRA NAO ACEITA!!!");
    }
}

