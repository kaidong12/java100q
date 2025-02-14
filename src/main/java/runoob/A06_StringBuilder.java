package runoob;

class A06_StringBuilder {

	public static void main(String[] args) {

		// StringBuffer is mutable.
		// StringBuffer is synchronized (thread-safe).
		StringBuffer sbuf = new StringBuffer(); // creates a new instance of StringBuffer
		sbuf.append("Java"); // appends "Java" to the StringBuilder
		sbuf.insert(0, "Welcome to "); // inserts "Welcome to " at the beginning of the StringBuffer
		sbuf.reverse(); // reverse the content of StringBuffer
		System.out.println(sbuf.toString()); // prints "avaJ ot emocleW"

		// StringBuilder is mutable.
		// StringBuilder 的方法不是线程安全的（不能同步访问）
		// StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
		StringBuilder sb = new StringBuilder(); // creates a new instance of StringBuilder
		sb.append("Welcome"); // appends "Welcome" to the StringBuilder
		sb.append(" to"); // appends " to" to the StringBuilder
		sb.append(" Java!"); // appends " Java" to the StringBuilder
		sb.insert(10, " Java");
		System.out.println(sb.toString()); // prints "Welcome to Java"
		sb.delete(8, 11);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}