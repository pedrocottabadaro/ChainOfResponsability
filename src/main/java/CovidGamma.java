public class CovidGamma implements TipoCovid{
    private static CovidGamma tipoCovidGamma = new CovidGamma();

    private CovidGamma() {};

    public static CovidGamma getTipoCovidGamma() {
        return tipoCovidGamma;
    }
}
