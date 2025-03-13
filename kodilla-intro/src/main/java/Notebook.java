public class Notebook {
    int weight;
    int price;
    int year;

   public Notebook(int weight, int price, int year){
       this.weight = weight;
       this.price = price;
       this.year = year;

   }

   public void checkPrise () {
       if (this.price < 600) {
           System.out.println("This notebook is very cheap");
       }
       else if (this.price > 600 && this.price < 1000) {
               System.out.println("This price is good");
        }

       else {
           System.out.println("This notebook is quite expensive");
       }
   }

   public void checkWeight () {
       if (this.weight <=600){
           System.out.println("This notebook is very lightweight");
       } else if (this.weight > 600 && this.weight < 900) {
           System.out.println("This notebook is not so heavy");
       }
       else {
           System.out.println("This notebook is heavy");
       }
   }

   public void checkYear (){
       if (this.year <=2019 && this.price >500) {
           System.out.println("This notebook is too expensive for a production's year");
       } else if (this.year <=2019 && this.price <=500) {
           System.out.println("This notebook has a good price");
       } else if (this.year >2019 && this.price <1000) {
           System.out.println("This notebook is very cheap for a production's year");
       } else if (this.year >2000 && this.price >1000 && this.price<=2000) {
           System.out.println("This notebook costs ok for it's production's year");
       }
       else {
           System.out.println("This notebook is too expensive for it's production's year");
       }
   }

}
