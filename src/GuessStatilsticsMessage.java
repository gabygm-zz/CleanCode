public class GuessStatilsticsMessage {
    private String number;
    private String verb;
    private String pluralModifier;

    private String makeMessage(char candidate, int count){
        createMessage(count);
        return String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
    }

    private void createMessage(int count) {
        if(count == 0){
            thereAreNoLetters();
        }else if (count == 1){
            thereIsOneLetter();
        }else {
            thereAreManyLetters(count);
        }
    }

    private void thereAreManyLetters(int count){
        number = Integer.toString(count);
        verb = "are";
        pluralModifier = "s";
    }

    private void thereIsOneLetter(){
        number = "1";
        verb = "is";
        pluralModifier = "";
    }

    private void thereAreNoLetters(){
        number = "no";
        verb = "are";
        pluralModifier = "s";
    }

    public static void main(String[] args) {
        GuessStatilsticsMessage printMessage= new GuessStatilsticsMessage();
        System.out.println(printMessage.makeMessage('h',1));
    }
}
