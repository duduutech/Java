package ex_evento;

import java.time.Duration;
import java.time.Instant;

public class Evento {
    private Instant inicio;
    private Instant fim;

    public Evento(Instant inicio, Instant fim){
        this.inicio = inicio;
        this.fim = fim;
    }

    public long duracao(){
        Duration d = Duration.between(inicio, fim);
        return d.toMinutes();
    }
}
