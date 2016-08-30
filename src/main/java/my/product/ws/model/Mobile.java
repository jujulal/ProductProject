package my.product.ws.model;

import javax.persistence.Entity;

@Entity
public class Mobile extends Product {
	
	private String NetworkType; 
	private String CPU; 
	private String ram;
	private String memory; 
	private String camera;
	public String getNetworkType() {
		return NetworkType;
	}
	public void setNetworkType(String networkType) {
		NetworkType = networkType;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	} 
	
}
