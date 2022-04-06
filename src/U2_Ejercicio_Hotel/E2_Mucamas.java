/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2_Ejercicio_Hotel;

/**
 *
 * @author MierderTheKat
 */
public class E2_Mucamas extends Empleados{
    
    public E2_Mucamas(){}
    
    public E2_Mucamas(String id_empleado, String nombre, String fech_nac, String puesto, String jornada)
    {
        super(id_empleado, nombre, fech_nac, puesto, jornada);
    }
    
    @Override
    public void Obligaciones()
    {
        System.out.println( "\t\t\t  __Obligaciones__\n"+
                            "\t\t\t Limpiar los cuartos\n"+
                            "\t\t\t Limpiar los baños\n\n");
    }
    
    @Override
    public void Sueldo(int horas)
    {
        int dinero_extra = 0;
        int horas_extra = 0;
        double sueldo = 0;
        horas_extra = horas - 36;
        
        if(horas_extra > 0)
        {
            dinero_extra = horas_extra * 200;
            sueldo = ((horas - horas_extra) * 100) + dinero_extra;
        }
        else if (horas_extra <= 0)
        {
          sueldo = (horas * 100);
        }
        System.out.println("\t\t\t\tSueldo:"+ sueldo + "$\n");
        this.Sueldo = sueldo;
    }
    
    
}
