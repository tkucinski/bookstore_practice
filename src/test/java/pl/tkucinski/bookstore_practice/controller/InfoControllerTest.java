package pl.tkucinski.bookstore_practice.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(InfoController.class)
public class InfoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenPerformInfoRequestThenReturnProperGreeting() throws Exception {
        //given

        mockMvc.perform(get("/info"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello from our bookstore service!")));
    }
}
