public class Grades {
    private int[] grades;
    private int size;

    public Grades (){
        this.grades = new int[10];
        this.size = 0;
    }

    public void add (int value){
        if (this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size ++;
}

    public int getLastAddGrade (){
        if (this.size ==0){
            System.out.println("You don't have any grade");
            return 0;
        }
        else {
            return this.grades[this.size - 1];
        }
}

    public double getAverageGrade (){
        if (size == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i< size; i++){
            sum = sum + grades [i];
        }
        return sum/size;
}

    public static void main (String[] args){
        Grades grades = new Grades();
        grades.add(3);
        grades.add(2);
        grades.add(6);
        grades.add(1);
        grades.add(4);

        System.out.println("Average grades is: " + grades.getAverageGrade());
        System.out.println("The last added grade was: " +grades.getLastAddGrade());


    }

}
