public class BankAccount {
    public static void main(String[] args) {
        float TelephonOlga = 21.49f;
        float TelephonLeonid = 21.49f;
        int ParkPlatze = 60;
        float DevkS = 42.69f;
        float AppartmentRent = 534.30f;
        float TelephoneCredit = 58.50f;
        float NetFlix = 4.99f;
        float DevkB = 62.71f;
        int Strom = 68;
        float Garantie = 10.50f;
        float fuell = 60f;
        float sum = TelephoneCredit + TelephonOlga + TelephonLeonid +
                ParkPlatze + DevkB + DevkS + AppartmentRent +
                NetFlix + Strom + Garantie + fuell;

        float Incom = 1455.68f;
        int IncomS = 150;

        float sumIncom = Incom + IncomS;

        double result = sumIncom - sum;


        System.out.println("Вход денег\n " + sumIncom + " \nОбязательные расходы\n " + sum + " \nОстаток\n " + result);

        System.out.println("остаток после покупки продуктов");

        float essen = 200f;
        int freetOuSE = (int)result - (int) essen;
        System.out.println(freetOuSE);






    }
}
