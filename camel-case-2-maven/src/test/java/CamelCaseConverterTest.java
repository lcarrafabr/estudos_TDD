import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CamelCaseConverterTest {
	
private CamelCaseConverter camelCase;
	
	@Before //Executado sempre antes de cada um dos @Test
	public void setup() {
		
		camelCase = new CamelCaseConverter();
	}
	
	@Test
	public void deveConverterNomeSimples() throws Exception {
		
		assertEquals("Luciano", camelCase.converter("luciano"));
	}
	
	@Test
	public void deveConverterNomeMisturadoEMaiusculoEMinusculo() throws Exception {
		
		assertEquals("Luciano", camelCase.converter("lUcIaNo"));
	}

}
