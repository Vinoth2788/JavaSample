//////////////////////////////ARRAY BASICS//////////////////////////////////

/*What is an Array?
 * Array is a static Homogenious Data structure to store multiple elements
 * there are 1,2 and multi dimensional arrays
 *     1 dimensional array
		syntax  datatype[] varname = new datatype[size];
		2 dimensional array
		syntax datatype[][] varname = new datatype[row][col]
*/
public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st way to declare an array
		int[] population = {1,2,3,4,5};
		//2nd way
		int[] Array = new int[5];
		Array[0]=6;
		Array[1]=7;
		Array[2]=8;
		Array[3]=9;
		Array[4]=10;
		//3rd way
		int[] population1= new int[]{11,12,13,14,15};
		for(int i=0; i<Array.length; i++) {
			{
				System.out.println("Population"+Array[i]);
			}
			
			//for each
			int count =0;
			for(int elm:population) {
				count= count + elm;
				
			}
			System.out.println("Total population"+count);
		}
		
		}
		

	}


