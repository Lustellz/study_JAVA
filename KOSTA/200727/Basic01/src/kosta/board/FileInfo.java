package kosta.board;

public class FileInfo {
	private int file_no;
	private String name;
	private int file_size;
	private String file_path;
	
	FileInfo(int file_no, String name, int file_size, String file_path){
		this.file_no=file_no;
		this.name=name;
		this.file_size=file_size;
		this.file_path=file_path;
		
	}

	public int getFile_no() {
		return file_no;
	}

	public void setFile_no(int file_no) {
		this.file_no = file_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFile_size() {
		return file_size;
	}

	public void setFile_size(int file_size) {
		this.file_size = file_size;
	}

	public String getFile_path() {
		return file_path;
	}

	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
}
