package org.levm.patterns;

public class Granola extends HeladoDecorator {
    private final Helado helado;

    public Granola(Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getDesc() {
        return helado.getDesc() + ", mas Granola por $ 10 extra";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 10;
    }
}
