import banco.*;

public class Main {

    public static void main (String [] args){
        Banco novoBanco = new Banco("Novo Banco");
        Cliente roberto = new Cliente("Roberto");

        Conta cc = new ContaCorrente(roberto, novoBanco);
        Conta poupanca = new ContaPoupanca(roberto, novoBanco);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        novoBanco.listContas();
//        novoBanco.addConta(poupanca);

//        System.out.println(novoBanco.getContas().toString());
    }
}
