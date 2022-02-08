public class PessoaDoutor extends Pessoa{

    public PessoaDoutor(Pessoa superior) {
        listaCovid.add(CovidOmega.getTipoCovidOmega());
        setPessoaSuperior(superior);
    }
    @Override
    public String getDescricaoPessoa() {
        return "Tratamento completo pelo doutor";
    }
}
