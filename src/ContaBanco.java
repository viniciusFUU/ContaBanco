public class ContaBanco {
    private int numero_conta;
    protected String dono;
    private float saldo = 0;
    private boolean conta_on_off;
    public void status(){

        if (conta_on_off == false){
            System.out.println("Sua conta está fechada. Você não tem direito a nada desta instituição.");
        } else {
            if (saldo < 0){
                conta_on_off = false;
                System.out.println("\n" + dono + ", sua conta está negativa, por isso, nós encerramos ela.");
            } else {
                System.out.println("Conta aberta!");
                System.out.println("Número da conta: " + this.getNumero_conta());
                System.out.println("Nome do dono da conta: " + this.getDono());
                System.out.println("Saldo atual: " + this.saldo);

                if (conta_on_off == true){
                    System.out.println("Status da conta: " + " Aberta.");
                }
            }
        }
    };

    public ContaBanco(int nc, String d,  double dps, double s){
        setNumero_conta(nc);
        setDono(d);
        setDepositar(dps);
        setSacar(s);
    }

    private String getDono() {
        return dono;
    }

    public void setDono(String d){
        dono = d;
    }

    private int getNumero_conta(){
        return numero_conta;
    }

    public void setNumero_conta(int nc){
        numero_conta = nc;
    }

    private double getDepositar(){
        return saldo;
    }

    public void setDepositar(double dps){
        saldo+=dps;
    }

    private double getSacar(){
        return saldo;
    }

    public void setSacar(double s){
        saldo-=s;
    }

    public void abrir_conta(){
        conta_on_off = true;
    }

    public void fechar_conta(){
        conta_on_off = false;
    }

    private void mensalidade(){
        System.out.println("A mensalidade neste banco é 10% do seu saldo no último dia útil do mês.");
        System.out.println("Neste mês, a mensalidade custou " + (saldo*0.1) + ",00 R$.");
    }

}
