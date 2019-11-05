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
//			return "(ошибка) неуказан номер";
//		}
		return factoryNambor;	
	}
	
	public void setFactoryNambor(String factoryNambor ){
		this.factoryNambor = factoryNambor;
		if(factoryNambor!= null && !factoryNambor.equals("  ")) {	
	   System.out.println("нет нехера");
		}
		else {
			System.out.println("не может быть пустым");
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
			System.out.println("заебиль"+newRam);
		}else {
			System.out.println("переданое значение"+newRam+"не может быть отрицательным");	
		}
		
		
	}
	 
	public void on() {
		print("я включаюсь:"+ name);
	}
	
	public void off() {
		print("я выключаюсь");
	}
	
	public void load() {
	print("я загружаюсь.мой обём жосткого диска:" +hdd+ "гб");
	}
	private void print(String her) {
		System.out.println(her);
	}
}

 