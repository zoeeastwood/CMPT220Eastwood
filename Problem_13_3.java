import java.util.ArrayList;

public class Problem_13_3 {

  public static void main(String[] args) {

    ArrayList<Number> list = new ArrayList<Number>();
  
    list.add(1);
    list.add(23);
    list.add(4);
    list.add(4.555);
    list.add(39);
    list.add(32.32);
    list.add(42);
 
    System.out.println("Unsorted numbers in the ArrayList: " + list.toString());

    sort(list);

    System.out.println("Sorted numbers in the ArrayList: " + list.toString());
    
    
  } 
  public static void sort(ArrayList<Number> list) {
    for(int i=0; i < list.size() - 1; i++){
      Number minimum = list.get(i);
      int indexValue = i;
      for(int n = i + 1; n < list.size(); n++) {
        if (list.get(n).doubleValue() < minimum.doubleValue()){
        minimum = list.get(n);
        indexValue = n;
        list.set(indexValue, list.get(i));
        list.set(i, minimum);
        }
      }
      
    }
  }

}