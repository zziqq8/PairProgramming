package intNumToStringNum;

import java.util.Scanner;

public class IntToEng {
	String[] OneToTen = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	String[] ElevenToNineteen = {};
	String[] digit= {"Hundred"};
	//

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));

	}
	public static String translateEng(int n) {
		if(n==0)return "Zero";


		/*
		for(int i=1000000000;i>0;i=i/100) {
		}
		*/
		return "";
	}


}
