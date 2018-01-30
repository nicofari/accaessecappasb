package it.kotik.accaessecappasb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(AccaessecappasbRestController.class)
public class AccaessecappasbRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void should_return_words() throws Exception {
        mockMvc.perform(get("/words"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
