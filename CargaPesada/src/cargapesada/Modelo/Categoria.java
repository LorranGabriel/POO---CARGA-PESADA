/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargapesada.Modelo;

/**
 *
 * @author 20171BSI0367
 */
public class Categoria {
   private String classe = "CATEGORIA";
   private int id_categoria;
   private String nome;
    
   
   public Categoria(int id_categoria,String nome)
   {
       
       this.id_categoria = id_categoria;
       this.nome = nome;
   }
   
    public String getclasse(){
        return classe;
    }
    
    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
   
    
}
