package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class ForumStats {
    public static void main(String[] args) {
        List<User> users = UserRepository.getUserList();

        double averagePostOlder = averagePostOlderUsers(users);
        double averagePostYounger = averagePostYoungerUsers(users);

        System.out.println("Śrenia ilośc postów u uzytkowników 40 plus to: " + averagePostOlder);
        System.out.println(("Średnia ilość postów u użytkowników poniżej 40 lat to: " + averagePostYounger));

    }

    public static double averagePostOlderUsers(List<User> users) {
        double avgOlder = users
                .stream()
                .filter(n -> n.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);

        return avgOlder;

    }

    public static double averagePostYoungerUsers(List<User> users) {
        double avgYounger = users
                .stream()
                .filter(n -> n.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);

        return avgYounger;
    }
}
