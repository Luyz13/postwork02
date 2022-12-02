package org.levm.patterns;

public class Galleta extends HeladoDecorator {
    private final Helado helado;

    public Galleta(Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getDesc() {
        return helado.getDesc() + ", mas Galleta por $15 extra ";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 15;
    }
}
