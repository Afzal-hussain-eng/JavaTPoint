package com.thisKeyword;
class S2{
	void m(S2 obj) {
		System.out.println("Method invoked");
	}
	void p() {
		m(this);
	}
}
public class ByUsingThisToPassAnAdgumentInMethod {

	public static void main(String[] args) {
		S2 s1 = new S2();
		s1.p();
	}

}
