package git_test2;

public class Hello {
<<<<<<< HEAD
	String message = "안녕하세요";
	
	public String say{
		return message;
=======
	String message;

	public Hello() {
		this("안녕하세요");
	}

	public Hello(String message) {
		this.message = message;
	}

	public void say(){
		System.out.println(message);

>>>>>>> c57fda532d3611de654b223f1c556c181da6a60c
	}
}
