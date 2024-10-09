package principal;

import model.Restaurante;

public class Principal {

    public static void main(String[] args) {

        Restaurante restaurante = new Restaurante();
        restaurante.leitura();
        restaurante.imprimir();

    }
}
