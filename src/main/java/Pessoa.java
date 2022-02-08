import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public abstract class Pessoa {

    protected ArrayList listaCovid = new ArrayList();
    private Pessoa pessoaSuperior;

    public Pessoa getPessoa() {
        return pessoaSuperior;
    }

    public void setPessoaSuperior(Pessoa pessoaSuperior) {
        this.pessoaSuperior = pessoaSuperior;
    }

    public abstract String getDescricaoPessoa();

    public String tratarCovid(Covid covid) {
        if (listaCovid.contains(covid.getTipoCovid())) {
            return getDescricaoPessoa();
        }
        else {
            if (pessoaSuperior != null) {
                return pessoaSuperior.tratarCovid(covid);
            }
            else
            {
                return "Tratamento não consegue ser feito";
            }
        }
    }

}
