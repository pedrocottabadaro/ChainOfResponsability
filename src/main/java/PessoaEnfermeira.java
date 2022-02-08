public class PessoaEnfermeira extends Pessoa{

    public PessoaEnfermeira(Pessoa superior) {
        listaCovid.add(CovidOriginal.getTipoCovidOriginal());
        setPessoaSuperior(superior);
    }
    @Override
    public String getDescricaoPessoa() {
        return "Tratamento completo pela enfermeira";
    }
}
