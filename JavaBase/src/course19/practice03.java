package course19;

public class practice03 {

	public static void main(String[] args) {
	
	//応用問題
		int[] logicArray = new int[5];
		
		logicArray[0] = 100;
		logicArray[1] = 50;
		logicArray[2] = 75;
		logicArray[3] = 80;
		logicArray[4] = 65;
		int savepoint = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.println(logicArray[i]);
		if(logicArray[i]>logicArray[i+1] ) {
		savepoint = logicArray[i];
		logicArray[i] = logicArray[i+1];
		logicArray[i+1] = savepoint;
		}
		}
	    for (int i = 0; i < 3; i++) {
			System.out.println(logicArray[i]);
		if(logicArray[i]>logicArray[i+1] ) {
		savepoint = logicArray[i];
		logicArray[i] = logicArray[i+1];
		logicArray[i+1] = savepoint;
		}
	}
		for (int i = 0; i < 2; i++) {
			System.out.println(logicArray[i]);
		if(logicArray[i]>logicArray[i+1] ) {
		savepoint = logicArray[i];
		logicArray[i] = logicArray[i+1];
		logicArray[i+1] = savepoint;
		{
		}
		for (int i = 0; i < 1; i++) {
			System.out.println(logicArray[i]);
		if(logicArray[i]>logicArray[i+1] ) {
		savepoint = logicArray[i];
		logicArray[i] = logicArray[i+1];
		logicArray[i+1] = savepoint;
		
		}
	}
	}
}
