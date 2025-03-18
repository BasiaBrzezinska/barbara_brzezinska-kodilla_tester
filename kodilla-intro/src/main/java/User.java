public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User[] users = new User[5];

        users[0] = new User("Nela", 18);
        users[1] = new User("Leon", 15);
        users[2] = new User("Daria", 20);
        users[3] = new User("Marcin", 38);
        users[4] = new User("Karolina", 35);


        int result = 0;

        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
            // result = (result + users[i].age)/ users.length; Dlaczego ten sposób jest zły???
        }
        System.out.println("Total users age is " +result+ "years old");

        int averageAge = result / users.length;
        System.out.println("Average users age is :" + averageAge +" years" );

        // public static int averageAge(){
        //    int average = result/ users.length;
        //    return average;  Dlaczego nie mogłam utworzyć takiej metody?

        //  for (int i=0; i<users.length;); i++) {
        //if (users.age<averageAge){
        //    System.out.println(users.names);
        //} To też nie zadziałało...
        //dlaczego tutaj nie mogę odwołac się do user.age??

        for (int i = 0; i < users.length; i++) {
            if(users[i].age < averageAge){
                System.out.println("Users younger than avareage are: " + users[i].name);
            }
        }

    }
}



