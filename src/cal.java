import java.util.Calendar;
public class cal {
	public static void main(String[] args) {
		//Calendar c1=new Calendar();
		Calendar c1 = Calendar.getInstance();
		
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(c1.MONTH));
		c1.set(Calendar.DAY_OF_YEAR,c1.getActualMaximum(Calendar.DAY_OF_YEAR)+72);
		System.out.println(Calendar.DAY_OF_YEAR);
		//System.out.println(c1.get(Calender.Hour));
		//system.out.println
		System.out.println(c1.getClass());
//apple
		
		
	}

}
