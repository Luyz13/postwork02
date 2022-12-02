package org.levm.patterns;

public class Topping extends HeladoDecorator {
    private final Helado helado;

    public Topping(Helado helado) {
        this.helado = helado;
    }
    @Override
    public String getDesc() {
        return helado.getDesc() + ", mas Topping por $20 extra ";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 20;
    }
}
