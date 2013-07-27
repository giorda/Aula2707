/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2707;

/**
 *
 * @author EDUTEC
 */
public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic){
        this.selic = selic;
    
    }
    public void roda(Conta c){
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo Total: " + c.getSaldo());
        this.saldoTotal += c.getSaldo();  
    }
    public double getSaldoTotal(){
        return this.saldoTotal;
    
}
}
