public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int [] array = new int [9];
        

        array[0]=5;
        array[5]=9;

        array[5]=0;

        System.out.println(array[5]);

            
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
      
        }
}
