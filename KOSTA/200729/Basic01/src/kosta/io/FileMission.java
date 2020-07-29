package kosta.io;

import java.io.File;

public class FileMission {

	// static void fileList(File file){
	// if(list[i].isDirectory()){
	// System.out.println();
	// System.out.println("**"+list[i].getName()+"Dir**");
	// fileList(list[i]);
	// }else{
	// System.out.println("-"+list[i].getName()+"-");
	// }
	// }

	public static void search(int now, int length, File files[]) {

		if (length == 0)
			return;
		else if (now >= length)
			return;
		if (files[now].isFile()) {
			for (int i = 0; i < length; i++)
				System.out.print(" ");
			System.out.println(files[now].getName());
		}

		else if (files[now].isDirectory()) {
			File this_files[] = files[now].listFiles();
			for (int i = 0; i < length + this_files.length; i++)
				System.out.print(" ");
			System.out.println("<DIR> " + files[now].getPath());
			search(0, this_files.length, this_files);
			System.out.println();
		}
		search(now + 1, length, files);
	}

	public static void main(String[] args) {
		String path = "C:\\rg\\workspace\\Servers";
		File file = new File(path);
		File files[] = file.listFiles();
		search(0, files.length, files);

		// if(file.exists() && file.isDirectory()){
		// fileList(file);}
	}

}
