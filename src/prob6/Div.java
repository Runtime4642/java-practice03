package prob6;


public class Div implements Calculator {
	int a,b;
	@Override
	public void setValue(int a, int b) {
		// TODO Auto-generated method stub
		this.a=a;
		this.b=b;
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return a/b;
	}

}
