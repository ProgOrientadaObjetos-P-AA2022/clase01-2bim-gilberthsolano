/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCostos(10000);
//        System.out.println(edf1);
        Edificio edf2 = new Edificio("Edificio Sur");
        edf2.establecerCostos(20000);

        Edificio edf3 = new Edificio("Edificio Norte");
        edf3.establecerCostos(30000);

        Edificio edf4 = new Edificio("Edificio Secundario");
        edf4.establecerCostos(20000);

//        Edificio[] edificios = new Edificio[4];
//        edificios[0] = edf1;
//        edificios[1] = edf2;
//        edificios[2] = edf3;
//        edificios[3] = edf4;
        Edificio[] edificios = {edf1, edf2, edf3, edf4};

        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        // Imprimir el costo de los bienes inmuebles de la empresa
        Empresa miempresa = new Empresa();

        miempresa.establecerNombre("Empresa de Hojas");

        miempresa.establecerEdificios(edificios);
        miempresa.establecerCostosBienesInmuebles();
        
        Vehiculo ve1= new Vehiculo("Camioneta", "LBC0055", 10000);
        Vehiculo ve2= new Vehiculo("Autos", "LVB0044", 20000);
        
        
//        System.out.printf("%.2f\n", miempresa.obtenerCostosBienesInmuebles());
        System.out.printf("%s\n", miempresa);
    }
}
