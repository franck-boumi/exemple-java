package modeles;

public class HelloWorld {
	public String getMessage(String msg){
		if(msg == null)
			return "Hello World";
		else
			return "Hello "+msg;
	}
	public int sum(int a,int b){
		return a+b;
	}

}
