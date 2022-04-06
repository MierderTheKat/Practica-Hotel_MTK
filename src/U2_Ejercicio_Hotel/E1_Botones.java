package U2_Ejercicio_Hotel;

/**
 *
 * @author MierderTheKat
 */
public class E1_Botones extends Empleados{

    private int Peso;
    
    public E1_Botones(){}
    
    public E1_Botones(String id_empleado, String nombre, String fech_nac, String puesto, String jornada, int peso)
    {
        super(id_empleado, nombre, fech_nac, puesto, jornada);
        Peso = peso;
    }
    
    //Metodos GET
    @Override
    public int getPeso()
    {
        return this.Peso;
    }
    
    @Override
    public void Obligaciones()
    {
        System.out.println( "\t\t\t  __Obligaciones__\n"+
                            "\t\t\t Llevar las maletas\n\n");
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
            dinero_extra = horas_extra * 160;
            sueldo = ((horas - horas_extra) * 80) + dinero_extra;
        }
        else if (horas_extra <= 0)
        {
          sueldo = (horas * 80);
        }
        System.out.println("\t\t\t\tSueldo:"+ sueldo + "$\n");
        this.Sueldo = sueldo;
    }
    
}
