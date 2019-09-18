public class ForLoops
{
    public static void main ( String args[] ) {
        //variable declariations
        int i, cube;
        //forloop to perform the task 
        System.out.println("i\tcube i");
        for(i = 1; i <= 10; i = i + 1){
            cube = i * i * i;
            System.out.println(i + "\t" + cube);}
        int j, consecutive;
        System.out.println("j\tconsecutive j");
        for(j = 99; j >=1; j = j - 2) {
            System.out.println(j);
        }
        
            
        String x = "The quick brown fox jumped over the lazy dog";
        int k = x.length();
        for(int w = 0; w <= k; w = w + 1) {
           
            char t = x.charAt(w);
            System.out.println(t);
        }
    }   //end main
}//end ForLoops class
