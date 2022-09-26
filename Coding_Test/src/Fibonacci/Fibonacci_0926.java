/*�Ǻ���ġ ��
�Ǻ���ġ ���� F(0) = 0, F(1) = 1�� ��, 1 �̻��� n�� ���Ͽ� F(n) = F(n-1) + F(n-2) �� ����Ǵ� �� �Դϴ�.

�������

F(2) = F(0) + F(1) = 0 + 1 = 1
F(3) = F(1) + F(2) = 1 + 1 = 2
F(4) = F(2) + F(3) = 1 + 2 = 3
F(5) = F(3) + F(4) = 2 + 3 = 5
�� ���� �̾����ϴ�.

2 �̻��� n�� �ԷµǾ��� ��, n��° �Ǻ���ġ ���� 1234567���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��� �ּ���.

���� ����
n�� 2 �̻� 100,000 ������ �ڿ����Դϴ�.
����� ��
n	return
3	2
5	5
����� �� ����
�Ǻ���ġ���� 0��°���� 0, 1, 1, 2, 3, 5, ... �� ���� �̾����ϴ�.*/

package Fibonacci;

/*public class Fibonacci_0926 {
    public static void main(String[] args) {
        System.out.println("test");
        FibonacciSo FS = new FibonacciSo();
        System.out.println(FS.Fibonacci(5));
    }



}

class FibonacciSo{
    public int Fibonacci(int n) {
    	
        int answer = 0;
        int[] arr= new int[n+1];
        
       
        for(int i = 2; i <= n; i++ ) {
        	arr[0]=0;
        	arr[1]=1;
        	arr[i]=arr[i-1]+arr[i-2];
        	answer = (arr[i]%1234567);
        }	
        
        

        return answer;
    }
}*/

public class Fibonacci_0926 {
    public static void main(String[] args) {
        Solution FS = new Solution();
        int test = FS.solution(10);
        System.out.println(test);
    }



}

class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n == 1 || n == 0) return 1;
        int a = 0;
        int b = 1;

        for(int i = 2; i <= n; i++){
            answer = (a+b) % 1234567;
            a = b;
            b = answer;
        }
        return   answer;
    }
}