package emsamablajecomputadoras.creacional;

public class ComputadorBuilderAsusROGE extends ComputadorBuilder{
	
	protected void asignarCaracteristicas() {
		computador.setRam(32);
		computador.setAlmacenamiento(1000);
		computador.setMarca("Asus");
		computador.setModelo("AsusROGE");
		computador.setCoolerExterno(false);
	}
	protected void asignarOS() {
		computador.setOs(new SistemaOperativo("Windows 10",64,"Pro"));
	}
	protected void asignarMB(){
		computador.setPlaca(new Mainboard("Stix","x99"));
	}
	
	public void definirComputadora(){
		computador = new Computador();
		asignarCaracteristicas();
		asignarOS();
		asignarMB();
	}

}
