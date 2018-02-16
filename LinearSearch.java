
public class LinearSearch {

	public static void main(String[] args) {
		Data data = new Data(1000);
		int search = 956;
		for (int i = 0; i < data.getSize(); i++) {
			data.count++;
			if (data.array[i] == search) {
				System.out.printf("Element \"%d\" found in list , %d operations done to find it", data.array[i],
						data.count);
				break;
			}
			
		}
	}

}
