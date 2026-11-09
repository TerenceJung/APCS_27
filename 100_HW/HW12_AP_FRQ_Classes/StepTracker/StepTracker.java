public class StepTracker{

    int minSteps;
    int totSteps;
    int activeDays;
    int totDays;

//contructor
    public StepTracker(int a){
        minSteps = a;
        totSteps = 0;
        totDays = 0;
        activeDays = 0;
    }

//methods
    public void addDailySteps(int 1DaySteps){
        totSteps = totSteps + 1DaySteps;
        totDays = totDays + 1;
        if(1DaySteps >= minSteps){
            activeDays = activeDays + 1;
        }
    }

    public int activeDays(){
        return activeDays;
    }

    public double averageSteps(){
        return totSteps / totDays;
    }
}