package Inmuebles.Inmuebles;

public class InmuebleVivienda extends Inmueble { 
    protected int numeroHabitaciones;
    protected int numeroBaños;
    
    
public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
    super(identificadorInmobiliario, area, direccion);
    this.numeroHabitaciones = numeroHabitaciones;
    this.numeroBaños = numeroBaños;
}

    @Override
void imprimir() {
    super.imprimir(); 
    System.out.println("Número de habitaciones = " +  numeroHabitaciones);
    System.out.println("Número de baños = " + numeroBaños);
}

}
