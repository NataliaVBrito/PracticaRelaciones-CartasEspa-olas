package servicio;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    BarajaServicio barajaServicio = new BarajaServicio();

    public void juego() {
        System.out.println("¿Listo para jugar?");
        barajaServicio.crearCarta();
        barajaServicio.barajar();

        System.out.println("La baraja ya fue creada y mezclada");

        System.out.println(">>>>><<<<<");
        
        System.out.println("Esta es la primera carta");
        System.out.println(barajaServicio.barajaEntidad.getCartas().get(0));

        int respuesta = menuOpciones();

        boolean salida = false;

        while (!salida == true) {
            switch (respuesta) {
                case 1:
                    barajaServicio.siguienteCarta();
                    break;
                case 2:
                    barajaServicio.cartasDisponibles();
                    break;
                case 3:
                    barajaServicio.darCartas();
                    break;
                case 4:
                    barajaServicio.cartasMonton();
                    break;
                case 5:
                    barajaServicio.mostrarCartas();
                    break;
                case 6:
                    System.out.println("Tecla equivocada, gracias por jugar con nosotros");
                    break;
            }
            System.out.println("¿Quieres seguir jugando?");
            char seguir = scanner.next().charAt(0);

            if (String.valueOf(seguir).equalsIgnoreCase("S")) {
                respuesta = menuOpciones();
            } else {
                salida = true;
                System.out.println("¡Gracias por jugar con nosotros!");
            }
        }
    }

    public int menuOpciones() {
        System.out.println("Ahora, ¿Que quieres hacer?");
        System.out.println("1)Siguiente carta\n2)Ver la cantidad de cartas disponibles\n3)Pedir cartas\n"
                + "4)Ver las cartas que ya salieron\n5)Ver las cartas que quedan en la baraja");
        int respuesta = scanner.nextInt();

        return respuesta;
    }
}
