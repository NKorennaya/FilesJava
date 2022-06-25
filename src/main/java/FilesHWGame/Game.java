package FilesHWGame;

public class Game {
    enum GameType {SOCCER, HOCKEY, RUGBY}

    ;

    public static void writeNumOfPlayersPerTeam(GameType game) {

        try {


            switch (game) {
                case SOCCER: {
                    createFile("Soccer.txt", "11");
                    break;
                }
                case HOCKEY: {
                    createFile("Hockey.txt", "6");
                    break;
                }
                case RUGBY: {

                    createFile("Rugby.txt", "15");

                    break;
                }

            }


        } catch (Exception error) {
            System.out.println("Something bad has happened");
            throw error;
        } finally {
            System.out.println("Hello teacher! Main logic structure I did myself, however I got help in the Class Game to higlight method createFile and ask it in each case. Before, I create new file Object in any case (4 extra row every case).");

        }
    }

    public static void createFile(String fileName, String text) {
        Files file = new Files();
        file.createSportFile(fileName);
        file.writeInFile(fileName, text);
        file.readFromFile(fileName);

    }
}



