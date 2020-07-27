package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyUtil {

	public static void search(int now, int length, File source_files[], Object dest_file) {
		if (length == 0)
			return;
		else if (now >= length)
			return;

		if (source_files[now].isDirectory()) {
			File this_files[] = source_files[now].listFiles();
			try {
				String path = ((File) dest_file).getPath();
				copyFile(source_files[now], new File(path, source_files[now].getName()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			((File) dest_file).mkdir();
			search(0, this_files.length, this_files, dest_file);
		}

		else if (source_files[now].isFile()) {
			try {
				copyFile(source_files[now], new File(((File)dest_file).getPath(), source_files[now].getName()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		search(now + 1, length, source_files, dest_file);
	}

	public static void copyDirectory(File source, File dest) throws Exception {
		search(0, source.listFiles().length, source.listFiles(), dest.listFiles());
	}

//byte 값을 가진 파일을 복사하세요.
	public static void copyFile(File source, File dest) throws Exception { // 원본과 복사되어질 경로를 입력 받으세요.

		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest, true);
			while (true) {
				int data = in.read();
				if (data == -1)
					break;
				out.write((byte) data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
