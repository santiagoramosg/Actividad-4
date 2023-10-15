/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carreraciclista;

/**
 *
 * @author marco
 */
public class Contrarrelojista extends Ciclista {
    // Atributo que define la velocidad máxima de un contrarrelojista
private double velocidadMáxima;
/**
* Constructor de la clase Escalador
* @param identificador Parámetro que define el identificador de un
* contrarrelojista
* @param nombre Parámetro que define el nombre de un
* contrarrelojista
* @param velocidadMáxima Parámetro que define la velocidad
* máxima de un contrarrelojista
*/
public Contrarrelojista(int identificador, String nombre, double
velocidadMáxima) {
super(identificador, nombre);
this.velocidadMáxima = velocidadMáxima;
}
/**
* Método que devuelve la velocidad máxima de un contrarrelojista
* @return La velocidad máxima de un contrarrelojista
*/
protected double getVelocidadMáxima() {
return velocidadMáxima;
}
/**
* Método que establece la velocidad máxima de un contrarrelojista
* @param Parámetro que especifica la velocidad máxima de un
* contrarrelojista
*/
protected void setVelocidadMáxima(double velocidadMáxima) {
this.velocidadMáxima = velocidadMáxima;
}
/**
* Método que muestra en pantalla los datos de un contrarrelojista
*/
protected void imprimir() {
super.imprimir(); // Invoca el método imprimir de la clase padre
System.out.println("Aceleración promedio = " + velocidadMáxima);
}
/**
* Método que devuelve el tipo de ciclista
* @return Un valor String con el texto “Es un constrarrelojista”
*/
protected String imprimirTipo() {
return "Es un constrarrelojista";
}
}

