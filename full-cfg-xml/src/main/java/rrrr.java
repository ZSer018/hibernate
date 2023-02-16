import java.util.List;
import java.util.stream.Stream;

public class rrrr {



    public static Stream<User> generateUsers(int numberOfUsers) {
        return Stream
                .iterate(1, t -> t < numberOfUsers, t -> t+1)
                .map(integer -> new User(integer, "user"+integer+"@gmail.com"));
    }

    public static void main(String[] args) {

    }

}

class User {
    private final long id;
    private final String email;

    User(long id, String email) {
        this.id = id;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}