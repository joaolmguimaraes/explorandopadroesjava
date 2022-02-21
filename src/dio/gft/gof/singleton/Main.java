package dio.gft.gof.singleton;

import dio.gft.gof.facade.Facade;
import dio.gft.gof.strategy.*;

public class Main {
    public static void main(String[] args) {

        Singleton lazy = Singleton.getInstancia();
        System.out.println(lazy);
        lazy = Singleton.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "86039-320");




    }
}
