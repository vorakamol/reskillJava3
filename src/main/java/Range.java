public class Range {
    private String input;

    public Range(String input) {
        this.input = input;
    }

    public boolean isStartWithInclusive() {
        return input.startsWith("[");
    }

    public int getStartInput(){
        int positionOfStartInput = 1 ;
        return Integer.parseInt(input.substring(positionOfStartInput,2));
    }

    public boolean isEndWithInclusive() {
        return input.endsWith("]");
    }
}