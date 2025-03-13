public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 500, 2019);
        System.out.println("weight:" + notebook.weight + " " + "price:" + notebook.price + " " +"year:" + notebook.year);
        notebook.checkPrise();
        notebook.checkWeight();
        notebook.checkYear();
        System.out.println();

        Notebook heavyNotebook = new Notebook(700, 900, 2023);
        System.out.println("weight:" + heavyNotebook.weight +" "+ "price:" + heavyNotebook.price +" "+"year:" + heavyNotebook.year);
        heavyNotebook.checkPrise();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        System.out.println();


        Notebook oldNotebook = new Notebook(1200, 2000, 2019);
        System.out.println("weight:" + oldNotebook.weight +" "+ "price:" + oldNotebook.price + " " + "year:" + oldNotebook.year);
        oldNotebook.checkPrise();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        System.out.println();

        Notebook newNotebook = new Notebook(590, 2200, 2025);
        System.out.println("weight:" + newNotebook.weight +" "+ "price:" + newNotebook.price + " " + "year:" + newNotebook.year);
        newNotebook.checkPrise();
        newNotebook.checkWeight();
        newNotebook.checkYear();
        System.out.println();

        Notebook specialNotebook = new Notebook(700, 2500, 2024);
        System.out.println("weight:" + specialNotebook.weight +" "+"price:" + specialNotebook.price + " " +"year:"+ specialNotebook.year);
        specialNotebook.checkPrise();
        specialNotebook.checkWeight();
        specialNotebook.checkYear();

    }
}

