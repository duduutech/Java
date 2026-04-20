package ex_aniversario;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Aniversario {
    private LocalDate dataNascimento;

    public Aniversario(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public  int calcularIdade(){
        Period periodo = Period.between(dataNascimento, LocalDate.now());
        return periodo.getYears();

    }

    public long diasVividos(){
        return ChronoUnit.DAYS.between(dataNascimento, LocalDate.now());
    }
}
