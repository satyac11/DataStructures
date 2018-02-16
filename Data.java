
public class Data {
	int count;
	int array[];
	

	public Data(int size) {
		array = new int[size];
		for(int i=1;i<=array.length;i++)
			array[i-1] = i;
		count=0;
	}
	
	public int getSize() {
		return array.length;
	}

}
