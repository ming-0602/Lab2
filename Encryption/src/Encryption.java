public class Encryption {

    public static String encryptRowColumn(String plaintext, int numColumns){

        //String Builder
        plaintext = plaintext.replaceAll(" ", "").toUpperCase();
        int numRows = Math.ceilDiv(plaintext.length(), numColumns);//ceilDiv is divide and round up
        if (plaintext.length() < (numRows * numColumns)) {
            //Math.max is to compare a use the largest number
            //repeat is to do it how many times
            StringBuilder str = new StringBuilder(plaintext);
            str.append("X".repeat(Math.max(0, (numColumns * numRows) - str.length())));//result is IAMSTUDENTSXXX
            plaintext = str.toString();
        }
        StringBuilder ciperText = new StringBuilder();

        for(int col = 0; col < numColumns; col++){
            int index = col;// 0
            for(int row = 0;row < numRows; row++){
                ciperText.append(plaintext.toCharArray()[index]);
                index += numColumns;//index = 0 ;; numColumns is 5 ;; 0 + 5 = 5 ;; index = 5 ;; 5 + 5 = 10 ;; index = 10
            }
        }

        return ciperText.toString();

    }


    public static String decryptRowColumn(String ciperText, int numColumns){
        int key = Math.ceilDiv(ciperText.length(), numColumns);
        return encryptRowColumn(ciperText, key);
    }

    public static String encryptCaesarCipher(String plaintext, int shift){
        //plaintext ? [A-Z]
        StringBuilder str = new StringBuilder(plaintext);
        if(shift >= 26){
            return "It is not possible";
        }
        char[] chrArr = plaintext.replaceAll(" ", "").toUpperCase().toCharArray();
        StringBuilder ciperText = new StringBuilder();

        for(char chr : chrArr){
            if(!(chr == ' ')) ciperText.append(((char) (chr + shift)));
            else ciperText.append(' ');
        }

        return ciperText.toString();



//        return null;
    }

}
