package emsamablajecomputadoras.creacional;

public class ComputadorBuilderAsusZenbook extends ComputadorBuilder{
	
	protected void asignarCaracteristicas() {
		computador.setRam(16);
		computador.setAlmacenamiento(500);
		computador.setMarca("Asus");
		computador.setModelo("AsusZenbook");
		computador.setCoolerExterno(false);
	}
	protected void asignarOS() {
		computador.setOs(new SistemaOperativo("Windows 10",64,"Home"));
	}
	protected void asignarMB(){
		computador.setPlaca(new Mainboard("Prime","Z370"));
	}
	
	public void definirComputadora(){
		computador = new Computador();
		asignarCaracteristicas();
		asignarOS();
		asignarMB();
	}

}