package test.com.maBanque;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.maBanque.CompteException;
import com.maBanque.CompteImpl;

public class CompteTest {
	
	CompteImpl compteImpl;
	
	@Before
	public void init(){
		compteImpl = new CompteImpl();
	}
	
	@Test
	public void debiter1(){
		try{
			compteImpl.setSolde(100);
			float gain = compteImpl.debiter(30);
			assertTrue(gain == 30);
			float solde = compteImpl.getSolde();
			assertTrue(solde == 70);
		} catch(CompteException e){
			fail(e.getMessage());
		}
	}
	
	@Test
	public void debiter2(){
		try{
			compteImpl.setSolde(100);
			float gain = compteImpl.debiter(150);
			assertTrue(gain == 0);
			float solde = compteImpl.getSolde();
			assertTrue(solde == 0);
		} catch(CompteException e){
			fail(e.getMessage());
		}
	}
	
	@Test(expected = com.maBanque.CompteException.class)
	public void debiter3() throws CompteException{
		compteImpl.setSolde(100);
		compteImpl.debiter(2000);
	}
	
	@Test(expected = com.maBanque.CompteException.class)
	public void debiter4() throws CompteException{
		compteImpl.setSolde(100);
		compteImpl.debiter(0);
	}

}
