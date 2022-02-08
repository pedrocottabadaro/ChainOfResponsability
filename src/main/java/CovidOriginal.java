public class CovidOriginal implements TipoCovid{

    private static CovidOriginal tipoCovidOriginal = new CovidOriginal();

    private CovidOriginal() {};

    public static CovidOriginal getTipoCovidOriginal() {
        return tipoCovidOriginal;
    }
}
