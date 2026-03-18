import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int list[];

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb=new StringBuffer();

        int n=Integer.parseInt(br.readLine());
        list=new int[n];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            list[i]=Integer.parseInt(st.nextToken());
        }

        int m=Integer.parseInt(br.readLine());

        int count=0;
        Arrays.sort(list);

        int left=0,right=n-1;
        while(left<right){

            if(list[left]+list[right]<m){
                left++;
            }
            else if(list[left]+list[right]>m){
                right--;
            }
            else{
                count++;
                left++;
                right--;
            }
        }

        System.out.println(count);
    }
}