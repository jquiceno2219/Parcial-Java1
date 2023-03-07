package mamiferos;

public class Lobo extends Canino {

    private int numCamada;

    private String especieLobo;

    public Lobo(int numCamada, String especieLobo, float tamanoColmillos, String color, String habitat, float altura, float largo, float peso) {
        super(tamanoColmillos, color, habitat, altura, largo, peso);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    @Override
    public String comer() {
        return "El Mamífero Lobo " + especieLobo + " caza junto a su grupo de " + numCamada + " individuos en los bosques de " + habitat;
    }

    @Override
    public String dormir() {
        return "El Mamífero Lobo " + color + " duerme en las cabernas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Mamíferos Lobo " + especieLobo + " corre en las llanuras aledañas a los bosques de " + habitat;
    }

    @Override
    public String comunicarse() {
        return "El Mamífero Lobo " + especieLobo + " " + color + " aulla en luna llena";
    }
}
