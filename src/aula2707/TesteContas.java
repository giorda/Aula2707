/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2707;

/**
 *
 * @author EDUTEC
 */
public class TesteContas {
    public static void main(String[] args){
        
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
        
    }
    
}
