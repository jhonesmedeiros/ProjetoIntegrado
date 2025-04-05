public class Produto {
    //Atributos - Caracteristicas - Instancias
    //Controle de acesso - public, private, protected
    private String nome;
    private double preco;
    protected int estoque;

    //publico - acessivel em qualquer lugar
    public String descricao;

    //privado - acesso somente dentro da classe
    private int codigo; 

    //Atributos de classe
    static double desconto = 0.10; //10% de desconto
    static int totalVendas = 0; //total de vendas realizadas

    // Metodo Construtor - Inicializa os atributos da classe
    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        descricao = "Sem descricao Especifica";
    }

    //Metodo acessor => getters
    int getCodigo(){
        return codigo;
    }
    String getNome(){
        return nome;
    }
    double getPreco(){
        return preco;
    }
    int getEstoque(){
        return estoque;
    }

    //Metodo modificador => setters
    void setNome(String nome){
        this.nome = nome;
    }
    void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        }
        else{
            System.out.println("Preco Invalido!");
            configurarProduto();
        }
    }
    void setEstoque(int estoque){
        if(estoque >= 0){
            this.estoque = estoque;
        }
        else{
            System.out.println("Estoque Vasio!");
            configurarProduto();
        }
    }

    //Metodos - Comportamento
    public void exibirDetalhes(){
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Produto: "+ nome);
        System.out.println("Preco: R$"+ preco);
        System.out.println("Estoque:"+ estoque);
        System.out.println("Descricao:"+ descricao);    

    }

    public void imprimir(){
        System.out.println("-----------------------------------");
    }

    //Metodo estatico da classe Produto
    public static double calcularDesconto (double precoBase){
        double valorDescontar = precoBase - (precoBase * desconto);
        return valorDescontar;
    }
    public static int registrarVenda(){
        totalVendas++;
        return totalVendas;
    }
        
    private void configurarProduto(){
        estoque = 0;
    }

    }
