import java.lang.reflect.Array;

public class MyArrays {

    public static int insert(int [] values, int currentSize, int pos, int newElement){
        if(pos < currentSize){
            if(currentSize < values.length){
                for(int i = currentSize-1;i > pos; i--){//downto is --
                    values[i - 1] = values[i];
                }
                values[pos] = newElement;
                currentSize++;
            }
            System.out.println(currentSize);
            return currentSize;
        }else{
            throw new IllegalArgumentException("Invalid");
        }
    }

}
