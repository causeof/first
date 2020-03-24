public class BeerSong {

  public static void main(String[] args) {
    int beer = 99;
    String word = "bottles";

    while (beer > 0 ){
        System.out.println(beer + " " + word + " " +  "beer on the wall");
        System.out.println(beer + " " + word + " " +  "beer.");
        System.out.println("Take one");
        System.out.println("Go around");
        beer = beer - 1;
      if (beer == 1) {
        word = "bottle";
      }
          if (beer > 0){
            System.out.println(beer + " " + word + " " + "beer on the wall");
            }
          else{
            System.out.println("No bottle beer on a wall");
            }
          }
      }
    }

