package snippet;

public class Exercisel6 {

	public static void main(String[] args) {

        int money_1 = 100;
        int money_2 = 200;
        int money_3 = 300;

        int moneyAccumulator = 0;

        int expenses = 45;
        
        moneyAccumulator += money_1;
        moneyAccumulator += money_2;
        moneyAccumulator += money_3;

        moneyAccumulator -= expenses;
      
        System.out.println(" " +  moneyAccumulator +"MDL:");
        System.out.print("+");
        System.out.println( money_1+"MDL");
        System.out.print("+");
        System.out.println( money_2+"MDL");
        System.out.print( "+");
        System.out.println(money_3+"MDL");
        System.out.println("-------");
        System.out.print("-");
        System.out.println(" "+expenses+"MDL");
        
    }

	

}
