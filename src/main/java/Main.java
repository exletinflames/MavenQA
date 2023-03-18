public class Main {

    public static void main(String[] args) {

        BonusService service = new BonusService();
        long expected = 150;
        long actual = service.calculate(5000,true);
        System.out.println(actual);



    }
}
