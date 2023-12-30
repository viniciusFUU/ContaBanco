public class Main {
    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco(01, "Vinícius", 450.00, 150.00);
        cb1.abrir_conta();
        cb1.status();

        ContaBanco cb2 = new ContaBanco(02, "Bianca", 100.00, 200.00);
        cb2.abrir_conta();
        cb2.status();
    }
}