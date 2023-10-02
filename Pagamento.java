//class pagamento
package atividadeSeis;

public class Pagamento {
	
	public Comprovante faturarPedido(Pedido pedido) {
		double total = this.calularTotal(pedido); //chamando a função abaixo
		int codigo = this.gerarCodigo();//chamando a função abaixo
		
		Comprovante compr = new Comprovante();
		
		compr.setCliente(pedido.getCliente());
		compr.setItens(pedido.getItens());
		
		
		compr.setCodigo(codigo);
		compr.setTotal(total);
		
		return compr;
	}
	
	private double calularTotal(Pedido pedido) {
		double total = 0;
		
		
		for(Item item: pedido.getItens()) {
			total += item.getPreço();
		}
		
		return total;
	}
	
	private int gerarCodigo() {
		int codigo = (int)(Math.random() * 999);
		return codigo;
	}
}
