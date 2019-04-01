package PackageA;

public class Array {
	
/**
 * It reverse element of array src.
 * @param src array of {@code int} type.
 * @return array in reverse order.
 */
 public static int[] reverseArray(int[] src)
 {
	 int[] dest= new int[src.length];
	 int j=0;
	 for(int i=dest.length-1;i>=0;i--)
	 {
		 dest[j]=src[i];
		 j++;
	 }
	 return dest;
 }


/**
 * Return position at which number is found. It will return -1 number element matching found.
 * @param src array in which number to search
 * @param numberToFind is a number which we want to search
 * @return position of number if found, else -1
 */
  public static int findNumber(int[] src, int numberToFind){
	 
	  int index=0;
	  for(int i=0;i<src.length;i++)
	  {
		  if(src[i]==numberToFind){
			  return i;
		  }
	  }
	  return index;
  }
 /**
  * It prints max number of array src
  */
  public static int findMax(int[] src){
	  int max=0;
	  for(int i=0;i<src.length;i++){
		  if(src[i]>max){
			  max=src[i];
		  }
	  }
	  return max;
  }
  /**
   * It prints min number of array src
   */
    public static int findMin(int[] src){
    	int min=src[0];
    	for(int i=0;i<src.length;i++)
    	{
    		if(src[i]<min)
    		{
    		min=src[i];
    		}
    	}
    	return min;
    }	
    /**
     * It prints even value of array src
     */
    public int[] findEvens(int[] src){
    	int j=0;
    	int[] dest=new int[src.length];
    	for(int i=0;i<dest.length;i++)
    	{
    		if(src[i]%2==0)
    		{
    			dest[j]=src[i];
    			j=j+1;
    		}
    	}
    	  	  	 
    	return dest;
    }
    /*
     * 
     */
    public int[] SortAscending(int[] src){
    	int j=0;
    	int[] dest=new int[src.length];
    	for(int i=0;i<src.length;i++)
    	{
    		 for(int k=0;k<src.length;k++)
    		 {
    			 if(src[k]<src[i])
    	    		{
    	    			dest[j]=src[k];
    	    			j=j+1;
    	    		}
	 
    		 }
    	}
    	  	  	 
    	return dest;
    }
    public int[] Compare(int[] src1,int[] src2){
    	int j=0;
    	int[] dest=new int[src1.length];
    	for(int i=0;i<src1.length;i++)
    	{
    		for(int k=0;k<src2.length;k++)
    	{
    		if(src1[i]==src2[k])
    		{
    			dest[j]=src2[k];
    			j=j+1;
    		}
    	}
    	}
    	  	  
    	return dest;
    }
}      




