 package newcomputer;

public class computer {
	
	private  String name;
	
	private int ram;
	
	public int hdd;
	
	private double weight;
	
	
	public computer() {
		
	}
	
	private String factoryNambor;

	public String getFactoryNambor() {
		
//		if(factoryNambor== null ||  factoryNambor.trim().equals("  ")){
//			return "(������) �������� �����";
//		}
		return factoryNambor;	
	}
	
	public void setFactoryNambor(String factoryNambor ){
		this.factoryNambor = factoryNambor;
		if(factoryNambor!= null && !factoryNambor.equals("  ")) {	
	   System.out.println("��� ������");
		}
		else {
			System.out.println("�� ����� ���� ������");
		}
	}
	
	
	
	
	
	
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		name = newName;
	}
		
	public int getRam() {	
		return ram;
	}
	
	public void setRam(int newRam) {
		ram = newRam;
		if(newRam>0) {
			System.out.println("�������"+newRam);
		}else {
			System.out.println("��������� ��������"+newRam+"�� ����� ���� �������������");	
		}
		
		
	}
	 
	public void on() {
		print("� ���������:"+ name);
	}
	
	public void off() {
		print("� ����������");
	}
	
	public void load() {
	print("� ����������.��� ��� �������� �����:" +hdd+ "��");
	}
	private void print(String her) {
		System.out.println(her);
	}
}

 