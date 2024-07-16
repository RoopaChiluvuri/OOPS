public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        var employee = new Employee();

        employee.setBaseSalary(50);
        employee.setHourlyRate(10);

        int wage = employee.calculateWage(10);

        System.out.println(wage);
    }
}