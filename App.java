//main


package atividadeSeis;

public class App {
	public static void main(String[]args) {
		 	UI tela = new UI();

	        tela.apresentarPrograma();
	        
	        Cliente cliente = new Cliente();
	        
	        cliente.setNome(tela.pedirTexto("Cliente:  "));
	        cliente.setTelefone(tela.pedirTexto("Telefone: "));
	        cliente.setEndereço(tela.pedirTexto("Endereço: "));

	        
	        int qtd = tela.pedirInt("\nQuantos itens irá comprar: ");
	        tela.pularLinha();

	        
	        Item[] itens = new Item[qtd];
	        
	        for (int i = 0; i < itens.length; i++) {
	        	
	            tela.pedirTexto("");
	            Item novoItem = new Item();
	            
	            novoItem.setDescricao(tela.pedirTexto("Item %s: ", i + 1));
	            novoItem.setPreço(tela.pedirDouble(" Preço: "));
	            
	            itens[i] = novoItem;
	            tela.pularLinha();
	        }
	        
	        Pedido pedido = new Pedido();
	        
	        pedido.setCliente(cliente);
	        pedido.setItens(itens);
	        
	        Pagamento pag = new Pagamento();
	        Comprovante compr = pag.faturarPedido(pedido);
	       
	        tela.exibirCompra(compr);
	}
}
