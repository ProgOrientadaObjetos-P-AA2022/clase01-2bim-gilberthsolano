/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciados;

import herenciauno.EstudianteDistancia;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteDistancia estd= new EstudianteDistancia();
        estd.establecerNombresEstudiante("Gilbert");
        estd.establecerApellidoEstudiante("Solano");
        estd.establecerIdentificacionEstudiante("1105059404");
        estd.establecerEdadEstudiante(25);
        estd.establecerCostoAsignatura(30);
        estd.establecerNumeroAsginaturas(5);
        estd.calcularMatriculaDistancia();
    //        System.out.printf("%s - (%.2f)\n", estd.obtenerApellidoEstudiante(), estd.obtenerMatriculaDistancia());
        System.out.printf("%s\n", estd);//uso to string
        
    }
    
}
