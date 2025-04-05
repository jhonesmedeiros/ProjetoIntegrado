public class Brincadeiras extends Produto {
    private int idadeRecomendada;

    public int getidadeRecomendada(){
        return idadeRecomendada;
    } 
    public void setidadeRecomendada(int idadeRecomendada){
        this.idadeRecomendada = idadeRecomendada;
    }
    
    public Brincadeiras(int idadeRecomendada, String nome, double preco, int estoque){
        super(nome,preco,estoque);
        this.idadeRecomendada = idadeRecomendada;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Idade Recomendada:");
    }

    public void exibirDetalhesBrincadeiras(){
        System.out.println("Produto: "+ getNome());
        System.out.println("Preco: R$"+ getPreco());
        System.out.println("Estoque:"+ getEstoque());
        System.out.println("Idade Recomendada:"+ idadeRecomendada); 
        System.out.println("Descricao:"+ descricao);

    }
}