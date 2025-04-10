package com.kodilla.stream;


import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class UserManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames ();
        System.out.println(chemistGroupUsernames);

        List<String> olderGroupUsernames = filterAgeGroupUsernames(45);
        System.out.println(olderGroupUsernames);

        List<String> activGroupUsernames = filterActiveGroupUsernames(100);
        System.out.println(activGroupUsernames);

        List<Integer> ageNoActivUser = filterNoActivGroupUserAge(10);
        System.out.println(ageNoActivUser);
    }

   public static List<String> filterChemistGroupUsernames(){
        List<String> username = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UserManager::getUserName)
                .collect (Collectors.toList());

        return username;
   }

   public static List <String> filterAgeGroupUsernames (int age){
        List<String> userOlder = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(User::getUsername)
                .collect(Collectors.toList());

        return userOlder;
   }

   public static List <String> filterActiveGroupUsernames (int numberOfPost){
        List<String> userActiv = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getNumberOfPost()>numberOfPost)
                .map(User::getUsername)
                .collect(Collectors.toList());

        return userActiv;
    }

    public static List <Integer> filterNoActivGroupUserAge (int numberOfPost){
        List<Integer> ageUserNoActiv = UserRepository.getUserList()
                .stream()
                .filter(user -> user.getNumberOfPost()<numberOfPost)
                .map(User::getAge)
                .collect(Collectors.toList());

        return ageUserNoActiv;
    }

    public static String getUserName (User user){
        return user.getUsername();
    }

    public static int getUserAge (User user){
        return user.getAge();
    }
}
