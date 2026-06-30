package person;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TeamLeader extends Employee {

    public void assign(Employee employee) {
        System.out.println("Employee " + employee.getFirstName() + " assigned to the team.");
    }

    public void showInformation() {
        System.out.println("Team Leader: " + getFirstName() + " " + getLastName());
    }

    public void modifySalary(Employee employee, double newSalary) {
        employee.setSalary(newSalary);
    }
}