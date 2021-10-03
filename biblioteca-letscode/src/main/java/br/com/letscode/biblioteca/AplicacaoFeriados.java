package br.com.letscode.biblioteca;

import br.com.letscode.biblioteca.Feriados;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

public class AplicacaoFeriados {
    public static void main(String[] args) {


        //emprestimos prazo devolução
        //Aluno - 10 dias uteis
        //Professor - 20 dias uteis
        LocalDate data = LocalDate.now();
        int diasUteisAluno = 10;
        int diasUteisProfessor = 20;
        int diasUteis = 0;

        while (diasUteis < diasUteisAluno) {
            data = data.plusDays(1);
            if (isDiaUtil(data)) {
                diasUteis++;

            }
        }
        System.out.println("A data de devolução de seus pedidos será em: "+ data);

        while (diasUteis < diasUteisProfessor) {
            data = data.plusDays(1);
            if (isDiaUtil(data)) {
                diasUteis++;
            }
        }
        System.out.println("A data de devolução de seus pedidos será em: "+ data);
    }

    private static boolean isDiaUtil(LocalDate data) {
        DayOfWeek dayOfWeek = data.getDayOfWeek();
        if (SATURDAY.equals(dayOfWeek) || SUNDAY.equals(dayOfWeek) || isFeriado(data)) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean isFeriado(LocalDate data) {
        List<Feriados> feriados = getFeriado();
        for (Feriados f : feriados) {
            if (f.getData().isEqual(data)) {
                return true;
            }
        }
        return false;
    }

    private static List<Feriados> getFeriado() {
        List<Feriados> listaFeriados = new ArrayList<>();
        listaFeriados.add(new Feriados(LocalDate.of(2021, 1, 1), "Confraternização Universal"));
        listaFeriados.add(new Feriados(LocalDate.of(2021, 2, 15), "Carnaval"));
        listaFeriados.add(new Feriados(LocalDate.of(2021, 2, 16), "Carnaval"));
        listaFeriados.add(new Feriados(LocalDate.of(2021, 4, 2), "Paixão de Cristo"));
        listaFeriados.add(new Feriados(LocalDate.of(2021, 4, 21), "Tiradentes"));
        listaFeriados.add(new Feriados(LocalDate.of(2021, 5, 1), "Dia do Trabalho"));
        listaFeriados.add(new Feriados(LocalDate.of(2021, 6, 3), "Corpus Christi"));
        listaFeriados.add(new Feriados(LocalDate.of(2021, 9, 7), "Independência do Brasil"));
        listaFeriados.add(new Feriados(LocalDate.of(2021, 10, 12), "Nossa Senhora da Aparecida - Padroeira do Brasil"));
        listaFeriados.add(new Feriados(LocalDate.of(2021, 11, 2), "Finados"));
        listaFeriados.add(new Feriados(LocalDate.of(2021, 11, 15), "Proclamação da Republica"));
        listaFeriados.add(new Feriados(LocalDate.of(2021, 12, 25), "Natal"));
        return listaFeriados;
    }
}

