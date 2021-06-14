package teamwork;
import java.io.*;
import java.util.Scanner;

public class calculate {
	public static void main(String[] args) throws IOException{
		Scanner scanner= new Scanner(System.in);
		float n=1,flag;
		shuru A=new shuru();
		do{
			A.input();
			flag=A.panduan();
			while(flag == 5){
				System.out.println("请重新输入");
				A.input();
				flag=A.panduan();
			}
			if (flag==1){
				jia B=new jia(A.a,A.b);
				B.jiafa();
				shuchu C=new shuchu(A.a,A.b,B.answer,A.caozuo);
				C.output();
			}
			else if (flag==2){
				jian B=new jian(A.a,A.b);
				B.jianfa();
				shuchu C=new shuchu(A.a,A.b,B.answer,A.caozuo);
				C.output();
			}
			else if (flag==3){
				cheng B=new cheng(A.a,A.b);
				B.chengfa();
				shuchu C=new shuchu(A.a,A.b,B.answer,A.caozuo);
				C.output();
			}
			else if (flag==4){
				while(A.b==0){
					System.out.println("请重新输入");
					A.input();
				}
				chu B=new chu(A.a,A.b);
				B.chufa();
				shuchu C=new shuchu(A.a,A.b,B.answer,A.caozuo);
				C.output();
			}
			System.out.println("是否需要再计算一题，是输入1，不是输入其他");
			n=scanner.nextFloat();
		}while(n==1);
		scanner.close();
	}
}

class shuru{
	Scanner scanner= new Scanner(System.in);
	float a,b;
	String caozuo;
	public shuru(){}
	public void input(){
		System.out.println("请输入两个数字和操作符");
		this.a=scanner.nextFloat();
		this.b=scanner.nextFloat();
		this.caozuo=scanner.next();
	}
	public float panduan(){
		if(caozuo.equals("+")){
			return 1;
		}
		else if(caozuo.equals("-")){
			return 2;
		}
		else if(caozuo.equals("*")){
			return 3;
		}
		else if(caozuo.equals("/"))
			return 4;
		else
			return 5;
	}
}
 
class shuchu{
	float a,b;
	float answer;
	String caozuo;
	public shuchu(float a,float b,float answer,String caozuo){
		this.a=a;
		this.b=b;
		this.answer=answer;
		this.caozuo=caozuo;
	}
	public void output(){
		System.out.println(a+caozuo+b+"的答案是"+answer);
	}
}
class jia{
	float a,b,answer;
	public jia(float a,float b){
		this.a=a;
		this.b=b;
	}
	public void jiafa(){
		this.answer=a+b;
	}
}

class jian{
	float a,b,answer;
	public jian(float a,float b){
		this.a=a;
		this.b=b;
	}
	public void jianfa(){
		this.answer=a-b;
	}
}

class cheng{
	float a,b,answer;
	public cheng(float a,float b){
		this.a=a;
		this.b=b;
	}
	public void chengfa(){
		this.answer=a*b;
	}
}

class chu{
	float a,b;
	float answer;
	public chu(float a,float b){
		this.a=a;
		this.b=b;
	}
	public void chufa(){
		this.answer=a/b;
	}
}