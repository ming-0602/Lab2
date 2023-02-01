public class Try {
    public static void main(String[] args) {
//        String plaintext = "I am a Students";
//        int numColumns = 5;
//        plaintext = plaintext.replaceAll(" ", "").toUpperCase();
//        int numRows = Math.ceilDiv(plaintext.length(), numColumns);//ceilDiv is divide and round up
//        System.out.println(numRows);
//        if (plaintext.length() < (numRows * numColumns)) {
//            StringBuilder str = new StringBuilder(plaintext);
//
//            str.append("X".repeat(Math.max(0, (numColumns * numRows) - str.length())));
//            System.out.println(str.append("X".repeat(Math.max(0, (numColumns * numRows) - str.length()))));
//
//        }
//
//
//        StringBuilder ciperText = new StringBuilder();
//        for(int col = 0; col < numColumns; col++){
//            int index = col;// 0
//            for(int row = 0;row < numRows; row++){
//                ciperText.append(plaintext.toCharArray()[index]);
//                index += numColumns;//numCo
//            }
//            System.out.println(ciperText.append(plaintext.toCharArray()[index]));
//
//        }

        String plaintext = "Hello World";

        System.out.println(plaintext);

        StringBuilder str = new StringBuilder(plaintext);

        System.out.println(str);

    }
}
