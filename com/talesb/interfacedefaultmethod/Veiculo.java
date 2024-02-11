package com.talesb.interfacedefaultmethod;

public interface Veiculo {
    void mover();

    default void ligar() {
        System.out.println("Veículo ligado");
    }
}
