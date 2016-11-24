package com.maBanque;

public interface Compte {

	float getSolde();

	/**
	 * D�bite le compte de la valeur donn�e en argument
	 * @param debit
	 * @return le montant demand� si le solde du compte est sup�rieur au montant demand�,
	 * retourne la valeur du solde si le solde est inf�rieur au montant demand�. 
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
