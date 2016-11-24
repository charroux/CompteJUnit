package com.maBanque;

public interface Compte {

	float getSolde();

	/**
	 * Débite le compte de la valeur donnée en argument
	 * @param debit
	 * @return le montant demandé si le solde du compte est supérieur au montant demandé,
	 * retourne la valeur du solde si le solde est inférieur au montant demandé. 
	 * @throws CompteException si debit < 20 ou si debit > 1000 euros.
	 */
	float debiter(float debit) throws CompteException;
	
	/**
	 * Reinitialise
	 * @param solde
	 * @throws CompteException si solde <= 0
	 */
	void setSolde(float solde) throws CompteException;

}
