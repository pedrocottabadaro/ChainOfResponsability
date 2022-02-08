public class CovidDelta implements TipoCovid{

    private static CovidDelta tipoCovidDelta = new CovidDelta();

    private CovidDelta() {};

    public static CovidDelta getTipoCovidDelta() {
        return tipoCovidDelta;
    }
}
