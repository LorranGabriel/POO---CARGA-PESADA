/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargapesada.Modelo;

/**
 *
 * @author 20181bsi0172
 */
public class Modelo {
    int id_modelo;
    String marca;
    int ano;
    String nome;
    int quantEixos;
    float peso;
    float altura;
    float largura;
    float comprimento;
    float volume;

    public Modelo(String marca, int ano, String nome, int quantEixos, float peso, float altura, float largura, float comprimento, float volume) {
        this.marca = marca;
        this.ano = ano;
        this.nome = nome;
        this.quantEixos = quantEixos;
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.volume = volume;
    }

    
    
}
