package passwordGeneration;

import java.util.regex.Pattern;

public class CreatePassword {

	public static void main(String[] args) {
		int strenght = 3, limit = 8;
		String password = setRandomPassword(strenght, limit);
		System.out.println("Your password for strenght " + strenght + " and limit " + limit + " is = " + password);
		validatePassword(password, limit, strenght);
	}

	public static String setRandomPassword(int strenght, int limit) {
		String charA_Z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String chara_z = "abcdefgjijklmnopqrstuvwxyz";
		String specialChar = "!@#$*";
		String numbers = "1234567890";

		if (strenght == 1) {
			char[] arrayPassword1 = new char[limit];
			for (int i = 0; i < arrayPassword1.length; i++) {
				int randomValue = (int) (Math.random() * (charA_Z + chara_z).length());
				arrayPassword1[i] = (charA_Z + chara_z).charAt(randomValue);
			}
			return new String(arrayPassword1);
		} else if (strenght == 2) {
			char[] arrayPassword2 = new char[limit];
			for (int i = 0; i < arrayPassword2.length; i++) {
				int randomValue = (int) (Math.random() * (charA_Z + chara_z + numbers).length());
				arrayPassword2[i] = (charA_Z + chara_z + numbers).charAt(randomValue);
			}
			return new String(arrayPassword2);
		} else if (strenght == 3) {
			char[] arrayPassword3 = new char[limit];
			for (int i = 0; i < arrayPassword3.length; i++) {
				int randomValue = (int) (Math.random() * (charA_Z + chara_z + numbers + specialChar).length());
				arrayPassword3[i] = (charA_Z + chara_z + numbers + specialChar).charAt(randomValue);
			}
			return new String(arrayPassword3);
		}

		return null;
	}

	public static void validatePassword(String inputPassword, int limit, int strenght) {
		if (strenght == 1) {
			String passwordPattern = "[a-zA-Z]{" + limit + "}";
			boolean checkPassword = Pattern.matches(passwordPattern, inputPassword);
			if (checkPassword) {
				System.out.println("This is valid password");
			} else {
				System.out.println("This is in valid .. !!! ");
			}
		} else if (strenght == 2) {
			String passwordPattern = "[a-zA-Z0-9]{" + limit + "}";
			boolean checkPassword = Pattern.matches(passwordPattern, inputPassword);
			if (checkPassword) {
				System.out.println("This is valid password");
			} else {
				System.out.println("This is in valid .. !!! ");

			}
		} else if (strenght == 3) {
			String passwordPattern = "[a-zA-Z0-9!@#$*]{" + limit + "}";
			boolean checkPassword = Pattern.matches(passwordPattern, inputPassword);
			if (checkPassword) {
				System.out.println("This is valid password");
			} else {
				System.out.println("This is in valid .. !!! ");

			}
		}

	}
}
