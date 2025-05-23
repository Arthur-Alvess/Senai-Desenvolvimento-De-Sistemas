package Getters_E_Setters_teste.Programa2.entities;

public class ContaBancaria {
    private String nome;
    private double saldo;
    private double saque;
    private double deposito;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double deposito(double saldo, double deposito){
        return saldo + deposito;
    }

    public double saque(double saldo, double saque){
        return saldo - saque;
    }
}
