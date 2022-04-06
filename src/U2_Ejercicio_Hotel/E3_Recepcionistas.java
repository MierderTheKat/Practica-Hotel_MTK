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
public class E3_Recepcionistas extends Empleados{
    
    private boolean Noche;
    
    public E3_Recepcionistas(){}
    
    public E3_Recepcionistas(String id_empleado, String nombre, String fech_nac, String puesto, String jornada, boolean noche)
    {
        super(id_empleado, nombre, fech_nac, puesto, jornada);
        Noche = noche;
    }
    
    //Metodos GET
    @Override
    public boolean getNoche()
    {
        return this.Noche;
    }
    
    @Override
    public void Obligaciones()
    {
        System.out.println( "\t\t\t  __Obligaciones__\n"+
                            "\t\t\t Atender el lobby\n"+
                            "\t\t\t Administrar las llaves\n"+
                            "\t\t\t Registrar los huespedes\n\n");
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
            dinero_extra = horas_extra * 300;
            sueldo = ((horas - horas_extra) * 150) + dinero_extra;
        }
        else if (horas_extra <= 0)
        {
          sueldo = (horas * 150);
        }
        System.out.println("\t\t\t\tSueldo:"+ sueldo + "$\n");
        this.Sueldo = sueldo; // se guarda aqui el sueldo
    }
}