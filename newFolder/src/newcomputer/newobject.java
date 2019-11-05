package newcomputer;

 import newcomputer.computer;
 import java.util.Date;
 import java.util.Calendar;
public class newobject {

	public static void main(String[] args) {
		
		computer comp1 = new computer();
		computer comp2 = new computer();
		
//		comp.setName("IBM");
//		comp.setRam(-25);
//		comp.hdd = 350;2
//		comp.on();
//		comp.load();
//		comp.off();
		comp1.setFactoryNambor(null);
		
		comp1.getFactoryNambor().charAt(2);
		System.out.println("this.factoryNumber = " + comp1.getFactoryNambor());
		
//		System.out.println(comp2.getFactoryNambor());
		
//	Date date = new Date();
//		System.out.println(date);
	
//	Calendar calendar = Calendar.getInstance();
	
	}	

}
