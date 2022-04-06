package U2_Ejercicio_Hotel;

import U2_Ejercicio_Hotel_Interfaz.*;
/**
 *
 * @author MierderTheKat
 */
public class Main_Hotel {
    
    public static void main(String[] args) {
        
        Pantalla_Inicial inicial = new Pantalla_Inicial(); //creo la pantalla inicio
        
        inicial.setVisible(true); //Se hace visible  
        inicial.setLocationRelativeTo(null);//Se centra
        inicial.setResizable(false);//Evita que estiren la pantalla
        
        /*  Version de CMD
        Scanner scan = new Scanner(System.in);
        
        E1_Botones Botones = new E1_Botones("1_AM","Juanito","12/12/12","Botones","6",false);
        E2_Mucamas Mucama = new E2_Mucamas("2_AM","Perla","11/11/11","Mucama","6",false);
        E3_Recepcionistas Recepcionista = new E3_Recepcionistas("3_AM","Mauricia","10/10/10","Recepcionista","8",false);
        E4_Porteros Portero = new E4_Porteros("4_AM","Pedro","09/09/09","Portero","4",false);
        E5_Cocineros Cocinero = new E5_Cocineros("5_AM","Sanji","08/08/08","Cocinero","8",false);
        
        Menu menu = new Menu();
        
        int a=1;
        while(a != 6)
        {
            menu.espacio();
            menu.MenuInicial();
            a = scan.nextInt();
            menu.espacio();
            switch(a)
            {
                case 1: // Informacion de los empleados
                    while(a != 6)
                    {
                        menu.espacio();
                        menu.Elegir_Empleado();
                        a = scan.nextInt();
                        menu.espacio();
                        switch(a)
                        {
                            case 1:
                                Recepcionista.Obligaciones();
                                Recepcionista.Imprimir();
                                menu.pausa();
                                break;
                            case 2:
                                Botones.Obligaciones();
                                Botones.Imprimir();
                                menu.pausa();
                                break;
                            case 3:
                                Mucama.Obligaciones();
                                Mucama.Imprimir();
                                menu.pausa();
                                break;
                            case 4:
                                Cocinero.Obligaciones();
                                Cocinero.Imprimir();
                                menu.pausa();
                                break;
                            case 5:
                                Portero.Obligaciones();
                                Portero.Imprimir();
                                menu.pausa();
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("\n\t\t\tValor incorrecto, intentalo nuevamente\n\n\n\n");
                                menu.pausa();
                        }
                    }
                    a=1;
                    break;
                case 2: // Sueldos por Puesto
                    menu.Sueldo_por_Hora();
                    menu.pausa();
                    break;
                case 3:// Horas de Trabajo por Puesto
                    menu.Jornadas();
                    menu.pausa();
                    break;
                case 4:// Pago del empleado (elegir empleado)
                    while(a != 6)
                    {
                        menu.espacio();
                        menu.Elegir_Empleado();
                        a = scan.nextInt();
                        menu.espacio();
                        switch(a)
                        {
                            case 1:
                                Recepcionista.Sueldo(Recepcionista.Horas());
                                menu.pausa();
                                break;
                            case 2:
                                Botones.Sueldo(Botones.Horas());
                                menu.pausa();
                                break;
                            case 3:
                                Mucama.Sueldo(Mucama.Horas());
                                menu.pausa();
                                break;
                            case 4:
                                Cocinero.Sueldo(Cocinero.Horas());
                                menu.pausa();
                                break;
                            case 5:
                                Portero.Sueldo(Portero.Horas());
                                menu.pausa();
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("\n\t\t\tValor incorrecto, intentalo nuevamente\n\n\n\n");
                                menu.pausa();
                        }
                    }
                    a=4;
                    break;
                case 5:// Capturar Empleado
                    while(a != 6)
                    {
                        menu.espacio();
                        menu.Elegir_Empleado();
                        a = scan.nextInt();
                        menu.espacio();
                        switch(a)
                        {
                            case 1:
                                Recepcionista.CapturarEmpleado();
                                menu.pausa();
                                break;
                            case 2:
                                Botones.CapturarEmpleado();
                                menu.pausa();
                                break;
                            case 3:
                                Mucama.CapturarEmpleado();
                                menu.pausa();
                                break;
                            case 4:
                                Cocinero.CapturarEmpleado();
                                menu.pausa();
                                break;
                            case 5:
                                Portero.CapturarEmpleado();
                                menu.pausa();
                                break;
                            case 6:
                                System.out.println("\t\t\tVuelva pronto\n\n\n\n");
                                break;
                            default:
                                System.out.println("\n\t\t\tValor incorrecto, intentalo nuevamente\n\n\n\n");
                                menu.pausa();
                        }
                    }
                    a=4;
                    break;
                case 6:
                    System.out.println("\t\t\tVuelva pronto\n\n\n\n");
                    break;
                default:
                    System.out.println("\n\t\t\tValor incorrecto, intentalo nuevamente\n\n\n\n");
                    menu.pausa();
                    break;
            }
        }*/
    }
}