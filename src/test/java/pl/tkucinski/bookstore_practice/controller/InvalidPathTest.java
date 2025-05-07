package pl.tkucinski.bookstore_practice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class InvalidPathTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenGetRequestWithInvalidPathThenReturn404() throws Exception {
        mockMvc.perform(get("/invalidPath"))
                .andExpect(content().contentType("application/json"))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.error").value("NOT FOUND"))
                .andExpect(jsonPath("$.method").value("GET"));
    }
}
