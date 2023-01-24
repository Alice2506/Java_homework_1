/*
Задание 1.
Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
*/

public class task1{
	static int calculateFactorial(int n){
		int result = 1;
		for (int i = 1; i <=n; i ++){
			result = result*i;
		}
		return result;
	}
    
    static int calculateSum(int n){
        int result = 0;
        for (int i = 1; i <= n; ++i){
            result = result + i;
        }
        return result;
    }
 
	public static void main(String[] args){
		System.out.println(calculateFactorial(3));
        System.out.println(calculateSum(4)); 
	}
}