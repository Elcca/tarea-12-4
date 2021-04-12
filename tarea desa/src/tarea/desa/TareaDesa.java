/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.desa;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class TareaDesa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vel;
        Scanner tecladou = new Scanner(System.in);
        System.out.println("ingrese la velocidad en km/h");
        vel = tecladou.nextDouble();
        vel = vel*0.27777777777;
        System.out.println("la velocidad en m/s es de " +vel+ "");
    }
    
}
