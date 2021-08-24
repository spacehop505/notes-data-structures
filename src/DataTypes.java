public class DataTypes {

	public static void primative() {
		byte byte1 = 1;
		short short1 = 1;
		int int1 = 1;
		long long1 = 1L;
		float float1 = 1.0f;
		double double1 = 1.0d;
		boolean boolean1 = false;
		char char1 = 'A';
		String string = "hello";

		System.out.println("[1 BYTE] Byte: " + Byte.MIN_VALUE + " \t" + Byte.MAX_VALUE);
		System.out.println("[2 BYTE] Short: " + Short.MIN_VALUE + " \t" + Short.MAX_VALUE);
		System.out.println("[4 BYTE] Integer: " + Integer.MIN_VALUE + " \t" + Integer.MAX_VALUE);
		System.out.println("[8 BYTE] Long: " + Long.MIN_VALUE + " \t" + Long.MAX_VALUE);
		System.out.println("[8 BYTE] Double: " + Double.MIN_VALUE + " \t" + Double.MAX_VALUE);
		System.out.println("[1 BYTE] Boolean: " + false + " \t" + true);
	}

	public static void arraysEmpty(){
		byte[] byteArray = new byte[5];
		short[] shortArray = new short[5];
		int[] intArray = new int[5];
		long[] longArray = new long[5];
		float[] floatArray = new float[5];
		double[] doubleArray = new double[5];
		boolean[] booleanArray = new boolean[5];
		char[] charArray = new char[5];
		String[] stringArray = new String[5];
	}

	public static void arraysDefined() {
		byte[] byteArray = { 1, 2, 3 };
		short[] shortArray = { 1, 2, 3 };
		int[] intArray = { 1, 2, 3 };
		long[] longArray = { 1, 2, 3 };
		float[] floatArray = { 1, 2, 3 };
		double[] doubleArray = { 1, 2, 3 };
		boolean[] booleanArray = { false, true };
		char[] charArray = { 'A', 'B', 'C' };
	}

	public static void casting() {
		double a = 4.3;
		int b = (int) a;
	}

}
