package loja;

public class Principal {
	
	public static void main(String[] args) {
		Vendedores vend1 = new Vendedores();
		vend1.nome = "José";
		vend1.idade = "23";
		vend1.email = "jose123@gmail.com";
		
		Clientes cli1 = new Clientes();
		cli1.nome = "vanessa";
		cli1.cpf = "63754872987";
		
		Fornecedores for1 = new Fornecedores();
		for1.endereço = "Grove Street";
		for1.produto = "Café";
		
		Produtos pro1 = new Produtos();
		pro1.lote = "70655";
		pro1.peso = "56kl";
		
		Vendas ven1 = new Vendas();
		ven1.data = "29/09/2029";
		ven1.quantidade = "60";
		
		Estoque est1 = new Estoque();
		est1.peso = "40kl";
		est1.quantidade = "3";
		
		Transportadora tran1 = new Transportadora();
		tran1.contato = "40028922";
		tran1.empresa = "Marvel";
		
		
	}
}
