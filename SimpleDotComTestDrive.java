public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        SimpleDotCom website = new SimpleDotCom();

        byte[] locationsWebsite = {2,3,4};
        website.setLocationCells(locationsWebsite);

        String userGuess = "2";
        String result = website.checkYourself(userGuess);

    }
}