package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialMain {

	Member m;

	// 직렬화
	public void write() {
		m = new Member("홍길동", 20);
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	// 역직렬화
	public void read() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		SerialMain se = new SerialMain();
		se.write();//직렬화
		se.m = null;
		se.read();//역직렬화
		
		System.out.println(se.m);
	}

}
