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
public class E5_Cocineros extends Empleados{
    
    private String Especialidad;
    private boolean Titulo;
    
    public E5_Cocineros(){}
    
    public E5_Cocineros(String id_empleado, String nombre, String fech_nac, String puesto, String jornada, String especialidad, boolean titulo)
    {
        super(id_empleado, nombre, fech_nac, puesto, jornada);
        Especialidad = especialidad;
        Titulo = titulo;
    }
    
    //Metodos GET
    @Override
    public String getEspecialidad()
    {
        return this.Especialidad;
    }
    
    @Override
    public boolean getTitulo()
    {
        return this.Titulo;
    }
    
    @Override
    public void Obligaciones()
    {
        System.out.println( "\t\t\t  __Obligaciones__\n"+
                            "\t\t\t      Cocinar\n\n");
    }
    
    @Override
    public void Sueldo(int horas)
    {
        int dinero_extra = 0;
        int horas_extra = 0;
        double sueldo = 0;
        horas_extra = horas - 48;
        
        if(horas_extra > 0)
        {
            dinero_extra = horas_extra * 320;
            sueldo = ((horas - horas_extra) * 160) + dinero_extra;
        }
        else if (horas_extra <= 0)
        {
          sueldo = (horas * 160);
        }
        System.out.println("\t\t\t\tSueldo:"+ sueldo + "$\n");
        this.Sueldo = sueldo;
    }
    
}
