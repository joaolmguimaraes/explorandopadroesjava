package dio.gft.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movimento defensivo.");
    }
}
