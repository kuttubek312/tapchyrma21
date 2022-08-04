package com.company;

public class Main {
    public static void main(String[] args) {

         //   Кундорго enum тузунуз (Monday, Tuesday ...)
        //  консолдон бир кунду белгилениз . Эгер Monday болсо
        //   - анда "Дуйшомбу куну жава окуйм" же Tuesday болсо - анда
        //   "Шейшемби куну англис тили сабагын окуйм" деп кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
        //   Жуманын кундорун кыргыз тилинде корсотунуз



        Days days = Days.DUYCHOMBU;
        switch (days){
            case DUYCHOMBU -> System.out.println("Дуйшомбу жава тилин окуйм");
            case SHEYSHEMBI -> System.out.println("Шейшемби практика сабагын окуйм");
            case SHARSHEMBI -> System.out.println("Шаршемби жава тилин окуйм");
            case BEYSHEMBI -> System.out.println("Бейшемби куну практика сабагын окуйм");
            case JUMA -> System.out.println("Жума жава тилин уйроном");
            case ISHEMBI -> System.out.println("Ийшенби англис тилин окуйм");
            case JEKSHEMBI -> System.out.println("Жекшенби ес алам ");
        }

    }
}