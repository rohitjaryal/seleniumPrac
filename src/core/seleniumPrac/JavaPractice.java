package core.seleniumPrac;

public class JavaPractice {

	public static String reverseString(String str) {
		char[] ch = str.toCharArray();
		int lenghtOfArray = ch.length - 1;
		String tempStr = "";
		char[] ch2 = new char[ch.length];

		for (int i = 0; i <= lenghtOfArray; i++) {
			ch2[i] = ch[lenghtOfArray - i];
			System.out.println(ch2[i]);
		}

		/*
		 * for(int i=0;i<=lenghtOfArray;i++) {
		 * tempStr=tempStr+ch[lenghtOfArray-i];
		 * 
		 * }
		 */
		return String.valueOf(ch2);
	}

	public static void segregateString(String segStr) {
		System.out.println("Orignal string " + segStr);
		char[] baseChar = segStr.toCharArray();
		String digitStr = "";
		String charStr = "";

		for (int i = 0; i < baseChar.length; i++) {
			if (Character.isLetter(baseChar[i])) {
				charStr = charStr + baseChar[i];
			} else if (Character.isDigit(baseChar[i])) {
				digitStr = digitStr + baseChar[i];
			}
		}

		System.out.println("Digits are: " + digitStr);
		System.out.println("Character are: " + charStr);

	}

	public static void bubbleSort() {

		int[] num = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		for (int j = 0; j < num.length; j++) {

			for (int i = 0; i < num.length; i++) {
				if (i != num.length - 1) {
					if (num[i] > num[i + 1]) {
						int temp = num[i + 1];
						num[i + 1] = num[i];
						num[i] = temp;

					}
				}
			}
		}

		for (int no : num) {
			System.out.println(no);
		}

	}

	public static void selectionSort() {

		int[] num = { -5, 90, 82, -2, 125, 66, 55, 10, 9, 8, 7, 6, 5, 4, 3, 2,
				1 };

		int totNum = num.length;
		int temp = 0;
		int index = 0;
		for (int i = 0; i < totNum; i++) {
			temp = num[i];
			index = i;
			for (int j = i; j < totNum; j++) {
				if (j == totNum - 1) {
					num[index] = num[i];
					num[i] = temp;
					break;
				}
				if (temp > num[j + 1]) {
					temp = num[j + 1];
					index = j + 1;
				}

			}
		}

		for (int no : num) {
			System.out.println(no);
		}

	}

}
