package aulas.trabalhandoComDatas.javaDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio002 {

    public static void main(String[] args) {

        //this
        //birthday timemillis
        //Date birthDay = new Date(1985-1900, 01,27);

        //or this - begins
        Date date = null;
        try {
            date = stringToDate("1985/02/27");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ends
        System.out.println(date);
        Date dataCompare = new Date(2010-1900, 4, 15);
        System.out.println(dataCompare);
        System.out.println(date.before(dataCompare));

    }

    public static Date stringToDate(String date) throws Exception{

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date formatedDate = sdf.parse(date);

        return formatedDate;
    }

}
