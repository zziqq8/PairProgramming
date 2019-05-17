package intNumToStringNum;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

// import intNumToStiringNum.IntToEng;

public class test {

	@Test
	public void 一桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "three";
		String actual = ite.translateEng(3);
		assertThat(actual,is(expected));
	}
	public void 二桁の数() {
		IntToEng ite = new IntToEng();
		String expected = "twenteen";
		String actual = ite.translateEng(12);
		assertThat(actual,is(expected));
	}

}
