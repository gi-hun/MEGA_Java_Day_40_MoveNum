/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
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
					System.out.print("벽 ");
				}
				else if(e.game[i]==2)
				{
					System.out.print("나 ");
					idx =i;
				}
				else
				{
					System.out.print(e.game[i]+" ");
				}
			}
			System.out.println();
			
			System.out.println("[1]왼쪽 [2]오른쪽 [3]벽 격파 [4]종료");
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
					System.out.println("벽 때문에 움직이지 못합니다.");
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
					System.out.println("벽 때문에 움직이지 못합니다.");
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
				System.out.println("게임을 종료하겠습니다.");
				break;
			}
		}
	}
}
