/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2707;

/**
 *
 * @author EDUTEC
 */
public class Conta {
    protected double saldo;
    public void deposita(double valor){
        this.saldo += valor;
    }
    public void saca(double valor){
        this.saldo -= valor;
    }
    public double getSaldo(){
        return this.saldo;
    }
     void atualiza(double taxa){
        this.saldo += this.saldo* taxa;
    }
    }

