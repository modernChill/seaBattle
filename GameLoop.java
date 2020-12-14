public class GameLoop {
    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        boolean winOrExit = true; //win - true, exit - false
        try {
            game.startPlaying();
        } catch (NullPointerException e) {
            winOrExit = false;
        }
        game.finishGame(winOrExit);
    }
}
