package capgemini.lab8;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Exercise6 {
	public static void calcuateDate(LocalDate date){
		LocalDate currentDate=LocalDate.now();
		LocalDate desiredDate = date;
		Period period=Period.between(currentDate, desiredDate);
		System.out.println(period.getYears()+" Years,"+period.getMonths()+" Months,"+period.getDays()+" Days");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(LocalDate.now());
		System.out.println("Enter the date:");
		LocalDate date=LocalDate.parse(scan.next());
		calcuateDate(date);
		scan.close();
	}

}
