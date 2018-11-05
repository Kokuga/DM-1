import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

class DM1test{

    public static void main(String args []) throws InterruptedException
    {


        //Code Ici, Oublie pas les Majuscules sur les "S" a chaque ligne de code.
        //Scanner keyb = new Scanner(System.in);
        //Variable = keyb.nextInt();
        System.out.println("Veuillez choisir le niveau de difficulté : ");
        System.out.println("Facile (3 chiffres + temps illimité)");
        System.out.println("Normal (4 chiffres + 200 secondes)");
        System.out.println("Difficile (5 chiffres + 100 secondes)");
        Scanner keyb = new Scanner(System.in);
        String difficulte = keyb.nextLine();
          System.out.println("Un nombre entre 1 et 100");
        int [] array = new int [0];
        int tempsmax=0;
        Random random = new Random();


        //Switch pour la difficulté.
          switch (difficulte) {

            case "Facile": array = random.ints(3 , 1 ,100).toArray();tempsmax =0; System.out.println("Vous avez choisi la difficulté la plus simple, \n il n'y a donc aucun challenge"); break;
            case "Normal": array = random.ints(4 , 1 ,100).toArray();tempsmax =200; System.out.println("Vous avez choisi la difficulté basique, \n un compte à rebours de 100 secondes est lancé"); break;
            case "Difficile": array = random.ints(5 , 1 ,100).toArray();tempsmax =100; System.out.println("Vous avez choisi la difficulté la plus difficile, \n si vous reussissez cela, vous serez le meilleur"); break;
          }


            long date = System.nanoTime();
            int found = 0;  //found = index pour connaitre le nombre de chiffres trouvés


            while (array.length > 0) {
              int value = array[0];
              int reponse = keyb.nextInt();
              double time = ((System.nanoTime() - date) / 1e6) / 1000; //En Secondes


              /*Si tempsmax est plus grand que 0 et que time est supérieur ou égal à tempsmax
              Pour que le timer finisse, il faut entrer n'importe quel chiffre */
              if (tempsmax > 0 && time >= tempsmax) {
                System.out.println("Vous avez été trop long");
                System.exit(1);
              }

              if (value > reponse){
                System.out.println("Trop bas :)");
              }else{
                System.out.println("Trop haut :)");
              }

              if (value == reponse) {
                  System.out.println((++found) + " chiffre trouvé(s)");
                  array = Arrays.copyOfRange(array, 1, array.length);

                }
              }
            System.out.println("Félicitation, vous avez trouvé la combinaison \n dans le temps imparti !");


            }

        }
