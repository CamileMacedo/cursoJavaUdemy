package aulas.antes.sessao11;

public class Conta {
    
    //Getters e Setters

    private int idConta;
    public static int contador2=0;
    private float saldo, limite;
    Cliente cliente;
    
    public Conta(float saldo, float limite, Cliente cliente){
        this.idConta = contador2;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
        Conta.contador2 = contador2++;
    }
    
    public void efetuarSaque(float saque){
        System.out.println("\n=========== Saque ===========\n\tem andamento...\n");
        if(this.saldo > saque){
            this.saldo = this.saldo - saque;
            System.out.println("Saque efetuado com sucesso!\nSaldo atual: " + this.saldo + "\n");
        }else{
            System.out.println("Saldo Insuficiente, saque NÂO efetuado.\n");
        }
    }

    public void efetuarDeposito (float deposito){
        System.out.println("\n=========== Depósito ===========\n\tem andamento...\n");
        if(this.limite > (this.saldo+deposito)){
            this.saldo = this.saldo+deposito;
            System.out.println("Deposito realizado com sucesso!\nSaldo atual: " + this.saldo + "\n");
        }else{
            System.out.println("Limite insuficiente para realizar este valor de depósito.\n");
        }
    }

    public float getIdConta(){
        return this.idConta;
    }

    //método Getter
    public float getSaldo(){
        return this.saldo;
    }
}
