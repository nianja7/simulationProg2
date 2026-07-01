package transaction.manager;

import enums.Function;
import person.Employee;
import enums.Post;
import transaction.History;
import errors.UnauthorizedPostException;
import errors.ForbiddenAccessException;

import java.util.List;

public abstract class AbstractManager extends TransactionManager {

    public AbstractManager(History history) {
        super(history);
    }

    protected void checkPost(Employee employee, Post requiredPost) {
        if (employee == null || employee.getPost() != requiredPost) {
            throw new UnauthorizedPostException(
                    employee,
                    requiredPost,
                    "Access Denied: Post " + requiredPost + " required.",
                    "Verify employee corporate placement configurations."
            );
        }
    }

    protected void checkFonction(Employee employee, Function requiredFonction) {
        if (employee == null || employee.getFunction() != requiredFonction) {
            throw new ForbiddenAccessException(
                    employee,
                    requiredFonction,
                    "Access Denied: Operational clearance required (" + requiredFonction + ").",
                    "Elevate clearance level via directorship authority."
            );
        }
    }
    protected <T> List<T> searchInList(List<T> list, java.util.function.Function<T, String> mapper, String searchKey) {
        if (searchKey == null || searchKey.isBlank()) {
            return list;
        }

        var lowerCaseKey = searchKey.toLowerCase();

        return list.stream()
                .filter(item -> {
                    var stringValue = mapper.apply(item); // .apply() va maintenant compiler !
                    return stringValue != null && stringValue.toLowerCase().contains(lowerCaseKey);
                })
                .toList();
    }
}