package Inmuebles.Inmuebles;

public class Apartaestudio extends Apartamento{
    protected static double valorArea = 1500000;
    
public Apartaestudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
    super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
}

    @Override
void imprimir(){
    super.imprimir();
    System.out.println();
}

}
