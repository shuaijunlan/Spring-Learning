package cn.shauijunlan.springboot.thymeleaf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:35 PM 11/15/19.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = WelcomeController.class)
public class ApplicationTest {

    @Autowired
    private MockMvc mockMvc;
    private List<String> expectedList = Arrays.asList("a", "b", "c", "d");

    @Test
    public void main() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"))
                .andExpect(model().attribute("message", equalTo("Junlan")))
                .andExpect(model().attribute("tasks", is(expectedList)))
                .andExpect(content().string(containsString("Hello, Junlan")));
        MvcResult mvcResult = resultActions.andReturn();
        ModelAndView mv = mvcResult.getModelAndView();
    }

    @Test
    public void hello() throws Exception {
        mockMvc.perform(get("/hello").param("name", "Shuai"))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"))
                .andExpect(model().attribute("message", equalTo("Shuai")))
                .andExpect(content().string(containsString("Hello, Shuai")));
    }

}