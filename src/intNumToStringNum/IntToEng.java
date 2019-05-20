package intNumToStringNum;

import java.util.Scanner;

public class IntToEng {
	static String[] OneToTen = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","ten"};
	static String[] TenToNineteen = {"Ten","Eleven","Twenteen","Thirteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	static String[] Ten_digit={"Twenty","Thirty","Fourtey","Fifty","Sixty","Seventy","Eighty","Ninety"};
	static String[] digit= {"Thousand","Million","Billion"};


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));

	}
	public static String translateEng(int n,String str) {
		int i=n;

		if(i==100) {
			str=str+" hundred";
		}else if(i>100)str=str+OneToTen[(i/100)-1]+" hundreds";
		int k=(i/10)%10;
		if(k==1) {//10~19のとき
			str=str+" "+TenToNineteen[(i%10)-1];
		}else if(k>0) {//20~99のとき
			str=str+" "+Ten_digit[k-2];
			if(i%10!=0) {str=str+" "+OneToTen[(i%10)-1];}
		}else {//0~9のとき、ただし0は何も表示しない。
			if(i%10!=0) {str=str+" "+OneToTen[(i%10)-1];}
		}

		return str;
	}
	public static String translateEng(int n) {
		if(n==0)return "Zero";
		return translateEng(n,"");
	}

}
