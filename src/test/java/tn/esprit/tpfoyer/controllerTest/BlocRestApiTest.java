package tn.esprit.tpfoyer.controllerTest;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.service.BlocServiceImpl;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(BlocRestApiTest.class)
public class BlocRestApiTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BlocServiceImpl blocService;

    @Test
    public void testGetAllBlocs() throws Exception {
        Bloc bloc = new Bloc();
        bloc.setIdBloc(1L);
        bloc.setNomBloc("Bloc A");

        when(blocService.retrieveAllBlocs()).thenReturn(Collections.singletonList(bloc));

        mockMvc.perform(get("/blocs"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].idBloc").value(1L))
                .andExpect(jsonPath("$[0].nomBloc").value("Bloc A"));
    }
}
