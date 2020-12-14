import java.util.*;

public class DotCom {
        private ArrayList<String> locationCells;
        private String name;

        public void setLocationCells(ArrayList<String> loc) {
            if (!loc.isEmpty()) locationCells = loc;
            else throw new IllegalArgumentException();
        }

        public void setName(String appelative) {
            if (appelative != null && !appelative.isEmpty()) name = appelative;
            else throw new IllegalArgumentException();
        }

        public String checkYourself(String userInput) {
            String result = "miss";
            int index = locationCells.indexOf(userInput);

            if (index != -1) {
                locationCells.remove(index);

                if (locationCells.isEmpty()) result = "sunk";
                else result = "hit";
            }

            return result;
        }
}
