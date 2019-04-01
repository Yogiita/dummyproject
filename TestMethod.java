package PackageA;

public class TestMethod extends Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] src={23,2,1,3,4,5};
     int[] src1={23,2,13,31,42,5};
     int[] dest=Array.reverseArray(src);
     for(int i:TestMethod.reverseArray(src))
     {
    	// System.out.print(i+" ");
     }
    //System.out.println(new Array().findNumber(src,5));
     //System.out.println("Max number: "+new Array().findMax(src));
     //System.out.println("Min number: "+new Array().findMin(src));
     
     //int[] evenNumbers=new Array().Compare(src,src1);
     //int[] evenNumbers=new Array().findEvens(src);
     int[] evenNumbers=new Array().SortAscending(src);
     for(int i=0;i<evenNumbers.length;i++)
     {
    	 if(evenNumbers[i]!=0)
    	 System.out.println(evenNumbers[i]);	 
     }
     
	}

}
