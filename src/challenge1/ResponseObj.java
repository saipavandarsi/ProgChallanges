package challenge1;

public class ResponseObj {
	
	public Integer number;
	public boolean isprime;
	
	ResponseObj(Integer number, boolean isprime) {
		number = this.number;
		isprime = this.isprime;
	}
	
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the isprime
	 */
	public boolean isIsprime() {
		return isprime;
	}
	/**
	 * @param isprimenum the isprime to set
	 */
	public void setIsprime(boolean isprime) {
		this.isprime = isprime;
	}

}
