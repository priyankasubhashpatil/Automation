package conditionalstatements;

public class array1 {

	public static void main(String[] args)
	{
		String[] str= new String[4];
		str[0]="Priyanka";
		str[1]="Swapnil";
		str[2]="Anjali";
		str[3]="Roopali";
		
		System.out.println(str[3]);
		
		
		System.out.println(str.length);

        for(int i=0; i<str.length; i++)
        	
        {
        	System.out.println(str[i]);
        }
        
        for(String s:str)
        {
        	System.out.println(s);
        }
	}

}
