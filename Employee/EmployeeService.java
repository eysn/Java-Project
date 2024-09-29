package Employee;

public class EmployeeService {
    public Employee createEmployee(String name, String email, String phone, String gender, String dob, String dateJoined, String rating, String status) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setGender(gender);
        employee.setDob(dob);
        employee.setDateJoined(dateJoined);
        employee.setRating(rating);
        employee.setStatus(status);
        return employee;
    }
}
