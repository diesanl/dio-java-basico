package aulas.trabalhandoComDatas.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioDateFormat {

    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:mmm");

        String formatedDate = sdf.format(now);

        System.out.println(formatedDate);

    }

}
