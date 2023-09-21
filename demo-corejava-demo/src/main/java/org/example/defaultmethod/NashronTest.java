package java8miscs;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashronTest {

	public static void main(String[] args) throws ScriptException {
		// TODO Auto-generated method stub

		
		ScriptEngineManager manag=new ScriptEngineManager();
		ScriptEngine eng=manag.getEngineByName("javascript");
		
		System.out.println(eng.getClass().getName());
		
		System.out.println("result::"+eng.eval("function  f() { return 1;}; f()+1 ;"));
	}

}
