package string_special;

public class Last_Word_Length {
    public static void main(String[] args) {
        String string = "ram is a good way";
        string = string.trim();
        int count = 0;
        for (int index = string.length() - 1; index >= 0; index -- ){
            if (string.charAt(index) != ' '){
                count++;
            }
            else {
                break;
            }
        }

        System.out.println("count: "+count);
    }
}

// count: 3