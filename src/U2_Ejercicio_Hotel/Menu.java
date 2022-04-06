/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2_Ejercicio_Hotel;

import java.util.Scanner;

/**
 *
 * @author MierderTheKat
 */
public class Menu {
    
    
    public void MenuInicial()
    {
        System.out.println("\n\t\t\t\t ____Menu____");
        System.out.println("\t\t\t 1. Informacion del empleado");
        System.out.println("\t\t\t 2. Sueldos por Puesto");
        System.out.println("\t\t\t 3. Horas de Trabajo por Puesto");
        System.out.println("\t\t\t 4. Pago de Empleados");
        System.out.println("\t\t\t 5. Capturar Empleado");
        System.out.println("\t\t\t 6. Salir");
        System.out.println("\n\t\t\t Elija una opcion");
        System.out.println("\n\n\n\n\n\n");
    }
    
    public void Elegir_Empleado()
    {
        System.out.println("\n\t\t\t\t ____Empleados____");
        System.out.println("\t\t\t 1. Recepcionistas");
        System.out.println("\t\t\t 2. Botones");
        System.out.println("\t\t\t 3. Mucamas");
        System.out.println("\t\t\t 4. Cocineros");
        System.out.println("\t\t\t 5. Porteros");
        System.out.println("\t\t\t 6. Regresar al inicio");
        System.out.println("\n\t\t\t Elija una opcion");
        System.out.println("\n\n\n\n\n\n");
    }
    public void Sueldo_por_Hora()
    {
        System.out.println( "\t\t\t\t __Sueldo__");
        System.out.println( "\t\t\t Recepcionista: 150$ por hora.\n" +
                            "\t\t\t Portero:       90$ por hora.\n" +
                            "\t\t\t Botones:       80$ pesos por hora.\n" +
                            "\t\t\t Mucamas:       100$ pesos por hora.\n" +
                            "\t\t\t Cocineros:     160$ pesos por hora.");
        System.out.println("\n\n\n\n\n\n");
    }
    
    public void Jornadas()
    {
        System.out.println( "\t\t\t\t __Jornadas__");
        System.out.println( "\t\t\t Recepcionista: 8hrs.\n" +
                            "\t\t\t Portero:       4hrs.\n" +
                            "\t\t\t Botones:       6hrs.\n" +
                            "\t\t\t Mucamas:       6hrs.\n" +
                            "\t\t\t Cocineros:     8hrs.");
        System.out.println("\n\n\n\n\n\n");
    }
    
// Hacer espacios y "pausar"
    public void espacio()
    {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void pausa()
    {
        System.out.println("\n    Presiona enter para continuar: ");
        new Scanner(System.in).nextLine();
    }
    
}
