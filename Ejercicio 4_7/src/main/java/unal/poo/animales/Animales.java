package unal.poo.animales;

public class Animales {

    public static void main(String[] args)  {
         Animal[] animales = new Animal[4];
         animales[0] = new Gato();
         animales[1] = new Perro();
         animales[2] = new Lobo();
         animales[3] = new Leon();
                 
         for (int i = 0 ; animales.length > i ; i++){
                   System.out.println(animales[i].getNombreCientifico());
                   System.out.println("Sonido: " + animales[i].getSonido());
                   System.out.println("Alimentos: " + animales[i].getAlimentos());
                   System.out.println("Habitad: " + animales[i].getHabitad());
                   System.out.println("");
             
         }
               
    }
}
