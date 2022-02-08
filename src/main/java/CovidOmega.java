public class CovidOmega implements TipoCovid {

    private static CovidOmega tipoCovidOmega = new CovidOmega();

    private CovidOmega() {};

    public static CovidOmega getTipoCovidOmega() {
        return tipoCovidOmega;
    }
}
