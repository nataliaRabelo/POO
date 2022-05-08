package com.company;

public class Par <F, S>{

    private F atributo1;
    private S atributo2;

    public Par(F atributo1, S atributo2){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;

    }


    public F getAtributo1(){
        return this.atributo1;
    }

    public S getAtributo2(){
        return this.atributo2;
    }

    public void setAtributo1(F algumaCoisa){
        this.atributo1 = algumaCoisa;
    }

    public void setAtributo2(S algumaCoisa){
        this.atributo2 = algumaCoisa;
    }
}
