package cn.shuaijunlan.learning.springboot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:23 2017/12/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerExampleTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getPersonList() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/personList"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void addPerson() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/addPerson"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void getAgeById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/person/getAge/55"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}