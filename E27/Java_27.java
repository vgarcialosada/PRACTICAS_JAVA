package E27;

import java.util.Random;

public class Java_27 {

	public static byte doubleToByte(double myDouble) {

		float myFloat = (float) myDouble;
		System.out.println("Float: " + myFloat);

		long myLong = (long) myFloat;
		System.out.println("Long: " + myLong);

		int myInt = (int) myLong;
		System.out.println("Int: " + myInt);

		short myShort = (short) myInt;
		System.out.println("Short: " + myShort);

		byte myByte = (byte) myShort;
		System.out.println("Byte: " + myByte);
		return myByte;
	}

	public static double ByteToDouble(byte myByte) {

		short myShort = (short) myByte;
		System.out.println("Short: " + myShort);

		int myInt = (int) myShort;
		System.out.println("Int: " + myInt);

		long myLong = (long) myInt;
		System.out.println("Long: " + myLong);

		float myFloat = (float) myLong;
		System.out.println("Float: " + myFloat);

		double myDouble = (double) myFloat;
		System.out.println("Duouble: " + myDouble);
		return myDouble;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		float random = 100f + rand.nextFloat() * (1200 - 100f);
		byte newByte = doubleToByte(random);
		System.out.println("-----");
		double newDouble = ByteToDouble(newByte);
		System.out.println("-----");

		byte byteIs100 = 100;
		byteIs100 = (byte) (byteIs100 * 2);
		System.out.println(byteIs100);
		// 100*2=200, pero byte solo llega hasta 128. Desborda y llega hasta -56. Para
		// solucionar esto debemos declararlo coomo int
		// o castearlo a int
		byte secondByte = 100;
		int myInt = (int) secondByte * 2;
		System.out.println(myInt);

	}
}