public class byteLogic{
    public static void main(String[] args){
        byte a = 135;               //-> Error
        byte b = (byte)135;         //-> -121 (-128 to 127)-> byte stores numbers
        System.out.println(b);
    }
}