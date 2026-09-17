
import java.util.Scanner;

class Lesson06_Application
{
    static Scanner scanner = new Scanner(System.in);//For general use throughout the application
    public static void main(String[] args)
    {
        System.out.println("Let's play a game!");
        OUTER:
        while (true) {
            System.out.println("0 - Play\n1 - Exit");
            String choice=scanner.next();
            switch (choice) {
                case "0" -> playGame();
                case "1" -> {
                    System.out.println("Exiting the game. Goodbye!");
                    break OUTER;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
  
    //A word list is given, select a random word from the list.
    static String[] wordList = {
    "java","method","decision","loop","program","class","object","array","string","boolean",
    "integer","function","variable","compiler","syntax","runtime","database","network","server","client",
    "internet","keyboard","monitor","printer","software","hardware","memory","storage","process","thread",
    "algorithm","structure","exception","interface","package","library","framework","developer","engineer","project",
    "computer","system","security","password","username","account","website","browser","application","update",
    "download","upload","folder","document","picture","message","notification","calendar","schedule","reminder",
    "morning","evening","weekend","holiday","weather","mountain","river","forest","ocean","island",
    "garden","kitchen","bedroom","hospital","airport","station","market","restaurant","school","classroom",
    "teacher","student","doctor","surgeon","musician","painter","writer","farmer","driver","pilot",
    "elephant","giraffe","dolphin","penguin","butterfly","squirrel","kangaroo","crocodile","tortoise","panther"
};
    public static String selectRandomWord()
    {
        int index=(int) (Math.random() * wordList.length);
        return wordList[index];
    }

    //Show the selected word as a puzzle.
    public static String convertToPuzzle(String word)
    {
        String puzzle ="";
        for(int i=0;i<word.length();i++)
        {
            puzzle+="_ ";
        }
        return puzzle;
    }
    //3. Ask the user for a letter.
    static String askForLetter()
    {
        System.out.println("Please enter a letter:");
        String letter=scanner.next().toLowerCase();
        if(letter.length()!=1)
        {
            System.out.println("Please enter only one letter.");
            return askForLetter();
        }
        if (Character.isLetter(letter.charAt(0)))//Check if the entered character is a letter
        {
            return letter;
        }
        else
        {
            System.out.println("Please enter a valid letter.");
            return askForLetter();
        }
    }

    //4. Check if the entered letter is in the word.
    static boolean isLetterInWord(String word, String letter)
    {
        return word.contains(letter);
    }
    static String updatePuzzle(String word,String correctGuesses)
    {
        String updatedDisplay="";
        for(int i=0;i<word.length();i++)
        {
            char letter=word.charAt(i);
            if (correctGuesses.indexOf(letter)>=0)
            {
                updatedDisplay+=letter +" ";
            }
            else
            {
                updatedDisplay+="_ ";
            }
        }
        return updatedDisplay;
    }
    //1. Create variables for correct guesses and incorrect guesses
    //2. Keep track of the number of mistakes
    //3. While the number of mistakes is less than 6 and the word is not completed
    //4. Display the current state of the puzzle and other relevant information
    //5. Ask the user for a letter and check if it has been guessed before.
    //6. If it has been guessed, ask for another letter
    //7. Show the end of the game
public static void playGame()
    {
        String selectedWord=selectRandomWord();
        String puzzle=convertToPuzzle(selectedWord);
        String correctGuesses="";
        String incorrectGuesses="";
        int mistakes=0;

        while(mistakes<6 && !puzzle.replace(" ", "").equals(selectedWord))
        {
            System.out.println("Current puzzle: "+puzzle);
            System.out.println("Incorrect guesses: "+incorrectGuesses);
            System.out.println("Mistakes left: "+(6-mistakes));
            String letter=askForLetter();

            if(correctGuesses.contains(letter) || incorrectGuesses.contains(letter))
            {
                System.out.println("You have already guessed that letter. Try again.");
                continue;
            }

            if(isLetterInWord(selectedWord,letter))
            {
                correctGuesses+=letter;
                puzzle=updatePuzzle(selectedWord,correctGuesses);
            }
            else
            {
                incorrectGuesses+=letter;
                mistakes++;
            }
        }

        if(puzzle.replace(" ", "").equals(selectedWord))
        {
            System.out.println("Congratulations! You've guessed the word: "+selectedWord);
        }
        else
        {
            System.out.println("Game over! The word was: "+selectedWord);
        }
    }
}