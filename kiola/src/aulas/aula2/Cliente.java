package aulas.aula2;

public class Cliente {

	private String CPFtitular, RGtitular, nometitular, endtitular;

	public Cliente(String cPFtitular, String rGtitular, String nometitular, String endtitular) {
		CPFtitular = cPFtitular;
		RGtitular = rGtitular;
		this.nometitular = nometitular;
		this.endtitular = endtitular;
	}

	public String getCPFtitular() {
		return CPFtitular;
	}

	public void setCPFtitular(String cPFtitular) {
		CPFtitular = cPFtitular;
	}

	public String getRGtitular() {
		return RGtitular;
	}

	public void setRGtitular(String rGtitular) {
		RGtitular = rGtitular;
	}

	public String getNometitular() {
		return nometitular;
	}

	public void setNometitular(String nometitular) {
		this.nometitular = nometitular;
	}

	public String getEndtitular() {
		return endtitular;
	}

	public void setEndtitular(String endtitular) {
		this.endtitular = endtitular;
	}
	

}
