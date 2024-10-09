package model;

import javax.swing.JOptionPane;

public class Restaurante extends Empresa {

    private String comida;
    private double preco_medio;

    public Restaurante() {
        this("", "", "", "", "", "", "", 0);
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone, String comida, double preco_medio) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.comida = comida;
        this.preco_medio = preco_medio;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public double getPreco_medio() {
        return preco_medio;
    }

    public void setPreco_medio(double preco_medio) {
        this.preco_medio = preco_medio;
    }

    public void leitura() {
        super.leitura();
        setComida(JOptionPane.showInputDialog("Digite o Nome da comida: "));
        setPreco_medio(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço da comida: ")));
    }

    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "O nome da comida é: " + getComida());
        JOptionPane.showMessageDialog(null, "O preço da comida é: " + getPreco_medio());
    }
}
