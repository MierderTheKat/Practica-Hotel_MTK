package U2_Ejercicio_Hotel;

import java.util.Scanner;

/**
 *
 * @author MierderTheKat
 */
public abstract class Empleados {
    
    protected String Id_Empleado;
    protected String Nombre;
    protected String Fech_Nac;
    protected String Puesto;
    protected String Jornada;
    protected double Sueldo;
    
    public Empleados(){}
    
    public Empleados(String id_empleado, String nombre, String fech_nac, String puesto, String jornada)
    {
        this.Id_Empleado = id_empleado;
        this.Nombre = nombre;
        this.Fech_Nac = fech_nac;
        this.Puesto = puesto;
        this.Jornada = jornada;
        this.Sueldo = 0;
    }
    
    //Metodos GET
    public String getId_Empleado()
    {
        return this.Id_Empleado;
    }
    public String getNombre()
    {
        return this.Nombre;
    }
    public String getFech_Nac()
    {
        return this.Fech_Nac;
    }
    public String getPuesto()
    {
        return this.Puesto;
    }
    public String getJornada()
    {
        return this.Jornada;
    }
    public double getSueldo()
    {
        return this.Sueldo;
    }
    //Clases
    public int getPeso()
    {
        return 1;
    }
    public boolean getNoche()
    {
        return true;
    }
    
    public boolean getEdad_Avanz()
    {
        return true;
    }
    
    public String getEspecialidad()
    {
        return "";
    }
    
    public boolean getTitulo()
    {
        return true;
    }
    
    //Metodos SET
    public void setId_Empleado(String id_empleado)
    {
        this.Id_Empleado = id_empleado;
    }
    public void setNombre(String nombre)
    {
        this.Nombre = nombre;
    }
    public void setFech_Nac(String fech_nac)
    {
        this.Fech_Nac = fech_nac;
    }
    public void setPuesto(String puesto)
    {
        this.Puesto = puesto;
    }
    public void setJornada(String jornada)
    {
        this.Jornada = jornada;
    }
    public void setSueldo(double sueldo)
    {
        this.Sueldo = sueldo;
    }
    
    public abstract void Obligaciones();
    
    public abstract void Sueldo(int horas);
    
    public void Imprimir()
    {
        System.out.println("\t\t\t\t_______Empleado______");
        System.out.println("\t\t\tNombre: " + Nombre);
        System.out.println("\t\t\tId: " + Id_Empleado);
        System.out.println("\t\t\tFecha de Nacimiento: " + Fech_Nac);
        System.out.println("\t\t\tPuesto: " + Puesto);
        System.out.println("\t\t\tJornada: " + Jornada + "hrs");
        System.out.println("\t\t\tSueldo obtenido: " + Sueldo);
        System.out.println("\n\n");
    }
    
    public void CapturarEmpleado()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\t\t\t\t_Empleado Nuevo_");
        System.out.println("\t\t\tIngresa el Id: ");
        this.Id_Empleado = scan.nextLine();
        System.out.println("\t\t\tIngresa el Nombre: ");
        this.Nombre = scan.nextLine();
        System.out.println("\t\t\tIngresa la Fecha de Nacimiento: ");
        this.Fech_Nac = scan.nextLine();
        this.Sueldo = 0;
    }
    
    public int Horas()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\t\t\tHoras trabajadas en la semana: \n");
        int horas = scan.nextInt();
        return horas;
    }
    
}