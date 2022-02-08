import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CovidTest {
    PessoaDoutor doutor;
    PessoaEnfermeira enfermeira;
    PessoaMedico medico;

    @BeforeEach
    void setUp() {
        doutor = new PessoaDoutor(null);
        medico = new PessoaMedico(doutor);
        enfermeira = new PessoaEnfermeira(medico);
    }

    @Test
    void deveRetornarTratamentoFeitoDoutor() {
        assertEquals("Tratamento completo pelo medico", enfermeira.tratarCovid(new Covid(CovidDelta.getTipoCovidDelta())));
    }

    @Test
    void deveRetornarTratamentoFeitoMedico() {
        assertEquals("Tratamento completo pelo doutor", enfermeira.tratarCovid(new Covid(CovidOmega.getTipoCovidOmega())));
    }

    @Test
    void deveRetornarTratamentoFeitoEnfermeira() {
        assertEquals("Tratamento completo pela enfermeira", enfermeira.tratarCovid(new Covid(CovidOriginal.getTipoCovidOriginal())));
    }

    @Test
    void deveRetornarTratamentoNaoPodeSerFeito() {
        assertEquals("Tratamento não consegue ser feito", enfermeira.tratarCovid(new Covid(CovidGamma.getTipoCovidGamma())));
    }


}
