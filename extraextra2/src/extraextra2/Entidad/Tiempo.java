/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraextra2.Entidad;

import java.util.Scanner;

/*
 */
public class Tiempo {
     private int hora, minutos, segundos;
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Tiempo() {
    }

    public Tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
     
    
    public void IngreseHora(){
        System.out.println("ingrese la hora");
        setHora(leer.nextInt());
        while (getHora()>23 || getHora() <0 ) {
            System.out.println("ingrese la hora correctamente");
           setHora(leer.nextInt());
        }
        System.out.println("ingrese los minutos");
        setMinutos(leer.nextInt());
        while (getMinutos()>59 || getMinutos()<0) {
            System.out.println("ingrese los minutos correctamente por diooo");
            setMinutos(leer.nextInt());
            
        }
        System.out.println("ingrese los segundos");
        setSegundos(leer.nextInt());
        while (getSegundos()>59 || getSegundos ()<0) {
            System.out.println("ingrese los segundos correctamente");
            setSegundos(leer.nextInt());
            
        }
    }
        public void Reloj() throws InterruptedException{
            for (int i =getHora()  ; i <=24 ; i++){
               if (i==24){
                   i=0;
               } 
                for (int j =getMinutos(); j <=59 ; j++) {
                    if (j==59) {
                        setMinutos(0);
                        
                    }
                    for (int k =getSegundos(); k <=59 ; k++) {
                        Thread.sleep(100);
                        if (k==59) {
                            setSegundos(0);
                            
                        }
                    if (i < 10) {
                        System.out.print("0");
                    }
                    System.out.print(i + ":");
                    if (j < 10) {
                        System.out.print("0");
                    }
                    System.out.print(j + ":");
                    if (k < 10) {
                        System.out.print("0");
                    }
                    System.out.println(k);

                        
                    }
                    
                }
                        
                
            }
        }
    }
      
   

