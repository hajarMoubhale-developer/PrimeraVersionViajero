/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona1.Viajero;
import java.util.Scanner;
/**
 *
 * @author tarde
 */
public class Viajero {
    
    private String dni;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private String direccion;
    
    private static int numObjetos = 0; 
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Viajero v2 = new Viajero("12345678A", "Ana", "Lago Sol", "Española", "Calle Mayor, 10");
        Viajero v1 = new Viajero();
        System.out.println("Dame el DNI: ");v1.setDni(sc.nextLine());
        System.out.println("Dame el Nombre: ");v1.setNombre(sc.nextLine());
        System.out.println("Dame los Apellidos: ");v1.setApellidos(sc.nextLine());
        System.out.println("Dame la Nacionalidad: ");v1.setNacionalidad(sc.nextLine());
        System.out.println("Dame la Direccion: ");v1.setDireccion(sc.nextLine());
        
        System.out.println("Num objetos creados:\t" +Viajero.getNumObjetos());
        
        System.out.println("Mostrar Numero de Viajeros\t");
        System.out.println("Quieres verlo en fromato:\n 1.PAUSADO \n 2.NORMAL");
        
        switch(sc.nextInt()){
            case 1: 
                v1.getInfo("pausado");
                v2.getInfo("pausado");
                break;
            case 2: 
                v1.getInfo("normal");
                v2.getInfo("normal");
                break;
            default:
                System.out.println("No es posible visualizar esa opción");
        }
        
        
    }
    
    // Método para devolver información
    
    public void getInfo(String formato){
        if (formato.equalsIgnoreCase("normal")){
            System.out.println("El dni es: " + dni);
            System.out.println("El nombre es: "+ nombre);
            System.out.println("Los apellidos son: " + apellidos);
            System.out.println("La nacionalidad es: " + nacionalidad);
            System.out.println("La dirección es: "+ direccion);
            
        }else if (formato.equalsIgnoreCase("pausado")){
            System.out.println("El dni es: " + dni);
            System.out.println("El nombre es: "+ nombre);
            System.out.println("Los apellidos son: " + apellidos);
            System.out.println("La nacionalidad es: " + nacionalidad);
            System.out.println("La dirección es: "+ direccion);
            
        }else{
            System.out.println("Formato no reconocido");
        }
        
        
    } 
    

// CONSTRUCTOR CON PARAMETROS
    public Viajero(String dni, String nombre, String apellidos, String nacionalidad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.numObjetos++;
    }
// CONSTRUCTOR SIN PARAMETROS
    public Viajero() {
        this.dni = "";
        this.nombre = "";
        this.apellidos = "";
        this.nacionalidad = "";
        this.direccion = "";
        this.numObjetos++;
    }
    
    
// GETTER
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getNacionalidad() {  return nacionalidad;  }
    public String getDireccion() { return direccion;  }
 // SETTER
    public void setDni(String dni) {  this.dni = dni;  }
    public void setNombre(String nombre) {  this.nombre = nombre;  }
    public void setApellidos(String apellidos) {  this.apellidos = apellidos;  }
    public void setNacionalidad(String nacionalidad) {  this.nacionalidad = nacionalidad;  }
    public void setDireccion(String direccion) {  this.direccion = direccion;  }

    public static int getNumObjetos() {  return numObjetos; }
    
    
}
