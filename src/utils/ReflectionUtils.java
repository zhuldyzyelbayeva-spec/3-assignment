package utils;

import model.User;
import java.util.List;

public class SortingUtils {

    public static void sortUsersByRating(List<User> users) {
        users.sort((u1, u2) ->
                Double.compare(u2.getRating(), u1.getRating())
        );
    }
}
