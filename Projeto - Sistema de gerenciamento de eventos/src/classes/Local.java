package classes;

import interfaces.gerLocal;

public class Local implements gerLocal {
	private String cidade;
	private String Estado;
	private String rua;
	
	public Local(String c, String e, String r) {
		this.setCidade(c);
		this.setEstado(e);
		this.setRua(r);
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
		
	}
	
	public void verDetalhes(){
		System.out.println("Cidade: "+this.getCidade()+"Estado: "+this.getEstado());
		System.out.println("Rua: "+this.getRua());
	}

}
