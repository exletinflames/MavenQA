import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

        @Test
        void shouldCalculateForRegisteredAndUnderLimit () {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1000;
            boolean registered = true;
            long expected = 30;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForRegisteredAndOverLimit () {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1_000_000;
            boolean registered = true;
            long expected = 500;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void test1 () {
            BonusService service = new BonusService();


            long amount = 500;
            boolean registered = true;
            long expected = 15;

            long actual = service.calculate(amount, registered);

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void test2 () {
            BonusService service = new BonusService();

            long amount = 300;
            boolean registered = true;
            long expected = 9;

            long actual = service.calculate(amount, registered);

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForUnregisteredAndUnderLimit () {
            BonusService service = new BonusService();

            long amount = 1000;
            boolean registered = false;
            long expected = 10;

            long actual = service.calculate(amount, registered);

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void test4 () {
            BonusService service = new BonusService();

            long amount = 500;
            boolean registered = false;
            long expected = 5;

            long actual = service.calculate(amount, registered);

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateForUnregisteredAndOverLimit () {
            BonusService service = new BonusService();

            long amount = 1_000_000;
            boolean registered = false;
            long expected = 500;

            long actual = service.calculate(amount, registered);

            Assertions.assertEquals(expected, actual);
        }
    }

