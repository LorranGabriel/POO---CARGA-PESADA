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
public class Modelo 
{
    private int id_modelo;
    private String marca;
    private int ano;
    private String nome;
    private int quantEixos;
    private float peso;
    private float altura;
    private float largura;
    private float comprimento;
    private float volume;
    
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

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantEixos() {
        return quantEixos;
    }

    public void setQuantEixos(int quantEixos) {
        this.quantEixos = quantEixos;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    
    
    
}
