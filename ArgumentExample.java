public class ArgumentExample {
        
    public static void main(String args[]) {
            int  arr[]={1,2,3,4};
            System.out.println(arr.length);
            
        for(int i = 0; i < args.length; i++) {
                
            System.out.println(args[i]);
                
        }
    }
}