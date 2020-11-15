package train;

public class ProblemRun {
	public String alarmClock(int day, boolean vacation) {
		if(vacation) //vacation
		{
		if(day == 0 || day == 6) //weekend
		return "off";
		else
		return "10:00"; //weekday
		}
		else //not on va ation
		{
		if(day == 0 || day == 6) //weekend
		return "10:00";
		else //weekday
		return "7:00";
		}

	}}


