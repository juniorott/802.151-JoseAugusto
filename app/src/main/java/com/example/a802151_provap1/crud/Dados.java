package com.example.a802151_provap1.crud;

import com.example.a802151_provap1.domain.Produto;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Dados {
    private static final List  dados = new LinkedList();
    private static Integer count=1;
    private Dados(){
    }
    public static void salvar(Produto o){
        if(dados.contains(o)) {
            dados.set(dados.indexOf(o), o);
        }else{
            o.setId(count++);
            dados.add(o);
        }
    }
    /*public static void salvar(Collection o){
        dados.addAll(o);
    }*/
    public static List getLista(){
        return dados;
    }
    public static void remove(int i) {
        dados.remove(i);
    }
}