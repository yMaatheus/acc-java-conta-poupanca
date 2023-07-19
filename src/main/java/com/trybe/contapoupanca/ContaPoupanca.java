package com.trybe.contapoupanca;

/**
 * Class ContaPoupança.
 */
public class ContaPoupanca {

  private double saldo;
  private final String titularConta;

  ContaPoupanca(String titularConta, double saldoInicial) {
    this.titularConta = titularConta;
    this.saldo = saldoInicial;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }

  public double mostrarSaldo() {
    return this.saldo;
  }

  public String mostrarTitularConta() {
    return this.titularConta;
  }

}
