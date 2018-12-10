package emsamablajecomputadoras.creacional;

public class ComputadorDirector {
	
	ComputadorBuilder builder;

	public ComputadorDirector(ComputadorBuilder builder){
		this.builder = builder;
	}
	public void construirComputadora(){
		builder.definirComputadora();
	}
	public Computador getComputador(){
		return builder.getComputador();
	}
}
