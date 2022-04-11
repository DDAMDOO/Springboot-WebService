package springboot.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
//@WebMvcTest(controllers = MainController.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void mainTest() throws Exception {
        String main = "main";

        mvc.perform(get("/main"))
                .andExpect(status().isOk())
                .andExpect(content().string(main));
    }

    @Test
    public void mainDtoTest() throws Exception {
        String name = "main";
        int amount = 1000;

        mvc.perform(get("/main/dto")
                .param("name",name)
                .param("amount",String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount",is(amount)));

    }
}
