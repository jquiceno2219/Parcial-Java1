package mamiferos;

public class Leon extends Felino {

    private int numManada;

    private double potenciaRugidoDecibel;

    public Leon(double potenciaRugidoDecibel, int numManada, float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso) {
        super(tamanoGarras, velocidad, habitat, altura, largo, peso);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El mamífero león caza junto a su grupo de " + numManada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El mamífero león duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El mamífero león corre a " + velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El mamífero león ruge fuerte a " + potenciaRugidoDecibel + " dB";
    }

}
