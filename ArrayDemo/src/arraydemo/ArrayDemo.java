/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;
import java.util.*;

 

public class ArrayDemo  {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("values");
        for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
        System.out.println("Didplay");
    
        int visited=(-1);
        for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){arr[j]=visited;}}}
     for(int i=0;i<n;i++){if(arr[i]!=visited){System.out.println(arr[i]+" ");}}   

    }
    
    
}
