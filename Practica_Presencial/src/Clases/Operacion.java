package Clases;

import Estructuras.Cola;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Operacion {
    
    int a;
    int b;
    String s;
    Cola<Object> sas = new Cola();

    public int Ope(int a, int b, String s) {
        if (s.equals("+")) {
            int o = a+b;
            String op = "Operacion: " + "+" + " Resultado: " + o;
            sas.Queue(op);
            return a+b;
        }
        else if (s.equals("-")) {
            int o = a-b;
            String op1 = "Operacion: " + "-" + " Resultado: " + o;
            sas.Queue(op1);
            return a-b;
        }
        else if (s.equals("*")) {
            int o = a*b;
            String op1 = "Operacion: " + "*" + " Resultado: " + o;
            sas.Queue(op1);
            return a*b;
        }
        else if (s.equals("/")) {
            int o = a/b;
            String op1 = "Operacion: " + "/" + " Resultado: " + o;
            sas.Queue(op1);
            return a/b;
        }
        else{
            return 0;
        }
    }
    
    public String ToHTML(){
        return sas.toString();
    }
}
