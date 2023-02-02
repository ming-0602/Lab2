import java.util.EmptyStackException;

public class TestEncryption {
    public static void main(String[] args) {
        System.out.println(Encryption.encryptRowColumn("I am a Students", 5));//12
        System.out.println(Encryption.decryptRowColumn("ITTAUSMDXAEXSNX", 5));
        System.out.println(Encryption.encryptCaesarCipher("B", 3));
    }


}
