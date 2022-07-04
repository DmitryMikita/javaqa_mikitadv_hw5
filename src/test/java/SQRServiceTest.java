import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.sqrservice.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,100,144",
            "0,50,40"
    }
    )
    public void testSqrtCount(int expected, int lower_bound, int upper_bound) {
        SQRService service = new SQRService();

        int actual = service.squarecounter(lower_bound, upper_bound);
        Assertions.assertEquals(expected, actual);
    }

}

