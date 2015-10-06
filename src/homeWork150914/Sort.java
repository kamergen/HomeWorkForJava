package homeWork150914;

public class Sort {
	
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
					
			arr[i] = (int)(Math.random() * 100);
		}
		Sort.selectSort(arr);
		System.out.println();
		Sort.bubbleSort(arr);
	}
	
	public static void selectSort(int mass[]){
		for (int i = 0; i < mass.length; i++) {
		        
		      int min = mass[i];
		      int min_i = i; 
		       
		      for (int j = i+1; j < mass.length; j++) {
		            
		            if (mass[j] < min) {
		                min = mass[j];
		                min_i = j;
		            }
		        }
		      
		        if (i != min_i) {
		            int tmp = mass[i];
		            mass[i] = mass[min_i];
		            mass[min_i] = tmp;
		        }
		     }
			for (int i = 0; i < mass.length; i++) {
				System.out.println(mass[i]);
			}
		}
	public static void bubbleSort(int mass[]){
	
		for(int i = mass.length-1 ; i > 0 ; i--){
	        for(int j = 0 ; j < i ; j++){
	           
	            if( mass[j] > mass[j+1] ){
	                int tmp = mass[j];
	                mass[j] = mass[j+1];
	                mass[j+1] = tmp;
	            }
	        }
	    }
		for (int i = 0; i < mass.length; i++) {
			System.out.println(mass[i]);
		}
	}

}
