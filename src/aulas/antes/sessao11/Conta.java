package aulas.antes.sessao11;

public class Conta {
    
    //Getters e Setters

    int numeroConta;
    private float saldo, limite;
    Cliente cliente;
    
    Conta(int numeroConta, float saldo, float limite, Cliente cliente){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }
    
    public void efetuarSaque(float saque){
        if(this.saldo > saque){
            this.saldo = this.saldo - saque;
            System.out.println("Saque efetuado com sucesso!\nSaldo atual: " + this.saldo + "\n");
        }else{
            System.out.println("Saldo Insuficiente, saque NÂO efetuado.\n");
        }
    }

    public void efetuarDeposito (float deposito){
        if(this.limite > (this.saldo+deposito)){
            this.saldo = this.saldo+deposito;
            System.out.println("Deposito realizado com sucesso!\nSaldo atual: " + this.saldo + "\n");
        }else{
            System.out.println("Limite insuficiente para realizar este valor de depósito.\n");
        }
    }

    //método Getter
    public float getSaldo(){
        return this.saldo;
    }
}
