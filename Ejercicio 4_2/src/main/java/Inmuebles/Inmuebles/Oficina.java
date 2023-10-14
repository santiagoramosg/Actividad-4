package Inmuebles.Inmuebles;

public class Oficina extends Local{
    protected static double valorArea = 3500000;
    protected boolean esGobierno;
    
public Oficina (int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, boolean esGobierno) {
    super(identificadorInmobiliario, area, direccion, tipoLocal);
    this.esGobierno = esGobierno;
    
}
void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Es oficina gubernamental = " + esGobierno);
    System.out.println();
}


}
