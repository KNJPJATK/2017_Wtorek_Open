package zadanie1;

import java.util.Iterator;

public class SmartArray implements Iterable<Integer>{

	Integer[] array;
	
	SmartArray(){
		this.array = new Integer[1];
	}
	
	public void add(int number){
		
		if(checkArray() != -1){
			array[checkArray()] = number;
		}else{
			Integer[] tmp = new Integer[array.length *2];
			for(int i = 0; i < array.length; i++){
				tmp[i] = array[i];
			}
			array = tmp;
			add(number);
		}
		
		
	}
	
	
	private int checkArray(){
		for(int i = 0; i < array.length; i++){
			if(array[i] == null){
				return i;
			}
		}
		return -1;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub\
		
		int currentEl = 0;
		return new Iterator(){

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}


	
}
