package heranca_java;


public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alice", 123456789);
        Vendedor vendedor = new Vendedor("Amanda", 123456781);
        Faxineiro faxineiro = new Faxineiro("Ana", 123456782);

        gerente.baterOPonto();
        gerente.fecharOCaixa();

        vendedor.baterOPonto();
        vendedor.realizarVenda();

        faxineiro.baterOPonto();
        faxineiro.solicitarMaterial();
    }
}
