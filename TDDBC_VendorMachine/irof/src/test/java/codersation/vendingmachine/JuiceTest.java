package codersation.vendingmachine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JuiceTest {

	private Juice sut;

	@Before
	public void setUp() {
		sut = Juice.Coke;
	}

	@Test
	public void コーラの名前はコーラ() {
		assertThat(sut.getName(), is("コーラ"));
	}

	@Test
	public void コーラの値段は120円() {
		assertThat(sut.getPrice(), is(120));
	}

}
