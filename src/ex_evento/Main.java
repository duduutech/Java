import ex_evento.Evento;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Evento e1 = new Evento(
                Instant.parse("2024-01-01T08:00:00Z"),
                Instant.parse("2024-01-01T22:00:00Z")
        );

        System.out.println("Duração: " + e1.duracao() + " minutos");
    }


}
