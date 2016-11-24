package com.maBanque;

public class CompteImpl implements Compte {

	private float solde;
	
	@Override
	public float getSolde() {
		return solde;
	}

	@Override
	public float debiter(float debit) throws CompteException {
		if(debit < 20){
			throw new CompteException("debit doit etre >= 20");
		}
		if(debit > 1000){
			throw new CompteException("debit doit etre <= 1000");
		}
		if(debit > solde){
			solde = 0;
			return solde;
		} else {
			solde = solde - debit;
			return debit;
		}
	}

	@Override
	public void setSolde(float solde) throws CompteException {
		if(solde <= 0){
			throw new CompteException("solde doit etre > 0");
		}
		this.solde = solde;
	}

}
