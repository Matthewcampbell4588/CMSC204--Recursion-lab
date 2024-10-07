
public class ArraySum {
	
	public int sumOfArray (Integer[] a,int index) {
		int p;
		if(index==0){
		 p=a[index];
		}
		else
		p=a[index]+sumOfArray(a,index-1);
	return p;
	}
}
