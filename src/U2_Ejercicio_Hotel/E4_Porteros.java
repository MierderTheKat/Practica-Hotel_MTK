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
public class E4_Porteros extends Empleados{
    
    private boolean Edad_Avanz;
    
    public E4_Porteros(){}
    
    public E4_Porteros(String id_empleado, String nombre, String fech_nac, String puesto, String jornada, boolean edad_avanz)
    {
        super(id_empleado, nombre, fech_nac, puesto, jornada);
        Edad_Avanz = edad_avanz;
    }
    
    //Metodos GET
    @Override
    public boolean getEdad_Avanz()
    {
        return this.Edad_Avanz;
    }
    
    @Override
    public void Obligaciones()
    {
        System.out.println( "\t\t\t  __Obligaciones__\n"+
                            "\t\t\t Cuidar la puerta\n\n");
    }
    
    @Override
    public void Sueldo(int horas)
    {
        int dinero_extra = 0;
        int horas_extra = 0;
        double sueldo = 0;
        horas_extra = horas - 24;
        
        if(horas_extra > 0)
        {
            dinero_extra = horas_extra * 180;
            sueldo = ((horas - horas_extra) * 90) + dinero_extra;
        }
        else if (horas_extra <= 0)
        {
          sueldo = (horas * 90);
        }
        System.out.println("\t\t\t\tSueldo:"+ sueldo + "$\n");
        this.Sueldo = sueldo;
    }
    
}
