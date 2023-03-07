package mamiferos;

public class Guepardo extends Felino {

    public Guepardo(float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso) {
        super(tamanoGarras, velocidad, habitat, altura, largo, peso);
    }

    @Override
    public String comer() {
        return "El Mamífero Guepardo caza junto a su grupo en las llanuras africanas, con un mordida mucho inferior a los demas felinos grandes.";
    }

    @Override
    public String dormir() {
        return "El Mamífero Guepardo duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El Mamífero Guepardo es el felino mas rápido del mundo, corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Mamífero Guepardo ruge no tan fuerte como el León";
    }

}
