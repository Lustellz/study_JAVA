package kosta.dos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		FileSystem fileSystem = new FileSystem();
		Scanner scanner = new Scanner(System.in);
		String moveSuperReg = "^cd(\\p{Space})?\\.\\.$";
		String moveDirReg = "^cd\\p{Space}.+$";
		String mkdirReg = "^mkdir\\p{Space}.+$";
		String cpReg = "^cp\\p{Space}.+$";
		
		while(true){
			System.out.print(fileSystem.getPresentDirFile().getPath());
			System.out.print(">");
			String command = scanner.nextLine().trim();

			if(command.equals("ls")){
				fileSystem.fileListPrint();
			}else if(command.matches(moveSuperReg)){
				fileSystem.moveSuperDir();
			}else if(command.matches(moveDirReg)){
				String modifyCommand = command.substring(3);
				fileSystem.moveDir(modifyCommand);
			}else if(command.matches(mkdirReg)){
				String modifyCommand = command.substring(6);
				fileSystem.makeDir(modifyCommand);
			}else if(command.matches(cpReg)){
				String modifyCommand = command.substring(3);
				fileSystem.copy(modifyCommand);
			}else if(command.equals("exit")){
				scanner.close();
				System.exit(0);
			}
			
			System.out.println();
		}
		
		
		
	}

}
