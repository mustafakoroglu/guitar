package serviceTest;

import entity.Guitar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import service.GuitarService;

import java.util.List;

@SpringBootTest
public class GuitarServiceUnitTest {

    @Autowired
    private GuitarService guitarService;

    @Test
    public void example_test() {
        List<Guitar> books = guitarService.list();
    }
}
