package model;

import javax.swing.JOptionPane;

public class Empresa {

    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;

    public Empresa() {
        this("", "", "", "", "", "");
    }

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void leitura() {
        setNome(JOptionPane.showInputDialog("Digite o Nome do Usuário: "));
        setEndereco(JOptionPane.showInputDialog("Digite o Endereço do Usuário: "));
        setCidade(JOptionPane.showInputDialog("Digite a Cidade do Usuário: "));
        setEstado(JOptionPane.showInputDialog("Digite o Estado do Usuário: "));
        setCep(JOptionPane.showInputDialog("Digite o Cep do Usuário: "));
        setFone(JOptionPane.showInputDialog("Digite o Fone do Usuário: "));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "O Nome é " + getNome());
        JOptionPane.showMessageDialog(null, "O Endereço é " + getEndereco());
        JOptionPane.showMessageDialog(null, "O Cidade é " + getCidade());
        JOptionPane.showMessageDialog(null, "O Estado é " + getEstado());
        JOptionPane.showMessageDialog(null, "O Cep é " + getCep());
        JOptionPane.showMessageDialog(null, "O Fone é " + getFone());
    }
}
