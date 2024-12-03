package lab03;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int size = 6;
int[] data = new int[size];
System.out.println(&quot;Enter 6 numbers:\n&quot;);
for(int i=0; i&lt;data.length; i++) {
data[i] = input.nextInt();
}
BuubleSortingAlgorithm sort = new BuubleSortingAlgorithm(data);
System.out.println(&quot;Before Bubble Sorting&quot;);
sort.printArray();
sort.bubbleSort();
System.out.println(&quot;\n After Bubble Sorting&quot;);
sort.printArray();

}
}
package lab03;
public class BuubleSortingAlgorithm {
int[] data;
public BuubleSortingAlgorithm(int[] data) {
this.data = data;
}
public void bubbleSort() {
int temp =0;
for(int j=0; j&lt;data.length-1; j++) {
for(int i=0; i&lt;data.length-1-j; i++) {
if(data[i]&gt;data[i+1]) {
temp = data[i];
data[i] = data[i+1];
data[i+1] = temp;
}
}
}
}
public void printArray() {
for(int i=0; i&lt;data.length; i++) {
System.out.println(data[i]+&quot; &quot;);
}
}

}