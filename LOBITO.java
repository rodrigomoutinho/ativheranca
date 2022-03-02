/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobito;

/**
 *
 * @author Rodrigo
 */
public abstract class LOBITO {

   
    public static void main(String[] args) {
   
     
    }
    private String nome;
    private Integer idade;
    private boolean doente;
    String fazLatir;
    String fazMiar;
    String dorme;
    String procuraComidaGato;
    String procuraComidaCachorro;
    
    
    public String getNome() {
        String nome = null;
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
 public Integer getIdade() {
        Integer idade = null;
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
 
    public void Doente (boolean doente) {
        System.out.println("O estado é: ");
    if (doente) {
        System.out.println("O animal está doente:");
    } else {
        System.out.println("Não está doente");
    }
}

    public String dorme(){
      return "Dormindo";
    }

 public String fazLatir(){
     return "AU AU AU AU AU";
 }
 
  public String fazMiar(){
    return "MIAU MIAU MIAU CARALHO";
 }
 
  public String procuraComidaGato(){
    return "HMM QUE RATATOUILLE APETITOSO";
 }
  
  public String procuraComidaCachorro(){
     return "HMM LIXO? VOU COMER";
 }
  
}


