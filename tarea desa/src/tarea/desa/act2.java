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
public class act2 {
    public static void main(String[] args) {
        double rad;
        double longi;
        double area;
        Scanner tecladou = new Scanner(System.in);
        System.out.println("ingrese el radio de una circunferencia");
        rad = tecladou.nextDouble();
        longi = 2*3.14*rad;
        area = 3.14*rad/2;
        System.out.println("la longitud de esta circunferencia es de " +longi+ " y el area es de " +area+ "");
    }
}
