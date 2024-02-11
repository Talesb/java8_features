package com.talesb.interfacedefaultmethod;

class Carro implements Veiculo {
    @Override
    public void mover() {
        System.out.println("Carro se movendo");
    }
}