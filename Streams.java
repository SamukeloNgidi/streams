import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
      
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(11);
    numbers.add(12);
    numbers.add(13);
	
	//using foreach
	/*int sum = 0;
	for(int n : numbers){
		if(n%2 == 0){
			n = n * 2;
			sum = sum + n;
		}
	}*/   
	
	//using streams
    //streams can only be used once
    //Stream<Integer> s1 = numbers.stream();
	//Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
	
	//do it all in one line
	int result = numbers.stream() 					//initial stream
	                    .filter(n -> n%2 == 0) 		//new stream, apply filter to get even number
	                    .map(n -> n * 2) 			//new stream, apply a map (numbers doubled)
						.reduce(0, (c,e) -> c + e); //adds up the values and give you 1 value

	//sort values
	Stream<Integer> sortedValues = numbers.stream()
										  .filter(n -> n%2 == 0)
										  .sorted();
										  
	//print results
    System.out.println(result);
	
	//sorted values
    sortedValues.forEach(n -> System.out.println(n));

  }
}