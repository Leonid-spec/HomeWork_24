public class BankAccount {
    public static void main(String[] args) {
        float TelephonOlga = 21.45f;
        float TelephonLeonid = 21.45f;
        int ParkPlatze = 60;
        float DevkS = 42.69f;
        float AppartmentRent = 534.30f;
        float TelephoneCredit = 58.50f;
        float NetFlix = 4.99f;
        float DevkB = 62.71f;
        int Strom = 93;
        float Garantie = 10.50f;
        float sum = TelephoneCredit + TelephonOlga + TelephonLeonid +
                ParkPlatze + DevkB + DevkS + AppartmentRent +
                NetFlix + Strom + Garantie;

        float Incom = 1455.68f;
        int IncomS = 105;

        float sumIncom = Incom + IncomS;

        double result = sumIncom - sum;


        System.out.println("Вход денег\n " + sumIncom + " \nОбязательные расходы\n " + sum + " \nОстаток\n " + result);

        System.out.println("Дополнительные расходы");

        float allout = 30.02f+16.61f+25.45f+14.65f+16.77f+30.06f+29.10f+20f+
                22.94f+11.45f+11.20f+57.82f+59.80f+38.15f+40.27f+20f+28.62f+3.30f+
                39.47f+23.02f+32.26f+4.95f+0.10f;
        int roundNumber = Math.round(allout);

        System.out.println(result - roundNumber);






    }
}
