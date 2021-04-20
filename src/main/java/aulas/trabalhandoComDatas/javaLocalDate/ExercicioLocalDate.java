package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExercicioLocalDate {

    public static void main(String[] args) {
//        this
//        LocalDate date = LocalDate.of(year, month, dayOfMonth);
//        LocalTime time = LocalTime.of(hour, minute);
//        return new LocalDateTime(date, time);

//      OR

        LocalDateTime someDate = LocalDateTime.of(2010, 05, 15, 10, 00, 00);
        System.out.println(someDate.plusYears(4).plusMonths(6).plusHours(13));
    }

}
