import java.util.Scanner;
import java.util.Arrays;

class Morpion
{
    public static void main(String[] args)
     {
        //Code Ici, Oublie pas les Majuscules sur les "S" a chaque ligne de code.
        //Scanner keyb = new Scanner(System.in);
        //Variable = keyb.nextInt();
    System.out.println("Vous etes dans un morpion, veuillez decider qui est le joueur O et X (O commencera)");
    String[][] morpion = {
      {"R","R","R"},
      {"R","R","R"},
      {"R","R","R"},
    };
    int i,j,k,l;
    int rows = 3;
    int columns = 3;
    int x;

      Scanner o = new Scanner(System.in);
      for (x = 1; x < 99; x++){
        if (x == 9){
          System.out.println("Personne n'a gagné, relancez le programme si vous voulez continuer.");
          System.exit(0);
        }else{
        System.out.println("Au tour du joueur O");
        System.out.println("Voici comment est disposé le morpion : ");
        System.out.println("  0   1   2 ");
        System.out.println("0  \n\n1  \n\n2");
        System.out.print("");
        System.out.print("Vertical :");
      int horizontal = o.nextInt();
      System.out.print("Horizontal :");
      int vertical = o.nextInt();
        morpion[horizontal][vertical] = "O";
        System.out.println("Vous avez choisi " +horizontal+ " et "+vertical+". Ils sont donc deja pris");
        System.out.println("Voici comment est disposé le morpion : ");
        System.out.println("  0   1   2 ");
        System.out.println("0  \n\n1  \n\n2");
        System.out.println("");

        for (i=0;i<rows;i++){
          for (j=0;j<columns;j++)
          System.out.print(morpion[i][j]+ " | ");
            System.out.println();

        }


        System.out.println("Au tour du joueur X");
        System.out.print("Vertical :");
        int Horizon = o.nextInt();
        System.out.print("Horizontal :");
        int Verti = o.nextInt();
        System.out.println("Vous avez choisi " +Horizon+ " et "+Verti+". Ils sont donc deja pris");
        System.out.println("Voici comment est disposé le morpion : ");
        System.out.println("  0   1   2 ");
        System.out.println("0 \n\n1  \n\n2");
        System.out.println("");
        morpion[Horizon][Verti] = "X";
        for (k=0;k<rows;k++){
          for (l=0;l<columns;l++)
          System.out.print(morpion[k][l]+ " | ");
          System.out.println();

          if (morpion[0][0] == "X" && morpion[0][1] == "X" && morpion[0][2] == "X")
          {
            System.out.println("Les X ont gagné");
            System.exit(0);
          }
          else if (morpion[0][0] == "O" && morpion[0][1] == "O" && morpion[0][2] == "O")
          {
            System.out.println("Les O ont gagné");
            System.exit(0);
          }
          else if (morpion[1][0] == "X" && morpion[1][1] == "X" && morpion[1][2] == "X")
          {
            System.out.println("Les X ont gagné");
            System.exit(0);
          }
          else if (morpion[1][0] == "O" && morpion[1][1] == "O" && morpion[1][2] == "O")
          {
            System.out.println("Les O ont gagné");
            System.exit(0);
          }
          else if (morpion[2][0] == "X" && morpion[2][1] == "X" && morpion[2][2] == "X")
          {
            System.out.println("Les X ont gagné");
            System.exit(0);
          }
          else if (morpion[2][0] == "O" && morpion[2][1] == "O" && morpion[2][2] == "O")
          {
            System.out.println("Les O ont gagné");
            System.exit(0);
          }
          else if (morpion[0][0] == "X" && morpion[1][0] == "X" && morpion[2][0] == "X")
          {
            System.out.println("Les X ont gagné");
            System.exit(0);
          }
          else if (morpion[0][0] == "O" && morpion[1][0] == "O" && morpion[2][0] == "O")
          {
            System.out.println("Les O ont gagné");
            System.exit(0);
          }
          else if (morpion[0][1] == "X" && morpion[1][1] == "X" && morpion[2][1] == "X")
          {
            System.out.println("Les X ont gagné");
            System.exit(0);
          }
          else if (morpion[0][1] == "O" && morpion[1][1] == "O" && morpion[2][1] == "O")
          {
            System.out.println("Les O ont gagné");
            System.exit(0);
          }
          else if (morpion[0][2] == "X" && morpion[1][2] == "X" && morpion[2][2] == "X")
          {
            System.out.println("Les X ont gagné");
            System.exit(0);
          }
          else if (morpion[0][2] == "O" && morpion[1][2] == "O" && morpion[2][2] == "O")
          {
            System.out.println("Les O ont gagné");
            System.exit(0);
          }
          else if (morpion[0][0] == "X" && morpion[1][1] == "X" && morpion[2][2] == "X")
          {
            System.out.println("Les X ont gagné");
            System.exit(0);
          }
          else if (morpion[0][0] == "O" && morpion[1][1] == "O" && morpion[2][2] == "O")
          {
            System.out.println("Les O ont gagné");
            System.exit(0);
          }
          else if (morpion[0][2] == "X" && morpion[1][1] == "X" && morpion[2][0] == "X")
          {
            System.out.println("Les X ont gagné");
            System.exit(0);
          }
          else if (morpion[0][2] == "O" && morpion[1][1] == "O" && morpion[2][0] == "O")
          {
            System.out.println("Les X ont gagné");
            System.exit(0);
          }
        }

        }
      }

      System.out.println();






    }
}
