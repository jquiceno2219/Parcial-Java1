package mamiferos;

public class Tigre extends Felino {

    private String especieTigre;

    public Tigre(String especieTigre, float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso) {
        super(tamanoGarras, velocidad, habitat, altura, largo, peso);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El Mamíferos.Tigre " + especieTigre + " caza solitario en los manglares y bosques monzónicos de " + habitat + ", son los mamíferos cazadores más sigilosos";
    }

    @Override
    public String dormir() {
        return "El Mamíferos.Tigre " + especieTigre + " duerme en la selvas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Mamíferos.Tigre " + especieTigre + " corre a " + velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Ruge Mamíferos.Tigre y agacha sus orejas";
    }

}
