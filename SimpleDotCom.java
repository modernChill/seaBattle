public class SimpleDotCom {

    private byte[] locationCells;
    private byte numOfHits = 0;

    public void setLocationCells(byte[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {

        int guess = Integer.parseInt(stringGuess);
        String result = "missed";

        for (byte cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;

            }

        }

        if (numOfHits == locationCells.length) result = "drown";

        System.out.println(result);
        return result;

    }


}