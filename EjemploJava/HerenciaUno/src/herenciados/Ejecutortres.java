/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciados;

import herenciauno.EstudianteDistancia;
import herenciauno.EstudiantePresencial;
import java.util.Scanner;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ejecutortres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        EstudiantePresencial esp = new EstudiantePresencial();
        EstudianteDistancia esd = new EstudianteDistancia();
        int opc = 0;

        System.out.println("Menu");
        System.out.println("1. Estudiante Presencial");
        System.out.println("2. Estudiante Distancia");
        opc = Integer.parseInt(entrada.nextLine());
        if (opc > 2 || opc < 1) {
            System.out.println("Error opcion no valida");

        } else {

            System.out.println("Ingrese nombre del estudiante");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese apellido del estudiante");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese la identificacion del estudiante");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            int edad = Integer.parseInt(entrada.nextLine());
            if (opc == 1) {

                System.out.println("---Ingrese los datos de estudiante presencial---");
                System.out.println("Ingrese los numeros de creditos");
                int numcreditos = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el costo de creditos");
                double coscreditos = Double.parseDouble(entrada.nextLine());

                esp.establecerNombresEstudiante(nombre);
                esp.establecerApellidoEstudiante(apellido);
                esp.establecerIdentificacionEstudiante(identificacion);
                esp.establecerEdadEstudiante(edad);
                esp.establecerNumeroCreditos(numcreditos);
                esp.establecerCostoCredito(coscreditos);
                esp.calcularMatriculaPresencial();
                System.out.println(esp);
            }
            if (opc == 2) {

                System.out.println("---Ingrese los datos de estudiante a distancia");
                System.out.println("Ingrese el numero de asignaturas");
                int numAsig = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el costo de Asignaturas");
                double costoAsing = Double.parseDouble(entrada.nextLine());
                esd.establecerNombresEstudiante(nombre);
                esd.establecerApellidoEstudiante(apellido);
                esd.establecerIdentificacionEstudiante(identificacion);
                esd.establecerEdadEstudiante(edad);
                esd.establecerNumeroAsginaturas(numAsig);
                esd.establecerCostoAsignatura(costoAsing);
                esd.calcularMatriculaDistancia();
                System.out.println(esd);
            }

        }
    }

}
