/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2707;

/**
 *
 * @author EDUTEC
 */
public class ContaPoupanca extends Conta {
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 3;
    
}
}
