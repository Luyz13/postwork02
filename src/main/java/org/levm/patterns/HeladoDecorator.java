package org.levm.patterns;

public abstract class HeladoDecorator implements Helado {
    @Override
    public String getDesc(){
        return "Complementos";
    }

}
