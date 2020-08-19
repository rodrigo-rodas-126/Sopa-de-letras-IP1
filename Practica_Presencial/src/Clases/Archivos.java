package Clases;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Archivos {
    
    public String abrirArchivo(String direccion){
        
        StringBuilder sb = new StringBuilder();
        
        File archivo = new File(direccion);
        
        try{
            FileReader lector = new FileReader(archivo);
            BufferedReader lector_archivo = new BufferedReader(lector);
            
            String s;
            while((s = lector_archivo.readLine()) != null){
                sb.append(s);
            }
            
            lector.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        
        return sb.toString();
        
    }
    
    
    public void crearArchivoPlano(String contenido){
        
        File archivo = new File("reporte.html");
        
        try {
            FileWriter escritor = new FileWriter(archivo);
            escritor.write(contenido);
            escritor.close();
        } 
        catch (IOException ex) {
            
            ex.printStackTrace();
            
        }
        
    }
    
    public void crearArchivoPlano1(String contenido){
        
        File archivo = new File("reporte1.html");
        
        try {
            FileWriter escritor = new FileWriter(archivo);
            escritor.write(contenido);
            escritor.close();
        } 
        catch (IOException ex) {
            
            ex.printStackTrace();
            
        }
        
    }
    
    
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    
}
