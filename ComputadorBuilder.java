package emsamablajecomputadoras.creacional;

public abstract class ComputadorBuilder {

	/**
	 * @param args
	 */
	public Computador computador;
	
	protected abstract void asignarCaracteristicas();
	protected abstract void asignarOS();
	protected abstract void asignarMB();
	protected abstract void definirComputadora();
	
	public Computador getComputador(){
		return computador;
	}
}
