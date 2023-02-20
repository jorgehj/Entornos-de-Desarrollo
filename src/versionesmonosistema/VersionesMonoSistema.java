/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package versionesmonosistema;

/**
 *
 * @author Admin
 */
public class VersionesMonoSistema {
    public static int valor;
    /**
     * @param args the command line arguments
     */
    public static void VersionesMonoSistema() {
        valor=0;
    }
    public static void setValor(int dato) {
        valor = dato;
    }
    public static int getValor(){
        return valor;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Contador recuenta = new Contador();
        System.out.println("Proyecto para probar el control de versiones en un único sistema.");
        setValor(12);
        System.out.println("Valor= "+getValor());
        recuenta.setCuenta(1);
        System.out.println("Contador= "+recuenta.getCuenta());
    }
    
}
