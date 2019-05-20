package intNumToStringNum;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

// import intNumToStiringNum.IntToEng;

public class test {

	@Test
	public void 一桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "Three";
		String actual = ite.translateEng(3);
		assertThat(actual,is(expected));
	}
	public void 二桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "Twelve";
		String actual = ite.translateEng(12);
		assertThat(actual,is(expected));
	}
	public void 四桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "One Thousand Five";
		String actual = ite.translateEng(1005);
		assertThat(actual,is(expected));
	}
	public void 五桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "Fifty Four Thousands Three Hundreds Twenty One";
		String actual = ite.translateEng(54321);
		assertThat(actual,is(expected));
	}
	public void 六桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "Six Hundreds Seventy Eight Thousands Nine Hundreds Thirty Two";
		String actual = ite.translateEng(678932);
		assertThat(actual,is(expected));
	}
	public void 七桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "Seven Millions Five Hundreds Thirty One Thousands Four Hundreds Eighty Six";
		String actual = ite.translateEng(7531486);
		assertThat(actual,is(expected));
	}
}
