package odbg.org.Main;

import odbg.org.libs.JSonG;

public class Main {

	public static void main(String[] args) {
		JSonG json = new JSonG();
		JSonG json2 = new JSonG();
		
		// Array type
		json.add("a");
		json.add(2);
		json.add(json);
		
		// Json type
		json2.add("a","a");
		json2.add("num", 2);
		json2.add("json", json);
		
		System.out.println(json2.getPrettyJson());

	}

}
