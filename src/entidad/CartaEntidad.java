package entidad;

public class CartaEntidad {

    private int num;
    private PaloEntidad palo;

    public CartaEntidad() {
    }

    public CartaEntidad(int num, PaloEntidad palo) {
        this.num = num;
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public PaloEntidad getPalo() {
        return palo;
    }

    public void setPalo(PaloEntidad palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta: " + num + " de " + palo;
    }

}
