package kosta.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonExample {

	// JSONObject -> json code(문자열)
	// {"name": "fram",
	// "address": "Avalon",
	// "age":21}

	public JSONObject createJson() {
		JSONObject obj = new JSONObject();
		obj.put("name", "Fram");
		obj.put("address", "Avalon");
		obj.put("age", 21);
		return obj;
	}

	public JSONObject createJson2() {
		JSONObject obj = new JSONObject();
		obj.put("name", "Zaira");
		obj.put("address", "Avalon");
		obj.put("age", 24);
		return obj;
	}

	public static void main(String[] args) {

		JsonExample e = new JsonExample();
		JSONObject obj = e.createJson();
		JSONObject obj2 = e.createJson2();
//		System.out.println(obj.toJSONString());
		JSONArray jsa = new JSONArray();
		jsa.add(obj);
		jsa.add(obj2);
//		System.out.println(jsa.toJSONString());

		List<Member> list = new ArrayList<Member>();
		list.add(new Member("Fram", "Avalon", 21));
		list.add(new Member("Zaira", "Avalon", 23));

		System.out.println(net.sf.json.JSONArray.fromObject(list));
		String jsonCode = net.sf.json.JSONArray.fromObject(list).toString();

		JSONParser parser = new JSONParser();
		Object re = null;

		try {
			re = parser.parse(jsonCode);
		} catch (Exception e_) {
			e_.printStackTrace();
		}
		if (re instanceof JSONArray) {
			JSONArray array = (JSONArray) re;
			Iterator iter = array.iterator();
			List<Member> list2 = new ArrayList<Member>();
			while (iter.hasNext()) {
				JSONObject jo = (JSONObject) iter.next();
				String name = (String) jo.get("name");
				String address = (String) jo.get("address");
				int age = ((Long) jo.get("age")).intValue();

				list2.add(new Member(name, address, age));
			}
			System.out.println(list2);

		}
	}

}
