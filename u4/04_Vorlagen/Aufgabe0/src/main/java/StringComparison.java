public class StringComparison {
	void main() {
		String oo = "OO";
		String prog = "Prog";
		String ooProg = "OOProg";

		IO.println(oo == oo);
		IO.println(oo == "OO");
		IO.println(oo == new String(oo));
		IO.println(oo == new String("OO"));
		IO.println(oo + prog == ooProg);
		IO.println(oo + prog == oo + prog);
		IO.println(ooProg == "OO" + "Prog");

		IO.println("---");

		IO.println(oo.equals("OO"));
		IO.println(oo.equals(new String("OO")));
		IO.println((oo + prog).equals(ooProg));
		IO.println((oo + prog).equals(oo + prog));
		IO.println(ooProg.equals("OO" + "Prog"));
	}
}
