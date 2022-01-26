/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 *
 * @author stefa
 */
public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{"
                + "titulo = " + getTitulo() + ","
                + "descricao = " + getDescricao() + ","
                + "data = " + getData() + " "
                + "}";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }
}
