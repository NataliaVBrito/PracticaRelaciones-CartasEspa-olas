package entidad;

import java.util.ArrayList;

public class BarajaEntidad {

    private ArrayList<CartaEntidad> cartas = new ArrayList<>();

    public BarajaEntidad() {
    }

    public BarajaEntidad(ArrayList<CartaEntidad> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<CartaEntidad> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<CartaEntidad> cartas) {
        this.cartas = cartas;
    }

}
