package atividade_VII;

public class Carro {

    private String marca;
    private String modelo;
    private String ano;

    public Carro(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }
        

    public void Info() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
