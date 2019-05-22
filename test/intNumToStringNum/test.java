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
	@Test
	public void 二桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "Twelve";
		String actual = ite.translateEng(12);
		assertThat(actual,is(expected));
	}
	@Test
	public void 四桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "One Thousand Five";
		String actual = ite.translateEng(1005);
		assertThat(actual,is(expected));
	}
	@Test
	public void 五桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "Fifty Four Thousands Three Hundreds Twenty One";
		String actual = ite.translateEng(54321);
		assertThat(actual,is(expected));
	}
	@Test
	public void 六桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "Six Hundreds Seventy Eight Thousands Nine Hundreds Thirty Two";
		String actual = ite.translateEng(678932);
		assertThat(actual,is(expected));
	}
	@Test
	public void 七桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "Seven Millions Five Hundreds Thirty One Thousands Four Hundreds Eighty Six";
		String actual = ite.translateEng(7531486);
		assertThat(actual,is(expected));
	}
	@Test
	public void 八桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "Eight Millions Six Hundreds Fourty Two One Thousand Three Hundreds Fifty Seven";
		String actual = ite.translateEng(86421357);
		assertThat(actual,is(expected));
	}
	@Test
	public void 九桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "Ninety Six Millions Three Hundreds Twelve Four Thousand Five Hundreds Seventy One";
		String actual = ite.translateEng(963124571);
		assertThat(actual,is(expected));
	}
}
