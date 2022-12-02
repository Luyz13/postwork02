package org.levm.patterns;

public class HeladoSuave implements Helado {
    @Override
    public String getDesc() {
        return "Un Helado Suave $30";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
