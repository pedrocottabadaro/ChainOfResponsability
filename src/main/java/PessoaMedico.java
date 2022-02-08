public class PessoaMedico extends Pessoa{

    public PessoaMedico(Pessoa superior) {
        listaCovid.add(CovidDelta.getTipoCovidDelta());
        setPessoaSuperior(superior);
    }
    @Override
    public String getDescricaoPessoa() {
        return "Tratamento completo pelo medico";
    }
}
