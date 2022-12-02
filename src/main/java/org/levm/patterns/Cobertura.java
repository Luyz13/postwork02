package org.levm.patterns;

public class Cobertura extends HeladoDecorator{

    private final Helado helado;

    public Cobertura(Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getDesc() {
        return helado.getDesc() + ", mas Cobertura por $20 extra";
    }
    @Override
    public int getPrice() {
        return helado.getPrice() + 20;
    }
}
