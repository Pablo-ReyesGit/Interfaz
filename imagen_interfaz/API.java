/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagen_interfaz;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class API {
    
    public void consumoHabitacionDetalle(){
        try{
    URL url = new URL("http://127.0.0.1:8000/habitaciondetalle/");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.connect();
    
    int responseCode = conn.getResponseCode();
    if (responseCode != 200){
        throw new RuntimeException("Ocurrio un error fatal \n " + responseCode);
    } else {
        StringBuilder informationString = new StringBuilder();
        Scanner scaner = new Scanner(url.openStream());
        
        while(scaner.hasNext()){
            informationString.append(scaner.nextLine());  
        }
        
        scaner.close();
        
        System.out.println(informationString);
    }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void consumoHabtacion(){
        try{
    URL url = new URL("http://127.0.0.1:8000/habitaciones/");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.connect();
    
    int responseCode = conn.getResponseCode();
    if (responseCode != 200){
        throw new RuntimeException("Ocurrio un error fatal \n " + responseCode);
    } else {
        StringBuilder informationString = new StringBuilder();
        Scanner scaner = new Scanner(url.openStream());
        
        while(scaner.hasNext()){
            informationString.append(scaner.nextLine());  
        }
        
        scaner.close();
        
        System.out.println(informationString);
    }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void consumoReserva(){
        try{
    URL url = new URL("http://127.0.0.1:8000/reservas/");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.connect();
    
    int responseCode = conn.getResponseCode();
    if (responseCode != 200){
        throw new RuntimeException("Ocurrio un error fatal \n " + responseCode);
    } else {
        StringBuilder informationString = new StringBuilder();
        Scanner scaner = new Scanner(url.openStream());
        
        while(scaner.hasNext()){
            informationString.append(scaner.nextLine());  
        }
        
        scaner.close();
        
        System.out.println(informationString);
    }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void consumoFactura(){
        try{
    URL url = new URL("http://127.0.0.1:8000/facturas/");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.connect();
    
    int responseCode = conn.getResponseCode();
    if (responseCode != 200){
        throw new RuntimeException("Ocurrio un error fatal \n " + responseCode);
    } else {
        StringBuilder informationString = new StringBuilder();
        Scanner scaner = new Scanner(url.openStream());
        
        while(scaner.hasNext()){
            informationString.append(scaner.nextLine());  
        }
        
        scaner.close();
        
        System.out.println(informationString);
    }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
