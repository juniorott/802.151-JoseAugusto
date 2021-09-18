package com.example.a802151_provap1.domain;

public class Produto {
    private Integer id;
    private String valoresGuardados;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValoresGuardados() {
        return valoresGuardados;
    }

    public void setValoresGuardados(String valoresGuardados) {
        this.valoresGuardados = valoresGuardados;
    }

    @Override
    public String toString() {
        return valoresGuardados;
    }
}
