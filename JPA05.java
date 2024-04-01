package Lab04;
public class JPA05{
    public static void main(String[] argv){
        String[] data = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        System.out.print("反轉陣列資料之前： ");
        for(String str : data)
        	System.out.printf("%s ", str);
        System.out.println("");
        reverse(data);
        System.out.print("反轉陣列資料之後： ");
        for(String str : data)
        	System.out.printf("%s ", str);
        System.out.println("");
    }
    public static void reverse(String[] data){
        String temp;
        for(int i = 0;i < data.length / 2;i++){
        	temp = data[i];
        	data[i] = data[data.length - i - 1];
        	data[data.length - i - 1] = temp;
        }
    }
}