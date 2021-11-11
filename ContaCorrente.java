public class ContaCorrente{

    // numerso, saldo status
    private int numero;
    private double saldo;
    private boolean status;
    private double limite;

    public void saca(double valor){
        if(valor > saldo && limite < 2000){
            status=true;    // cheque especial
            limite+=saldo-valor;
            saldo-=valor;
        } else{
            status=false;   // conta normal
        }
    }

    public void deposita(double valor){     // depósito de money
        saldo+=valor;
    }

    // Source Action --> Generate Getters e Setters
    public int getNumero() {
        return numero;
    } public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    } public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    } public void setStatus(boolean status) {
        this.status = status;
    }

    public double getLimite() {
        return limite;
    } public void setLimite(double limite) {
        this.limite = limite;
    }
    

    
}