package basic.array;

public class FrequencyOfElements {

    static int arr[] = {1,2,4,2,1,5,6,3,4,2};

    public static void main(String args[]) {
        int frq[] = new int[arr.length];
        int visited[] = new int[arr.length];

        for(int i=0; i<frq.length; i++) {
            frq[i] = 1;
            visited[i] = 0;
        }

        for(int i=0; i<arr.length; i++) {
            if(frq[i] > 1)
                continue;
            int count = 1;
            for(int j=i+1; j< arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    frq[i] = frq[j] = count;
                    visited[j] = 1;
                }

            }
        }

        for(int i=0; i<arr.length; i++) {
            if(visited[i] !=1) {
                System.out.println(arr[i] + "-------" + frq[i]);
            }
        }
    }

}
