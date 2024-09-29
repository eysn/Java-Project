
package verify.Cards;


import java.time.LocalDate;

public class NewEmployee {
    private String name;
    private LocalDate dateOfJoin;

    public NewEmployee(String name, LocalDate dateOfJoin) {
        this.name = name;
        this.dateOfJoin = dateOfJoin;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfJoin() {
        return dateOfJoin;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', dateOfJoin=" + dateOfJoin + '}';
    }
}
