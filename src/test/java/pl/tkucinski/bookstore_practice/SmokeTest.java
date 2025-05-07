package pl.tkucinski.bookstore_practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.tkucinski.bookstore_practice.controller.InfoController;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
public class SmokeTest {

    @Mock
    private InfoController infoController;

    @Test
    public void contextLoads() {
        assertThat(infoController).isNotNull();
    }
}
