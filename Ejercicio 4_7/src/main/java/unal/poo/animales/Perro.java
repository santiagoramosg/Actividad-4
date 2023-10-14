package unal.poo.animales;

public class Perro extends Canido {

    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }

    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }

    @Override
    public String getHabitad() {
        return "Domestico";
    }
    
}
