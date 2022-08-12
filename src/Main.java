public class Main
{ public static void main(String[] args)
    {
        //Задание №1
        var z = 666;
        byte a =  1;
        short b = 2;
        int c = 3;
        long d = 4L;

        float e = 5.5f;
        double f = 6;

        char k = 47;
        char l = '/';
        System.out.println("Ответ на задачу №1:");
        System.out.println(k + " = " + l + "\n");

        //Задание №2
        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;
        float totalWeightBoxers = boxerWeight1 + boxerWeight2;
        float diffWeightBoxers = (boxerWeight2-boxerWeight1);
        System.out.println("Ответ на задачу №2:");
        System.out.println("Общий вес бойцов равен " + totalWeightBoxers + " кг");
        System.out.println("Разница в весе бойцов равна " + diffWeightBoxers + " кг" + "\n");

        //Задание №3
        double banana = 80;
        double milk = 105;
        double iceCream = 100;
        double eggs = 70;
        double breakfastWeight = ((banana * 5) + (milk*2) + (iceCream*2) + (eggs*4))/1000;
        System.out.println("Ответ на задачу №3:");
        System.out.println("Вес завтрака равен " + breakfastWeight + " кг" + "\n");

        //Задание №4
        int dropWeight = 7000;
        int daysWeightLossMinus250 = dropWeight/250;
        int daysWeightLossMinus500 = dropWeight/500;
        int daysWeightLossAverage = (daysWeightLossMinus250 + daysWeightLossMinus500)/2;
        System.out.println("Ответ на задачу №4:");
        System.out.println("При потере веса 250 грамм в сутки требуется " + daysWeightLossMinus250 + " дней");
        System.out.println("При потере веса 500 грамм в сутки требуется " + daysWeightLossMinus500 + " дней");
        System.out.println("При потере в весе от 250 грамм до 500 грамм в сутки, среднее значение составит " + daysWeightLossAverage + " день" + "\n");

        //Задание №5
        //Маша
        // Зарплата в месяц
        double MashaSalaryMonth = 67_760;
        //Количество месяцев
        double Month = 12;
        //Зарплата за год
        double MashaSalaryYear = MashaSalaryMonth*Month;
        //Разница
        double MashaSalaryPercentage = (MashaSalaryYear/100*110)-MashaSalaryYear;
        //Вывод
        System.out.println("Ответ на задачу №5:");
        System.out.println("Маша теперь получает " + MashaSalaryYear/100*110 + " рублей в год. " + "Годовой доход вырос на " + MashaSalaryPercentage + " рублей");

        //Денис
        // Зарплата в месяц
        double DenisSalaryMonth = 83_690;
        //Зарплата за год
        double DenisSalaryYear = DenisSalaryMonth*Month;
        //Разница
        double DenisSalaryPercentage = (DenisSalaryYear/100*110)-DenisSalaryYear;
        //Вывод
        System.out.println("Денис теперь получает " + DenisSalaryYear/100*110 + " рублей в год. " + "Годовой доход вырос на " + DenisSalaryPercentage + " рублей");

        //Кристина
        // Зарплата в месяц
        double KristinaSalaryMonth = 76_230;
        //Зарплата за год
        double KristinaSalaryYear = KristinaSalaryMonth*Month;
        //Разница
        double KristinaSalaryPercentage = (KristinaSalaryYear/100*110)-KristinaSalaryYear;
        //Вывод
        System.out.println("Кристина теперь получает " + KristinaSalaryYear/100*110 + " рублей в год. " + "Годовой доход вырос на " + KristinaSalaryPercentage + " рублей");
    }
}