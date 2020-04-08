/*
 * # �����̵�[3�ܰ�] : Ŭ���� + ����
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 4. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 * 5. �¿� ���� �����ص� ��� �ݴ������� �̵��� �����ϴ�.
 * ��) 
 *  0 0 0 0 0 0 0 2 
 *  ����(1) ������(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */
package day_40;

import java.util.Scanner;

class Ex08
{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}

public class ClassEx08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex08_1 e = new Ex08_1();
		
		int idx = -1;
		while(true)
		{
			for(int i=0;i<e.game.length;i++)
			{
				if(e.game[i]==1)
				{
					System.out.print("�� ");
				}
				else if(e.game[i]==2)
				{
					System.out.print("�� ");
					idx =i;
				}
				else
				{
					System.out.print(e.game[i]+" ");
				}
			}
			System.out.println();
			
			System.out.println("[1]���� [2]������ [3]�� ���� [4]����");
			int move = sc.nextInt();
			
			if(move==1)
			{
				if(idx==0)
				{
					e.game[idx] = 0;
					idx = e.game.length-1;
					e.game[idx] = 2;
				}
				else if(e.game[idx-1]==0)
				{
					e.game[idx] = 0;
					e.game[idx-1] = 2;
				}
				else if(e.game[idx-1]==1)
				{
					System.out.println("�� ������ �������� ���մϴ�.");
				}
			}
			else if(move==2)
			{
				if(idx==8)
				{
					e.game[idx] = 0;
					idx = 0;
					e.game[idx] = 2;
				}
				else if(e.game[idx+1]==0)
				{
					e.game[idx] = 0;
					e.game[idx+1] = 2;
				}
				else if(e.game[idx+1]==1)
				{
					System.out.println("�� ������ �������� ���մϴ�.");
				}
			}
			else if(move==3)
			{
				if(e.game[idx-1]==1)
				{
					e.game[idx-1] = 0;
				}
				else if(e.game[idx+1]==1)
				{
					e.game[idx+1] = 0;
				}
			}
			else if(move==4)
			{
				System.out.println("������ �����ϰڽ��ϴ�.");
				break;
			}
		}
	}
}
