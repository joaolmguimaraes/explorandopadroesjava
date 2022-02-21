package dio.gft.gof.subsistema2.cep;

import dio.gft.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Londrina";

    }
    public String recuperarEstado(String cep) {
        return "PR";

    }

}
