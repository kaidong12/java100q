package runoob;

class AA
{
    public static void main ( String[] args )
    {
        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt( myArray );
        for(int j=0; j<myArray.length; j++)
            System.out.print( myArray[j] + " " );
    }
}
class ChangeIt
{
    static void doIt( int[] z ) 
    {
    	
    	System.out.println( z);
//        z = null ;
        z[0] = 100;
        
        System.out.println( z);
    }
}