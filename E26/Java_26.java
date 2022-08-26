package E26;

public class Java_26 {
static Long myLong=1231231231L;
static byte myBite=8;
static short myShort=15;
static Integer myInt=50;
static int normalInt= 10;
public static void whatsMyClass(Object x) {
	System.out.println(x.getClass());
}

	public static void main(String[] args) {
		whatsMyClass(myLong);
		whatsMyClass(myBite);
		whatsMyClass(myShort);
		whatsMyClass(myInt);
		whatsMyClass(normalInt);

	}
}