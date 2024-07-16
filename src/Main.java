public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        var employee = new Employee();

        employee.setBaseSalary(50);
        System.out.println(employee.getBaseSalary());

        employee.setHourlyRate(10);
        System.out.println(employee.getHourlyRate());

        int wage = employee.calculateWage(10);

        System.out.println(wage);
    }
}