/*���� ����
���� �迭 array�� ���� n�� �Ű������� �־��� ��, array�� ����ִ� ���� �� n�� ���� ����� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
1 �� array�� ���� �� 100
1 �� array�� ���� �� 100
1 �� n �� 100
���� ����� ���� ���� ���� ��� �� ���� ���� return �մϴ�.
����� ��
array	n	result
[3, 10, 28]	20	28
[10, 11, 12]	13	12
����� �� ����
����� �� #1

3, 10, 28 �� 20�� ���� ����� ���� 28�Դϴ�.
����� �� #2

10, 11, 12 �� 13�� ���� ����� ���� 12�Դϴ�.*/

package BFS_DFS;

import java.util.Iterator;

public class ClosedNum {
	public static void main(String[] args) {
		Solution_1102 s = new Solution_1102();
		System.out.println(s);
	}	
}
class Solution_1102 {
    public int solution(int[] array, int n) {
    	
    	 int answer = 0;
         for(int i = 0; i < array.length; i++) {
             if(answer == 0) {
                 answer = array[i];
             }
             else {
                 if(Math.abs(n - answer) > Math.abs(n - array[i])) {
                     answer = array[i];
                 }
                 else if(Math.abs(n - answer) == Math.abs(n - array[i])) {
                     if(answer > array[i]) {
                         answer = array[i];
                     }
                 }
             }
         }
         return answer;
     }
}
