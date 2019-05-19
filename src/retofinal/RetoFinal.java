package retofinal;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Random;

public class RetoFinal {
    
        public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int numeroTur;
        int nivelVidaMago = 10;
        int nivelVidaJugador = 10;
        int opcion;
        int turno = 0;
        System.out.println("Tu vida inicial es: "+nivelVidaMago);
        System.out.println("La vida del mago es: "+nivelVidaMago);
        System.out.println("La recomendación de turnos es de 50 o más para poder obtener a un ganador :)");
        System.out.println("Ingrese cantidad de turnos a jugar: ");
        numeroTur = Integer.parseInt(entrada.readLine());
        System.out.println(" ");

        Random aleatorio = new Random(System.currentTimeMillis());
        for (int turActual = 1; turActual <= numeroTur; turActual++){
        System.out.println("El juego se encuentra en el turno " + turActual);

        if (turno == 1) {
            opcion = aleatorio.nextInt(4) + 1;
            switch(opcion){
                case 1:
                    nivelVidaJugador += 1;
                    nivelVidaMago -= 1;
                    System.out.println(" ");//sout vacíos para una mejor presentación de la simulación
                    System.out.println("-- Haz salvado 10 hadas, aumenta tu poder --");
                    System.out.println("-- El mago pierde poder --");
                    System.out.println(" ");
                    break;
                case 2:
                    nivelVidaJugador -= 1;
                    nivelVidaMago += 1;
                    System.out.println(" ");
                    System.out.println("-- Pierdes poder --");
                    System.out.println("-- El mago capturó 10 hadas, aumenta su poder --");
                    System.out.println(" ");
                    break;
                case 3:
                    nivelVidaJugador -= 1;
                    System.out.println(" ");
                    System.out.println("-- Un ogro te golpeó golpeó, pierdes poder --");
                    System.out.println(" ");
                    break;
                case 4:
                    nivelVidaMago  -= 1;
                    System.out.println(" ");
                    System.out.println("-- Le quitaste un hada al mago --");
                    System.out.println("-- El mago pierde poder --");
                    System.out.println(" ");
                    break;
            }
            turno = 0;
        }
        turno++;
            if(nivelVidaJugador == 0 || nivelVidaMago ==  0){
                System.out.println("-- Se acabó el juego --");
                System.out.println("Poder del Jugador: "+nivelVidaJugador);
                System.out.println("Poder del Mago: "+nivelVidaMago);
                break;
            }
        }
    }
}
