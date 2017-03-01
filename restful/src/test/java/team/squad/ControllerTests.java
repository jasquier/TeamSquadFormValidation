package team.squad;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Team Squad Spring Squad
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTests {

    @Autowired
    private MockMvc mockMvc;
    private MockHttpSession mockHttp;

    @Test
    public void goodRequestShouldReturnTrue() throws Exception {
        MockHttpServletRequestBuilder query = get("/login")
                .param("name", "Andres").param("pw", "123");

        mockMvc.perform(query).andDo(print()).andExpect(jsonPath("$.isPasswordValid").value(true));
    }

    @Test
    public void badRequestShouldReturnFalse() throws Exception {
        MockHttpServletRequestBuilder query = get("/login")
                .param("name", "Andres").param("pw", "badpw");

        mockMvc.perform(query).andDo(print()).andExpect(jsonPath("$.isPasswordValid").value(false));
    }
}