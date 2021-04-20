package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

public class ExercicioCalendar {

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        //added 1 day to get wknd ;)
        now.add(Calendar.DATE, 1);

        System.out.println(verifyLimitDate(now));

    }


    public static String verifyLimitDate(Calendar dueDate) {

        dueDate.add(Calendar.DATE, 10);

        if (dueDate.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            dueDate.add(Calendar.DATE, 2);
        } else if (dueDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            dueDate.add(Calendar.DATE, 1);
        }

        return String.format("Vc tem até o dia %s para pagar s/ juros!!!!", dueDate.getTime());
    }

}
