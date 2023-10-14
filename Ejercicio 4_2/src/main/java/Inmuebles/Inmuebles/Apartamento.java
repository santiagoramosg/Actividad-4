package Inmuebles.Inmuebles;

public class Apartamento extends InmuebleVivienda {
    
public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
    super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
}

@Override
void imprimir(){
    super.imprimir();
}
    
}
