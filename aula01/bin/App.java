public class App {
    public static void main(String[] args) throws Exception {

    Produto p1 = new Produto ("Cama eslastica", 120.00, 1);
    p1.descricao =  "Com rede de protecao e suporte de metal.";

    Produto p2 = new Produto ("Barco Pirata", 30.00, 3);
    p2.descricao = "Com tapa olho e uma Busca ao tesouro.";

    Produto p3 = new Produto("Canhao de Espuma", 150.00, 1);
    p3.descricao = "Lona de sabao com Canhao de espuma.";
    

    // Acessando o atributo estatico da classe Produto
    p1.exibirDetalhes();
    p1.imprimir();
    p2.exibirDetalhes();
    p2.imprimir();
    p3.exibirDetalhes();
    p3.imprimir();

    double valorRetorno = Produto.calcularDesconto(p3.getPreco());
    System.out.println("Valor com 10% de desconto Canhao de espuma: R$"+ valorRetorno);

    System.out.println(Produto.registrarVenda());

    System.out.println("-----------------------------------");

    Brincadeiras b1 = new Brincadeiras(5,"Pintura Facial",60,2 );
    b1.setNome("Pintura Facial");
    b1.setPreco(60.00);
    b1.setidadeRecomendada(5);
    b1.setEstoque(2);
    b1.exibirDetalhesBrincadeiras();
    b1.descricao = "nova descricao";



}
}
