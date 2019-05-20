package intNumToStringNum;

import java.util.Scanner;
import java.util.Stack;

public class IntToEng {
	static String[] OneToTen = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	static String[] TenToNineteen = {"Ten","Eleven","Twelve","Thirteen","Forteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	static String[] Ten_digit={"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	static String[] digit= {"","Thousands","Millions","Billions"};


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("英語に変換したい数字を入力してください.");
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while(sc.hasNext()) {
			input = sc.nextInt();
			System.out.println(translateEng(input));
		}
	}

	public static String translateEng(int n) {
		if(n==0)return "Zero";
		Stack<String> stack = new Stack<String>();
		int i=0;

		for(int j=3;j>=1;j--) {
			String str="";//stackにpushする文字列をしまうところ。for分の度に初期化される。
			i=(int)n%1000;//下3桁の数字をiにしまう
			if(i==0)break;

			if((int)i/100==1) {str="One Hundred";}//One hundredにならないよう”s”、ここだけ場合分け。
			else if(i>100)str=pettyStrAdd(str,OneToTen[(i/100)-1]+" Hundreds");

			int k=(i/10)%10;//下3桁のうちの2桁目の数字を取り出す
			if(k==1) {//10~19のとき
				str=pettyStrAdd(str,TenToNineteen[(i%100)-10]);
			}else if(k>0) {//20~99のとき
				str=pettyStrAdd(str,Ten_digit[k-2]);
				if(i%10!=0) str=pettyStrAdd(str,OneToTen[(i%10)-1]);
			}else {//0~9のとき、ただし0は何も表示しない。
				if(i%10!=0) str=pettyStrAdd(str,OneToTen[(i%10)-1]);
			}

			stack.push(pettyStrAdd(str,digit[3-j]));
			n=(int)n/1000;//今stackにpushした分の桁を削除する
		}
		return stackAdd(stack);//stackの中身をpopして全て足し合わせたStringをreturnする。
	}
	public static String stackAdd(Stack<String> stack) {
		String str="";
		while(!stack.empty()) {
			str=pettyStrAdd(str,stack.pop());
			}
		return str;
	}
	public static String pettyStrAdd(String base,String add) {
		if(base.isEmpty())return add;
		if(add.isEmpty())return base;
		return base+" "+add;
	}

}
