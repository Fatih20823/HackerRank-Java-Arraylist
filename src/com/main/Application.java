package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        List<List<Integer>> arr = new ArrayList<>();
        
        for(int i=0;i<a;i++){
            int b = scan.nextInt();
            List<Integer> list2 = new ArrayList<>();
            for(int k=0 ;k<b ;k++){
                int c = scan.nextInt();
                list2.add(c);
            }
            arr.add(list2);
        }
        int d = scan.nextInt();
        for(int i=0;i<d;i++){
            int row = scan.nextInt();
            int col = scan.nextInt();
            
            try {
                System.out.println(arr.get(row-1).get(col-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        scan.close();
	}

}
