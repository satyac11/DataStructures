
public class BinarySearch {

	public static void main(String[] args) {
		Data data = new Data(1000);
		int search = 99;
		int low = 0;
		int high = data.getSize()-1;
		int mid;
		while(true) {
			if(low>high) {
				System.out.println("number isnot found");
				break;
			}
				
			//mid = low+((high-low)/2);//Binary Search
			//mid =  low + ((high-low)/(data.array[high]-data.array[low]))*(search-data.array[low]);
			mid=low+((high-low)/(data.array[high]-
					data.array[low]))*(search-data.array[low]);
			data.count++;
			if(data.array[mid] == search) {
				System.out.printf("Element \"%d\" found in list , %d operations done to find it", search,
						data.count);
				break;
			}
			else if(search < data.array[mid]) {
				high = mid-1;
			}
			else if(search>data.array[mid]) {
				low = mid+1;
			}
			
		}

	}

}
