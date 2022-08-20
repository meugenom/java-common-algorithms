package leetcode.CountPrimes;

import java.util.Arrays;

public class CountPrimes {

	public int countPrimes(int n) {
        
		if(n==0 || n==1) return 0;
        
        int countPrime=0;
        boolean[] isPrime = helper(n);
        
		for( int i = 2; i < n; i++){
        
			if(isPrime[i]==true){
                countPrime++;
            }

        }

        return countPrime;
    }
    
    public boolean[] helper(int n){
        
		boolean isPrime[]= new boolean[n+1];
        
		Arrays.fill(isPrime,true);
        
		isPrime[0]= false;
        isPrime[1]= false;
        
        for( int i=2; i*i < n; i++){

            for(int j = 2*i; j <= n; j+=i){

                isPrime[j]=false;
				
            }
        }
        
        return isPrime;
    }

    public static void main(String[] args){
        CountPrimes c = new CountPrimes();
        int n = 499979; //output 41537
        //int n = 10; //output 4
        System.out.println(c.countPrimes(n));
    }
    
}

// 1  2   2  4  6    6   6   
//2..3..5..7..11..17..23..29..31..
//eratosphenes algorithm
        /*
        int i = 5;      
        int length = arr.size();  
        while(i < length){
            for(int j = 0; j < length; j++){
                if((arr.get(i) % arr.get(j)) == 0 && arr.get(i) != arr.get(j)){
                    arr.remove(j);
                    length = arr.size();
                }
            }
            i++;
        }
        */

