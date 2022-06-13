/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciados;

import herenciauno.EstudiantePresencial;
import java.util.Scanner;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ejecutordos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        // TODO code application logic here
        EstudiantePresencial estudianteP= new EstudiantePresencial();
        System.out.println("Ingrese el nombre del estudiante");
        estudianteP.establecerNombresEstudiante(entrada.nextLine());
        System.out.println("Ingrese el apellido del estudiante");
        estudianteP.establecerApellidoEstudiante(entrada.nextLine());
        System.out.println("Ingrese la identificacion del estudiante");
        estudianteP.establecerIdentificacionEstudiante(entrada.nextLine());
        System.out.println("Ingrese la edad del estudiante");
        estudianteP.establecerEdadEstudiante(Integer.parseInt(entrada.nextLine()));
        System.out.println("Ingrese el numero de creditos");
        estudianteP.establecerNumeroCreditos(Integer.parseInt(entrada.nextLine()));
        System.out.println("Ingrese el costo de creditos");
        estudianteP.establecerCostoCredito(Double.parseDouble(entrada.nextLine()));
        estudianteP.calcularMatriculaPresencial();
        
        System.out.printf("%s\n", estudianteP);
        
    }
    
}
