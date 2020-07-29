package kosta.io;

import java.io.File;

public class Mission {

	public static void main(String[] args) {
		// 1. byteStream을 이용하여 파일 복사를 구현하세요.
		String source_path = "C:\\rg\\workspace\\Basic01\\src\\kosta\\io\\CopyExample.java";
		String dest = "C:\\rg\\workspace\\Basic01\\src\\kosta\\io\\CopyExample2.java";
		
		String source_dir = "C:\\rg\\workspace\\Basic01\\src\\kosta\\io";
		String dest_dir = "C:\\rg\\workspace\\Basic01\\src\\kosta\\io2";
		
		File source_file = new File(source_path);
		File dest_file = new File(dest);
		
		try {
//			CopyUtil.copyFile(source_file, dest_file);
			CopyUtil.copyDirectory(new File(source_dir), new File(dest_dir));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
