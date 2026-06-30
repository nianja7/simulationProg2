package transaction.manager;

import person.Employee;
import model.enums.Post;
import model.enums.Fonction;
import transaction.History;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractManager {
    protected final History history;

    // Restricts methods to a specific staff role (e.g., RECEPTIONIST)
    protected void checkPost(Employee employee, Post requiredPost) {
        if (employee == null || employee.getPost() != requiredPost) {
            throw new SecurityException("Access Denied: Only employees with the post "
                    + requiredPost + " can perform this operation.");
        }
    }

    // Restricts methods to a specific management tier (e.g., DIRECTEUR)
    protected void checkFonction(Employee employee, Fonction requiredFonction) {
        if (employee == null || employee.getFonction() != requiredFonction) {
            throw new SecurityException("Access Denied: Operational clearance required ("
                    + requiredFonction + ").");
        }
    }
}