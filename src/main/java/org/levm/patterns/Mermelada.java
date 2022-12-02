package org.levm.patterns;

public class Mermelada extends HeladoDecorator {
    private final Helado helado;

    public Mermelada(Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getDesc() {
        return helado.getDesc() + ", mas Mermelada por $10 extra ";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 10;
    }
}