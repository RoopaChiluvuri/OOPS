public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }

    public void setBaseSalary(int baseSalary) throws IllegalAccessException {
        if (baseSalary <= 0)
            throw new IllegalAccessException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) throws IllegalAccessException {
        if(hourlyRate <= 0)
            throw new IllegalAccessException("Hourly rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }
}
