import java.util.*;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public void setUpGame() {
        String[] namesDotCom = {"Pets.com", "eToys.com", "Go2.com"};
        for (String name : namesDotCom){
            dotComsList.add(new DotCom());
            dotComsList.get(dotComsList.size()-1).setName(name);
        }

        for (DotCom dotComToSet: dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }

        System.out.println("Your goal is to sink 3 sites");
        for (String name : namesDotCom) System.out.println(name);
        System.out.println("Try to sink them in the minimum number of moves");
    }

    public void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("make a move");
            checkUserGuess(userGuess);
        }
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) break;
            if (result.equals("sunk")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame(boolean winOrExit) {
        if (winOrExit)System.out.println("All sites went to fish feed! Nice work young hacker");
        else System.out.println("Thanks for playing");
    }
}

