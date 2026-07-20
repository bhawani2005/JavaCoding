package lamdaExpression;

public class StringProgramUsingLamdaExpression {
	public static void main(String[] args) {
//		StringProcessor processor = new ConvertIntoUpperCase();
		
		StringProcessor processor = s->s.toUpperCase();	//in the place of all those line i just write only this line using lamda Expression.
		System.out.println(processor.process("Rahul"));
	}
}

interface StringProcessor{
	String process(String s);
}

//class ConvertIntoUpperCase implements StringProcessor{
//
//	@Override
//	public String process(String s) {
//		return s.toUpperCase();
//		
//	}
//	
//}