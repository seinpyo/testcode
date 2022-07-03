import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

enum TimeSet {
	//now를 제외한 객체의 시간은 전부 00:00:00 입니다
	NOW, YESTERDAY, TODAY, TOMORROW
}

public class EnumTest {
	
	public static void main(String[] args) {
		System.out.println(returnEnumTime(TimeSet.NOW));	
		System.out.println(returnEnumTime(TimeSet.YESTERDAY));	
		System.out.println(returnEnumTime(TimeSet.TODAY));	
		System.out.println(returnEnumTime(TimeSet.TOMORROW));	
	}
	
	public static String returnEnumTime(TimeSet ts) {
		Date thisTime = new Date();
		String enumTime = "";
		Calendar cal = Calendar.getInstance();
		cal.setTime(thisTime);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		
		switch(ts) {
		case NOW : 
			cal.setTime(thisTime);
			break;
		case TODAY :
			break;
		case YESTERDAY : 
			cal.add(Calendar.DATE, -1); 
			break;
		case TOMORROW :
			cal.add(Calendar.DATE, +1);
			break;
		}
		enumTime = returnFormattedTime(cal.getTime());
		return enumTime;
	}
	
		
		
	public static String returnFormattedTime(Date date) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		return dateFormat.format(date);
	}
	
}
