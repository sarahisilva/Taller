package emsamablajecomputadoras.creacional;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputadorDirector comd1 = new ComputadorDirector(new ComputadorBuilderAsusROGE());
		comd1.construirComputadora();
		Computador com1 = comd1.getComputador();
		System.out.println("Computador 1:");
		System.out.println(com1.especificacionesTecnicas());
		
		
		ComputadorDirector comd2 = new ComputadorDirector(new ComputadorBuilderAsusZenbook());
		comd2.construirComputadora();
		Computador com2 = comd2.getComputador();
		System.out.println("Computador 2:");
		System.out.println(com2.especificacionesTecnicas());
	}

}
