import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TugasKelompokKeTiga {
    private static BufferedReader br = null;

    static boolean cekJumlahKata(String param){
        if (param.length() < 3){
            return false;
        }else if (param.length() > 6){
            return false;
        }else {
            return true;
        }
    }

    static boolean isAnswerDuplicate(String kataSatu, String kataDua){
        if (kataSatu == kataDua){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean cek = true;
        String cobaLagi = "";
        Integer pointsLevelSatu = 0;
        Integer pointsLevelDua = 0;
        Integer pointsLevelTiga = 0;
        String answer = "";
        String tempAnswer = "";
        String soalLevelSatu = "     K     E     Y     B     O     A     R     D";
        String soalLevelDua = "     K     E     Y     B     O     A     R     D";
        String soalLevelTiga = "     K     E     Y     B     O     A     R     D";
        String[] jawabanLevelSatu = {"Linda", "Santi", "Susan", "Mila", "Ayu", "Cinta", "Kamu", "Aja"};
        String[] jawabanLevelDua = {"Dina", "Dinda", "Rachel", "Intan", "Dewi", "Putri", "Laptop", "Lebaran"};
        String[] jawabanLevelTiga = {"Milan", "Chelsi", "Roma", "Love", "Roti", "Susu", "Padi", "Dewa" };
        Integer rightAnswerLevelSatu = 0;
        Integer rightAnswerLevelDua = 0;
        Integer rightAnswerLevelTiga = 0;
        Integer totalPointsAcummulated = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Rules:\n");
        System.out.print("1. Create a word using given characters. min 3 characters and max 6 characters.\n");
        System.out.print("2. Each level, You have 10 chances to answer correctly.\n");
        System.out.print("3. To get through to next level, Ypu have to score 70 points each level.\n");

        while (cek) {
            br = new BufferedReader(new InputStreamReader(System.in));
            try {

                System.out.print("Level 1\n");
                System.out.print("-------\n");
                System.out.print(soalLevelSatu + "\n");
                for (int i = 1; i <= 10; i ++){
                    System.out.print(i + "> Your Answer: ");
                    answer = keyboard.next();
                    if (cekJumlahKata(answer)){
                        if (! answer.equals(tempAnswer)){
                            if (Arrays.stream(jawabanLevelSatu).anyMatch(answer::equals)){
                                pointsLevelSatu += 10;
                                rightAnswerLevelSatu += 1;
                                System.out.println("#RIGHT. Score: " + pointsLevelSatu);
                            }else{
                                System.out.println("#WRONG");
                            }
                        }else{
                            System.out.println("You Already Type This Word Before");
                        }
                    }else{
                        System.out.println("Your Answer Rejected. Min 3 char & Max 6 char.");
                    }
                    tempAnswer = answer;
                }
                System.out.println("You Had Answered 10 Times With " + rightAnswerLevelSatu + " Right Answer ...");
                System.out.println("Correct Answers :");
                System.out.println(Arrays.toString(jawabanLevelSatu));
                if (pointsLevelSatu < 70){
                    System.out.println("You Lose!! Try Again ...");
                    System.out.println("Do You Want To Retry [y/t]:");
                    cobaLagi = br.readLine();
                    if (cobaLagi.equalsIgnoreCase("t"))
                        System.exit(0);
                    else if (cobaLagi.equalsIgnoreCase("y"))
                        cek = true;
                    else
                        System.exit(0);
                }

                System.out.print("\n");
                System.out.print("\n");
                System.out.print("Level 2\n");
                System.out.print("-------\n");
                System.out.print(soalLevelDua + "\n");
                for (int i = 1; i <= 10; i ++){
                    System.out.print(i + "> Your Answer: ");
                    answer = keyboard.next();
                    if (cekJumlahKata(answer)){
                        if (! answer.equals(tempAnswer)){
                            if (Arrays.stream(jawabanLevelDua).anyMatch(answer::equals)){
                                pointsLevelDua += 10;
                                rightAnswerLevelDua += 1;
                                System.out.println("#RIGHT. Score: " + pointsLevelDua);
                            }else{
                                System.out.println("#WRONG");
                            }
                        }else{
                            System.out.println("You Already Type This Word Before");
                        }
                    }else{
                        System.out.println("Your Answer Rejected. Min 3 char & Max 6 char.");
                    }
                    tempAnswer = answer;
                }
                System.out.println("You Had Answered 10 Times With " + rightAnswerLevelDua + " Right Answer ...");
                System.out.println("Correct Answers :");
                System.out.println(Arrays.toString(jawabanLevelDua));
                if (pointsLevelDua < 70){
                    System.out.println("You Lose!! Try Again ...");
                    System.out.println("Do You Want To Retry [y/t]:");
                    cobaLagi = br.readLine();
                    if (cobaLagi.equalsIgnoreCase("t"))
                        System.exit(0);
                    else if (cobaLagi.equalsIgnoreCase("y"))
                        cek = true;
                    else
                        System.exit(0);
                }


                System.out.print("\n");
                System.out.print("\n");
                System.out.print("Level 3\n");
                System.out.print("-------\n");
                System.out.print(soalLevelTiga + "\n");
                for (int i = 1; i <= 10; i ++){
                    System.out.print(i + "> Your Answer: ");
                    answer = keyboard.next();
                    if (cekJumlahKata(answer)){
                        if (! answer.equals(tempAnswer)){
                            if (Arrays.stream(jawabanLevelTiga).anyMatch(answer::equals)){
                                pointsLevelTiga += 10;
                                rightAnswerLevelTiga += 1;
                                System.out.println("#RIGHT. Score: " + pointsLevelTiga);
                            }else{
                                System.out.println("#WRONG");
                            }
                        }else{
                            System.out.println("You Already Type This Word Before");
                        }
                    }else{
                        System.out.println("Your Answer Rejected. Min 3 char & Max 6 char.");
                    }
                    tempAnswer = answer;
                }
                System.out.println("You Had Answered 10 Times With " + rightAnswerLevelTiga + " Right Answer ...");
                System.out.println("Correct Answers :");
                System.out.println(Arrays.toString(jawabanLevelTiga));

//                Menampilkan Hasil Score
                totalPointsAcummulated = pointsLevelSatu + pointsLevelDua + pointsLevelTiga;
                if (pointsLevelTiga < 70){
                    System.out.println("You Lose!! Try Again ...");
                    System.out.println("Do You Want To Retry [y/t]:");
                    cobaLagi = br.readLine();
                    if (cobaLagi.equalsIgnoreCase("t"))
                        System.exit(0);
                    else if (cobaLagi.equalsIgnoreCase("y"))
                        cek = true;
                    else
                        System.exit(0);
                }else {
                    System.out.println("Overall Score : " + totalPointsAcummulated);
                    System.out.println("You Win !!!");
                    System.out.print("Press ENTER to exit ...");
                    keyboard.next();
                    System.exit(0);
                }


            }catch (IOException ioe) {
                System.out.println("Error IOException");
            }
        }
    }
}
