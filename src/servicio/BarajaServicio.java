package servicio;

import entidad.BarajaEntidad;
import entidad.CartaEntidad;
import entidad.PaloEntidad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaServicio {

    ArrayList<CartaEntidad> baraja = new ArrayList<>();
    ArrayList<CartaEntidad> cartasMonton = new ArrayList<>();
    BarajaEntidad barajaEntidad = new BarajaEntidad();

    public void crearCarta() {
        int num;
        for (int i = 1; i <= 12; i++) {
            if (i == 8 || i == 9) {
                continue;
            }
            num = i;
            crearBaraja(num);
        }
    }

    public void crearBaraja(int num) {
        CartaEntidad cartaBasto = new CartaEntidad();
        cartaBasto.setNum(num);
        cartaBasto.setPalo(PaloEntidad.Basto);
        baraja.add(cartaBasto);

        CartaEntidad cartaEspada = new CartaEntidad();
        cartaEspada.setNum(num);
        cartaEspada.setPalo(PaloEntidad.Espada);
        baraja.add(cartaEspada);

        CartaEntidad cartaOro = new CartaEntidad();
        cartaOro.setNum(num);
        cartaOro.setPalo(PaloEntidad.Oro);
        baraja.add(cartaOro);

        CartaEntidad cartaCopa = new CartaEntidad();
        cartaCopa.setNum(num);
        cartaCopa.setPalo(PaloEntidad.Copa);
        baraja.add(cartaCopa);

        barajaEntidad.setCartas(baraja);
    }

    public void barajar() {
        Collections.shuffle(barajaEntidad.getCartas());
    }

    public void siguienteCarta() {
        System.out.println("Esta es la siguiente carta");
        System.out.println(barajaEntidad.getCartas().get(1));

        cartasMonton.add(barajaEntidad.getCartas().get(0));
        cartasMonton.add(barajaEntidad.getCartas().get(1));

        barajaEntidad.getCartas().subList(0, 2).clear();
    }

    public void cartasDisponibles() {
        int cantCarta = barajaEntidad.getCartas().size();
        System.out.println("Quedan " + cantCarta + " cartas disponibles");
    }

    public void darCartas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantas cartas queres?");
        int respuesta = scanner.nextInt();

        if (respuesta <= barajaEntidad.getCartas().size()) {
            System.out.println("Aquí tienes");
            System.out.println(barajaEntidad.getCartas().subList(0, respuesta));

            for (int i = 0; i < respuesta; i++) {
                cartasMonton.add(barajaEntidad.getCartas().get(i));
            }

            barajaEntidad.getCartas().subList(0, respuesta).clear();
            cartasDisponibles();
        } else {
            System.out.println("No puedo darte tantas cartas");
            cartasDisponibles();
        }
    }

    public void cartasMonton() {
        System.out.println("Estas cartas ya salieron");
        for (int i = 0; i < cartasMonton.size(); i++) {
            System.out.println(cartasMonton.get(i));
        }
    }

    public void mostrarCartas() {
        System.out.println(barajaEntidad.getCartas());
    }
}
