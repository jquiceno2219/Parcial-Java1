package mamiferos;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(int potenciaMordida, float tamanoColmillos, String color, String habitat, float altura, float largo, float peso) {
        super(tamanoColmillos, color, habitat, altura, largo, peso);
        this.fuerzaMordida = potenciaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }


    @Override
    public String comer() {
        return "El perro colombiano caza en manada con una fuerte mordida de " + fuerzaMordida + " PSI, posee fuertes mandíbulas y grandes orejas redondeadas";
    }

    @Override
    public String dormir() {
        return "El perro colombiano duerme en la sabana bogotana";
    }

    @Override
    public String correr() {
        return "El perro colombiano corre en las llanuras aledañas a la sabana!";
    }

    @Override
    public String comunicarse() {
        return "Los perros coolombianos ladran de noche durante cacerías nocturnas";
    }
}
