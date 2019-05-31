package gob.mtpe.apigateway.archetype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import gob.mtpe.apigateway.archetype.ApigatewayArchetypeApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApigatewayArchetypeApplication.class)
public class ApigatewayArchetypeApplicationTests {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
