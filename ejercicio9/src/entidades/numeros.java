/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author dpicc
 */
public class numeros {
    private int num1, num2;

    public numeros() {
         this.num1 =  (int)(Math.random()*10);

        this.num2 =  (int)(Math.random()*10);
    }

    public numeros(int num1, int num2) {
        this.num1 =  (int)(Math.random()*10);

        this.num2 =  (int)(Math.random()*10);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
