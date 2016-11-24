package test.com.maBanque;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.maBanque.CompteException;
import com.maBanque.CompteImpl;

public class CompteTest1 {
	
	CompteImpl compteImpl;
	
	@Before
	public void init(){
		compteImpl = new CompteImpl();
	}
	
	@Test
	public void setSolde(){
		try{
			
			compteImpl.setSolde(10);
			float solde = compteImpl.getSolde();
			assertTrue(solde == 10);
		} catch(CompteException e){
			fail(e.getMessage());
		}
	}
	

}
