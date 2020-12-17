package inhe.day1;

public class SBIbank extends HDFCbank {
	private void ifscCode() {
		System.out.println("My ifsccode is 000");

	}
	public static void main(String[] args) {
		SBIbank f = new SBIbank();
		f.ifscCode();
		f.phNo();
		f.aadharId();
		f.panId();
		f.branchNmae();

	}

}
