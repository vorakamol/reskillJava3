public class Range {
    private String input;

    public Range(String input) {
        this.input = input;
    }

    public boolean isStartWithInclusive() {
        return input.startsWith("[");
    }

    public int getStartInput(){
        return Integer.parseInt(input.substring(1,2));
    }
}