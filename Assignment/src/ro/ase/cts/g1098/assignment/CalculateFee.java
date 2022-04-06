package ro.ase.cts.g1098.assignment;

public class CalculateFee {
	//This calculates the total fee of an account
		public static double calculate(Account[] accounts) {
			double totalFee = 0.0;
			Account account;
			for (int i = 0; i < accounts.length; i++) {
				account = accounts[i];
				if (account.account_Type == Account.PREMIUM || account.account_Type == Account.SUPER_PREMIUM)
					totalFee += .0125 * ( // 1.25% broker's fee
					account.loan_value * Math.pow(account.rate, (account.daysActive / 365)) - account.loan_value); // interest-principal
			}
			return totalFee;
		}
}
