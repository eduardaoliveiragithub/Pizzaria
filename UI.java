//Class UI
package atividadeSeis;
import java.util.*;
public class UI {
	
		   static Scanner ler = new Scanner(System.in);

		    public void apresentarPrograma() {
		        escrever("##### PROGRAMA DA PIZZARIA #####\n");
		    }

		    public void escrever(String msg, Object... values) {
		        System.out.printf(msg+"\n", values);
		    }
		    
		    public double pedirDouble(String msg, Object... values) {
		        System.out.printf(msg, values);
		        double valor = ler.nextDouble();
		        return valor;
		    }

		    public int pedirInt(String msg, Object... values) {
		        System.out.printf(msg, values);
		        int valor = ler.nextInt();
		        return valor;
		    }

		    public String pedirTexto(String msg, Object... values) {
		        System.out.printf(msg, values);
		        String valor = ler.nextLine();
		        return valor;
		    }

		    public void pularLinha() {
		        System.out.println();
		    }
		    
		 
		    public void exibirCompra(Comprovante compr) { 
		 	pularLinha();
	        pularLinha();
	        escrever("=========================");
	        escrever("    COMPRA REALIZADA!");
	        escrever("=========================");
	        
	        pularLinha();
	        pularLinha();
	        escrever("=========================");
	        escrever("         ITENS");
	        escrever("=========================");
	        
	        for (Item item: compr.getItens()) {
	            escrever("%s  R$ %.2f ", item.getDescricao(), item.getPreço());
	        }

	        pularLinha();
	        pularLinha();
	        escrever("=========================");
	        escrever("    TOTAL DA COMPRA");
	        escrever("=========================");
	        escrever("R$ %.2f", compr.getTotal());
	        
	        pularLinha();
	        pularLinha();
	        escrever("=========================");
	        escrever("        ENTREGA");
	        escrever("=========================");
	        escrever("  Código: %d", compr.getCodigo());
	        escrever(" Cliente: %s", compr.getCliente().getNome());
	        escrever("Telefone: %s", compr.getCliente().getTelefone());
	        escrever("Endereço: %s", compr.getCliente().getEndereço());
	        
	        pularLinha();
	        pularLinha();
	        escrever("=========================");
	        escrever("          FIM");
	        escrever("=========================");
	        pularLinha();
	        pularLinha();
	        pularLinha();
	    }

}
