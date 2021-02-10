public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,44));

    }
    public static boolean isCatPlaying (boolean summer, int temperature) {

        if  (summer) {
            if (temperature > 25 || temperature > 45) {
                System.out.println("CatIsPlayingInSummer");
                return true;
            } else return false;

        }
        if (temperature < 35 && temperature > 25) {
            System.out.println("CatIsPlaying");
            return true;
        }
        else
            System.out.println(" CAT IS NOT PLAYING ");
            return false;
        }




    }

