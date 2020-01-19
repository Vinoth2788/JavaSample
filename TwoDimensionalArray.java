
public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] worldPopulation = {{2121,548,23154,54687},{5544,9898,656,84564,64654},{65798,978798,865465,65784,514655,54654}};
		System.out.println("The world population"+worldPopulation+"The size"+worldPopulation.length);
		System.out.println("The world population[0]"+worldPopulation[0]+"The size"+worldPopulation[0].length);
		System.out.println("WorldPopulation [1][2]"+worldPopulation[1][2]);
		worldPopulation[1][2]=76767;
		
		System.out.println("WorldPopulation [1][2]"+worldPopulation[1][2]);
		for(int i=0; i<worldPopulation.length;i++) {
			for(int j=0; j<worldPopulation[i].length;j++) {
				System.out.println("The world population "+worldPopulation[i][j]);			}
		}
		}

	}

 